package org.openlca.ecospold.model;

import java.util.List;

public interface IFlowData {

	List<IExchange> getExchanges();

	List<IAllocation> getAllocation();

	List<Object> getAny();

}
