package org.openlca.ecospold.model.process;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.openlca.ecospold.model.ISource;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSource")
class Source implements Serializable, ISource {

	private final static long serialVersionUID = 1L;
	@XmlAttribute(name = "number", required = true)
	protected int number;
	@XmlAttribute(name = "sourceType")
	protected Integer sourceType;
	@XmlAttribute(name = "firstAuthor", required = true)
	protected String firstAuthor;
	@XmlAttribute(name = "additionalAuthors")
	protected String additionalAuthors;
	@XmlAttribute(name = "year", required = true)
	@XmlSchemaType(name = "gYear")
	protected XMLGregorianCalendar year;
	@XmlAttribute(name = "title", required = true)
	protected String title;
	@XmlAttribute(name = "pageNumbers")
	protected String pageNumbers;
	@XmlAttribute(name = "nameOfEditors")
	protected String nameOfEditors;
	@XmlAttribute(name = "titleOfAnthology")
	protected String titleOfAnthology;
	@XmlAttribute(name = "placeOfPublications", required = true)
	protected String placeOfPublications;
	@XmlAttribute(name = "publisher")
	protected String publisher;
	@XmlAttribute(name = "journal")
	protected String journal;
	@XmlAttribute(name = "volumeNo")
	protected BigInteger volumeNo;
	@XmlAttribute(name = "issueNo")
	protected String issueNo;
	@XmlAttribute(name = "text")
	protected String text;

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int value) {
		this.number = value;
	}

	@Override
	public int getSourceType() {
		if (sourceType == null)
			return 0;
		return sourceType;
	}

	@Override
	public void setSourceType(Integer value) {
		this.sourceType = value;
	}

	@Override
	public String getFirstAuthor() {
		return firstAuthor;
	}

	@Override
	public void setFirstAuthor(String value) {
		this.firstAuthor = value;
	}

	@Override
	public String getAdditionalAuthors() {
		return additionalAuthors;
	}

	@Override
	public void setAdditionalAuthors(String value) {
		this.additionalAuthors = value;
	}

	@Override
	public XMLGregorianCalendar getYear() {
		return year;
	}

	@Override
	public void setYear(XMLGregorianCalendar value) {
		this.year = value;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String value) {
		this.title = value;
	}

	@Override
	public String getPageNumbers() {
		return pageNumbers;
	}

	@Override
	public void setPageNumbers(String value) {
		this.pageNumbers = value;
	}

	@Override
	public String getNameOfEditors() {
		return nameOfEditors;
	}

	@Override
	public void setNameOfEditors(String value) {
		this.nameOfEditors = value;
	}

	@Override
	public String getTitleOfAnthology() {
		return titleOfAnthology;
	}

	@Override
	public void setTitleOfAnthology(String value) {
		this.titleOfAnthology = value;
	}

	@Override
	public String getPlaceOfPublications() {
		return placeOfPublications;
	}

	@Override
	public void setPlaceOfPublications(String value) {
		this.placeOfPublications = value;
	}

	@Override
	public String getPublisher() {
		return publisher;
	}

	@Override
	public void setPublisher(String value) {
		this.publisher = value;
	}

	@Override
	public String getJournal() {
		return journal;
	}

	@Override
	public void setJournal(String value) {
		this.journal = value;
	}

	@Override
	public BigInteger getVolumeNo() {
		return volumeNo;
	}

	@Override
	public void setVolumeNo(BigInteger value) {
		this.volumeNo = value;
	}

	@Override
	public String getIssueNo() {
		return issueNo;
	}

	@Override
	public void setIssueNo(String value) {
		this.issueNo = value;
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
