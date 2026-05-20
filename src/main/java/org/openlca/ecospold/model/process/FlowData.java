package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IAllocation;
import org.openlca.ecospold.model.IExchange;
import org.openlca.ecospold.model.IFlowData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFlowData", propOrder = { "exchange", "allocation", "any" })
class FlowData implements Serializable, IFlowData {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true, type = Exchange.class)
	protected List<IExchange> exchange;
	@XmlElement(type = Allocation.class)
	protected List<IAllocation> allocation;
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
	public List<IAllocation> getAllocation() {
		if (allocation == null) {
			allocation = new ArrayList<>();
		}
		return this.allocation;
	}

	@Override
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

}
