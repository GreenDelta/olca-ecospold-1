
package org.openlca.ecospold.model.internal.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.ITimePeriod;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTimePeriod", propOrder = {
    "startYear",
    "startYearMonth",
    "startDate",
    "endYear",
    "endYearMonth",
    "endDate"
})
class TimePeriod
    implements Serializable, ITimePeriod
{

    private final static long serialVersionUID = 1L;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar startYear;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar startYearMonth;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar endYear;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar endYearMonth;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "dataValidForEntirePeriod", required = true)
    protected boolean dataValidForEntirePeriod;
    @XmlAttribute(name = "text")
    protected String text;

    @Override
	public XMLGregorianCalendar getStartYear() {
        return startYear;
    }

    @Override
	public void setStartYear(XMLGregorianCalendar value) {
        this.startYear = value;
    }

    @Override
	public XMLGregorianCalendar getStartYearMonth() {
        return startYearMonth;
    }

    @Override
	public void setStartYearMonth(XMLGregorianCalendar value) {
        this.startYearMonth = value;
    }

    @Override
	public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    @Override
	public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    @Override
	public XMLGregorianCalendar getEndYear() {
        return endYear;
    }

    @Override
	public void setEndYear(XMLGregorianCalendar value) {
        this.endYear = value;
    }

    @Override
	public XMLGregorianCalendar getEndYearMonth() {
        return endYearMonth;
    }

    @Override
	public void setEndYearMonth(XMLGregorianCalendar value) {
        this.endYearMonth = value;
    }

    @Override
	public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    @Override
	public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    @Override
	public boolean isDataValidForEntirePeriod() {
        return dataValidForEntirePeriod;
    }

    @Override
	public void setDataValidForEntirePeriod(boolean value) {
        this.dataValidForEntirePeriod = value;
    }

    @Override
	public String getText() {
        return text;
    }

    @Override
	public void setText(String value) {
        this.text = value;
    }

}
