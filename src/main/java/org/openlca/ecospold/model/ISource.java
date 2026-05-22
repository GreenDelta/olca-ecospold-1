package org.openlca.ecospold.model;

import javax.xml.datatype.XMLGregorianCalendar;

public interface ISource {

	int getNumber();

	void setNumber(int value);

	int getSourceType();

	void setSourceType(int value);

	String getFirstAuthor();

	void setFirstAuthor(String value);

	String getAdditionalAuthors();

	void setAdditionalAuthors(String value);

	XMLGregorianCalendar getYear();

	void setYear(XMLGregorianCalendar value);

	String getTitle();

	void setTitle(String value);

	String getPageNumbers();

	void setPageNumbers(String value);

	String getNameOfEditors();

	void setNameOfEditors(String value);

	String getTitleOfAnthology();

	void setTitleOfAnthology(String value);

	String getPlaceOfPublications();

	void setPlaceOfPublications(String value);

	String getPublisher();

	void setPublisher(String value);

	String getJournal();

	void setJournal(String value);

	Long getVolumeNo();

	void setVolumeNo(Long value);

	String getIssueNo();

	void setIssueNo(String value);

	String getText();

	void setText(String value);

}
