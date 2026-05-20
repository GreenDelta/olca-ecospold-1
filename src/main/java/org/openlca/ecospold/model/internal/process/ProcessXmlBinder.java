package org.openlca.ecospold.model.internal.process;

import jakarta.xml.bind.JAXBElement;
import org.openlca.ecospold.model.IEcoSpold;
import org.openlca.ecospold.EcoSpoldXmlBinder;

public class ProcessXmlBinder extends EcoSpoldXmlBinder<ProcessEcoSpold> {

	private final ObjectFactory factory = new ObjectFactory();

	@Override
	public boolean matches(IEcoSpold spold) {
		return spold instanceof ProcessEcoSpold;
	}

	@Override
	protected Class<ProcessEcoSpold> getEcoSpoldClass() {
		return ProcessEcoSpold.class;
	}

	@Override
	protected JAXBElement<ProcessEcoSpold> toElement(IEcoSpold ecoSpold) {
		JAXBElement<ProcessEcoSpold> element = null;
		if (ecoSpold instanceof ProcessEcoSpold) {
			element = factory.createEcoSpold((ProcessEcoSpold) ecoSpold);
		}
		return element;
	}

}
