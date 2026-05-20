package org.openlca.ecospold;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.Before;
import org.junit.Test;
import org.openlca.ecospold.io.DataSet;
import org.openlca.ecospold.io.DataSetType;
import org.openlca.ecospold.io.EcoSpold;

public class DataSetTest {

	private DataSet ds;

	@Before
	public void setup() throws Exception {
		ds = roundTripExample();
	}

	private DataSet roundTripExample() throws Exception {
		var path = "/org/openlca/ecospold/example.xml";
		try (var stream = getClass().getResourceAsStream(path)) {
			assertNotNull("Missing example.xml test resource", stream);
			var spold = EcoSpold.read(stream, DataSetType.PROCESS).orElseThrow();

			var buffer = new ByteArrayOutputStream();
			EcoSpold.write(buffer, spold).orElseThrow();
			assertTrue(buffer.size() > 0);

			try (var roundTrip = new ByteArrayInputStream(buffer.toByteArray())) {
				var reloaded = EcoSpold.read(roundTrip, DataSetType.PROCESS)
					.orElseThrow();
				return new DataSet(
					reloaded.getDataset().getFirst(),
					DataSetType.PROCESS.getFactory());
			}
		}
	}

	@Test
	public void testGeography() {
		var geo = ds.getGeography();
		assertNotNull(geo);
		assertEquals("DE", geo.getLocation());
		assertEquals(
			"Values describe a fictional neighborhood-scale operation in Germany.",
			geo.getText());
	}

	@Test
	public void testReferenceFunction() {
		var ref = ds.getReferenceFunction();
		assertNotNull(ref);
		assertEquals("community garden compost service", ref.getName());
		assertEquals("kg", ref.getUnit());
		assertEquals("waste treatment", ref.getCategory());
		assertEquals("community composting", ref.getSubCategory());
		assertFalse(ref.isInfrastructureProcess());
		assertTrue(ref.isDatasetRelatesToProduct());
		assertEquals(1, ref.getSynonym().size());
		assertEquals("garden compost test flow", ref.getSynonym().getFirst());
	}

	@Test
	public void testTimePeriod() {
		var time = ds.getTimePeriod();
		assertNotNull(time);
		assertTrue(time.isDataValidForEntirePeriod());
		assertEquals("2024", time.getStartYear().toXMLFormat());
		assertEquals("2025", time.getEndYear().toXMLFormat());
		assertEquals(
			"Representative period used for the fictional test inventory.",
			time.getText());
	}

	@Test
	public void testDataSetInformation() {
		var info = ds.getDataSetInformation();
		assertNotNull(info);
		assertEquals(1, info.getType());
		assertFalse(info.isImpactAssessmentResult());
		assertEquals(1.0f, info.getVersion(), 0.0f);
		assertEquals(1.0f, info.getInternalVersion(), 0.0f);
		assertEquals("en", info.getLanguageCode().value());
		assertEquals("en", info.getLocalLanguageCode().value());
	}

	@Test
	public void testAdministrativeInformation() {
		var entry = ds.getDataEntryBy();
		assertNotNull(entry);
		assertEquals(1, entry.getPerson());
		assertEquals(1, entry.getQualityNetwork().intValue());

		var publication = ds.getDataGeneratorAndPublication();
		assertNotNull(publication);
		assertEquals(1, publication.getPerson());
		assertEquals(0, publication.getDataPublishedIn());
		assertEquals(Integer.valueOf(10), publication.getReferenceToPublishedSource());
		assertFalse(publication.isCopyright());
	}

	@Test
	public void testPersons() {
		var persons = ds.getPersons();
		assertEquals(2, persons.size());

		var first = persons.getFirst();
		assertEquals(1, first.getNumber());
		assertEquals("Alex Example", first.getName());
		assertEquals("OPENLCA-TEST", first.getCompanyCode());
		assertEquals("DE", first.getCountryCode().value());

		var second = persons.get(1);
		assertEquals(2, second.getNumber());
		assertEquals("Casey Checker", second.getName());
	}

	@Test
	public void testExchanges() {
		var exchanges = ds.getExchanges();
		assertEquals(2, exchanges.size());

		var output = exchanges.getFirst();
		assertEquals(1, output.getNumber());
		assertEquals("community garden compost service", output.getName());
		assertEquals("DE", output.getLocation());
		assertEquals("kg", output.getUnit());
		assertEquals(0, output.getOutputGroup().intValue());

		var input = exchanges.get(1);
		assertEquals(2, input.getNumber());
		assertEquals("wood chips, bulking agent", input.getName());
		assertEquals(Integer.valueOf(5), input.getInputGroup());
		assertEquals(0.15, input.getMeanValue(), 0.0);
		assertEquals(Double.valueOf(1.10), input.getStandardDeviation95());
	}

	@Test
	public void testAllocations() {
		var allocations = ds.getAllocations();
		assertEquals(1, allocations.size());

		var allocation = allocations.getFirst();
		assertEquals(1, allocation.getReferenceToCoProduct());
		assertEquals(1, allocation.getAllocationMethod());
		assertEquals(100.0f, allocation.getFraction(), 0.0f);
		assertEquals(1, allocation.getReferenceToInputOutput().size());
		assertEquals(Integer.valueOf(1),
			allocation.getReferenceToInputOutput().getFirst());
	}

	@Test
	public void testSourcesAndValidation() {
		var sources = ds.getSources();
		assertEquals(1, sources.size());

		var source = sources.getFirst();
		assertEquals(10, source.getNumber());
		assertEquals("OpenLCA Test Team", source.getFirstAuthor());
		assertEquals("Synthetic EcoSpold Example Dataset", source.getTitle());
		assertEquals("openLCA test resources", source.getTitleOfAnthology());
		assertEquals("2026", source.getYear().toXMLFormat());

		var validation = ds.getValidation();
		assertNotNull(validation);
		assertEquals(
			"Synthetic dataset reviewed for schema coverage.",
			validation.getProofReadingDetails());
		assertEquals(2, validation.getProofReadingValidator());
	}


}
