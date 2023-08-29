package control_structures;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String pin="NULL";
		System.out.println("Enter the pin : ");
		pin = scan.nextLine();
		
		if(checkPin(pin))
				System.out.println("Entered PIN is correct!!");
		else
				System.out.println("Entered PIN is incorrect!!");
	}
	public static boolean checkPin(String pin) {
		String actualPin = "8642";
		return pin.equals(actualPin);
	}

}
