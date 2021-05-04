package ID;

import java.util.Scanner;

public class ID {

	protected UserType type = UserType.GoldMember;
	protected String name;
	protected int id;
	protected int password;
	protected String mail;
	protected String phone;
	  
	public ID() {

	}
	public ID(UserType type) {
		this.type = type;
	}
	
	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	} 

	public void setId(int id) {
		this.id = id;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public ID(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public ID(String name, int id, int password, String mail, String phone) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.mail = mail;
		this.phone = phone;
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
		System.out.println("UserType :" + skind + "\n Name :" + name + "\n ID :" + id + "\n Password :" + password + "\n Mail :" +mail + "\n Phone :"+phone);
		
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
		System.out.print("New ID: ");
		int id1 = input.nextInt(); 
		this.setId(id1);
		System.out.print("New Password(only number) : ");
		int password = input.nextInt();
		this.setPassword(password);
		System.out.print("E-mail address : ");
		String mail = input.next();
		this.setMail(mail);
		System.out.print("Phone Number : ");
		String phone = input.next();
		this.setPhone(phone);
	}
}
