
public class Doctor extends Employee {

	private String specialty;

	public int getSalary() {
		return 90000;
	}
	public String getSpecialty() {
		return specialty;
	}

	public Doctor(String name, int employeeNumber, String specialty) {
		super(name, employeeNumber);
		this.specialty = specialty;
	}

	public void drawBlood() {
		
	}
	public void care() {
		
	}
}
