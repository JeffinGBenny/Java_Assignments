package Inheritance;

import java.util.Scanner;

class Car extends Vehicle{
	Scanner sc=new Scanner(System.in);

	 String brandName(){
		System.out.println("Enter car brand");
		String brandName = sc.next();
		return brandName;
	}
	 
	 String color(){
			System.out.println("Enter car color");
			String color = sc.next();
			return color;
		}
	
}
