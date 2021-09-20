package Abstraction;

public abstract class Bank {
	private String Name, BranchName;
	
	public Bank(String Name, String BranchName) {
		this.Name = Name;
		this.BranchName = BranchName;
	}
	
	abstract void calculateIntrest();
}
