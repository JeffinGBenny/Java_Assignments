package polymorphism;

public class Rectangle1 extends Figure {
	int length;
	int breadth;
	public Rectangle1(int length, int breadth) {
		super(length,breadth);
		this.length = length;
		this.breadth = breadth;
	}
	
	int area(){
		int area=this.dim1*this.dim2;
		return area;
	}
}