package constructors;

public class Account {
	static double balance=0.0;

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		Account.balance = balance;
	}
	public void withdraw(double amount){
		balance=balance-amount;
	}
	public void deposit(double amount){
		balance=balance+amount;
	}
}
