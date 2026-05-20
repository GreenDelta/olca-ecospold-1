package org.openlca.ecospold.model.internal.impact;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IAllocation;
import org.openlca.ecospold.model.IExchange;
import org.openlca.ecospold.model.IFlowData;
import org.w3c.dom.Element;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFlowData", propOrder = { "exchange", "any" })
class ImpactFactors implements Serializable, IFlowData {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true, type = ImpactFactor.class)
	protected List<IExchange> exchange;
	@XmlAnyElement(lax = true)
	protected List<Object> any;

	@Override
	public List<IExchange> getExchanges() {
		if (exchange == null) {
			exchange = new ArrayList<>();
		}
		return this.exchange;
	}

	@Override
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	@Override
	public List<IAllocation> getAllocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
