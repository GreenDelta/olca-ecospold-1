
package org.openlca.ecospold.internal.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.ICountryCode;
import org.openlca.ecospold.IPerson;

import java.io.Serializable;


/**
 * Used for the identification of members of the organisation / institute co-operating within a quality network (e.g., ecoinvent) referred to in the areas Validation, dataEntryBy and dataGeneratorAndPublication.
 *
 * <p>Java class for TPerson complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="number" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TIndexNumber" />
 *       &lt;attribute name="name" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TString40" />
 *       &lt;attribute name="address" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TString255" />
 *       &lt;attribute name="telephone" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TString40" />
 *       &lt;attribute name="telefax" type="{http://www.EcoInvent.org/EcoSpold01}TString40" />
 *       &lt;attribute name="email" type="{http://www.EcoInvent.org/EcoSpold01}TString80" />
 *       &lt;attribute name="companyCode" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TCompanyCode" />
 *       &lt;attribute name="countryCode" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TISOCountryCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPerson")
class Person
    implements Serializable, IPerson
{

    private final static long serialVersionUID = 1L;
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

    /**
     * Gets the value of the number property.
     *
     */
    @Override
	public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     */
    @Override
	public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
	public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
	public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
	public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
	public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
	public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
	public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the telefax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
	public String getTelefax() {
        return telefax;
    }

    /**
     * Sets the value of the telefax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
	public void setTelefax(String value) {
        this.telefax = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
	public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
	public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the companyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
	public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
	public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     *
     * @return
     *     possible object is
     *     {@link CountryCode }
     *
     */
    @Override
	public ICountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *
     */
    @Override
	public void setCountryCode(ICountryCode value) {
        this.countryCode = (CountryCode) value;
    }

}
