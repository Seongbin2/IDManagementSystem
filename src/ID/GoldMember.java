package ID;

import java.util.Scanner;

public class GoldMember extends ID {
	
	public GoldMember(UserType type) {
		super(type);
	}
	
	protected String parentEmail;
	protected String parentPhone;

	public void getUserInput(Scanner input) {
		System.out.println("User ID : ");
		int id = input.nextInt();
		this.setId(id);     //상속받은 ID.java 의 함수 사용
		
		System.out.println("User name :");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an Email address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Email address: ");
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
	
}
