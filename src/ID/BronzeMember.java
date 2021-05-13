package ID;

import java.util.Scanner;

public class BronzeMember extends NohaveEmail{
	
	public BronzeMember(UserType type) {
		super(type);
	}

	public void getUserInput(Scanner input) {
		setUser_ID(input);
		setUser_Name(input);
		setUser_Password(input);
		setUserEmailwithYN(input);
		setUser_Phonenumber(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("UserType :" + skind + "\n Name :" + name + "\n ID :" + id + "\n Password :" + password + "\n Parent's Mail :" + mail + "\n Parent's Phone :"+phone );
		
	}
	
	

}
