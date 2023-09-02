package Inheritance;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Patient p=new Patient("arjun","KIMS",2019,"trivandrum");
		System.out.println(p);
		Money m=new Money();
		System.out.println(p.calculateMedicalFee(m));
		
	}

}
