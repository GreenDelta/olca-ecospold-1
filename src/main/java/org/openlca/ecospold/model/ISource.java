package org.openlca.ecospold.model;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

public interface ISource {

	public abstract int getNumber();

	public abstract void setNumber(int value);

	public abstract int getSourceType();

	public abstract void setSourceType(Integer value);

	public abstract String getFirstAuthor();

	public abstract void setFirstAuthor(String value);

	public abstract String getAdditionalAuthors();

	public abstract void setAdditionalAuthors(String value);

	public abstract XMLGregorianCalendar getYear();

	public abstract void setYear(XMLGregorianCalendar value);

	public abstract String getTitle();

	public abstract void setTitle(String value);

	public abstract String getPageNumbers();

	public abstract void setPageNumbers(String value);

	public abstract String getNameOfEditors();

	public abstract void setNameOfEditors(String value);

	public abstract String getTitleOfAnthology();

	public abstract void setTitleOfAnthology(String value);

	public abstract String getPlaceOfPublications();

	public abstract void setPlaceOfPublications(String value);

	public abstract String getPublisher();

	public abstract void setPublisher(String value);

	public abstract String getJournal();

	public abstract void setJournal(String value);

	public abstract BigInteger getVolumeNo();

	public abstract void setVolumeNo(BigInteger value);

	public abstract String getIssueNo();

	public abstract void setIssueNo(String value);

	public abstract String getText();

	public abstract void setText(String value);

}
