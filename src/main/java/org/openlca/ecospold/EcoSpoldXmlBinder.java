package org.openlca.ecospold;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import org.openlca.ecospold.model.IEcoSpold;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public abstract class EcoSpoldXmlBinder<T extends IEcoSpold> {

	private final HashMap<Class<?>, Marshaller> marshallers = new HashMap<>();
	private final HashMap<Class<?>, Unmarshaller> unmarshallers = new HashMap<>();

	protected EcoSpoldXmlBinder() {
	}

	/**
	 * Returns true if the given EcoSpold type matches this XML binder.
	 */
	public abstract boolean matches(IEcoSpold spold);




	protected abstract Class<T> getEcoSpoldClass();

	protected abstract JAXBElement<T> toElement(IEcoSpold ecoSpold);

	void marshal(IEcoSpold ecoSpold, OutputStream outputStream)
		throws JAXBException {
		getMarshaller(ecoSpold).marshal(toElement(ecoSpold), outputStream);
	}

	T unmarshal(InputStream inputStream) throws JAXBException {
		@SuppressWarnings("unchecked")
		JAXBElement<T> element = (JAXBElement<T>) getUnmarshaller(
			getEcoSpoldClass()).unmarshal(inputStream);
		return element.getValue();
	}


	private Marshaller getMarshaller(Object object) throws JAXBException {
		Class<?> clazz = object.getClass();
		var marshaller = marshallers.get(clazz);
		if (marshaller != null)
			return marshaller;
		var context = JAXBContext.newInstance(object.getClass());
		marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshallers.put(clazz, marshaller);
		return marshaller;
	}

	private Unmarshaller getUnmarshaller(Class<?> clazz) throws JAXBException {
		var unmarshaller = unmarshallers.get(clazz);
		if (unmarshaller != null)
			return unmarshaller;
		var context = JAXBContext.newInstance(clazz);
		unmarshaller = context.createUnmarshaller();
		unmarshallers.put(clazz, unmarshaller);
		return unmarshaller;
	}
}
