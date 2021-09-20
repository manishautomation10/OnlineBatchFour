package OOPS;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Shapes s = new Shapes();
		s.calArea(10);
		s.calArea(10.00, 20);
		s.calArea(10, 20.00);*/
		HDFC hdBank = new HDFC();
		//hdBank.calIntrest(10000, 10, 10);
		
		Bank rbi = new HDFC();
		
		rbi.calIntrest(10000, 10, 10);
		
		//HDFC rbi = new Bank();
	}

}
