
public class Patient {

	private static final int BLOOD_LEVEL = 20;
	private static final int HEALTH_LEVEL = 10;

	private int bloodLevel;
	private int healthLevel;

	public Patient() {
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void haveBloodDrawn() {
		bloodLevel -= 2;
		if (bloodLevel < 12) {
			bloodLevel = 12;
			System.out.println("Cannot draw blood below level 12.");
			System.out.println("Patient will die.");
		}
	}

	public void beCaredFor() {
		healthLevel += 2;
		if (healthLevel > 25) {
			healthLevel = 25;
			System.out.println("Patient is fully healthy.");
		}
	}

}
