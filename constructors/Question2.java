package constructors;

import java.util.Scanner;


public class Question2 {

	public static void main(String[] args) {
		Account a=new Account();
		char choice='n';
		int op;
		Scanner sc=new Scanner(System.in);
		System.out.println("Account management");
		do{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			op=sc.nextInt();
			if(op==1){
				System.out.println("Enter amount to deposit");
				double amount=sc.nextDouble();
				a.deposit(amount);
			}
			if(op==2){
				System.out.println("Enter amount to withdraw");
				double amount=sc.nextDouble();
				if(a.balance<amount){
					System.out.println("Insufficient balance");
				}
				else{
				
				a.withdraw(amount);
				}
			}
			System.out.println("Do you want to continue");
			choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y' );
	}

}
