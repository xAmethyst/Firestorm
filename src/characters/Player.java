package characters;

public class Player implements People {
	
	private String fName;
	private String lName;
	private int gender;
	
	public Player(String fName, String lName, int gender) {
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
	}
	
	public Player() {
		fName = "Chelsea";
		lName = "Shasta";
		gender = 2;
	}
	
	@Override
	public String getFName() {
		return fName;
	}

	@Override
	public String getLName() {
		return lName;
	}

	@Override
	public String getPronounA() {
		if(gender == 1) {
			return "he";
		}
		else if(gender == 2) {
			return "she";
		}
		else {
			return "they";
		}
	}
	
	public String getPronounB() {
		if(gender == 1) {
			return "him";
		}
		else if(gender == 2) {
			return "her";
		}
		else {
			return "them";
		}
	}

}
