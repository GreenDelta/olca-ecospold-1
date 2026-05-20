package org.openlca.ecospold;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openlca.ecospold.model.IEcoSpold;

import java.nio.file.Files;

public class WriteReadTest {

	@Test
	public void testProcess() throws Exception {
		with(EcoSpold.newProcess());
	}

	@Test
	public void testImpactMethod() throws Exception {
		with(EcoSpold.newImpactMethod());
	}

	private void with(IEcoSpold spold) throws Exception {
		var ds = spold.newDataSet();
		ds.withReferenceFunction().setName("a test");

		var file = Files.createTempFile(
			"_olca_test", ".xml").toFile();
		EcoSpold.write(file, spold);

		var name = EcoSpold.read(file)
			.orElseThrow()
			.getDataSets()
			.getFirst()
			.getMetaInformation()
			.getProcessInformation()
			.getReferenceFunction()
			.getName();
		assertEquals("a test", name);

		Files.delete(file.toPath());
	}
}
