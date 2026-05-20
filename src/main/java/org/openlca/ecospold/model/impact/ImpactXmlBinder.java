package org.openlca.ecospold.model.impact;

import jakarta.xml.bind.JAXBElement;
import org.openlca.ecospold.model.IEcoSpold;
import org.openlca.ecospold.EcoSpoldXmlBinder;

public class ImpactXmlBinder extends EcoSpoldXmlBinder<ImpactEcoSpold> {

	private final ObjectFactory factory = new ObjectFactory();

	@Override
	public boolean matches(IEcoSpold spold) {
		return spold instanceof ImpactEcoSpold;
	}

	@Override
	protected Class<ImpactEcoSpold> getEcoSpoldClass() {
		return ImpactEcoSpold.class;
	}

	@Override
	protected JAXBElement<ImpactEcoSpold> toElement(IEcoSpold ecoSpold) {
		JAXBElement<ImpactEcoSpold> element = null;
		if (ecoSpold instanceof ImpactEcoSpold) {
			element = factory.createEcoSpold((ImpactEcoSpold) ecoSpold);
		}
		return element;
	}

}
