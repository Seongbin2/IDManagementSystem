import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner (System.in);
		
		while (num != 6) {
			
		System.out.println("Website ID Manage MENU \n********************");
		System.out.println("1. Add User ID");
		System.out.println("2. Delete User ID");
		System.out.println("3. Edit User ID");
		System.out.println("4. View User ID");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6");
		num = input.nextInt();
		switch (num) {
		case 1 :
			System.out.print("Name : ");
			String User_name = input.next();
			System.out.print("New ID: ");
			int User_ID = input.nextInt(); 
			System.out.print("New Password(only number) : ");
			int User_password = input.nextInt();

			System.out.print(" : ");
			break;
		case 2 :
			System.out.print ("ID : ");
			System.out.print ("Password : ");
			
			
		}
		}
	}
}

	
