package org.openlca.ecospold.model.impact;

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

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcessInformation", propOrder = { "referenceFunction",
		"geography", "timePeriod", "dataSetInformation", "any" })
class ImpactProcessInformation implements IProcessInformation {

	@XmlElement(required = true, type = ImpactReferenceFunction.class)
	protected IReferenceFunction referenceFunction;
	@XmlElement(required = true, type = ImpactGeography.class)
	protected IGeography geography;
	@XmlElement(type = ImpactTimePeriod.class)
	protected ITimePeriod timePeriod;
	@XmlElement(required = true, type = ImpactDataSetInformation.class)
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

	@Override
	public void setTechnology(ITechnology value) {
		// TODO Auto-generated method stub

	}

	@Override
	public ITechnology getTechnology() {
		// TODO Auto-generated method stub
		return null;
	}

}
