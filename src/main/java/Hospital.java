import java.util.ArrayList;

public class Hospital {

	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Nurse> nurses = new ArrayList<Nurse>();
	private ArrayList<Receptionist> receptionists = new ArrayList<Receptionist>();
	private ArrayList<Janitor> janitors = new ArrayList<Janitor>();
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public int getNumberOfEmployees() {
		return employees.size();
	}

	ArrayList<Employee> getEmployees() {
		return employees;
	}

	public String getEmployeeName(int employeeNumber) {
		String name = null;
		for (Employee employee : employees) {
			if (employee.getEmployeeNumber() == employeeNumber) {
				name = employee.getName();
			}
		}
		return name;
	}

	public int getSalary(int employeeNumber) {
		int salary = -1;
		for (Employee employee : employees) {
			if (employee.getEmployeeNumber() == employeeNumber) {
				salary = employee.getSalary();
			}
		}
		return salary;
	}

	public boolean getHasBeenPaid(int employeeNumber) {
		boolean hasBeenPaid = false;
		for (Employee employee : employees) {
			if (employee.getEmployeeNumber() == employeeNumber) {
				hasBeenPaid = employee.getHasBeenPaid();
			}
		}
		return hasBeenPaid;
	}

	public String getSpecialty(int employeeNumber) {
		String specialty = null;
		for (Doctor doctor : doctors) {
			if (doctor.getEmployeeNumber() == employeeNumber) {
				specialty = doctor.getSpecialty();
			}
		}
		return specialty;
	}

	public int getNumberOfPatients(int employeeNumber) {
		int numberOfPatients = 0;
		return numberOfPatients;
	}

	public boolean getIsOnPhone(int employeeNumber) {
		boolean isOnPhone = false;
		for (Receptionist receptionist : receptionists) {
			if (receptionist.getEmployeeNumber() == employeeNumber) {
				isOnPhone = receptionist.getIsOnPhone();
			}
		}
		return isOnPhone;
	}

	public boolean getIsSweeping(int employeeNumber) {
		boolean isSweeping = false;
		for (Janitor janitor : janitors) {
			if (janitor.getEmployeeNumber() == employeeNumber) {
				isSweeping = janitor.getIsSweeping();
			}
		}
		return isSweeping;
	}

	public void addJanitor(String name, int employeeNumber) {
		Janitor janitor = new Janitor(name, employeeNumber);
		boolean isAlreadyEmployeeNumber = false;
		for (Employee employee : employees) {
			if (employee.getEmployeeNumber() == employeeNumber) {
				isAlreadyEmployeeNumber = true;
			}
		}
		if (!isAlreadyEmployeeNumber) {
			employees.add(janitor);
			janitors.add(janitor);
		}
	}

	public void addNurse(String name, int employeeNumber) {
		Nurse nurse = new Nurse(name, employeeNumber);
		boolean isAlreadyEmployeeNumber = false;
		for (Employee employee : employees) {
			if (employee.getEmployeeNumber() == employeeNumber) {
				isAlreadyEmployeeNumber = true;
			}
		}
		if (!isAlreadyEmployeeNumber) {
			employees.add(nurse);
			nurses.add(nurse);
		}
	}

	public void addReceptionist(String name, int employeeNumber) {
		Receptionist receptionist = new Receptionist(name, employeeNumber);
		boolean isAlreadyEmployeeNumber = false;
		for (Employee employee : employees) {
			if (employee.getEmployeeNumber() == employeeNumber) {
				isAlreadyEmployeeNumber = true;
			}
		}
		if (!isAlreadyEmployeeNumber) {
			employees.add(receptionist);
			receptionists.add(receptionist);
		}
	}

	public void addDoctor(String name, int employeeNumber, String specialty) {
		Doctor doctor = new Doctor(name, employeeNumber, specialty);
		boolean isAlreadyEmployeeNumber = false;
		for (Employee employee : employees) {
			if (employee.getEmployeeNumber() == employeeNumber) {
				isAlreadyEmployeeNumber = true;
			}
		}
		if (!isAlreadyEmployeeNumber) {
			employees.add(doctor);
			doctors.add(doctor);
		}
	}

	public void pay(int employeeNumber) {
		for (Employee employee : employees) {
			if (employee.getEmployeeNumber() == employeeNumber) {
				employee.pay();
			}
		}
	}
}
