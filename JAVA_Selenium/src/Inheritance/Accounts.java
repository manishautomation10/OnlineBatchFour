package Inheritance;

public class Accounts extends Bank{

	int accNo;
	String type;
	double balance;
	
	public Accounts() {
		
		System.out.println("Accounts");
	}
	
	public Accounts(String BankName, String BranchName, int accNo, String type, double balance) {
		
		super( BankName,  BranchName);
		
		this.accNo = accNo;
		this.type = type;
		this.balance = balance;
	}
	
	public void setAccounts(String BankName, String BranchName, int accNo, String type, double balance) {
		
		super.SetBank(BankName, BranchName);
		
		this.accNo = accNo;
		this.type = type;
		this.balance = balance;
	}
	
	public void displayAccountDetails() {
		System.out.println("Acc No - " + this.accNo);
		System.out.println("Acc Type - " + this.type);
		System.out.println("Acc balance - " + this.balance);
	}
}
