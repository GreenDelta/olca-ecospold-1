package org.openlca.ecospold.model;

import javax.xml.datatype.XMLGregorianCalendar;

public interface IDataSetInformation {

	public abstract int getType();

	public abstract void setType(int value);

	public abstract boolean isImpactAssessmentResult();

	public abstract void setImpactAssessmentResult(boolean value);

	public abstract XMLGregorianCalendar getTimestamp();

	public abstract void setTimestamp(XMLGregorianCalendar value);

	public abstract float getVersion();

	public abstract void setVersion(float value);

	public abstract float getInternalVersion();

	public abstract void setInternalVersion(float value);

	public abstract int getEnergyValues();

	public abstract void setEnergyValues(int value);

	public abstract ILanguageCode getLanguageCode();

	public abstract void setLanguageCode(ILanguageCode value);

	public abstract ILanguageCode getLocalLanguageCode();

	public abstract void setLocalLanguageCode(ILanguageCode value);

}
