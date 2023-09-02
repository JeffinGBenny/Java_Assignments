package Inheritance;

public class Question4 {

	public static void main(String[] args) {
		Grad g=new Grad("Raju", 1, 50, 21, "Trivandrum");
		System.out.println(g);
		if(g.isPassed(g.grade)){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
		UnderGrad u=new UnderGrad("George", 1, 90, 21, "Kochi");
		System.out.println(u);
		if(u.isPassed(u.grade)){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
	}

}
