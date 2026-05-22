package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.IDataSetInformation;
import org.openlca.ecospold.model.ILanguageCode;

import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataSetInformation")
class DataSetInformation implements IDataSetInformation {

	@XmlAttribute(name = "type", required = true)
	protected int type;
	@XmlAttribute(name = "impactAssessmentResult", required = true)
	protected boolean impactAssessmentResult;
	@XmlAttribute(name = "timestamp", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar timestamp;
	@XmlAttribute(name = "version", required = true)
	protected float version;
	@XmlAttribute(name = "internalVersion", required = true)
	protected float internalVersion;
	@XmlAttribute(name = "energyValues", required = true)
	protected int energyValues;
	@XmlAttribute(name = "languageCode")
	protected LanguageCode languageCode;
	@XmlAttribute(name = "localLanguageCode")
	protected LanguageCode localLanguageCode;

	@Override
	public int getType() {
		return type;
	}

	@Override
	public void setType(int value) {
		this.type = value;
	}

	@Override
	public boolean isImpactAssessmentResult() {
		return impactAssessmentResult;
	}

	@Override
	public void setImpactAssessmentResult(boolean value) {
		this.impactAssessmentResult = value;
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
	public float getVersion() {
		return version;
	}

	@Override
	public void setVersion(float value) {
		this.version = value;
	}

	@Override
	public float getInternalVersion() {
		return internalVersion;
	}

	@Override
	public void setInternalVersion(float value) {
		this.internalVersion = value;
	}

	@Override
	public int getEnergyValues() {
		return energyValues;
	}

	@Override
	public void setEnergyValues(int value) {
		this.energyValues = value;
	}

	@Override
	public ILanguageCode getLanguageCode() {
		if (languageCode == null)
			return LanguageCode.EN;
		return languageCode;
	}

	@Override
	public void setLanguageCode(ILanguageCode value) {
		if (value instanceof LanguageCode) {
			this.languageCode = (LanguageCode) value;
		} else {
			this.languageCode = LanguageCode.fromValue(value.value());
		}
	}

	@Override
	public ILanguageCode getLocalLanguageCode() {
		if (localLanguageCode == null)
			return LanguageCode.DE;
		return localLanguageCode;
	}

	@Override
	public void setLocalLanguageCode(ILanguageCode value) {
		if (value instanceof LanguageCode) {
			this.localLanguageCode = (LanguageCode) value;
		} else {
			this.localLanguageCode = LanguageCode.fromValue(value.value());
		}
	}

}
