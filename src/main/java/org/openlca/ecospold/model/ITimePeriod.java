package org.openlca.ecospold.model;

import javax.xml.datatype.XMLGregorianCalendar;

public interface ITimePeriod {

	public abstract XMLGregorianCalendar getStartYear();

	public abstract void setStartYear(XMLGregorianCalendar value);

	public abstract XMLGregorianCalendar getStartYearMonth();

	public abstract void setStartYearMonth(XMLGregorianCalendar value);

	public abstract XMLGregorianCalendar getStartDate();

	public abstract void setStartDate(XMLGregorianCalendar value);

	public abstract XMLGregorianCalendar getEndYear();

	public abstract void setEndYear(XMLGregorianCalendar value);

	public abstract XMLGregorianCalendar getEndYearMonth();

	public abstract void setEndYearMonth(XMLGregorianCalendar value);

	public abstract XMLGregorianCalendar getEndDate();

	public abstract void setEndDate(XMLGregorianCalendar value);

	public abstract boolean isDataValidForEntirePeriod();

	public abstract void setDataValidForEntirePeriod(boolean value);

	public abstract String getText();

	public abstract void setText(String value);

}
