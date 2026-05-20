package org.openlca.ecospold.model;

import org.w3c.dom.Element;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public interface IDataSet {

	public abstract IMetaInformation getMetaInformation();

	public abstract void setMetaInformation(IMetaInformation value);

	public abstract List<IFlowData> getFlowData();

	public abstract List<Object> getAny();

	public abstract int getNumber();

	public abstract void setNumber(int value);

	public abstract String getInternalSchemaVersion();

	public abstract void setInternalSchemaVersion(String value);

	public abstract String getGenerator();

	public abstract void setGenerator(String value);

	public abstract XMLGregorianCalendar getTimestamp();

	public abstract void setTimestamp(XMLGregorianCalendar value);

	public abstract String getValidCompanyCodes();

	public abstract void setValidCompanyCodes(String value);

	public abstract String getValidRegionalCodes();

	public abstract void setValidRegionalCodes(String value);

	public abstract String getValidCategories();

	public abstract void setValidCategories(String value);

	public abstract String getValidUnits();

	public abstract void setValidUnits(String value);

}
