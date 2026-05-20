package org.openlca.ecospold.model;

public interface IPerson {

	public abstract int getNumber();

	public abstract void setNumber(int value);

	public abstract String getName();

	public abstract void setName(String value);

	public abstract String getAddress();

	public abstract void setAddress(String value);

	public abstract String getTelephone();

	public abstract void setTelephone(String value);

	public abstract String getTelefax();

	public abstract void setTelefax(String value);

	public abstract String getEmail();

	public abstract void setEmail(String value);

	public abstract String getCompanyCode();

	public abstract void setCompanyCode(String value);

	public abstract ICountryCode getCountryCode();

	public abstract void setCountryCode(ICountryCode value);

}
