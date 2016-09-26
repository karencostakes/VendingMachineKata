package Testing;

public class Coin {
	

	public String insertCoinIntoVending(double diam, double weight) {
		// TODO Auto-generated method stub
		if ((diam == .84 && weight == 5.00) || (diam == .71 && weight == 2.27) || (diam == .96 && weight == 5.67)  )
			return "5";
	
		
		return "We do not accept pennies or coins other than dimes, nickles, and quarters";
	}


}
