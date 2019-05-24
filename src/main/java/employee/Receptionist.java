package employee;

public class Receptionist extends Employee{

	

	private boolean isOnPhone;



	public int getSalary() {
		return 45000;
	}
	


	public Receptionist(String name, int employeeNumber) {
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	public void pay() {
		hasBeenPaid = true; 
	}



	public boolean getIsOnPhone() {
		return isOnPhone;
		
	}



	public void isOnPhone() {
		isOnPhone = true;
	}


	
}