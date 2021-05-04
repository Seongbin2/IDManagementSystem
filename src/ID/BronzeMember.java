package ID;

import java.util.Scanner;

public class BronzeMember extends ID {
	
	public BronzeMember(UserType type) {
		super(type);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("User ID : ");
		int id = input.nextInt();
		this.setId(id); 
		
		System.out.println("User name :");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an Parent's Email address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Parent's Email address: ");
				String email = input.next();
				this.setMail(email);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMail("");
				break;
			}
		}
		System.out.println("Phone number :");
		String phone = input.next();
		this.setPhone(phone);
	}
	public void printInfo() {
		String skind = "none";
		switch (this.type) {
		case GoldMember:
			skind = "GOLD";
			break;
		case SilverMember:
			skind = "SILVER";
			break;
		case BronzeMember:
			skind = "BRONZE";
			break;
		default:
			
		}
		System.out.println("UserType :" + skind + "\n Name :" + name + "\n ID :" + id + "\n Password :" + password + "\n Parent's Mail :" + mail + "\n Parent's Phone :"+phone );
		
	}

}
