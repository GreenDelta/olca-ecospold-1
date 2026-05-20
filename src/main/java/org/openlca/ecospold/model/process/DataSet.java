package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IDataSet;
import org.openlca.ecospold.model.IFlowData;
import org.openlca.ecospold.model.IMetaInformation;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataset", propOrder = { "metaInformation", "flowData", "any" })
class DataSet implements Serializable, IDataSet {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true, type = MetaInformation.class)
	protected IMetaInformation metaInformation;
	@XmlElement(required = true, type = FlowData.class)
	protected List<IFlowData> flowData;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "number", required = true)
	protected int number;
	@XmlAttribute(name = "internalSchemaVersion")
	protected String internalSchemaVersion;
	@XmlAttribute(name = "generator", required = true)
	protected String generator;
	@XmlAttribute(name = "timestamp", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar timestamp;
	@XmlAttribute(name = "validCompanyCodes")
	protected String validCompanyCodes;
	@XmlAttribute(name = "validRegionalCodes")
	protected String validRegionalCodes;
	@XmlAttribute(name = "validCategories")
	protected String validCategories;
	@XmlAttribute(name = "validUnits")
	protected String validUnits;

	@Override
	public IMetaInformation getMetaInformation() {
		return metaInformation;
	}

	@Override
	public void setMetaInformation(IMetaInformation value) {
		this.metaInformation = value;
	}

	@Override
	public List<IFlowData> getFlowData() {
		if (flowData == null) {
			flowData = new ArrayList<>();
		}
		return this.flowData;
	}

	@Override
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int value) {
		this.number = value;
	}

	@Override
	public String getInternalSchemaVersion() {
		return internalSchemaVersion;
	}

	@Override
	public void setInternalSchemaVersion(String value) {
		this.internalSchemaVersion = value;
	}

	@Override
	public String getGenerator() {
		return generator;
	}

	@Override
	public void setGenerator(String value) {
		this.generator = value;
	}

	@Override
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	@Override
	public void setTimestamp(XMLGregorianCalendar value) {
		this.timestamp = value;
	}

	@Override
	public String getValidCompanyCodes() {
		return validCompanyCodes;
	}

	@Override
	public void setValidCompanyCodes(String value) {
		this.validCompanyCodes = value;
	}

	@Override
	public String getValidRegionalCodes() {
		return validRegionalCodes;
	}

	@Override
	public void setValidRegionalCodes(String value) {
		this.validRegionalCodes = value;
	}

	@Override
	public String getValidCategories() {
		return validCategories;
	}

	@Override
	public void setValidCategories(String value) {
		this.validCategories = value;
	}

	@Override
	public String getValidUnits() {
		return validUnits;
	}

	@Override
	public void setValidUnits(String value) {
		this.validUnits = value;
	}

}
