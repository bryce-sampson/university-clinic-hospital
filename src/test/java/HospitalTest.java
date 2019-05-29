import static org.junit.Assert.assertEquals;

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
		String testEmployeeName = underTest.getEmployeeName(1);
		assertEquals("Fred", testEmployeeName);
	}
	
	@Test
	public void hospitalShouldBeAbleToGetJanitorNameJim() {
		underTest.addJanitor("Jim", 2);
		String testEmployeeName = underTest.getEmployeeName(2);
		assertEquals("Jim", testEmployeeName);
	}
	
	@Test
	public void shouldBeAbleToAddNurseToHospital() {
		underTest.addNurse("Sue", 1);
	}
	@Test
	public void hospitalShouldBeAbleToGetNurseNameSue() {
		underTest.addNurse("Sue", 1);
		String testEmployeeName = underTest.getEmployeeName(1);
		assertEquals("Sue", testEmployeeName);
	}
	
	@Test
	public void shouldBeAbleToAddReceptionistToHospital() {
		underTest.addReceptionist("Jane", 1);
	}
	
	@Test
	public void shouldBeAbleToGetReceptionistNameJane() {
		underTest.addReceptionist("Jane", 1);
		String testEmployeeName = underTest.getEmployeeName(1);
		assertEquals("Jane", testEmployeeName);
	}
	
	@Test
	public void shouldBeAbleToAddDoctorToHospital() {
		underTest.addDoctor("Janet", 1, null);
	}
	
	@Test
	public void shouldBeAbleToGetDoctorNameJanet() {
		underTest.addDoctor("Janet", 1, null);
		String testEmployeeName = underTest.getEmployeeName(1);
		assertEquals("Janet", testEmployeeName);
	}
	
}
