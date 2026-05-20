package org.openlca.ecospold.model;

import org.w3c.dom.Element;

import java.util.List;

public interface IProcessInformation {

	public abstract IReferenceFunction getReferenceFunction();

	public abstract void setReferenceFunction(IReferenceFunction value);

	public abstract IGeography getGeography();

	public abstract void setGeography(IGeography value);

	public abstract ITechnology getTechnology();

	public abstract void setTechnology(ITechnology value);

	public abstract ITimePeriod getTimePeriod();

	public abstract void setTimePeriod(ITimePeriod value);

	public abstract IDataSetInformation getDataSetInformation();

	public abstract void setDataSetInformation(IDataSetInformation value);

	public abstract List<Object> getAny();

}
