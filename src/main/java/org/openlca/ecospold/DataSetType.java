package org.openlca.ecospold;

import org.openlca.ecospold.model.IEcoSpoldFactory;
import org.openlca.ecospold.model.internal.impact.ImpactMethodFactory;
import org.openlca.ecospold.model.internal.process.ProcessFactory;

public enum DataSetType {

	PROCESS("http://www.EcoInvent.org/EcoSpold01", new ProcessFactory()),

	IMPACT_METHOD("http://www.EcoInvent.org/EcoSpold01Impact",
			new ImpactMethodFactory());

	private final String namespace;

	private final IEcoSpoldFactory factory;

	public IEcoSpoldFactory getFactory() {
		return factory;
	}

	DataSetType(String namespace, IEcoSpoldFactory factory) {
		this.namespace = namespace;
		this.factory = factory;
	}

	static DataSetType forNamespace(String namespace) {
		for (DataSetType type : values()) {
			if (type.namespace.equals(namespace)) {
				return type;
			}
		}
		return null;
	}

}
