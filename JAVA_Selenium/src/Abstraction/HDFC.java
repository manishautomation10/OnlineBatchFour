package Abstraction;

public class HDFC extends Bank implements CalcullateIntrest{

	public HDFC(String Name, String BranchName) {
		super(Name, BranchName);
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC b = new HDFC("HDFC","JM Road");
		b.calculateIntrest();
	}



	@Override
	void calculateIntrest() {
		// TODO Auto-generated method stub
		System.out.println("hello HDFC");
	}

	@Override
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC home loan");
	}



	@Override
	public void perrsonalLoan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC personal loan");
	}

}
