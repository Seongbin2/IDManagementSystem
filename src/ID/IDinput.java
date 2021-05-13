package ID;

import java.util.Scanner;

import Exception.EmailFormatException;

public interface IDinput {

	public int getId();
	
	public void setId(int id);

	public void setName(String name);
	
	public void setPassword(int password);
	
	public void setMail(String mail) throws EmailFormatException;
	
	public void setPhone(String phone);
	
	public void getUserInput(Scanner input);

	public void printInfo();
	
	public void setUser_ID(Scanner input);
	
	public void setUser_Name(Scanner input);
	
	public void setUser_Password(Scanner input);
	
	public void setUser_Email(Scanner input);
	
	public void setUser_Phonenumber( Scanner input);
	
	
}
