import java.util.ArrayList;

public class Hospital {

	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Nurse> nurses = new ArrayList<Nurse>();
	private ArrayList<Receptionist> receptionists = new ArrayList<Receptionist>();
	private ArrayList<Janitor> janitors = new ArrayList<Janitor>();
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private ArrayList<MedEmployee> medEmployees = new ArrayList<MedEmployee>();

	public int getNumberOfEmployees() {
		return employees.size();
	}

	public String getName(int employeeNumber) {
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
			medEmployees.add(nurse);
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
			medEmployees.add(doctor);
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

	public void payAll() {
		for (Employee employee : employees) {
			if (employee.getHasBeenPaid() == false) {
				employee.pay();
			} else {
				System.out.println("Employee number " + employee.getEmployeeNumber() + " has already been paid.");
			}
		}
	}

	public ArrayList<String[]> getAllEmployeeStats() {
		ArrayList<String[]> allStats = new ArrayList<String[]>();

		for (Doctor doctor : doctors) {
			String[] stats = new String[8];
			stats[0] = doctor.getName();
			stats[1] = Integer.toString(doctor.getEmployeeNumber());
			stats[2] = Integer.toString(doctor.getSalary());
			stats[3] = Boolean.toString(doctor.getHasBeenPaid());
			stats[4] = doctor.getSpecialty();
			stats[5] = "";
			stats[6] = "";
			stats[7] = "";
			allStats.add(stats);
		}
		for (Nurse nurse : nurses) {
			String[] stats = new String[8];
			stats[0] = nurse.getName();
			stats[1] = Integer.toString(nurse.getEmployeeNumber());
			stats[2] = Integer.toString(nurse.getSalary());
			stats[3] = Boolean.toString(nurse.getHasBeenPaid());
			stats[4] = "";
			stats[5] = Integer.toString(nurse.getNumberOfPatients());
			stats[6] = "";
			stats[7] = "";
			allStats.add(stats);
		}
		for (Janitor janitor : janitors) {
			String[] stats = new String[8];
			stats[0] = janitor.getName();
			stats[1] = Integer.toString(janitor.getEmployeeNumber());
			stats[2] = Integer.toString(janitor.getSalary());
			stats[3] = Boolean.toString(janitor.getHasBeenPaid());
			stats[4] = "";
			stats[5] = "";
			stats[6] = Boolean.toString(janitor.getIsSweeping());
			stats[7] = "";
			allStats.add(stats);
		}
		for (Receptionist receptionist : receptionists) {
			String[] stats = new String[8];
			stats[0] = receptionist.getName();
			stats[1] = Integer.toString(receptionist.getEmployeeNumber());
			stats[2] = Integer.toString(receptionist.getSalary());
			stats[3] = Boolean.toString(receptionist.getHasBeenPaid());
			stats[4] = "";
			stats[5] = "";
			stats[6] = "";
			stats[7] = Boolean.toString(receptionist.getIsOnPhone());
			allStats.add(stats);
		}
		return allStats;
	}
	
	public ArrayList<String[]> getMedEmployeeStats() {
		ArrayList<String[]> allStats = new ArrayList<String[]>();

		for (Doctor doctor : doctors) {
			String[] stats = new String[8];
			stats[0] = doctor.getName();
			stats[1] = Integer.toString(doctor.getEmployeeNumber());
			stats[2] = Integer.toString(doctor.getSalary());
			stats[3] = Boolean.toString(doctor.getHasBeenPaid());
			stats[4] = doctor.getSpecialty();
			stats[5] = "";
			stats[6] = "";
			stats[7] = "";
			allStats.add(stats);
		}
		for (Nurse nurse : nurses) {
			String[] stats = new String[8];
			stats[0] = nurse.getName();
			stats[1] = Integer.toString(nurse.getEmployeeNumber());
			stats[2] = Integer.toString(nurse.getSalary());
			stats[3] = Boolean.toString(nurse.getHasBeenPaid());
			stats[4] = "";
			stats[5] = Integer.toString(nurse.getNumberOfPatients());
			stats[6] = "";
			stats[7] = "";
			allStats.add(stats);
		}
		return allStats;
	}
	
	public void drawBlood(int employeeNumber, Patient patient) {
		boolean bloodDrawn = false;
		for (Doctor doctor : doctors) {
			if (doctor.getEmployeeNumber() == employeeNumber) {
				doctor.drawBlood(patient);
				bloodDrawn = true;
			}
		}
		for (Nurse nurse : nurses) {
			if (nurse.getEmployeeNumber() == employeeNumber) {
				nurse.drawBlood(patient);
				bloodDrawn = true;
			}
		}
		if (!bloodDrawn) {
			System.out.println("Invalid");
		}
	}
	
	public void care(int employeeNumber, Patient patient) {
		boolean cared = false;
		for (Doctor doctor : doctors) {
			if (doctor.getEmployeeNumber() == employeeNumber) {
				doctor.care(patient);
				cared = true;
			}
		}
		for (Nurse nurse : nurses) {
			if (nurse.getEmployeeNumber() == employeeNumber) {
				nurse.care(patient);
				cared = true;
			}
		}
		if (!cared) {
			System.out.println("Invalid");
		}
	}
}
