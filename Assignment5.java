package Day1;

class Account{
	private int accountNo;
	private double accountBalance;
	private String accountPassword;
	private static String bankName;
	public static void setBankName(String bankName) {
		System.out.println("Setting bank name....");
		Account.bankName = bankName;
	}
	Account(){System.out.println("Using default constructor");}
	
	Account(int acn, double bal, String pass){
		accountNo = acn;
		accountBalance = bal;
		accountPassword = pass;
		
	}
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	void displayAccount(){
		System.out.println("................");
		System.out.println("The bank employee details are as follows :");
		System.out.println("Bank Name : "+ bankName);
		System.out.println("Account Number : "+ accountNo);
		System.out.println("Account Balance : "+ accountBalance);
		System.out.println("Account Password : "+ accountPassword);
		System.out.println("................\n");
		
	}}

public class Assignment5 {
public static void main(String args[]) {
	System.out.println("........Core Java Assignment 5........\n");
	Account.setBankName("ICICI");
	Account e1 = new Account();
	e1.setAccountBalance(5000);
	e1.setAccountNo(101);
	e1.setAccountPassword("js0IA123");
	e1.displayAccount();
	e1.setAccountBalance(6000);
	e1.setAccountPassword("assjd567AERTYU");
	e1.displayAccount();
	
     Account e2 = new Account(102,2000.51,"asf78Y@12");
	e2.displayAccount();
}
}
