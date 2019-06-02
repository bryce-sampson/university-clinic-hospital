import java.util.HashMap;

public class Hospital {

	private HashMap<Integer, Doctor> doctors = new HashMap<Integer, Doctor>();
	private HashMap<Integer, Nurse> nurses = new HashMap<Integer, Nurse>();
	private HashMap<Integer, Receptionist> receptionists = new HashMap<Integer, Receptionist>();
	private HashMap<Integer, Janitor> janitors = new HashMap<Integer, Janitor>();

	public int getNumberOfEmployees() {
		return makeEmployeesHashMap().size();
	}

	public HashMap<Integer, Employee> makeEmployeesHashMap() {
		HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>();
		employees.putAll(doctors);
		employees.putAll(nurses);
		employees.putAll(receptionists);
		employees.putAll(janitors);
		return employees;
	}

	public String getEmployeeName(int employeeNumber) {
		return makeEmployeesHashMap().get(employeeNumber).getName();
	}

	public int getSalary(int employeeNumber) {
		return makeEmployeesHashMap().get(employeeNumber).getSalary();
	}

	public boolean getHasBeenPaid(int employeeNumber) {
		return makeEmployeesHashMap().get(employeeNumber).getHasBeenPaid();
	}

	public String getSpecialty(int employeeNumber) {
		if (doctors.get(employeeNumber) != null) {
			return doctors.get(employeeNumber).getSpecialty();
		} else {
			return null;
		}
	}

	public int getNumberOfPatients(int employeeNumber) {
		if (nurses.get(employeeNumber) != null) {
			return nurses.get(employeeNumber).getNumberOfPatients();
		} else {
			return -1;
		}
	}

	public boolean getIsOnPhone(int employeeNumber) {
		if (receptionists.get(employeeNumber) != null) {
			return receptionists.get(employeeNumber).getIsOnPhone();
		} else {
			return false;
		}
	}

	public boolean getIsSweeping(int employeeNumber) {
		if (janitors.get(employeeNumber) != null) {
			return janitors.get(employeeNumber).getIsSweeping();
		} else {
			return false;
		}
	}

	public void addJanitor(String name, int employeeNumber) {
		janitors.put(employeeNumber, new Janitor(name, employeeNumber));
	}

	public void addNurse(String name, int employeeNumber) {
		nurses.put(employeeNumber, new Nurse(name, employeeNumber));
	}

	public void addReceptionist(String name, int employeeNumber) {
		receptionists.put(employeeNumber, new Receptionist(name, employeeNumber));
	}

	public void addDoctor(String name, int employeeNumber, String specialty) {
		doctors.put(employeeNumber, new Doctor(name, employeeNumber, specialty));
	}

	public void pay(int employeeNumber) {
		if (makeEmployeesHashMap().get(employeeNumber).getHasBeenPaid()) {
			System.out.println("Employee Number " + employeeNumber + " has already been paid.");
		} else {
			makeEmployeesHashMap().get(employeeNumber).pay();
		}
	}

}
