package org.openlca.ecospold.model.process;

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

	private final ObjectFactory f = new ObjectFactory();

	@Override
	public IEcoSpold createEcoSpold() {
		return f.createEcoSpold();
	}

	@Override
	public IDataEntryBy createDataEntryBy() {
		return f.createDataEntryBy();
	}

	@Override
	public IModellingAndValidation createModellingAndValidation() {
		return f.createModellingAndValidation();
	}

	@Override
	public IAllocation createAllocation() {
		return f.createAllocation();
	}

	@Override
	public ITechnology createTechnology() {
		return f.createTechnology();
	}

	@Override
	public IPerson createPerson() {
		return f.createPerson();
	}

	@Override
	public IExchange createExchange() {
		return f.createExchange();
	}

	@Override
	public IReferenceFunction createReferenceFunction() {
		return f.createReferenceFunction();
	}

	@Override
	public IProcessInformation createProcessInformation() {
		return f.createProcessInformation();
	}

	@Override
	public IValidation createValidation() {
		return f.createValidation();
	}

	@Override
	public IAdministrativeInformation createAdministrativeInformation() {
		return f.createAdministrativeInformation();
	}

	@Override
	public IDataGeneratorAndPublication createDataGeneratorAndPublication() {
		return f.createDataGeneratorAndPublication();
	}

	@Override
	public IDataSet createDataSet() {
		return f.createDataSet();
	}

	@Override
	public IDataSetInformation createDataSetInformation() {
		return f.createDataSetInformation();
	}

	@Override
	public ISource createSource() {
		return f.createSource();
	}

	@Override
	public IMetaInformation createMetaInformation() {
		return f.createMetaInformation();
	}

	@Override
	public ITimePeriod createTimePeriod() {
		return f.createTimePeriod();
	}

	@Override
	public IRepresentativeness createRepresentativeness() {
		return f.createRepresentativeness();
	}

	@Override
	public IGeography createGeography() {
		return f.createGeography();
	}

	@Override
	public IFlowData createFlowData() {
		return f.createFlowData();
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
