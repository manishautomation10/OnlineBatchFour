package Inheritance;

public class Bank {

	private String Name, BranchName;
	
	public Bank() {
		
		System.out.println("Bank");
	}
	
	public Bank(String Name, String BranchName) {
		this.Name = Name;
		this.BranchName = BranchName;
	}
	
	public void SetBank(String Name, String BranchName) {
		this.Name = Name;
		this.BranchName = BranchName;
	}
	
	public void displayBankDetails() {
		System.out.println("Bank Name - " + this.Name);
		System.out.println("Branch Name - " + this.BranchName);
	}
}
