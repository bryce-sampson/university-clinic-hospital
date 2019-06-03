import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatientTest {
	@Test
	public void patientShouldExist() {
		Patient testPatient = new Patient();
	}
	
	@Test
	public void patientShouldHaveDefaultBloodLevelOf20() {
		Patient testPatient = new Patient();
		int testBloodLevel = testPatient.getBloodLevel();
		assertEquals(20, testBloodLevel);
	}
	
	@Test
	public void patientShouldBeAbleToHaveBloodDrawnAndDecreaseBloodLevelBy2() {
		Patient testPatient = new Patient();
		int initialBloodLevel = testPatient.getBloodLevel();
		testPatient.haveBloodDrawn(2);
		int finalBloodLevel = testPatient.getBloodLevel();
		assertEquals(initialBloodLevel - 2, finalBloodLevel);
	}
	
	@Test
	public void shouldNotBeAbleToDrainPatientBloodBelow12() {
		Patient testPatient = new Patient();
		testPatient.haveBloodDrawn(2);
		testPatient.haveBloodDrawn(2);
		testPatient.haveBloodDrawn(2);
		testPatient.haveBloodDrawn(2);
		testPatient.haveBloodDrawn(2);
		int finalBloodLevel = testPatient.getBloodLevel();
		assertEquals(12, finalBloodLevel);
	}
	
	@Test
	public void patientShouldHaveDefaultHealthLevelOf10() {
		Patient testPatient = new Patient();
		int testHealthLevel = testPatient.getHealthLevel();
		assertEquals(10, testHealthLevel);
	}
	
	@Test
	public void patientShouldBeAbleToBeCaredForAndIncreaseHealthBy2() {
		Patient testPatient = new Patient();
		int initialHealthLevel = testPatient.getHealthLevel();
		testPatient.beCaredFor(2);
		int finalHealthLevel = testPatient.getHealthLevel();
		assertEquals(initialHealthLevel + 2, finalHealthLevel);
	}
	
	@Test
	public void patientShouldHaveMaximumHealthOf25() {
		Patient testPatient = new Patient();
		testPatient.beCaredFor(2);
		testPatient.beCaredFor(2);
		testPatient.beCaredFor(2);
		testPatient.beCaredFor(2);
		testPatient.beCaredFor(2);
		testPatient.beCaredFor(2);
		testPatient.beCaredFor(2);
		testPatient.beCaredFor(2);
		int finalHealthLevel = testPatient.getHealthLevel();
		assertEquals(25, finalHealthLevel);
	}
}
