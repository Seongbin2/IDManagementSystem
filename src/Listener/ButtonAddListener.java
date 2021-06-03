package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.UserIDAdder;
import GUI.UserinfoViewer;
import GUI.WindowFrame;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		UserIDAdder adder = frame.getUseridadder();
		frame.setupPanel(adder);

	}

}
