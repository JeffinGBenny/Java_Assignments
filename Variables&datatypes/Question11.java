package assgnment1;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,rem,reverse=0;
		System.out.println("Enter 5 digit number");
		number=sc.nextInt();
		while(number>0){
			rem=number%10;
			reverse=reverse*10+rem;
			number=number/10;
			
		}
		System.out.println("Reverse of number="+reverse);
	}

}
