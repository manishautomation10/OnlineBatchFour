package Inheritance;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts accObj = new Accounts("SBI", "JM Road",101, "Saving", 1000);
		//accObj.SetBank("SBI", "JM Road");
		//accObj.setAccounts("SBI", "JM Road",101, "Saving", 1000);
		
		accObj.displayBankDetails();
		accObj.displayAccountDetails();
		
	}

}
