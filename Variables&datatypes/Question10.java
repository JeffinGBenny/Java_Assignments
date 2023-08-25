package assgnment1;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,rem,sum=0;
		System.out.println("Enter 5 digit number");
		number=sc.nextInt();
		while(number>0){
			rem=number%10;
			sum=sum+rem;
			number=number/10;
			
		}
		System.out.println("Sum of digits="+sum);
	}

}
