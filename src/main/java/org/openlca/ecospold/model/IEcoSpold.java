package org.openlca.ecospold.model;

import java.math.BigInteger;
import java.util.List;

import jakarta.xml.bind.JAXBElement;

public interface IEcoSpold {

	List<IDataSet> getDataset();

	List<Object> getAny();

	BigInteger getValidationId();

	void setValidationId(BigInteger value);

	String getValidationStatus();

	void setValidationStatus(String value);

	JAXBElement<?> toElement();

}
