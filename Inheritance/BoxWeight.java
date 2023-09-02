package Inheritance;

public class BoxWeight extends Box{
	

	float weight;

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public BoxWeight(float width, float height, float depth, float weight) {
		super(width, height, depth);
		this.weight = weight;
	}
	
	

}

	

	
	
	
	
	

