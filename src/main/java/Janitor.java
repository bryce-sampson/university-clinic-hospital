
public class Janitor {

	private String name;
	private int employeeNumber;
	private boolean hasBeenPaid;
	private boolean isSweeping;

	public Janitor(String name, int employeeNumber) {
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	public String getName() {

		return name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public int getSalary() {
				return 40000;
	}

	public boolean getHasBeenPaid() {
				return hasBeenPaid;
	}

	public void pay() {
			hasBeenPaid = true; 
	}

	public boolean getIsSweeping() {
				return isSweeping;
	}

	public void sweep() {
		isSweeping = true;
	}

	

	
	
	
	
	
	
	
	
}