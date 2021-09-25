package Abstraction;

public class SBI extends Bank{

	public SBI(String Name, String BranchName) {
		super(Name, BranchName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI b = new SBI("SBI","JM Road");
		b.calculateIntrest();
	}

	@Override
	void calculateIntrest() {
		// TODO Auto-generated method stub
		System.out.println("hello SBI");
	}

}
