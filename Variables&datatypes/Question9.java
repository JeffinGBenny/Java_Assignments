package assgnment1;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float basicSalary;
		System.out.println("Enter Raju's basic salary");
		basicSalary=sc.nextFloat();
		System.out.println("Total salary="+(basicSalary+0.4*basicSalary+0.2*basicSalary));
	}

}
