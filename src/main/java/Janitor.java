
public class Janitor extends Employee {

	private static final int JANITOR_SALARY = 40000;
	private boolean isSweeping;

	@Override
	public int getSalary() {
		return JANITOR_SALARY;
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