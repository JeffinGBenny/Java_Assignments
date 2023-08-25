package assgnment1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a,b,quotient,remainder;
		System.out.println("Enter a number a");
		a=sc.nextFloat();
		System.out.println("Enter a number b");

		b=sc.nextFloat();
		quotient=a/b;
		remainder=a%b;
		System.out.println("Quotient="+quotient);
		
		System.out.println("Remainder="+remainder);

	}

}
