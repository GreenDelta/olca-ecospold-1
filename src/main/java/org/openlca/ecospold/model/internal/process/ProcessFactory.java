package org.openlca.ecospold.model.internal.process;

import org.openlca.ecospold.model.IAdministrativeInformation;
import org.openlca.ecospold.model.IAllocation;
import org.openlca.ecospold.model.ICountryCode;
import org.openlca.ecospold.model.IDataEntryBy;
import org.openlca.ecospold.model.IDataGeneratorAndPublication;
import org.openlca.ecospold.model.IDataSet;
import org.openlca.ecospold.model.IDataSetInformation;
import org.openlca.ecospold.model.IEcoSpold;
import org.openlca.ecospold.model.IEcoSpoldFactory;
import org.openlca.ecospold.model.IExchange;
import org.openlca.ecospold.model.IFlowData;
import org.openlca.ecospold.model.IGeography;
import org.openlca.ecospold.model.ILanguageCode;
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

public class ProcessFactory implements IEcoSpoldFactory {

	private ObjectFactory objectFactory = new ObjectFactory();

	public final static ProcessFactory INSTANCE = new ProcessFactory();

	@Override
	public IEcoSpold createEcoSpold() {
		return objectFactory.createEcoSpold();
	}

	@Override
	public IDataEntryBy createDataEntryBy() {
		return objectFactory.createDataEntryBy();
	}

	@Override
	public IModellingAndValidation createModellingAndValidation() {
		return objectFactory.createModellingAndValidation();
	}

	@Override
	public IAllocation createAllocation() {
		return objectFactory.createAllocation();
	}

	@Override
	public ITechnology createTechnology() {
		return objectFactory.createTechnology();
	}

	@Override
	public IPerson createPerson() {
		return objectFactory.createPerson();
	}

	@Override
	public IExchange createExchange() {
		return objectFactory.createExchange();
	}

	@Override
	public IReferenceFunction createReferenceFunction() {
		return objectFactory.createReferenceFunction();
	}

	@Override
	public IProcessInformation createProcessInformation() {
		return objectFactory.createProcessInformation();
	}

	@Override
	public IValidation createValidation() {
		return objectFactory.createValidation();
	}

	@Override
	public IAdministrativeInformation createAdministrativeInformation() {
		return objectFactory.createAdministrativeInformation();
	}

	@Override
	public IDataGeneratorAndPublication createDataGeneratorAndPublication() {
		return objectFactory.createDataGeneratorAndPublication();
	}

	@Override
	public IDataSet createDataSet() {
		return objectFactory.createDataSet();
	}

	@Override
	public IDataSetInformation createDataSetInformation() {
		return objectFactory.createDataSetInformation();
	}

	@Override
	public ISource createSource() {
		return objectFactory.createSource();
	}

	@Override
	public IMetaInformation createMetaInformation() {
		return objectFactory.createMetaInformation();
	}

	@Override
	public ITimePeriod createTimePeriod() {
		return objectFactory.createTimePeriod();
	}

	@Override
	public IRepresentativeness createRepresentativeness() {
		return objectFactory.createRepresentativeness();
	}

	@Override
	public IGeography createGeography() {
		return objectFactory.createGeography();
	}

	@Override
	public IFlowData createFlowData() {
		return objectFactory.createFlowData();
	}

	@Override
	public ICountryCode getCountryCode(String code) {
		if (code == null)
			return null;
		for (CountryCode countryCode : CountryCode.values()) {
			if (countryCode.name().equalsIgnoreCase(code))
				return countryCode;
		}
		return null;
	}

	@Override
	public ILanguageCode getLanguageCode(String code) {
		return LanguageCode.fromValue(code);
	}

}
