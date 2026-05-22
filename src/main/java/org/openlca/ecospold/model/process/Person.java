
package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import org.openlca.ecospold.model.ICountryCode;
import org.openlca.ecospold.model.IPerson;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPerson")
class Person implements IPerson {

	@XmlAttribute(name = "number", required = true)
	protected int number;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "address", required = true)
	protected String address;
	@XmlAttribute(name = "telephone", required = true)
	protected String telephone;
	@XmlAttribute(name = "telefax")
	protected String telefax;
	@XmlAttribute(name = "email")
	protected String email;
	@XmlAttribute(name = "companyCode", required = true)
	protected String companyCode;
	@XmlAttribute(name = "countryCode", required = true)
	protected CountryCode countryCode;

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int value) {
		this.number = value;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String value) {
		this.name = value;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public void setAddress(String value) {
		this.address = value;
	}

	@Override
	public String getTelephone() {
		return telephone;
	}

	@Override
	public void setTelephone(String value) {
		this.telephone = value;
	}

	@Override
	public String getTelefax() {
		return telefax;
	}

	@Override
	public void setTelefax(String value) {
		this.telefax = value;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String value) {
		this.email = value;
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
		this.countryCode = (CountryCode) value;
	}

}
