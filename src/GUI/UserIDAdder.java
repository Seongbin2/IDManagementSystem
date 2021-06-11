package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.IDAdderCancleListener;
import Listener.UserAdderListener;
import manager.IDManagement;

public class UserIDAdder extends JPanel{

	WindowFrame frame;
	IDManagement idmanagement;
	
	public UserIDAdder(WindowFrame frame, IDManagement idmanagement) {

		this.frame = frame;
		this.idmanagement = idmanagement;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelEmail = new JLabel("Email: ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		
		JLabel labelPhone = new JLabel("Phone: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		
		JButton savebutton = new JButton("save");
		savebutton.addActionListener(new UserAdderListener(fieldID,fieldName,
				fieldEmail,fieldPhone, idmanagement));
		
		JButton canclebutton = new JButton("cancle");
		canclebutton.addActionListener(new IDAdderCancleListener(frame));
		
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		panel.add(savebutton);
		panel.add(canclebutton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		

		this.add(panel);
		this.setVisible(true);
		

		
	}

}
