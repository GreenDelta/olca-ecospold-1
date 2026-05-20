package org.openlca.ecospold.model;

public interface IDataGeneratorAndPublication {

	int getPerson();

	void setPerson(int value);

	int getDataPublishedIn();

	void setDataPublishedIn(Integer value);

	Integer getReferenceToPublishedSource();

	void setReferenceToPublishedSource(Integer value);

	boolean isCopyright();

	void setCopyright(boolean value);

	Integer getAccessRestrictedTo();

	void setAccessRestrictedTo(Integer value);

	String getCompanyCode();

	void setCompanyCode(String value);

	ICountryCode getCountryCode();

	void setCountryCode(ICountryCode value);

	String getPageNumbers();

	void setPageNumbers(String value);

}
