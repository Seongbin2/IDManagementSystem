package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.UserinfoViewer;
import GUI.WindowFrame;
import manager.IDManagement;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	
	public void actionPerformed(ActionEvent e) {
		UserinfoViewer userinfoviewer = frame.getUserinfoviewer();
		IDManagement idmanagement = getObject("idmanagement.ser");
		userinfoviewer.setIdmanagement(idmanagement);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(userinfoviewer);
		frame.revalidate();
		frame.repaint();
	}
	
public static IDManagement getObject(String filename) {
		
		IDManagement idmanagement = null;
		
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			idmanagement = (IDManagement) in.readObject();
			
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return idmanagement;
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return idmanagement;
	}

	//public void actionPerformed(ActionEvent e) {
		//JButton b = (JButton)e.getSource();
	//	UserinfoViewer viewer = frame.getUserinfoviewer();
	//	frame.setupPanel(viewer);

	//}

}
