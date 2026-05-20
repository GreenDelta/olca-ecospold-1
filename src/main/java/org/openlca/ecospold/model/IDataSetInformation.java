package org.openlca.ecospold.model;

import javax.xml.datatype.XMLGregorianCalendar;

public interface IDataSetInformation {

	int getType();

	void setType(int value);

	boolean isImpactAssessmentResult();

	void setImpactAssessmentResult(boolean value);

	XMLGregorianCalendar getTimestamp();

	void setTimestamp(XMLGregorianCalendar value);

	float getVersion();

	void setVersion(float value);

	float getInternalVersion();

	void setInternalVersion(float value);

	int getEnergyValues();

	void setEnergyValues(int value);

	ILanguageCode getLanguageCode();

	void setLanguageCode(ILanguageCode value);

	ILanguageCode getLocalLanguageCode();

	void setLocalLanguageCode(ILanguageCode value);

}
