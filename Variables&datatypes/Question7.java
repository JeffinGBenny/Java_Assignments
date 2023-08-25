package assgnment1;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double temperatureInC,temperatureInF;
		System.out.println("Enter Temperaturture in Fahrenheit");
		temperatureInF=sc.nextFloat();
		
		temperatureInC=(temperatureInF-32)*5/9;
		System.out.println("Temperaturture in Celsius="+temperatureInC);
	}

}
