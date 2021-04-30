import java.util.ArrayList;
import java.util.Scanner;

import ID.BronzeMember;
import ID.ID;
import ID.SilverMember;

public class IDManagement {
	ArrayList<ID> ids = new ArrayList<ID>();

	Scanner input;
	IDManagement(Scanner input){
		this.input = input;
	}
	public void addID() {
		int type = 0;
		ID id;
		while (type != 1 && type != 2 && type != 3) {
			System.out.println("1. for Gold Member  ");
			System.out.println("2. for Silver Member");
			System.out.println("3. for Bronze Member");

			System.out.print("Select Number For ID TYPE between 1 ,2 and 3 : ");
			type = input.nextInt();
			if (type == 1) {
				id = new ID(UserType.GoldMember);
				id.getUserInput(input);
				ids.add(id);
				break; 
			}
			else if (type == 2) {
				id = new SilverMember(UserType.SilverMember);
				id.getUserInput(input);
				ids.add(id);
				break;
			}
			
			else if (type == 3) {
				id = new BronzeMember(UserType.BronzeMember);
				id.getUserInput(input); 
				ids.add(id);
				break;
			}
			else {
				System.out.print("Select Number For ID TYPE between 1 and 2 : ");
			}
		}

		Scanner input = new Scanner (System.in);
 
	  //id의 이름겹침 때문에 id1 으로 임의설정

	}

	public void deleteID() {
		System.out.print("ID : ");
		int User_id = input.nextInt();
		int index = -1;
		for (int i=0; i<ids.size(); i++) {
			if (ids.get(i).getId() == User_id) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			ids.remove(index);
			System.out.println("The ID" + User_id + "is deleted!");
		}
		else {
			System.out.println("The ID has not been registered");
			return;
		}
		
	}
	public void editID () {

		System.out.print("Your ID :");
		int User_id = input.nextInt();
		for (int i=0; i<ids.size(); i++) {
			ID id = ids.get(i);
			if(ids.get(i).getId() == User_id) {
				int num = -1;
				while (num !=5) {
					System.out.println("** ID Info Edit Menu **");
					System.out.println(" 1. Edit Name");
					System.out.println(" 2. Edit Password");
					System.out.println(" 3. Edit E-mail");
					System.out.println(" 4. Edit Phonenumber");
					System.out.println(" 5. EXIT");
					System.out.println("** SELECT ONE NUMBER BETWEEN 1-5 **");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Name : ");
						String id2 = input.next();
						id.setName(id2);
					}
					else if(num == 2) {
						System.out.print("Password : ");
						int password = input.nextInt();
						id.setPassword(password);
					}
					else if(num == 3) {
						System.out.print("E-mail :");
						String mail = input.next();
						id.setMail(mail);
					}
					else if(num==4) {
						System.out.print("Phone number :");
						String phone = input.next();
						id.setPhone(phone);
					}
					else {
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
}
