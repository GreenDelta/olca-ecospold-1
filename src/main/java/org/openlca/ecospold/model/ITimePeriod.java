package org.openlca.ecospold.model;

import javax.xml.datatype.XMLGregorianCalendar;

public interface ITimePeriod {

	XMLGregorianCalendar getStartYear();

	void setStartYear(XMLGregorianCalendar value);

	XMLGregorianCalendar getStartYearMonth();

	void setStartYearMonth(XMLGregorianCalendar value);

	XMLGregorianCalendar getStartDate();

	void setStartDate(XMLGregorianCalendar value);

	XMLGregorianCalendar getEndYear();

	void setEndYear(XMLGregorianCalendar value);

	XMLGregorianCalendar getEndYearMonth();

	void setEndYearMonth(XMLGregorianCalendar value);

	XMLGregorianCalendar getEndDate();

	void setEndDate(XMLGregorianCalendar value);

	boolean isDataValidForEntirePeriod();

	void setDataValidForEntirePeriod(boolean value);

	String getText();

	void setText(String value);

}
