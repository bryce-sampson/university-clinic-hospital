import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JanitorTest {
	Janitor underTest = new Janitor("", 0);
	@Before
	public void setup() {
		underTest = new Janitor("", 0);
	} 

	@Test
	public void shouldBeAbleToInstantiateJanitor() {
		Janitor testJanitor = new Janitor(null, 0);
	}

	@Test
	public void shouldBeAbleToGetJanitorNameBill() {
		Janitor bill = new Janitor("Bill", 0);
		String expectedName = bill.getName();
		assertEquals("Bill", expectedName);
	}

	@Test
	public void shouldBeAbleToGetJanitorNameJim() {
		Janitor jim = new Janitor("Jim", 0);
		String expectedName = jim.getName();
		assertEquals("Jim", expectedName);
	}

	@Test
	public void shouldBeAbleToGetJanitorNumber3() {
		Janitor underTest = new Janitor("", 3);
		int expectedEmployeeNumber = underTest.getEmployeeNumber();
		assertEquals(3, expectedEmployeeNumber);
	}

	@Test
	public void shouldBeAbleToGetJanitorNumber4() {
		Janitor underTest = new Janitor("", 4);
		int expectedEmployeeNumber = underTest.getEmployeeNumber();
		assertEquals(4, expectedEmployeeNumber);
	}
	@Test
	public void shouldBeAbleToGetJanitorSalary40000() {
		int expectedSalary = underTest.getSalary();
		assertEquals(40000, expectedSalary);
	}
	@Test
	public void shouldBeAbleToGetHasBeenPaidDefaultFalse() {
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();
		assertEquals(false, expectedHasBeenPaid);
	}
	@Test
	public void shouldBeAbleToPayJanitorAndHasBeenPaidBeTrue() {
		underTest.pay();
		boolean expectedHasBeenPaid = underTest.getHasBeenPaid();
		assertEquals(true, expectedHasBeenPaid);
	}
	
	@Test
	public void shouldBeAbleToTellIfSweepingDefaultFalse() {
		boolean expectedIsSweeping = underTest.getIsSweeping();
		assertEquals(false, expectedIsSweeping);
	}
	@Test
	public void isSweepingShouldBeTrueIfSweeping() {
		underTest.sweep();
		boolean expectedIsSweeping = underTest.getIsSweeping();
		assertEquals(true, expectedIsSweeping);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}