package constructors;
import java.util.Scanner;



public class StaffLibrary {
	Scanner sc=new Scanner(System.in);
	Staff[] st=new Staff[5];
	int i=0;
	public void addStaff(){
		
		
		
		Staff obj=new Staff();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter phone number");

		long phoneNo=sc.nextLong();
		obj.setName(name);
		obj.setPhoneNumber(phoneNo);
		st[i]=obj;
		System.out.println("Records added");
		i++;
		
		
	}
public int searchPerson(String searchName){
	
for(int i=0;i<st.length;i++){
	if(searchName.equals(st[i].getName())){
		
		return i;
}
	}
return -1;
}
	public void display(int index){
		Staff s=st[index];
		System.out.println("Name:"+p.getName());
		System.out.println("Phone number"+p.getPhoneNo());

		
	}
	public void displayAll(){
		for(Staff s:st){
			System.out.println(s);
		}
	}

}

public class StaffLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
