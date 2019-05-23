
public class Doctor {

	private String name;
	private int employeeNumber;
	private boolean hasBeenPaid;
	private String specialty;

	public String getName() {
		return name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public int getSalary() {
		return 90000;
	}

	public boolean getHasBeenPaid() {
		return hasBeenPaid;
	}
	
	public String getSpecialty() {
		return specialty;
	}

	public Doctor(String name, int employeeNumber, String specialty) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.specialty = specialty;
	}

	public void pay() {
		hasBeenPaid = true;
	}

	public void drawBlood() {
		
	}

	public void care() {
		
	}
	
}
