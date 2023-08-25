package assignment2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month;
		String season;
		System.out.println("Enter month");
		month=sc.nextInt();
		switch(month){
		case 1:
		case 2:
		case 12:
			season="winter";
			break;
		case 3:
		case 4:
		case 5:
			season="spring";
			break;
		case 6:
		case 7:
		case 8:
			season="summer";
			break;
		case 9:
		case 10:
		case 11:
			season="autumn";
			break;
		default:season="no season";
			
		}
		System.out.println("Season is "+season);

	}

}
