package org.openlca.ecospold.model.internal.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IDataSetInformation;
import org.openlca.ecospold.model.IGeography;
import org.openlca.ecospold.model.IProcessInformation;
import org.openlca.ecospold.model.IReferenceFunction;
import org.openlca.ecospold.model.ITechnology;
import org.openlca.ecospold.model.ITimePeriod;
import org.w3c.dom.Element;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcessInformation", propOrder = { "referenceFunction",
		"geography", "technology", "timePeriod", "dataSetInformation", "any" })
class ProcessInformation implements Serializable, IProcessInformation {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true, type = ReferenceFunction.class)
	protected IReferenceFunction referenceFunction;
	@XmlElement(required = true, type = Geography.class)
	protected IGeography geography;
	@XmlElement(required = true, type = Technology.class)
	protected ITechnology technology;
	@XmlElement(required = true, type = TimePeriod.class)
	protected ITimePeriod timePeriod;
	@XmlElement(required = true, type = DataSetInformation.class)
	protected IDataSetInformation dataSetInformation;
	@XmlAnyElement(lax = true)
	protected List<Object> any;

	@Override
	public IReferenceFunction getReferenceFunction() {
		return referenceFunction;
	}

	@Override
	public void setReferenceFunction(IReferenceFunction value) {
		this.referenceFunction = value;
	}

	@Override
	public IGeography getGeography() {
		return geography;
	}

	@Override
	public void setGeography(IGeography value) {
		this.geography = value;
	}

	@Override
	public ITechnology getTechnology() {
		return technology;
	}

	@Override
	public void setTechnology(ITechnology value) {
		this.technology = value;
	}

	@Override
	public ITimePeriod getTimePeriod() {
		return timePeriod;
	}

	@Override
	public void setTimePeriod(ITimePeriod value) {
		this.timePeriod = value;
	}

	@Override
	public IDataSetInformation getDataSetInformation() {
		return dataSetInformation;
	}

	@Override
	public void setDataSetInformation(IDataSetInformation value) {
		this.dataSetInformation = value;
	}

	@Override
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

}
