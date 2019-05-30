
public class Doctor extends MedEmployee {

	private String specialty;
	
	@Override
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

}
