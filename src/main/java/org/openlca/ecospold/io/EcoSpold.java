package org.openlca.ecospold.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.openlca.commons.Res;
import org.openlca.ecospold.IEcoSpold;
import org.openlca.ecospold.internal.impact.ImpactXmlBinder;
import org.openlca.ecospold.internal.process.ProcessXmlBinder;

public class EcoSpold {

	private static final EcoSpoldXmlBinder<?> processXmlBinder = new ProcessXmlBinder();
	private static final EcoSpoldXmlBinder<?> impactMethodXmlBinder = new ImpactXmlBinder();

	/**
	 * Tries to detect the EcoSpold data set type from the given file. If this
	 * fails, an empty Optional is returned.
	 */
	public static Res<DataSetType> typeOf(File file) {
		try (var stream = new FileInputStream(file);
				 var buff = new BufferedInputStream(stream)) {
			var type = typeOf(buff);
			return type.isError()
				? type.wrapError("Failed to detect dataset type of file: " + file)
				: type;
		} catch (Exception e) {
			return Res.error("Failed to read file: " + file, e);
		}
	}

	/// Tries to detect the EcoSpold data set type from the given stream.
	public static Res<DataSetType> typeOf(InputStream stream) {

		// check the root element
		try {
			var reader = XMLInputFactory.newInstance().createXMLStreamReader(stream);
			while (reader.hasNext()) {
				int next = reader.next();
				if (next != XMLStreamReader.START_ELEMENT)
					continue;
				var qname = reader.getName();
				if (!Objects.equals("ecoSpold", qname.getLocalPart()))
					return Res.error("Invalid root element: " + qname.getLocalPart());
				var namespace = qname.getNamespaceURI();
				var type = DataSetType.forNamespace(namespace);
				return type != null
					? Res.ok(type)
					: Res.error("Not a valid EcoSpold 1 namespace: " + namespace);
			}
			return Res.error("Could not find root element `ecoSpold`");
		} catch (Exception e) {
			return Res.error("Failed to parse XML document", e);
		}
	}

	public static Res<IEcoSpold> read(File file) {
		var type = typeOf(file);
		return type.isError()
			? type.castError()
			: read(file, type.value());
	}

	public static Res<IEcoSpold> read(File file, DataSetType type) {
		try (var stream = new FileInputStream(file);
				 var buffer = new BufferedInputStream(stream)) {
			var res =  read(buffer, type);
			return res.isError()
				? res.wrapError("Failed to read EcoSpold document from file: " + file)
				: res;
		} catch (Exception e) {
			return Res.error("Failed to read EcoSpold from file: " + file, e);
		}
	}

	public static Res<IEcoSpold> read(InputStream stream, DataSetType type) {
		try {
			return switch (type) {
				case PROCESS -> Res.ok(processXmlBinder.unmarshal(stream));
				case IMPACT_METHOD -> Res.ok(impactMethodXmlBinder.unmarshal(stream));
				case null -> Res.error("No dataset type of EcoSpold document provided");
			};
		} catch (Exception e) {
			return Res.error("Failed to parse EcoSpold document of type " + type, e);
		}
	}

	public static Res<Void> write(File file, IEcoSpold spold) {
		try (var stream = new FileOutputStream(file);
				 var buffer = new BufferedOutputStream(stream)) {
			var res = write(buffer, spold);
			return res.isError()
				? res.wrapError("Failed to write EcoSpold to file: " + file)
				: res;
		} catch (Exception e) {
			return Res.error("Failed to write EcoSpold to file: " + file, e);
		}
	}

	public static Res<Void> write(OutputStream stream, IEcoSpold spold) {
		try {
			if (processXmlBinder.matches(spold)) {
				processXmlBinder.marshal(spold, stream);
			} else if (impactMethodXmlBinder.matches(spold)) {
				impactMethodXmlBinder.marshal(spold, stream);
			}
			return Res.ok();
		} catch (Exception e) {
			return Res.error("Failed to write EcoSpold document", e);
		}
	}
}
