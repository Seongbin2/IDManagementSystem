import java.util.Scanner;

public class IDManagement {
	ID id;
	Scanner input;
	IDManagement(Scanner input){
		this.input = input;
	}
	public void addID() {
		id = new ID();
		Scanner input = new Scanner (System.in);
		System.out.print("Name : ");
		id.name = input.next();
		System.out.print("New ID: ");
		id.id = input.nextInt(); 
		System.out.print("New Password(only number) : ");
		id.password= input.nextInt();
		System.out.print("E-mail address : ");
		id.mail = input.next();
		System.out.print("Phone Number : ");
		id.phone = input.next();
	}

	public void deleteID() {

		System.out.print("ID : ");
		int User_id = input.nextInt();
		if(id == null) {
			System.out.println("The ID has not been registred!!");
			return;
		}
		if (id.id == User_id) {
			id = null;
			System.out.println("The ID '" + id + "' is deleted!");
		}
		
	}
	public void editID () {

		System.out.print("ID : ");
		int User_id = input.nextInt();
		if (id.id == User_id) {
		
			System.out.println("The ID to be edited is " + User_id);
		}
	}
	
	public void viewID () {

		System.out.print("ID : ");
		int User_id = input.nextInt();
		if (id.id == User_id) {
			id.printInfo();
		}
	}
}
