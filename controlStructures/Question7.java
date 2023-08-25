package assignment2;
 class Volume{
	int length;
	int breadth;
	int height;
	int calculateVolume(){
		return length*breadth*height;
	}
}
public class Question7 {

	public static void main(String[] args) {
      Volume v1=new Volume();
      v1.breadth=1;
      v1.length=2;
      v1.height=3;
      System.out.println("length="+ v1.length+"\n"+
      "breadth="+v1.breadth+"\n"+"height="+ v1.height+"\n"+"Volume="+v1.calculateVolume());
      
      Volume v2=new Volume();
      v2.breadth=4;
      v2.length=6;
      v2.height=10;
      System.out.println("\n length="+ v2.length+"\n"+
    	      "breadth="+v2.breadth+"\n"+"height="+ v2.height+"\n"+"Volume="+v2.calculateVolume());
      
      
      
	}

}
