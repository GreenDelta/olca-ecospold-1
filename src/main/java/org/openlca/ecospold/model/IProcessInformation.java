package org.openlca.ecospold.model;

import java.util.List;

public interface IProcessInformation {

	IReferenceFunction getReferenceFunction();

	void setReferenceFunction(IReferenceFunction value);

	IGeography getGeography();

	void setGeography(IGeography value);

	ITechnology getTechnology();

	void setTechnology(ITechnology value);

	ITimePeriod getTimePeriod();

	void setTimePeriod(ITimePeriod value);

	IDataSetInformation getDataSetInformation();

	void setDataSetInformation(IDataSetInformation value);

	List<Object> getAny();

}
