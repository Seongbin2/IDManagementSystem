package ID;

import java.util.Scanner;

import Exception.EmailFormatException;

public abstract class ID implements IDinput{

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

	public void setMail(String mail) throws EmailFormatException {
		
		if (!mail.contains("@") && !mail.equals("")) {
			throw new EmailFormatException();
		}
		
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

	public abstract void printInfo();
	
	public void setUser_ID( Scanner input) {
		System.out.print("ID : ");
		int id2 = input.nextInt();
		this.setId(id2);
	}
	
	public void setUser_Name(Scanner input) {
		System.out.print("Name : ");
		String id2 = input.next();
		this.setName(id2);
	}
	
	public void setUser_Password(Scanner input) {
		System.out.print("Password : ");
		int password = input.nextInt();
		this.setPassword(password);
	}
	
	public void setUser_Email(Scanner input) {
		String mail = "";
		while (!mail.contains("@")) {
			try {
			System.out.print("E-mail :");
			mail = input.next();
			
				this.setMail(mail);
			} catch (EmailFormatException e) {
				System.out.println("Wrong Email address! Put the E-mail address taht contains '@'");
			}
		}
	}
	public void setUser_Phonenumber( Scanner input) {
		System.out.print("Phone number :");
		String phone = input.next();
		this.setPhone(phone);
	}
	
	public String getKindString() {
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
		return skind;
	}
	
	
}
