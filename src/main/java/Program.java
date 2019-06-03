import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Hospital hospital = new Hospital();
		Patient patient = new Patient();
		
		initializeDemoHospital(hospital);
		
		printWelcomeMessage(hospital);

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
	}

	private static void displayEmployeePrintout(Hospital hospital) {
		displayEmployeePrintoutHeader();
//		displaySingleEmployeeAttributes(hospital, employeeNumber);
	}

	private static void displayEmployeeAttributeList(Hospital hospital) {
		System.out.println("| " + fifteenCharacterString("") + 
				" | " + fifteenCharacterString("") + 
				" | " + fifteenCharacterString("") +
				" | " + fifteenCharacterString("") + 
				" | " + fifteenCharacterString("") + 
				" | " + fifteenCharacterString("") + 
				" | " + fifteenCharacterString("") + " |");
	}

	private static void displayEmployeePrintoutHeader() {
		System.out.println("Printout of Employee Data");
		System.out.println();
		System.out.println("| " + fifteenCharacterString("Name") + 
				" | " + fifteenCharacterString("Employee Number") + 
				" | " + fifteenCharacterString("Has been paid") +
				" | " + fifteenCharacterString("Specialty") + 
				" | " + fifteenCharacterString("Patients") + 
				" | " + fifteenCharacterString("On Phone") + 
				" | " + fifteenCharacterString("Sweeping") + " |");
		for(int i = 0; i < 18*7+1; i++) {
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
