package polymorphism;

public class Triangle extends Figure {
	
	int base;
	int height;
	public Triangle(int base, int height) {
		super(base,height);
		this.base = base;
		this.height = height;
	}
	
	int area(){
		int area=(this.base*this.height)/2;
		return area;
	}

}
