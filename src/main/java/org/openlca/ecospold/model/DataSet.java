package org.openlca.ecospold.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/// Wraps a single EcoSpold data set instance and provides convenient access
/// to its nested structures.
///
/// The `get*` methods are query methods for reading the wrapped data set. They
/// do not create missing structures. Depending on the requested element, they
/// can therefore return `null` or an empty immutable list when the respective
/// path is not present in the wrapped data set.
///
/// The `with*` methods are intended for writing data sets. They create the
/// required path and target structure on demand, so that the returned object or
/// list can be modified directly.
public class DataSet {

	private final IDataSet root;
	private final IEcoSpoldFactory factory;

	public DataSet(IDataSet root, IEcoSpoldFactory factory) {
		this.root = Objects.requireNonNull(root);
		this.factory = Objects.requireNonNull(factory);
	}

	/// Returns the root of the underlying raw dataset of this wrapper.
	public IDataSet root() {
		return root;
	}

	public IEcoSpoldFactory factory() {
		return factory;
	}

	public IMetaInformation withMetaInformation() {
		if (root.getMetaInformation() == null) {
			root.setMetaInformation(factory.createMetaInformation());
		}
		return root.getMetaInformation();
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
		var metaInfo = root.getMetaInformation();
		return metaInfo != null
			? metaInfo.getAdministrativeInformation()
			: null;
	}

	private IModellingAndValidation getModellingAndValidation() {
		var metaInfo = root.getMetaInformation();
		return metaInfo != null
			? metaInfo.getModellingAndValidation()
			: null;
	}

	private IProcessInformation getProcessInformation() {
		var metaInfo = root.getMetaInformation();
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
		var adminInfo = withAdministrativeInformation();
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
		return !root.getFlowData().isEmpty()
			? root.getFlowData().getFirst()
			: null;
	}

	private IFlowData withFlowData() {
		var flowData = getFlowData();
		if (flowData != null)
			return flowData;
		flowData = factory.createFlowData();
		root.getFlowData().add(flowData);
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
