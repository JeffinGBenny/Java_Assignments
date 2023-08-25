package assignment2;


 class Volumes {
	
	int length;
	int breadth;
	int height;

	Volumes(int length,int breadth,int height) {
		this.breadth =breadth;
		this.length = length;
		this.height = height;

	}

	int calculateVolume() {
		return this.length * this.breadth * this.height;
	}
}
public class Question8 {

	public static void main(String[] args) {
		Volumes v1 = new Volumes(1,2,3);

		System.out.println("length=" + v1.length + "\n" + "breadth="
				+ v1.breadth + "\n" + "height=" + v1.height + "\n" + "Volume="
				+ v1.calculateVolume());

		Volumes v2 = new Volumes(4,6,10);

		System.out.println("\n length=" + v2.length + "\n" + "breadth="
				+ v2.breadth + "\n" + "height=" + v2.height + "\n" + "Volume="
				+ v2.calculateVolume());

	}
}
