package constructors;

import java.util.Scanner;

class Box {
	float width, height,depth;
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}
	public float volumePassed(float width, float height, float depth) {
		return width*depth*height;
	}
	public float volume() {
		return width*depth*height;
	}
}
public class Question1 {

	public static void main(String[] args) {
		Box b=new Box();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height");
		b.setHeight(sc.nextFloat());
		System.out.println("Enter width");
		b.setWidth(sc.nextFloat());
		System.out.println("Enter depth");
		b.setDepth(sc.nextFloat());
        System.out.println("Volume="+b.volume());
        
        Box b1=new Box();
		
		System.out.println("Enter height");
		b1.setHeight(sc.nextFloat());
		System.out.println("Enter width");
		b1.setWidth(sc.nextFloat());
		System.out.println("Enter depth");
		b1.setDepth(sc.nextFloat());
        System.out.println("Volume="+b1.volume());
	}

}
