
public class Nurse extends MedEmployee {
	
	private static final int NURSE_SALARY = 50000;
	private int numberOfPatients;

	@Override
	public int getSalary() {
		return NURSE_SALARY;
	}

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	public Nurse(String name, int employeeNumber) {
		super(name, employeeNumber);
		this.numberOfPatients = 0;
	}

}
