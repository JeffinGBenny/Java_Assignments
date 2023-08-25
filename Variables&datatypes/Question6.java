package assgnment1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double distanceInKm,distanceInM,distanceInFeet,distanceInInch,distanceInCm;
		System.out.println("Enter distance in Km");
		distanceInKm=sc.nextFloat();
		distanceInM=distanceInKm*1000;
		distanceInFeet=distanceInKm*3280.84;
		distanceInInch=distanceInKm*39370.1;
		distanceInCm=distanceInKm*100000;
		System.out.println("Distance in metres="+distanceInM);
		System.out.println("Distance in feet="+distanceInFeet);
		System.out.println("Distance in Inch="+distanceInInch);
		System.out.println("Distance in centimetres="+distanceInCm);
	}

}
