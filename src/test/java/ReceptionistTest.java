import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReceptionistTest {
	Receptionist underTest = new Receptionist("", 0);
	@Before
	public void setup() {
		underTest = new Receptionist("", 0);
	} 

	@Test
	public void shouldBeAbleToInstantiateReceptionist() {
		Receptionist testReceptionist = new Receptionist(null, 0);
	}

	@Test
	public void shouldBeAbleToGetReceptionistNameBill() {
		Receptionist bill = new Receptionist("Bill", 0);
		String expectedName = bill.getName();
		assertEquals("Bill", expectedName);
	}

	@Test
	public void shouldBeAbleToGetReceptionistNameJim() {
		Receptionist jim = new Receptionist("Jim", 0);
		String expectedName = jim.getName();
		assertEquals("Jim", expectedName);
	}

	@Test
	public void shouldBeAbleToGetReceptionistNumber3() {
		Receptionist underTest = new Receptionist("", 3);
		int expectedEmployeeNumber = underTest.getEmployeeNumber();
		assertEquals(3, expectedEmployeeNumber);
	}

	@Test
	public void shouldBeAbleToGetReceptionistNumber4() {
		Receptionist underTest = new Receptionist("", 4);
		int expectedEmployeeNumber = underTest.getEmployeeNumber();
		assertEquals(4, expectedEmployeeNumber);
	}
	@Test
	public void shouldBeAbleToGetReceptionistSalary45000() {
		int expectedSalary = underTest.getSalary();
		assertEquals(45000, expectedSalary);
	}
	@Test
	public void shouldBeAbleToGetHasBeenPaidDefaultFalse() {
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();
		assertEquals(false, expectedHasBeenPaid);
	}
	@Test
	public void shouldBeAbleToPayReceptionistAndHasBeenPaidBeTrue() {
		underTest.pay();
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();
		assertEquals(true, expectedHasBeenPaid);
	}
	
	
	@Test
	public void shouldBeAbleToSeeIfOnPhoneCallDefaultFalse() {
		boolean expectedIsOnPhone = underTest.getIsOnPhone();
		assertEquals(false, expectedIsOnPhone);
			
	}
	
	@Test
	public void isOnPhoneShouldBeTrueIfOnPhone() {
		underTest.isOnPhone();
		boolean expectedIsOnPhone = underTest.getIsOnPhone();
		assertEquals(true, expectedIsOnPhone);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}