package Testing;

public class MakingChange {
	public String makeChange(double insertedChange, double itemCost) {
		// TODO Auto-generated method stub
		double changeToUser = insertedChange - itemCost;
		if (changeToUser > 0)
		return "Here is your change:" + changeToUser;
		return "There is no change to return";
		
	}

	
	
	
	
}
