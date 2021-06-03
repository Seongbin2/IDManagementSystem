package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ID.BronzeMember;
import ID.GoldMember;
import ID.ID;
import ID.IDinput;
import ID.SilverMember;
import ID.UserType;

public class IDManagement implements Serializable{
	
	private static final long serialVersionUID = -8588681312168756223L;

	ArrayList<IDinput> ids = new ArrayList<IDinput>();

	transient Scanner input;
	
	IDManagement(Scanner input){
		this.input = input;
	}
	
	public void addID() {
		int types = 0;
		IDinput idinput;
		while (types < 1 || types > 3) {
			try {
				System.out.println("1. for Gold Member  ");
				System.out.println("2. for Silver Member");
				System.out.println("3. for Bronze Member");

				System.out.print("Select Number For ID TYPE between 1 ,2 and 3 : ");
				types = input.nextInt();
				
				if (types == 1) {
					idinput = new GoldMember(UserType.GoldMember);
					idinput.getUserInput(input);
					ids.add(idinput);
					break; 
				}
			
				else if (types == 2) {
					idinput = new SilverMember(UserType.SilverMember);
					idinput.getUserInput(input);
					ids.add(idinput);
					break;
				}
			
				else if (types == 3) {
					idinput = new BronzeMember(UserType.BronzeMember);
					idinput.getUserInput(input); 
					ids.add(idinput);
				break;
				}
				else {
					System.out.print("Select Number For ID TYPE between 1 and 2 : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put and integer between 1 and 3");
				if(input.hasNext()) {
					input.next();
				} 
				types = -1;	
			}
		}
	}

	public void deleteID() {
		System.out.print("ID : ");
		int User_id = input.nextInt();
		int index = findIndex(User_id);
		removefromeID(index, User_id);
	}
	
	public int findIndex(int User_id) {
		int index = -1;
		for (int i=0; i<ids.size(); i++) {
			if (ids.get(i).getId() == User_id) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromeID(int index, int User_id) {
		if (index >= 0) {
			ids.remove(index);
			System.out.println("The ID" + User_id + "is deleted!");
			return 1;
		}
		else {
			System.out.println("The ID has not been registered");
			return -1;
		}
	}
	
	public void editID () {

		System.out.print("Your ID :");
		int User_id = input.nextInt();
		for (int i=0; i<ids.size(); i++) {
			IDinput idinput = ids.get(i);
			if(idinput.getId() == User_id) {
				int num = -1;
				while (num !=5) {
				 
					showEditMenu();
					
					num = input.nextInt();
					
					switch (num) {
					case 1:
						idinput.setUser_Name(input);
						break;
					case 2:
						idinput.setUser_Password(input);
						break;
					case 3:
						idinput.setUser_Email(input);
						break;
					case 4:
						idinput.setUser_Phonenumber(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	} 
	
	
	public void viewIDs () {

		for (int i=0; i<ids.size(); i++) {
			ids.get(i).printInfo();
		}
	}
	
	
	public int size() {
		return ids.size();
	}
	
	public IDinput get(int index) {
		return (ID) ids.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("** ID Info Edit Menu **");
		System.out.println(" 1. Edit Name");
		System.out.println(" 2. Edit Password");
		System.out.println(" 3. Edit E-mail");
		System.out.println(" 4. Edit Phonenumber");
		System.out.println(" 5. EXIT");
		System.out.println("** SELECT ONE NUMBER BETWEEN 1-5 **");
	}
}
