package Testing;

public class ProductSelection {
	


	
	public String iWantACoke(double insertedChange) {
		// TODO Auto-generated method stub
		if (insertedChange>= 1.00) 
			return "Thank You!";
		return "Price: $1.00";
	}

	public String iWantCandy(double insertedChange) {
		// TODO Auto-generated method stub
		if (insertedChange>= .65) 
			return "Thank You!";
		return "Price: $.65";
	}
	
	public String iWantChips(double insertedChange) {
		// TODO Auto-generated method stub
		if (insertedChange>= .50) 
			return "Thank You!";
		return "Price: $.50";
	}



}
