package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.EmailFormatException;
import ID.GoldMember;
import ID.IDinput;
import ID.UserType;
import manager.IDManagement;

public class UserAdderListener implements ActionListener {

	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldPhone;
	
	IDManagement idmanagement;
	
	public UserAdderListener(JTextField fieldID, JTextField fieldName, 
			JTextField fieldEmail, JTextField fieldPhone, IDManagement idmanagement) {
		 
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldPhone = fieldPhone;
		this.idmanagement = idmanagement;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		IDinput idinput = new GoldMember(UserType.GoldMember);
		try {
			idinput.setId(Integer.parseInt(fieldID.getText()));
			idinput.setMail(fieldEmail.getText());
			idinput.setName(fieldName.getName());
			idinput.setPhone(fieldPhone.getText());
			idmanagement.addID(idinput);
			putObject(idmanagement, "idmanagement.ser");
			idinput.printInfo();
		} catch (EmailFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
	}
	
	public static void putObject(IDManagement idmanagement, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(idmanagement);
			
			out.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
