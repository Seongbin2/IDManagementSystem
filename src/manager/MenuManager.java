package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

	
		
		Scanner input = new Scanner (System.in);
		IDManagement idmanagement = getObject("idmanagement.ser");
		if(idmanagement == null) {
			idmanagement = new IDManagement(input);
		}		
		
		WindowFrame frame = new WindowFrame(idmanagement);
		selectMenu(input, idmanagement);
		putObject(idmanagement, "idmanagement.ser");
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
					logger.log("add a ID");
					break;
				case 2:
					idmanagement.deleteID();
					logger.log("delete a ID");
					break;
				case 3:
					idmanagement.editID();
					logger.log("edit a ID");
					break;
				case 4:
					idmanagement.viewIDs();
					logger.log("edit a list of ID");
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
	
	public static IDManagement getObject(String filename) {
		
		IDManagement idmanagement = null;
		
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			idmanagement = (IDManagement) in.readObject();
			
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return idmanagement;
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return idmanagement;
	}



public static void putObject(IDManagement idmanagement, String filename) {

	try {
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(idmanagement);
		
		out.close();
		file.close();
		
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}

}



	
	


	
