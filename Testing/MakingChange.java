package Testing;

public class MakingChange {
	public String makeChange(double insertedChange, double itemCost) {
		// TODO Auto-generated method stub
		double changeToUser = insertedChange - itemCost;
		String changeToUser1 = String.valueOf(changeToUser);
		
		if (changeToUser > 0)
		return changeToUser1;
		return "There is no change to return";
		
		
	}

	
	
	
	
}
