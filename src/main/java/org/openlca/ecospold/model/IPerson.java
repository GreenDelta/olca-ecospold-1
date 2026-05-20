package org.openlca.ecospold.model;

public interface IPerson {

	int getNumber();

	void setNumber(int value);

	String getName();

	void setName(String value);

	String getAddress();

	void setAddress(String value);

	String getTelephone();

	void setTelephone(String value);

	String getTelefax();

	void setTelefax(String value);

	String getEmail();

	void setEmail(String value);

	String getCompanyCode();

	void setCompanyCode(String value);

	ICountryCode getCountryCode();

	void setCountryCode(ICountryCode value);

}
