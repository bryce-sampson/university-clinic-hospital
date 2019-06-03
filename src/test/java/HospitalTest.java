import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {
	
	Hospital underTest = new Hospital();
	@Before
	public void setup() {
		Hospital underTest = new Hospital();
	}
	@Test
	public void hospitalClassShouldExist() {
		Hospital underTest = new Hospital();
	}
	
	@Test
	public void hospitalClassShouldHaveZeroEmployees() {
		int numberOfEmployees = underTest.getNumberOfEmployees();
		assertEquals(0, numberOfEmployees);
	}	
	
	@Test
	public void shouldBeAbleToAddJanitorToHospital() {
		underTest.addJanitor("Fred", 1);
	}
	
	@Test
	public void hospitalShouldBeAbleToGetJanitorNameFred() {
		underTest.addJanitor("Fred", 1);
		String testEmployeeName = underTest.getName(1);
		assertEquals("Fred", testEmployeeName);
	}
	
	@Test
	public void hospitalShouldBeAbleToGetJanitorNameJim() {
		underTest.addJanitor("Jim", 2);
		String testEmployeeName = underTest.getName(2);
		assertEquals("Jim", testEmployeeName);
	}
	
	@Test
	public void shouldBeAbleToAddNurseToHospital() {
		underTest.addNurse("Sue", 1);
	}
	@Test
	public void hospitalShouldBeAbleToGetNurseNameSue() {
		underTest.addNurse("Sue", 1);
		String testEmployeeName = underTest.getName(1);
		assertEquals("Sue", testEmployeeName);
	}
	
	@Test
	public void shouldBeAbleToAddReceptionistToHospital() {
		underTest.addReceptionist("Jane", 1);
	}
	
	@Test
	public void shouldBeAbleToGetReceptionistNameJane() {
		underTest.addReceptionist("Jane", 1);
		String testEmployeeName = underTest.getName(1);
		assertEquals("Jane", testEmployeeName);
	}
	
	@Test
	public void shouldBeAbleToAddDoctorToHospital() {
		underTest.addDoctor("Janet", 1, null);
	}
	
	@Test
	public void shouldBeAbleToGetDoctorNameJanet() {
		underTest.addDoctor("Janet", 1, null);
		String testEmployeeName = underTest.getName(1);
		assertEquals("Janet", testEmployeeName);
	}
	
	@Test
	public void shouldBeAbleToPaySingleEmployeeJanet() {
		underTest.addDoctor("Janet", 1,  null);
		underTest.pay(1);
		boolean janetHasBeenPaid = underTest.getHasBeenPaid(1);
		assertEquals(true, janetHasBeenPaid);
	}
	
	@Test
	public void shouldBeAbleToGetDoctorJanetSalary90000() {
		underTest.addDoctor("Janet", 1, null);
		int janetSalary = underTest.getSalary(1);
		assertEquals(90000, janetSalary);
	}
	
	@Test
	public void shouldBeAbleToGetNurseStephanieSalary50000() {
		underTest.addNurse("Stephanie", 1);
		int stephanieSalary = underTest.getSalary(1);
		assertEquals(50000, stephanieSalary);	
	}
	
	@Test
	public void shouldBeAbleToGetDoctorJanetSpecialtyNeurosurgery() {
		underTest.addDoctor("Janet", 1, "Neurosurgery");
		String janetSpecialty = underTest.getSpecialty(1);
		assertEquals("Neurosurgery", janetSpecialty);
	}
	
	@Test
	public void shouldBeAbleToGetDoctorBobSpecialtyProctology() {
		underTest.addDoctor("Bob", 1, "Proctology");
		String bobSpecialty = underTest.getSpecialty(1);
		assertEquals("Proctology", bobSpecialty);
	}
	
	@Test
	public void shouldBeAbleToAddFourEmployeesAndGetNumberOfEmployeesFour() {
		underTest.addDoctor("Alpha", 1, null);
		underTest.addNurse("Beta", 2);
		underTest.addReceptionist("Gamma", 3);
		underTest.addJanitor("Delta", 4);
		int numberOfEmployees = underTest.getNumberOfEmployees();
		assertEquals(4, numberOfEmployees);
	}
	
	@Test
	public void shouldBeAbleToGetNurseSallyNumberOfPatientsZero() {
		underTest.addNurse("Sally", 1);
		int sallyNumberOfPatients = underTest.getNumberOfPatients(1);
		assertEquals(sallyNumberOfPatients, 0);
	}
	
	@Test
	public void shouldBeAbleToGetReceptionistAveryIsOnPhoneFalse() {
		underTest.addReceptionist("Avery", 1);
		boolean averyOnPhone = underTest.getIsOnPhone(1);
		assertEquals(false, averyOnPhone);
	}
	
	@Test
	public void shouldBeAbleToGetJanitorKennedyIsSweepingFalse() {
		underTest.addJanitor("Kennedy", 1);
		boolean kennedySweeping = underTest.getIsSweeping(1);
		assertEquals(false, kennedySweeping);
	}
	
	@Test
	public void shouldBeAbleToPayFourEmployees() {
		underTest.addDoctor("Alpha", 1, null);
		underTest.addNurse("Beta", 2);
		underTest.addReceptionist("Gamma", 3);
		underTest.addJanitor("Delta", 4);
		underTest.payAll();
		assertEquals(true, underTest.getHasBeenPaid(1));
		assertEquals(true, underTest.getHasBeenPaid(2));
		assertEquals(true, underTest.getHasBeenPaid(3));
		assertEquals(true, underTest.getHasBeenPaid(4));
	}
}
