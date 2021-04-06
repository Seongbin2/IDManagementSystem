
public class ID {
	String name;
	int id;
	int password;
	String mail;
	String phone;
	  
	public ID() {

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
		System.out.println("Name :" + name + "\n ID :" + id + "\n Password =" + password + "\n Mail =" +mail + "\n Phone ="+phone);
		
	}
}
