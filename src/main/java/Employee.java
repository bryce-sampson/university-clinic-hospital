
public abstract class Employee {
	private String name;
	private int employeeNumber;
	private boolean hasBeenPaid;
	
	public String getName() {
		return name;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public boolean getHasBeenPaid() {
		return hasBeenPaid;
	}
	
	public Employee(String name, int employeeNumber) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.hasBeenPaid = false;
	}
	
	public void pay() {
		hasBeenPaid = true;
	}
}
