
public abstract class MedEmployee extends Employee {

	public MedEmployee(String name, int employeeNumber) {
		super(name, employeeNumber);
	}

	public void drawBlood(Patient patient) {
		patient.haveBloodDrawn();

	}

	public void care(Patient patient) {
		patient.beCaredFor();
	}
}
