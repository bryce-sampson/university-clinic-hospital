
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NurseTest {
	
	Nurse underTest = new Nurse("", 0);
	@Before
	public void setup() {
		underTest = new Nurse("", 0);
	} 
	
	@Test
	public void shouldBeAbleToInstantiateNurse() {
		Nurse testNurse = new Nurse("", 0);
	}
	@Test
	public void shouldBeAbleToGetNurseNameFred() {
		Nurse fred = new Nurse("fred", 0);
		String expectedName = fred.getName();
		assertEquals("fred", expectedName);
	}
	@Test
	public void shouldBeAbleToGetNurseNameJim() {
		Nurse jim = new Nurse("jim", 0);
		String expectedName = jim.getName();
		assertEquals("jim", expectedName);
	}
	@Test
	public void shouldBeAbleToGetNurseNumber30() {
		Nurse underTest = new Nurse("", 30);
		int expectedEmployeeNumber = underTest.getEmployeeNumber();
		assertEquals(30, expectedEmployeeNumber);
	}
	@Test
	public void shouldBeAbleToGetNurseNumber31() {
		Nurse underTest = new Nurse("", 31);
		int expectedEmployeeNumber = underTest.getEmployeeNumber();
		assertEquals(31, expectedEmployeeNumber);
	}
	@Test
	public void shouldBeAbleToGetNurseSalary50000() {
		int expectedSalary = underTest.getSalary();
		assertEquals(50000, expectedSalary);
	}
	@Test
	public void shouldBeAbleToGetHasBeenPaidDefaultFalse() {
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();
		assertEquals(false, expectedHasBeenPaid);
	}
	@Test
	public void shouldBeAbleToPayNurseAndHasBeenPaidBeTrue() {
		underTest.pay();
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();
		assertEquals(true, expectedHasBeenPaid);
	}
	
	@Test
	public void shouldBeAbleToGetNumberOfPatients() {
		underTest.getNumberOfPatients();
	}
	
	@Test
	public void shouldBeAbleToDrawBlood() {
		Patient testPatient = new Patient();
		int initialBloodLevel = testPatient.getBloodLevel();
		underTest.drawBlood(testPatient);
		int finalBloodLevel = testPatient.getBloodLevel();
		assertEquals(initialBloodLevel -1, finalBloodLevel);
	}
	
	@Test
	public void shouldBeAbleToCareForPatient() {
		Patient testPatient = new Patient();
		int initialHealthLevel = testPatient.getHealthLevel();
		underTest.care(testPatient);
		int finalHealthLevel = testPatient.getHealthLevel();
		assertEquals(initialHealthLevel +1, finalHealthLevel);
	}
	
	
	
	
	
	
}

