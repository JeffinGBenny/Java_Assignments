package constructors;
import java.util.Scanner;



public class Question3 {

	public static void main(String[] args) {
		menuDisplay();
	}

	private static void menuDisplay(){
		Scanner input=new Scanner(System.in);
		int ch=0;
		char choice='n';
		StaffLibrary lib=new StaffLibrary();
		do{
			System.out.println("Staff Management");
			System.out.println("1.add staff");
			System.out.println("2.Search staff");
			System.out.println("3.Delete staff");
			System.out.println("4.List staff");
			System.out.println("0.Exit");
			System.out.println("Enter your choice");
			ch=Integer.parseInt(input.next());
			switch(ch){
			case 1:lib.addStaff();
			break;
			case 2:System.out.println("searching...");
			System.out.println("Enter the name to be searched");
			String searchName=input.next();
			
			int index=lib.searchPerson(searchName);
			if(index>=0){
				System.out.println("Name found");
			}
			else{
				System.out.println("Name not found");
			}
			break;
			case 3:System.out.println("deleting...");
			break;
			case 4:System.out.println("displaying...");
			System.out.println("Enter the index to be displayed");
			int index1=input.nextInt();
			lib.display(index1);
			break;
			
			case 0:break;
			default:System.out.println("Invalid entry");
			}
			System.out.println("Do you want to continue?");
			choice=input.next().charAt(0);
		}while(choice=='y' || choice=='Y');
	}
}

