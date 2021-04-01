import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		IDManagement idmanagement = new IDManagement(input);
		int num = -1;
		while (num != 5) {
			
			System.out.println("Website ID Manage MENU \n**********************");
			System.out.println("1. Add User ID");
			System.out.println("2. Delete User ID");
			System.out.println("3. Edit User ID");
			System.out.println("4. View User ID");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5");
			num = input.nextInt();
		
			if (num == 1) {
				idmanagement.addID();
			}
			else if (num == 2) {
				idmanagement.deleteID();
			}
			else if (num == 3) {
				idmanagement.editID();
			}
			else if (num == 4) {
				idmanagement.viewID();
			}
			else {
				continue;
			}
		}
	}
	
	
}

	
