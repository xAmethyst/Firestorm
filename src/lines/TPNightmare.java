package lines;

import java.util.ArrayList;

public class TPNightmare {
	
	public ArrayList<String> lines;
	
	private String di1;
	private String di2;
	private String di3;
	private String di4;
	private String di5;
	private String di6;
	private String di7;
	private String di8;
	
	private String de1;
	private String de2;
	private String de3;
	private String de4;
	private String de5;
	private String de6;
	private String de7;
	private String de8;
	private String de9;
	private String de10;
	
	public TPNightmare() {
		lines = new ArrayList<String>();
		di1 = "<html><p>What's going on? What's so important?</p></html>";
		di2 = "<html><p>Could it be something with the uprising?</p></html>";
		di3 = "<html><p>It's taking so long... I'm so tired, but what's so important?</p><html>";
		di4 = "<html><p>Look at what you've done! You've killed us all!</p></html>";
		di5 = "<html><p>I know you are the one to blame and I'll make sure you take that blame!</p></html>";
		di6 = "<html><p>Wait, what?<html></p>";
		di7 = "<html><p>No, not me... Please not me...</p></html>";
		di8 = "<html><p>Ahhhhhhhh!</p></html>";
		
		de1 = "<html><p>You wake up in the middle of the night"
				+ " after your friends keep calling you.</p></html>";
		de2 = "<html><p>The file you were sent continues to load.</p></html>";
		de3 = "<html><p>Finally, the file loads and you press play.</p></html>";
		de4 = "<html><p>The Elemental Kingdom and everything around it is burning.</p></html>";
		de5 = "<html><p>People are scrambling around, looking for safety.</p></html>";
		de6 = "<html><p>In the background, you can hear yelling.</p></html>";
		de7 = "<html><p>The computer fizzles out and starts sparking.</p></html>";
		de8 = "<html><p>The walls start to crumble and the ceiling turns to dust.</p></html>";
		de9 = "<html><p>You see warriors sliding a rope coming from a helicopter and ninjas rushing in.</p></html>";
		de10 = "<html><p>The ground crumbles and suddenly falls away.</p></html>";
		
		lines.add(de1);
		lines.add(di1);
		lines.add(di2);
		lines.add(de2);
		lines.add(di3);
		lines.add(de3);
		lines.add(de4);
		lines.add(de5);
		lines.add(de6);
		lines.add(di4);
		lines.add(di5);
		lines.add(de7);
		lines.add(di6);
		lines.add(de8);
		lines.add(de9);
		lines.add(di7);
		lines.add(de10);
		lines.add(di8);
	}
	
	public String getLine(int i){
		return lines.get(i);
	}	

}
