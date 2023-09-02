package Inheritance;

public class Box{
	float width, height, depth;
	
	
	public Box(float width, float height, float depth) {
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	}


	float volume(){
		return width*height*depth;
	}
}
