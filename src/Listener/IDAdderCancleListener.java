package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.UserIDAdder;
import GUI.UserinfoViewer;
import GUI.WindowFrame;

public class IDAdderCancleListener implements ActionListener {

	WindowFrame frame;
	
	public IDAdderCancleListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
		
	}

}
