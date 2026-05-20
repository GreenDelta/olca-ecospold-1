package org.openlca.ecospold;

import org.openlca.ecospold.model.IAdministrativeInformation;
import org.openlca.ecospold.model.IAllocation;
import org.openlca.ecospold.model.IDataEntryBy;
import org.openlca.ecospold.model.IDataGeneratorAndPublication;
import org.openlca.ecospold.model.IDataSet;
import org.openlca.ecospold.model.IDataSetInformation;
import org.openlca.ecospold.model.IEcoSpoldFactory;
import org.openlca.ecospold.model.IExchange;
import org.openlca.ecospold.model.IFlowData;
import org.openlca.ecospold.model.IGeography;
import org.openlca.ecospold.model.IMetaInformation;
import org.openlca.ecospold.model.IModellingAndValidation;
import org.openlca.ecospold.model.IPerson;
import org.openlca.ecospold.model.IProcessInformation;
import org.openlca.ecospold.model.IReferenceFunction;
import org.openlca.ecospold.model.IRepresentativeness;
import org.openlca.ecospold.model.ISource;
import org.openlca.ecospold.model.ITechnology;
import org.openlca.ecospold.model.ITimePeriod;
import org.openlca.ecospold.model.IValidation;

import java.util.Collections;
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
	}

	public IMetaInformation withMetaInformation() {
		if (ds.getMetaInformation() == null) {
			ds.setMetaInformation(factory.createMetaInformation());
		}
		return ds.getMetaInformation();
	}

	private IAdministrativeInformation withAdministrativeInformation() {
		var metaInfo = withMetaInformation();
		if (metaInfo.getAdministrativeInformation() == null) {
			metaInfo.setAdministrativeInformation(
				factory.createAdministrativeInformation());
		}
		return metaInfo.getAdministrativeInformation();
	}

	private IModellingAndValidation withModellingAndValidation() {
		var metaInfo = withMetaInformation();
		if (metaInfo.getModellingAndValidation() == null) {
			metaInfo.setModellingAndValidation(
				factory.createModellingAndValidation());
		}
		return metaInfo.getModellingAndValidation();
	}

	private IProcessInformation withProcessInformation() {
		var metaInfo = withMetaInformation();
		if (metaInfo.getProcessInformation() == null) {
			metaInfo.setProcessInformation(
				factory.createProcessInformation());
		}
		return metaInfo.getProcessInformation();
	}

	private IAdministrativeInformation getAdministrativeInformation() {
		var metaInfo = ds.getMetaInformation();
		return metaInfo != null
			? metaInfo.getAdministrativeInformation()
			: null;
	}

	private IModellingAndValidation getModellingAndValidation() {
		var metaInfo = ds.getMetaInformation();
		return metaInfo != null
			? metaInfo.getModellingAndValidation()
			: null;
	}

	private IProcessInformation getProcessInformation() {
		var metaInfo = ds.getMetaInformation();
		return metaInfo != null
			? metaInfo.getProcessInformation()
			: null;
	}

	public IDataEntryBy getDataEntryBy() {
		var adminInfo = getAdministrativeInformation();
		return adminInfo != null
			? adminInfo.getDataEntryBy()
			: null;
	}

	public IDataEntryBy withDataEntryBy() {
		var adminInfo =	withAdministrativeInformation();
		if (adminInfo.getDataEntryBy() == null) {
			adminInfo.setDataEntryBy(factory.createDataEntryBy());
		}
		return adminInfo.getDataEntryBy();
	}

	public IDataGeneratorAndPublication getDataGeneratorAndPublication() {
		var adminInfo = getAdministrativeInformation();
		return adminInfo != null
			? adminInfo.getDataGeneratorAndPublication()
			: null;
	}

	public IDataGeneratorAndPublication withDataGeneratorAndPublication() {
		var adminInfo = withAdministrativeInformation();
		if (adminInfo.getDataGeneratorAndPublication() == null) {
			adminInfo.setDataGeneratorAndPublication(
				factory.createDataGeneratorAndPublication());
		}
		return adminInfo.getDataGeneratorAndPublication();
	}

	public IDataSetInformation getDataSetInformation() {
		var procInfo = getProcessInformation();
		return procInfo != null
			? procInfo.getDataSetInformation()
			: null;
	}

	public IDataSetInformation withDataSetInformation() {
		var procInfo = withProcessInformation();
		if (procInfo.getDataSetInformation() == null) {
			procInfo.setDataSetInformation(factory.createDataSetInformation());
		}
		return procInfo.getDataSetInformation();
	}

	private IFlowData getFlowData() {
		return !ds.getFlowData().isEmpty()
			? ds.getFlowData().getFirst()
			: null;
	}

	private IFlowData withFlowData() {
		var flowData = getFlowData();
		if (flowData != null)
			return flowData;
		flowData = factory.createFlowData();
		ds.getFlowData().add(flowData);
		return flowData;
	}

	public List<IExchange> getExchanges() {
		var flowData = getFlowData();
		return flowData != null
			? flowData.getExchanges()
			: Collections.emptyList();
	}

	public List<IExchange> withExchanges() {
		return withFlowData().getExchanges();
	}

	public List<IAllocation> getAllocations() {
		var flowData = getFlowData();
		return flowData != null
			? flowData.getAllocation()
			: Collections.emptyList();
	}

	public List<IAllocation> withAllocations() {
		return withFlowData().getAllocation();
	}

	public IGeography getGeography() {
		var procInfo = getProcessInformation();
		return procInfo != null
			? procInfo.getGeography()
			: null;
	}

	public IGeography withGeography() {
		var procInfo = withProcessInformation();
		if (procInfo.getGeography() == null) {
			procInfo.setGeography(factory.createGeography());
		}
		return procInfo.getGeography();
	}

	public List<IPerson> getPersons() {
		var adminInfo = getAdministrativeInformation();
		return adminInfo != null
			? adminInfo.getPersons()
			: Collections.emptyList();
	}

	public List<IPerson> withPersons() {
		return withAdministrativeInformation().getPersons();
	}

	public IReferenceFunction getReferenceFunction() {
		var procInfo = getProcessInformation();
		return procInfo != null
			? procInfo.getReferenceFunction()
			: null;
	}

	public IReferenceFunction withReferenceFunction() {
		var procInfo = withProcessInformation();
		if (procInfo.getReferenceFunction() == null) {
			procInfo.setReferenceFunction(
				factory.createReferenceFunction());
		}
		return procInfo.getReferenceFunction();
	}

	public IRepresentativeness getRepresentativeness() {
		var modVal = getModellingAndValidation();
		return modVal != null
			? modVal.getRepresentativeness()
			: null;
	}

	public IRepresentativeness withRepresentativeness() {
		var modVal = withModellingAndValidation();
		if (modVal.getRepresentativeness() == null) {
			modVal.setRepresentativeness(
				factory.createRepresentativeness());
		}
		return modVal.getRepresentativeness();
	}

	/**
	 * Returns the sources under modelling and validation. The returned list is
	 * guaranteed to be never NULL.
	 */
	public List<ISource> getSources() {
		var modVal = getModellingAndValidation();
		return modVal != null
			? modVal.getSources()
			: Collections.emptyList();
	}

	public List<ISource> withSources() {
		return withModellingAndValidation().getSources();
	}

	public ITechnology getTechnology() {
		var procInfo = getProcessInformation();
		return procInfo != null
			? procInfo.getTechnology()
			: null;
	}

	public ITechnology withTechnology() {
		var procInfo = withProcessInformation();
		if (procInfo.getTechnology() == null) {
			procInfo.setTechnology(factory.createTechnology());
		}
		return procInfo.getTechnology();
	}

	public ITimePeriod getTimePeriod() {
		var procInfo = getProcessInformation();
		return procInfo != null
			? procInfo.getTimePeriod()
			: null;
	}

	public ITimePeriod withTimePeriod() {
		var procInfo = withProcessInformation();
		if (procInfo.getTimePeriod() == null) {
			procInfo.setTimePeriod(factory.createTimePeriod());
		}
		return procInfo.getTimePeriod();
	}

	public IValidation getValidation() {
		var modVal = getModellingAndValidation();
		return modVal != null
			? modVal.getValidation()
			: null;
	}

	public IValidation withValidation() {
		var modVal = withModellingAndValidation();
		if (modVal.getValidation() == null) {
			modVal.setValidation(factory.createValidation());
		}
		return modVal.getValidation();
	}

}
