package polymorphism;

public class Question1 {

	public static void main(String[] args) {
		Shape sh=new Shape(2,3);
		System.out.println("Area of shape="+area(sh));
		Rectangle r=new Rectangle(2,3);
		System.out.println("Area of rectangle="+area(r));
		Square s=new Square(2);
		System.out.println("Area of square="+area(s));

	}
	int breadth;
	static int area(Shape sh){
		int area=sh.dim1*sh.dim2;
		return area;
	}
	
	static int area(Rectangle r){
		int area=r.length*r.breadth;
		return area;
	}
	static int area(Square s){
		int area=s.side*s.side;
		return area;
	}
}
