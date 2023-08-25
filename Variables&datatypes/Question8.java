package assgnment1;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		int temp;
		 int i=9;
		 int j=4;

		System.out.println("Value of i before swap="+i);
		System.out.println("Value of j before swap="+j);
		
		temp=j;
		j=i;
		i=temp;
		System.out.println("Value of i after swap="+i);
		System.out.println("Value of i after swap="+j);
	}

}
