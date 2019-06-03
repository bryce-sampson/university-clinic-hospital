import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Hospital hospital = new Hospital();
		Patient patient = new Patient();
		String userChoice;
		Boolean gameStillGoing = true;

		initializeDemoHospital(hospital);
		printWelcomeMessage(hospital);

		do {
			printMenuOptions();
			userChoice = input.nextLine();
			if (userChoice.equals("9")) {
				System.out.println("Good bye.");
				break;
			} else if (userChoice.equals("1")) {
				displayEmployeePrintout(hospital);
			} else if (userChoice.equals("2")) {
				hospital.payAll();
			} else if (userChoice.equals("3")) {
				System.out.println("Choose a medical employee to perform task by typing their employee number");
				displayMedEmployeePrintout(hospital);
				userChoice = input.nextLine();
				try {
					int employeeNumber = Integer.parseInt(userChoice);
					System.out.println("Choose a task to perform: 1 for drawing blood; 2 for caring");
					userChoice = input.nextLine();
					try {
						int task = Integer.parseInt(userChoice);
						if (task == 1) {
							hospital.drawBlood(employeeNumber, patient);
							printPatientStats(patient);
						} else if (task == 2) {
							hospital.care(employeeNumber, patient);
							printPatientStats(patient);
						} else {
							System.out.println("Invalid");
						}
					} catch (NumberFormatException e) {
					           System.out.println("This is not a number");
					}
					
				} catch (NumberFormatException e) {
				           System.out.println("This is not a number");
				}
				
			} else if (userChoice.equals("4")) {
				printPatientStats(patient);
			} 
		} while (gameStillGoing);

	}

	private static void printMenuOptions() {
		System.out.println("Press 1 to see all employee information");
		System.out.println("Press 2 to pay all unpaid employees");
		System.out.println("Press 3 to choose a medical employee and have them perform a task");
		System.out.println("Please note: Doctors heal more than nurses, and nurses take less blood than doctors");
		System.out.println("Press 4 to see patient stats");
		System.out.println("Press 9 to quit");

	}

	private static void printWelcomeMessage(Hospital hospital) {
		System.out.println("Welcome to the Hospital Program");
		System.out.println("You have four employees and one patient");
		System.out.println();
		displayEmployeePrintout(hospital);
	}

	private static void initializeDemoHospital(Hospital hospital) {
		hospital.addDoctor("Albert", 1, "General Practitioner");
		hospital.addNurse("Beth", 2);
		hospital.addReceptionist("Carie", 3);
		hospital.addJanitor("Dave", 4);
		hospital.addDoctor("Emerson", 5, "Trauma Surgeon");
		hospital.addNurse("Fran", 6);
		hospital.addReceptionist("Greg", 7);
		hospital.addJanitor("Harold", 8);
	}

	private static void displayMedEmployeePrintout(Hospital hospital) {
		displayEmployeePrintoutHeader();
		displayMedEmployeeAttributeList(hospital);
	}

	private static void displayMedEmployeeAttributeList(Hospital hospital) {
		ArrayList<String[]> attributes = hospital.getMedEmployeeStats();
		for (int i = 0; i < attributes.size(); i++) {
			System.out.println("| " + fifteenCharacterString(attributes.get(i)[0]) + " | "
					+ fifteenCharacterString(attributes.get(i)[1]) + " | "
					+ fifteenCharacterString(attributes.get(i)[2]) + " | "
					+ fifteenCharacterString(attributes.get(i)[3]) + " | "
					+ fifteenCharacterString(attributes.get(i)[4]) + " | "
					+ fifteenCharacterString(attributes.get(i)[5]) + " | "
					+ fifteenCharacterString(attributes.get(i)[6]) + " | "
					+ fifteenCharacterString(attributes.get(i)[7]) + " |");
		}
	}

	private static void displayEmployeePrintout(Hospital hospital) {
		displayEmployeePrintoutHeader();
		displayEmployeeAttributeList(hospital);
	}

	private static void displayEmployeeAttributeList(Hospital hospital) {
		ArrayList<String[]> attributes = hospital.getAllEmployeeStats();
		for (int i = 0; i < attributes.size(); i++) {
			System.out.println("| " + fifteenCharacterString(attributes.get(i)[0]) + " | "
					+ fifteenCharacterString(attributes.get(i)[1]) + " | "
					+ fifteenCharacterString(attributes.get(i)[2]) + " | "
					+ fifteenCharacterString(attributes.get(i)[3]) + " | "
					+ fifteenCharacterString(attributes.get(i)[4]) + " | "
					+ fifteenCharacterString(attributes.get(i)[5]) + " | "
					+ fifteenCharacterString(attributes.get(i)[6]) + " | "
					+ fifteenCharacterString(attributes.get(i)[7]) + " |");
		}
	}

	private static void displayEmployeePrintoutHeader() {
		System.out.println("Printout of Employee Data");
		System.out.println();
		System.out.println("| " + fifteenCharacterString("Name") + " | " + fifteenCharacterString("Employee Number")
				+ " | " + fifteenCharacterString("Salary") + " | " + fifteenCharacterString("Has been paid") + " | "
				+ fifteenCharacterString("Specialty") + " | " + fifteenCharacterString("# Of Patients") + " | "
				+ fifteenCharacterString("On Phone") + " | " + fifteenCharacterString("Sweeping") + " |");
		for (int i = 0; i < 18 * 8 + 1; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	private static String fifteenCharacterString(String string) {
		return nCharacterString(string, 15);
	}

	private static String nCharacterString(String string, int length) {
		if (string.equals("-1")) {
			string = "";
		}
		if (string.length() > 15) {
			return string.substring(0, 15);
		} else {
			while (string.length() < 15) {
				string += " ";
			}
			return string;
		}
	}

	private static void printPatientStats(Patient patient) {
		System.out.println("Patient blood level: " + patient.getBloodLevel());
		System.out.println("Patient health level: " + patient.getHealthLevel());
		System.out.println();
	}
}
