
public class Employee {
	protected String name;
	protected int employeeNumber;
	protected boolean hasBeenPaid;
	
	public String getName() {
		return name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public boolean getHasBeenPaid() {
		return hasBeenPaid;
	}

	public void pay() {
		hasBeenPaid = true;
	}
}
