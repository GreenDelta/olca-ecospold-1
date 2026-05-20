package org.openlca.ecospold.io;

import org.openlca.ecospold.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;
import java.util.Objects;

/**
 * An adapter class for EcoSpold 01 data sets which provides an easy access to
 * internal elements of data sets and ensures that 'path' elements are created
 * when such internal elements are set.
 */
public class DataSet {

	private final IDataSet ds;
	private final IEcoSpoldFactory factory;

	public DataSet(IDataSet ds, IEcoSpoldFactory factory) {
		this.ds = Objects.requireNonNull(ds);
		this.factory = Objects.requireNonNull(factory);
		if (ds.getFlowData().size() > 1) {
			aggregateFlowData();
		}
		if (ds.getFlowData().isEmpty()) {
			ds.getFlowData().add(factory.createFlowData());
		}
	}

	// to avoid different lists when aggregating all exchange lists from the
	// different flow data, all exchanges (and allocations) will be appended to
	// one new flow data object (this is just to ensure safe modifications on
	// the lists, since no file is known where several flow data instances are
	// used anyway)
	private void aggregateFlowData() {
		var flowData = factory.createFlowData();
		for (var fd : ds.getFlowData()) {
			flowData.getExchange().addAll(fd.getExchange());
			flowData.getAllocation().addAll(fd.getAllocation());
		}
		ds.getFlowData().clear();
		ds.getFlowData().add(flowData);
	}

	public IMetaInformation withMetaInformation() {
		if (ds.getMetaInformation() == null) {
			ds.setMetaInformation(factory.createMetaInformation());
		}
		return ds.getMetaInformation();
	}

	private IAdministrativeInformation withAdministrativeInformation() {
		IMetaInformation metaInformation = withMetaInformation();
		if (metaInformation.getAdministrativeInformation() == null) {
			metaInformation.setAdministrativeInformation(
					factory.createAdministrativeInformation());
		}
		return metaInformation.getAdministrativeInformation();
	}

	private IModellingAndValidation withModellingAndValidation() {
		IMetaInformation metaInformation = withMetaInformation();
		if (metaInformation.getModellingAndValidation() == null) {
			metaInformation.setModellingAndValidation(
					factory.createModellingAndValidation());
		}
		return metaInformation.getModellingAndValidation();
	}

	private IProcessInformation withProcessInformation() {
		IMetaInformation metaInformation = withMetaInformation();
		if (metaInformation.getProcessInformation() == null) {
			metaInformation.setProcessInformation(
					factory.createProcessInformation());
		}
		return metaInformation.getProcessInformation();
	}



	private IAdministrativeInformation getAdministrativeInformation() {
		IAdministrativeInformation administrativeInformation = null;
		if (ds.getMetaInformation() != null) {
			administrativeInformation = ds.getMetaInformation()
					.getAdministrativeInformation();
		}
		return administrativeInformation;
	}

	private IModellingAndValidation getModellingAndValidation() {
		IModellingAndValidation modellingAndValidation = null;
		if (ds.getMetaInformation() != null) {
			modellingAndValidation = ds.getMetaInformation()
					.getModellingAndValidation();
		}
		return modellingAndValidation;
	}

	private IProcessInformation getProcessInformation() {
		IProcessInformation processInformation = null;
		if (ds.getMetaInformation() != null) {
			processInformation = ds.getMetaInformation()
					.getProcessInformation();
		}
		return processInformation;
	}

	public IDataEntryBy getDataEntryBy() {
		IDataEntryBy dataEntryBy = null;
		if (getAdministrativeInformation() != null) {
			dataEntryBy = getAdministrativeInformation().getDataEntryBy();
		}
		return dataEntryBy;
	}

	public void setDataEntryBy(IDataEntryBy value) {
		withAdministrativeInformation().setDataEntryBy(value);
	}

	public IDataGeneratorAndPublication getDataGeneratorAndPublication() {
		IDataGeneratorAndPublication dataGeneratorAndPublication = null;
		if (getAdministrativeInformation() != null) {
			dataGeneratorAndPublication = getAdministrativeInformation()
					.getDataGeneratorAndPublication();
		}
		return dataGeneratorAndPublication;
	}

	public void setDataGeneratorAndPublication(
			IDataGeneratorAndPublication value) {
		withAdministrativeInformation().setDataGeneratorAndPublication(value);
	}

	public IDataSetInformation getDataSetInformation() {
		IDataSetInformation dataSetInformation = null;
		if (getProcessInformation() != null) {
			dataSetInformation = getProcessInformation()
					.getDataSetInformation();
		}
		return dataSetInformation;
	}

	public void setDataSetInformation(IDataSetInformation value) {
		withProcessInformation().setDataSetInformation(value);
	}

	public List<IExchange> getExchanges() {
		// list size of 1 is ensured and contains all exchanges
		// see #initialize
		return ds.getFlowData().get(0).getExchange();
	}

	public List<IAllocation> getAllocations() {
		// list size of 1 is ensured and contains all allocations
		// see #initialize
		return ds.getFlowData().get(0).getAllocation();
	}

	public String getGenerator() {
		return ds.getGenerator();
	}

	public IGeography getGeography() {
		IGeography geography = null;
		if (getProcessInformation() != null) {
			geography = getProcessInformation().getGeography();
		}
		return geography;
	}

	public void setGeography(IGeography value) {
		withProcessInformation().setGeography(value);
	}

	public String getInternalSchemaVersion() {
		return ds.getInternalSchemaVersion();
	}

	public int getNumber() {
		return ds.getNumber();
	}

	public List<IPerson> getPersons() {
		return withAdministrativeInformation().getPerson();
	}

	public IReferenceFunction getReferenceFunction() {
		IReferenceFunction referenceFunction = null;
		if (getProcessInformation() != null) {
			referenceFunction = getProcessInformation().getReferenceFunction();
		}
		return referenceFunction;
	}

	public void setReferenceFunction(IReferenceFunction value) {
		withProcessInformation().setReferenceFunction(value);
	}

	public IRepresentativeness getRepresentativeness() {
		IRepresentativeness representativeness = null;
		if (getModellingAndValidation() != null) {
			representativeness = getModellingAndValidation()
					.getRepresentativeness();
		}
		return representativeness;
	}

	public void setRepresentativeness(IRepresentativeness value) {
		withModellingAndValidation().setRepresentativeness(value);
	}

	/**
	 * Returns the sources under modelling and validation. The returned list is
	 * guaranteed to be never NULL.
	 */
	public List<ISource> getSources() {
		return withModellingAndValidation().getSource();
	}

	public ITechnology getTechnology() {
		ITechnology technology = null;
		if (getProcessInformation() != null
				&& getProcessInformation().getTechnology() != null) {
			technology = getProcessInformation().getTechnology();
		}
		return technology;
	}

	public void setTechnology(ITechnology value) {
		withProcessInformation().setTechnology(value);
	}

	public ITimePeriod getTimePeriod() {
		ITimePeriod timePeriod = null;
		if (getProcessInformation() != null) {
			timePeriod = getProcessInformation().getTimePeriod();
		}
		return timePeriod;
	}

	public void setTimePeriod(ITimePeriod value) {
		withProcessInformation().setTimePeriod(value);
	}

	public XMLGregorianCalendar getTimestamp() {
		return ds.getTimestamp();
	}

	public IValidation getValidation() {
		IValidation validation = null;
		if (getModellingAndValidation() != null) {
			validation = getModellingAndValidation().getValidation();
		}
		return validation;
	}

	public void setValidation(IValidation value) {
		withModellingAndValidation().setValidation(value);
	}

}
