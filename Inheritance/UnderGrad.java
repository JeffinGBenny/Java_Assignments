package Inheritance;

public class UnderGrad extends Student{
	
	public UnderGrad(String name, int iD, double grade, int age, String address) {
		super(name, iD, grade, age, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UnderGrad [name=" + name + ", ID=" + ID + ", grade=" + grade
				+ ", age=" + age + ", address=" + address + "]";
	}

	boolean isPassed (double grade){
		if(grade>70){
			return true;
		}
		else{
			return false;
		}
	}
}
