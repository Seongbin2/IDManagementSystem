import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		IDManagement idmanagement = new IDManagement(input);
		 
		selectMenu(input, idmanagement);
	}
	
	public static void selectMenu(Scanner input, IDManagement idmanagement) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
		
				switch(num) {
				case 1:
					idmanagement.addID();
					break;
				case 2:
					idmanagement.deleteID();
					break;
				case 3:
					idmanagement.editID();
					break;
				case 4:
					idmanagement.viewIDs();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put and integer between 1 and 5");
				if(input.hasNext()) {
					input.next();
				} 
				num = -1;
			}
		} 
	}
	
	public static void showMenu() {
		System.out.println("Website ID Manage MENU \n**********************");
		System.out.println("1. Add User ID");
		System.out.println("2. Delete User ID");
		System.out.println("3. Edit User ID");
		System.out.println("4. View User IDs");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5");
	}
}
	
	


	
