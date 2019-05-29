
public class Janitor extends Employee{

	private boolean isSweeping;

	public int getSalary() {
		return 40000;
	}
	public boolean getIsSweeping() {
		return isSweeping;
	}
	public Janitor(String name, int employeeNumber) {
		super(name, employeeNumber);
	}

	public void sweep() {
		isSweeping = true;
	}
}