package Encapsulation;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
			int type;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter type of account");
			System.out.println("Enter 1 for savings and 2 for fixed");
			type=sc.nextInt();
			if(type==1)
			{	Account a=new Account();
				System.out.println("Enter pricipal");
				a.setPrincipal(sc.nextInt());
				System.out.println("Enter time");
				a.setTime(sc.nextInt());
				a.setRate(4);
				System.out.println("Interest="+a.getPrincipal()*a.getTime()*a.getRate());
			}
			else{
				Account a=new Account();
				System.out.println("Enter pricipal");
				a.setPrincipal(sc.nextInt());
				System.out.println("Enter time");
				a.setTime(sc.nextInt());
				a.setRate(11);
				System.out.println("Interest="+a.getPrincipal()*a.getTime()*a.getRate());
			}
		
	}

}
