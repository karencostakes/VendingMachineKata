package Testing;

public class ProductSelection {
	


	
	public String iWantACoke(double insertedChange) {
		// TODO Auto-generated method stub
		if (insertedChange>= 1.00) 
			return "Here's your ice cold coke";
		return "Please enter additional change";
	}

	public String iWantCandy(double insertedChange) {
		// TODO Auto-generated method stub
		if (insertedChange>= .65) 
			return "Here's your candy";
		return "Please enter additional change";
	}
	
	public String iWantChips(double insertedChange) {
		// TODO Auto-generated method stub
		if (insertedChange>= 1.00) 
			return "Here's your chips";
		return "Please enter additional change";
	}



}
