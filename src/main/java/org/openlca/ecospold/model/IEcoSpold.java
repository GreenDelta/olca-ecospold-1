package org.openlca.ecospold.model;

import java.util.List;

import org.openlca.ecospold.model.impact.ImpactMethodFactory;
import org.openlca.ecospold.model.process.ProcessEcoSpold;
import org.openlca.ecospold.model.process.ProcessFactory;

import jakarta.xml.bind.JAXBElement;

public interface IEcoSpold {

	List<IDataSet> getDataSets();

	List<Object> getAny();

	Long getValidationId();

	void setValidationId(Long value);

	String getValidationStatus();

	void setValidationStatus(String value);

	JAXBElement<?> toElement();

	default DataSet newDataSet() {
		var factory = this instanceof ProcessEcoSpold
			? new ProcessFactory()
			: new ImpactMethodFactory();
		var ds = factory.createDataSet();
		getDataSets().add(ds);
		return new DataSet(ds, factory);
	}

}
