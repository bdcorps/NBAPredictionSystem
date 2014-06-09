import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.JTable;

import java.awt.Scrollbar;
import java.awt.Panel;

import javax.swing.JSeparator;
import javax.swing.JTree;


import javax.swing.*;
import javax.swing.table.*;

public class statScreen extends JPanel{
	private JTable table;
	private JTable table_1;
	public statScreen() {
		
		Panel panel = new Panel();
		add(panel);
		
		table = new JTable(10,2);
		panel.add(table);
		
		Panel panel_1 = new Panel();
		add(panel_1);
		
		table_1 = new JTable(10,2);
		panel_1.add(table_1);
	}

}

