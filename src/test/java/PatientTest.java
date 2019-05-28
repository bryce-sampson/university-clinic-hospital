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
		testPatient.haveBloodDrawn();
		int finalBloodLevel = testPatient.getBloodLevel();
		assertEquals(initialBloodLevel - 2, finalBloodLevel);
	}
	
	@Test
	public void shouldNotBeAbleToDrainPatientBloodBelow12() {
		Patient testPatient = new Patient();
		testPatient.haveBloodDrawn();
		testPatient.haveBloodDrawn();
		testPatient.haveBloodDrawn();
		testPatient.haveBloodDrawn();
		testPatient.haveBloodDrawn();
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
		testPatient.beCaredFor();
		int finalHealthLevel = testPatient.getHealthLevel();
		assertEquals(initialHealthLevel + 2, finalHealthLevel);
	}
	
	@Test
	public void patientShouldHaveMaximumHealthOf25() {
		Patient testPatient = new Patient();
		testPatient.beCaredFor();
		testPatient.beCaredFor();
		testPatient.beCaredFor();
		testPatient.beCaredFor();
		testPatient.beCaredFor();
		testPatient.beCaredFor();
		testPatient.beCaredFor();
		testPatient.beCaredFor();
		int finalHealthLevel = testPatient.getHealthLevel();
		assertEquals(25, finalHealthLevel);
	}
}
