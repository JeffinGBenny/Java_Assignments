package Inheritance;


public class Question2 {

	public static void main(String[] args) {
		BoxWeight b=new BoxWeight(10,20,30,80);
		System.out.println(b.volume());
		System.out.println(b.getWeight());
		
		BoxWeight b1=new BoxWeight(10,10,20,70);
		System.out.println(b.volume());
		System.out.println(b.getWeight());
	}

}
