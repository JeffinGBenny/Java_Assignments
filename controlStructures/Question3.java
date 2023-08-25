package assignment2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month;
		String season;
		System.out.println("Enter month");
		month=sc.nextInt();
		
		
		if(month==1 || month==2||month==12)
			season="winter";

		else if(month==3|| month==4||month==5)
			season="spring";
		else if(month==6|| month==7||month==8)
			season="summer";
		
		else
			season="autumn";
		
		System.out.println("Season is "+season);
	}

}
