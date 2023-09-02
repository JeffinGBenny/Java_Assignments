package polymorphism;

public class Figure {
	int dim1;
	int dim2;
	public Figure(int dim1, int dim2) {
		
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	int area(){
		int area=this.dim1*this.dim2;
		return area;
	}

}
