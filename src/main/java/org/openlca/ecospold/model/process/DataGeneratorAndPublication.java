package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import org.openlca.ecospold.model.ICountryCode;
import org.openlca.ecospold.model.IDataGeneratorAndPublication;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataGeneratorAndPublication")
class DataGeneratorAndPublication implements IDataGeneratorAndPublication {

	@XmlAttribute(name = "person", required = true)
	protected int person;
	@XmlAttribute(name = "dataPublishedIn")
	protected Integer dataPublishedIn;
	@XmlAttribute(name = "referenceToPublishedSource")
	protected Integer referenceToPublishedSource;
	@XmlAttribute(name = "copyright", required = true)
	protected boolean copyright;
	@XmlAttribute(name = "accessRestrictedTo")
	protected Integer accessRestrictedTo;
	@XmlAttribute(name = "companyCode")
	protected String companyCode;
	@XmlAttribute(name = "countryCode")
	protected CountryCode countryCode;
	@XmlAttribute(name = "pageNumbers")
	protected String pageNumbers;

	@Override
	public int getPerson() {
		return person;
	}

	@Override
	public void setPerson(int value) {
		this.person = value;
	}

	@Override
	public int getDataPublishedIn() {
		if (dataPublishedIn == null)
			return 0;
		return dataPublishedIn;
	}

	@Override
	public void setDataPublishedIn(Integer value) {
		this.dataPublishedIn = value;
	}

	@Override
	public Integer getReferenceToPublishedSource() {
		return referenceToPublishedSource;
	}

	@Override
	public void setReferenceToPublishedSource(Integer value) {
		this.referenceToPublishedSource = value;
	}

	@Override
	public boolean isCopyright() {
		return copyright;
	}

	@Override
	public void setCopyright(boolean value) {
		this.copyright = value;
	}

	@Override
	public Integer getAccessRestrictedTo() {
		return accessRestrictedTo;
	}

	@Override
	public void setAccessRestrictedTo(Integer value) {
		this.accessRestrictedTo = value;
	}

	@Override
	public String getCompanyCode() {
		return companyCode;
	}

	@Override
	public void setCompanyCode(String value) {
		this.companyCode = value;
	}

	@Override
	public ICountryCode getCountryCode() {
		return countryCode;
	}

	@Override
	public void setCountryCode(ICountryCode value) {
		if (value instanceof CountryCode) {
			this.countryCode = (CountryCode) value;
		} else {
			this.countryCode = CountryCode.fromValue(value.value());
		}
	}

	@Override
	public String getPageNumbers() {
		return pageNumbers;
	}

	@Override
	public void setPageNumbers(String value) {
		this.pageNumbers = value;
	}

}
