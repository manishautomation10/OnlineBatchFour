package OOPS;

public class HDFC extends Bank{

	 public void calIntrest(int amount, int roi, int period) {
		double amt = ((amount * roi ) /100 ) * period;
		if(period >= 5 ) {
			//amt = amt + 1000;
			amt += 1000;
		}
		System.out.println(amt);
	}
	
	
}
