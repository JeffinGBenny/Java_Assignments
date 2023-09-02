package polymorphism;

public class Question2 {

	public static void main(String[] args) {
		Figure f=new Figure(4,5);
		System.out.println("Area of figure="+f.area());
		Rectangle1 r=new Rectangle1(2,3);
		System.out.println("Area of rectangle="+r.area());
		Triangle t=new Triangle(2,8);
		System.out.println("Area of Triangle="+t.area());

	}
	
	
	
	
}
