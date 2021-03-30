import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner (System.in);
		
		while (num != 6) {
			
			System.out.println("Website ID Manage MENU \n**********************");
			System.out.println("1. Add User ID");
			System.out.println("2. Delete User ID");
			System.out.println("3. Edit User ID");
			System.out.println("4. View User ID");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
		
			if (num == 1) {
				addID();
			}
			else if (num == 2) {
				deleteID();
			}
			else if (num == 3) {
				editID();
			}
			else if (num == 4) {
				viewID();
			}
			else {
				continue;
			}
		}
	}
	public static void addID() {
		Scanner input = new Scanner (System.in);
		System.out.print("Name : ");
		String User_name = input.next();
		System.out.print("New ID: ");
		int User_ID = input.nextInt(); 
		System.out.print("New Password(only number) : ");
		int User_password = input.nextInt();
		System.out.print("E-mail address : ");
		String User_mail = input.next();
		System.out.print("Phone Number : ");
		String user_phonenumber = input.next();
	}

	public static void deleteID() {
		Scanner input = new Scanner (System.in);
		System.out.print("Name : ");
		String User_name = input.next();
	}
	public static void editID () {
		Scanner input = new Scanner (System.in);
		System.out.print("Name : ");
		String User_name = input.next();
	}
	
	public static void viewID () {
		Scanner input = new Scanner (System.in);
		System.out.print("Name : ");
		String User_name = input.next();
	}
	
	
}

	
