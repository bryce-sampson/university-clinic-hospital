
public class Nurse extends Employee {
	
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
	
	public void drawBlood() {
		
	}
	public void care() {
		
	}
}
