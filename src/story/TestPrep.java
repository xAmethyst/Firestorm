package story;

public class TestPrep {
	private String lexiA;
	private String lexiB;
	private String talkA;
	private String talkB;
	private String silenced;
	private String water;
	private String fanT;
	private String fanF;
	private String lighter;
	private String ice;
	
	public TestPrep() {
		lexiA = "Fine.";
		lexiB = "Lexi, please not now.";
		talkA = "Of course this would happen.";
		talkB = "Maybe I should wait. It's not an emergency, anyways.";
		silenced = "Now they're just mocking me.";
	}
	
	public String getResponse() {
		return null;
	}
	
	public boolean fanWork() {
		int r = (int)(Math.random() * 10);
		if(r < 7) {
			return true;
		}
		else {
			return false;
		}
	}

}
