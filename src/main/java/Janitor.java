
public class Janitor extends Employee{

	private boolean isSweeping;

	public int getSalary() {
		return 40000;
	}
	public boolean getIsSweeping() {
		return isSweeping;
	}

	public Janitor(String name, int employeeNumber) {
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	public void pay() {
		hasBeenPaid = true; 
	}


	public void sweep() {
		isSweeping = true;
	}
}