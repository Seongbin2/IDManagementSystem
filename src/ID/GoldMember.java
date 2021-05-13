package ID;

import java.util.Scanner;

import Exception.EmailFormatException;

public class GoldMember extends ID {
	
	public GoldMember(UserType type) {
		super(type);
	}
	
	protected String parentEmail;
	protected String parentPhone;

	public void getUserInput(Scanner input) {
		setUser_ID(input);
		setUser_Name(input);
		setUser_Password(input);
		setUser_Email(input);
		setUser_Phonenumber(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("UserType :" + skind + "\n Name :" + name + "\n ID :" + id + "\n Password :" + password + "\n Mail :" +mail + "\n Phone :"+phone);
		
	}
	
}
