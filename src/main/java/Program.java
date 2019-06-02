import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Hospital hospital = new Hospital();
		
		initializeDemoHospital(hospital);
		
		printWelcomeMessage(hospital);

	}

	private static void printWelcomeMessage(Hospital hospital) {
		System.out.println("Welcome to the Hospital Program");
		System.out.println("You start with four employees");
		System.out.println();
		displayEmployeePrintout(hospital);
	}

	private static void initializeDemoHospital(Hospital hospital) {
		hospital.addDoctor("Albert", 1, "General Practitioner");
		hospital.addNurse("Beth", 2);
		hospital.addReceptionist("Carie", 3);
		hospital.addJanitor("Dave", 4);
	}

	private static void displayEmployeePrintout(Hospital hospital) {
		displayEmployeePrintoutHeader();
//		displaySingleEmployeeAttributes(hospital, employeeNumber);
	}

	private static void displaySingleEmployeeAttributes(Hospital hospital, int employeeNumber) {
		System.out.println("| " + nCharacterString(hospital.getEmployeeName(employeeNumber), 15) + 
				" | " + nCharacterString(Integer.toString(employeeNumber), 15) + 
				" | " + nCharacterString(Boolean.toString(hospital.getHasBeenPaid(employeeNumber)), 15) +
				" | " + nCharacterString("Specialty", 15) + 
				" | " + nCharacterString("Patients", 15) + 
				" | " + nCharacterString("On Phone", 15) + 
				" | " + nCharacterString("Sweeping", 15) + " |");
		
	}

	private static void displayEmployeePrintoutHeader() {
		System.out.println("Printout of Employee Data");
		System.out.println();
		System.out.println("| " + nCharacterString("Name", 15) + 
				" | " + nCharacterString("Employee Number", 15) + 
				" | " + nCharacterString("Has been paid", 15) +
				" | " + nCharacterString("Specialty", 15) + 
				" | " + nCharacterString("Patients", 15) + 
				" | " + nCharacterString("On Phone", 15) + 
				" | " + nCharacterString("Sweeping", 15) + " |");
		for(int i = 0; i < 18*7+1; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	private static String nCharacterString(String string, int length) {
		if (string.equals("-1")) {
			string = "";
		}
		if(string.length() > 15) {
			return string.substring(0, 15);
		} else {
			while(string.length() < 15) {
				string += " ";
			}
			return string;
		}
	}
}
