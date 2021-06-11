package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.IDManagement;

public class WindowFrame extends JFrame{

	IDManagement idmanagement;
	
	MenuSelection menuselection;
	UserIDAdder useridadder;
	UserinfoViewer userinfoviewer;

	
	public WindowFrame(IDManagement idmanagement) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.idmanagement = idmanagement;		
		menuselection = new MenuSelection(this);
		useridadder = new UserIDAdder(this, this.idmanagement);
		userinfoviewer = new UserinfoViewer(this, this.idmanagement);

		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	
	public void setupPanel(JPanel panel) {
		
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}


	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}


	public UserIDAdder getUseridadder() {
		return useridadder;
	}


	public void setUseridadder(UserIDAdder useridadder) {
		this.useridadder = useridadder;
	}


	public UserinfoViewer getUserinfoviewer() {
		return userinfoviewer;
	}


	public void setUserinfoviewer(UserinfoViewer userinfoviewer) {
		this.userinfoviewer = userinfoviewer;
	}

}
