package org.openlca.ecospold.model;

import org.w3c.dom.Element;

import java.util.List;

public interface IModellingAndValidation {

	public abstract IRepresentativeness getRepresentativeness();

	public abstract void setRepresentativeness(IRepresentativeness value);

	public abstract List<ISource> getSources();

	public abstract IValidation getValidation();

	public abstract void setValidation(IValidation value);

	public abstract List<Object> getAny();

}
