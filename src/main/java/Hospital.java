import java.util.HashMap;

public class Hospital {

	private HashMap<Integer, Employee> employees = new HashMap();

	public int getNumberOfEmployees() {
		return 0;
	}

	public String getEmployeeName(int employeeNumber) {
		return employees.get(employeeNumber).getName();
	}

	public void addJanitor(String name, int employeeNumber) {
		employees.put(employeeNumber, new Janitor(name, employeeNumber));
	}

	public void addNurse(String name, int employeeNumber) {
		employees.put(employeeNumber, new Nurse(name, employeeNumber));
	}

	public void addReceptionist(String name, int employeeNumber) {
		employees.put(employeeNumber, new Receptionist(name, employeeNumber));
	}

	public void addDoctor(String name, int employeeNumber, String specialty) {
		employees.put(employeeNumber, new Doctor(name, employeeNumber, specialty));
	}
}
