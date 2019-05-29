
public class Receptionist extends Employee{

	private boolean isOnPhone;
	
	@Override
	public int getSalary() {
		return 45000;
	}

	public Receptionist(String name, int employeeNumber) {
		super(name, employeeNumber);
	}

	public boolean getIsOnPhone() {
		return isOnPhone;
	}

	public void isOnPhone() {
		isOnPhone = true;
	}
}