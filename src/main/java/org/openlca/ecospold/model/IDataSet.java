package org.openlca.ecospold.model;

import org.w3c.dom.Element;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public interface IDataSet {

	IMetaInformation getMetaInformation();

	void setMetaInformation(IMetaInformation value);

	List<IFlowData> getFlowData();

	List<Object> getAny();

	int getNumber();

	void setNumber(int value);

	String getInternalSchemaVersion();

	void setInternalSchemaVersion(String value);

	String getGenerator();

	void setGenerator(String value);

	XMLGregorianCalendar getTimestamp();

	void setTimestamp(XMLGregorianCalendar value);

	String getValidCompanyCodes();

	void setValidCompanyCodes(String value);

	String getValidRegionalCodes();

	void setValidRegionalCodes(String value);

	String getValidCategories();

	void setValidCategories(String value);

	String getValidUnits();

	void setValidUnits(String value);

}
