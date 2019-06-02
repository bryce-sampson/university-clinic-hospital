
public class Receptionist extends Employee {

	private static final int RECEPTIONIST_SALARY = 45000;
	private boolean isOnPhone;

	@Override
	public int getSalary() {
		return RECEPTIONIST_SALARY;
	}

	public Receptionist(String name, int employeeNumber) {
		super(name, employeeNumber);
		this.isOnPhone = false;
	}

	public boolean getIsOnPhone() {
		return isOnPhone;
	}

	public void usePhone() {
		isOnPhone = true;
	}
}