
public class Nurse extends MedEmployee {

	@Override
	public int getSalary() {
		return 50000;
	}

	public int getNumberOfPatients() {
		return 0;
	}

	public Nurse(String name, int employeeNumber) {
		super(name, employeeNumber);
	}

}
