package assignment2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double units,amt;
		String type;
		System.out.println("Enter type of connection");
		type=sc.next();
		System.out.println("Enter no. of units");
		units=sc.nextFloat();
		if(type.equals("domestic")){
		if(units>0 && units<100)
			amt=units* 1;

		else if(units>100 && units<200)
			amt=units*1.5;

		else if(units>200 && units<500)
			amt=units* 2;	
		else
			amt= units*5;
		
		System.out.println("Amount="+amt);
		}
		else
		{
			
				amt=units* 10;

			
			System.out.println("Amount="+amt);
			}
	}

}
