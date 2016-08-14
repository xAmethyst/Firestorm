package mainclasses;

import java.util.Scanner;

import characters.Player;

public class RunTestPrep {
	
	private static final int EXIT = 0;
	private static final int STOP = -1;
	private static final int CONTINUE = 1;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int lContinue = CONTINUE;
		
		System.out.println("Welcome to Firestorm: Path to the Palace.");
		System.out.println("Before you join the world, tell us a little about yourself.");
		System.out.println("What is your first name?");
		String fName = sc.nextLine();
		System.out.println("What is your last name?");
		String lName = sc.nextLine();
		System.out.println("What is your gender? (male, female, both, neither, other)");
		String gender = sc.nextLine();
		
		int gn = 0;
		if(gender.equals("male")) {
			gn = 1;
		}
		else if(gender.equals("female")) {
			gn = 2;
		}
		else if(gender.equals("both")||
				gender.equals("neither")||
				gender.equals("other")){
			gn = 3;
		}
		else {
			System.out.println("Invalid choice.");
		}
		
		Player p = new Player(fName, lName, gn);
		System.out.println("Welcome, " + p.getFName() + " " + p.getLName() + ", to Firestorm.");
		
		System.out.println("You wake up in the middle of the night"
				+ " after your friends keep calling you.");
		System.out.println();
		System.out.println("You: What's going on? What's so important?");
		System.out.println("You: Could it be something with the uprising?");
		System.out.println();
		System.out.println("The file you were sent continues to load.");
		System.out.println();
		System.out.println("You: It's taking so long... I'm so tired, but what's so important?");
		System.out.println();
		System.out.println("Finally, the file loads and you press play.");
		System.out.println("The Elemental Kingdom and everything around it is burning.");
		System.out.println("People are scrambling around, looking for safety.");
		System.out.println("In the background, you can hear yelling.");
		System.out.println();
		System.out.println("Abigail: Look at what you've done! You've killed us all!");
		System.out.println("Abigail: I know you are the one to blame and I'll make sure you take that blame!");
	}

}
