import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DoctorTest {
	
	Doctor underTest = new Doctor("", 0, null);
	@Before
	public void setup() {
		underTest = new Doctor("", 0, null);
	} 
	
	@Test
	public void shouldBeAbleToInstantiateDoctor() {
		Doctor testDoctor = new Doctor("", 0, null);
	}
	@Test
	public void shouldBeAbleToGetDoctorNameFred() {
		Doctor fred = new Doctor("fred", 0, null);
		String expectedName = fred.getName();
		assertEquals("fred", expectedName);
	}
	@Test
	public void shouldBeAbleToGetDoctorNameJim() {
		Doctor jim = new Doctor("jim", 0, null);
		String expectedName = jim.getName();
		assertEquals("jim", expectedName);
	}
	@Test
	public void shouldBeAbleToGetDoctorNumber30() {
		Doctor underTest = new Doctor("", 30, null);
		int expectedEmployeeNumber = underTest.getEmployeeNumber();
		assertEquals(30, expectedEmployeeNumber);
	}
	@Test
	public void shouldBeAbleToGetDoctorNumber31() {
		Doctor underTest = new Doctor("", 31, null);
		int expectedEmployeeNumber = underTest.getEmployeeNumber();
		assertEquals(31, expectedEmployeeNumber);
	}
	@Test
	public void shouldBeAbleToGetDoctorSalary90000() {
		int expectedSalary = underTest.getSalary();
		assertEquals(90000, expectedSalary);
	}
	@Test
	public void shouldBeAbleToGetHasBeenPaidDefaultFalse() {
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();
		assertEquals(false, expectedHasBeenPaid);
	}
	@Test
	public void shouldBeAbleToPayDoctorAndHasBeenPaidBeTrue() {
		underTest.pay();
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();
		assertEquals(true, expectedHasBeenPaid);
	}
	@Test
	public void shouldBeAbleToReturnNeurosurgeonSpecialty() {
		Doctor neurosurgeon = new Doctor("", 0, "Neurosurgeon");
		String expectedSpecialty = neurosurgeon.getSpecialty();
		assertEquals("Neurosurgeon", expectedSpecialty);
	}
	@Test
	public void shouldBeAbleToReturnPodiatristSpecialty() {
		Doctor podiatrist = new Doctor("", 0, "Podiatrist");
		String expectedSpecialty = podiatrist.getSpecialty();
		assertEquals("Podiatrist", expectedSpecialty);
	}
}
