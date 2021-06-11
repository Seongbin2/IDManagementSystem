package GUI;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ID.IDinput;
import manager.IDManagement;

public class UserinfoViewer extends JPanel{

	WindowFrame frame;
	
	IDManagement idmanagement;
	
	public IDManagement getIdmanagement() {
		return idmanagement;
	}

	public void setIdmanagement(IDManagement idmanagement) {
		this.idmanagement = idmanagement;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contact Info.");
		
		for(int i=0; i<idmanagement.size(); i++) {
			Vector row = new Vector();
			IDinput ii= idmanagement.get(i);
			row.add(ii.getId());
			row.add(ii.getName());
			row.add(ii.getMail());
			row.add(ii.getPhone());
			model.addRow(row);
		}
	}

	public UserinfoViewer(WindowFrame frame, IDManagement idmanagement) {
		this.frame = frame; 
		this.idmanagement = idmanagement;
		
		System.out.println("***" + idmanagement.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contact Info.");
		
		for(int i=0; i<idmanagement.size(); i++) {
			Vector row = new Vector();
			IDinput ii= idmanagement.get(i);
			row.add(ii.getId());
			row.add(ii.getName());
			row.add(ii.getMail());
			row.add(ii.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}
}
