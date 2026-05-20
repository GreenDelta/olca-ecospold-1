package org.openlca.ecospold.model;

public interface IDataGeneratorAndPublication {

	public abstract int getPerson();

	public abstract void setPerson(int value);

	public abstract int getDataPublishedIn();

	public abstract void setDataPublishedIn(Integer value);

	public abstract Integer getReferenceToPublishedSource();

	public abstract void setReferenceToPublishedSource(Integer value);

	public abstract boolean isCopyright();

	public abstract void setCopyright(boolean value);

	public abstract Integer getAccessRestrictedTo();

	public abstract void setAccessRestrictedTo(Integer value);

	public abstract String getCompanyCode();

	public abstract void setCompanyCode(String value);

	public abstract ICountryCode getCountryCode();

	public abstract void setCountryCode(ICountryCode value);

	public abstract String getPageNumbers();

	public abstract void setPageNumbers(String value);

}
