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
		gender = gender.toLowerCase();
		
		int gn = 0;
		if(gender.equals("male")) {
			gn = 1;
		}
		else if(gender.equals("female")) {
			gn = 2;
		}
		else if(gender.equals("both")||gender.equals("neither")||gender.equals("other")){
			gn = 3;
		}
		else {
			gn = 3;
		}
		
		Player p = new Player(fName, lName, gn);
		System.out.println("Welcome, " + p.getFName() + " " + p.getLName() + ", to Firestorm.");
		
		//Nightmare sequence
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
		System.out.println();
		System.out.println("The computer fizzles out and starts sparking.");
		System.out.println("You: Wait, what?");
		System.out.println();
		System.out.println("The walls start to crumble and the ceiling turns to dust.");
		System.out.println("You see warriors sliding a rope coming from a helicopter and ninjas rushing in.");
		System.out.println();
		System.out.println("You: No, not me... Please not me...");
		System.out.println();
		System.out.println("The ground crumbles and suddenly falls away.");
		System.out.println();
		System.out.println("You: Ahhhhhhhh!");
		
		//First day, waking up late
		System.out.println("You bolt up straight in you bed, panting. All is peaceful.");
		System.out.println();
		System.out.println("You: What the heck was that...? That's the fifth time this week...");
		System.out.println();
		System.out.println("The clock reads 6:45.");
		System.out.println();
		System.out.println("You: Shoot, I've got to meet Abigail and Lexi!");
		System.out.println("You: Nonononononono, this cannot happen again!");
		System.out.println("You: Why didn't Chris wake me up?! I told him to wake me!");
		System.out.println();
		System.out.println("Minutes later, you arrive at the teleporters, where Abigail and Lexi are waiting.");
		System.out.println();
		System.out.println("Abigail: My god, " + p.getFName() + ". Did you see your creepy 10-year-old neighbor again?");
		System.out.println("A: No, B: Yes");
		
		String r1 = sc.nextLine();
		r1.toLowerCase();
		if(r1.equals("a")||r1.equals("no")) {
			System.out.println("You: No... Just woke up... Ran here...");
			System.out.println("Lexi: Like always You've got to fix that alarm.");
		}
		else {
			System.out.println("You: Yup... Because obviously a 10-year-old would be up before 7 in the morning...");
			System.out.println("Lexi: Classic " + p.getFName() + ". Sassy 24/7");
		}
	}

}
