package ID;

import java.util.Scanner;

import Exception.EmailFormatException;

public abstract class NohaveEmail extends ID {

	public NohaveEmail(UserType type) {
		super(type);
	}
	
	public abstract void getUserInput(Scanner input);

	public void printInfo() {
		String skind = getKindString(); 
		System.out.println("UserType :" + skind + "\n Name :" + name + "\n ID :" + id + "\n Password :" + password + "\n Mail :" +mail + "\n Phone :"+phone);
	}

	public void setUserEmailwithYN(Scanner input) {
	
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an Email address? (Y/N)");
			answer = input.next().charAt(0);
			try {
				
			if(answer == 'y' || answer == 'Y') {
				setUser_Email(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMail("");
				break;
			}
			else {
			}
			}
			catch(EmailFormatException e) {
				System.out.println("Wrong Email address! Put the E-mail address taht contains '@'");
			}
		}
		
	}
}
