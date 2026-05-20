package org.openlca.ecospold.model;

import java.math.BigInteger;

public interface IDataEntryBy {

	public abstract int getPerson();

	public abstract void setPerson(int value);

	public abstract BigInteger getQualityNetwork();

	public abstract void setQualityNetwork(BigInteger value);

}
