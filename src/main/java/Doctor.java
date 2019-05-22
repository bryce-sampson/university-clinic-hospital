
public class Doctor {

	
	
	private String name;
	private int employeeNumber;
	private boolean hasBeenPaid;
	private String specialty;

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getEmployeeNumber() {
		// TODO Auto-generated method stub
		return employeeNumber;
	}
	public int getSalary() {
		return 90000;
	}
	public Doctor(String name, int employeeNumber, String specialty) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.specialty = specialty;
	}
	public boolean getHasBeenPaid() {
		return hasBeenPaid;
	}
	public String getSpecialty() {
		return specialty;
	}
	
	public void pay() {
		hasBeenPaid = true;
	}
}
