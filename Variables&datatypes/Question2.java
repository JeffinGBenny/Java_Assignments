package assgnment1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter i");
		i=sc.nextInt();
		System.out.println("Enter j");
		j=sc.nextInt();
		
		
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("i="+i);
		System.out.println("j="+j);

	}

}
