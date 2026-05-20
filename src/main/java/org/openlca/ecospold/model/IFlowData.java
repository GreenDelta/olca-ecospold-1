package org.openlca.ecospold.model;

import org.w3c.dom.Element;

import java.util.List;

public interface IFlowData {

	public abstract List<IExchange> getExchanges();

	public abstract List<IAllocation> getAllocation();

	public abstract List<Object> getAny();

}
