import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

public class winScreen extends JFrame {
	JLabel team1_image;
	center p = new center();
	playerStatParser sp;

	private JScrollPane sc1;
	private Box topPanel;
	private JTable table;
	private JScrollPane scrollPane;
	private JTable table2;
	private JScrollPane scrollPane2;
	String[][] dataValues;
	ArrayList<String> StatsNameList = new ArrayList<String>();
	ArrayList<String> StatsValueList = new ArrayList<String>();
	boolean error = false;
	String winner;
	int points1 = 0;
	int points2 = 0;

	Box a1;
	Box a;

	public winScreen(ArrayList<team> teamMatchups) {
		a = Box.createVerticalBox();
		a1 = Box.createHorizontalBox();
		
		JPanel panel = new JPanel();
		JLabel t1 = new JLabel(teamMatchups.get(0).p_team1_1.getTeam());
		t1.setFont(new Font("Serif", Font.PLAIN, 14));
		a1.add(t1);
		JLabel vs = new JLabel("	 VS.	 ");
		vs.setFont(new Font("Serif", Font.PLAIN, 10));
		a1.add(vs);
		JLabel t2 = new JLabel(teamMatchups.get(1).p_team1_1.getTeam());
		t2.setFont(new Font("Serif", Font.PLAIN, 14));
		a1.add(t2);
		a.add(a1);
		
		sc1 = new JScrollPane(a);

		sc1.setPreferredSize(new Dimension(800, 600));
		for (int i = 0; i < teamMatchups.size(); i++)
		{
			displayTable(teamMatchups.get(i), teamMatchups.get(++i));
		}
		
		panel.add(sc1);
		
		panel.setPreferredSize(new Dimension(800, 640));
		panel.setBackground(Color.WHITE);
		Container cp = getContentPane();
		cp.add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Handle the CLOSE
														// button
		setTitle("NBA Prediction System");
		pack(); // pack all the components in the JFrame
		setVisible(true); // show it

		requestFocus();
	}

	private void setTable(team t) {
		dataValues[0] = setPlayerTable(t.p_team1_1);
		dataValues[1] = setPlayerTable(t.p_team1_2);
		dataValues[2] = setPlayerTable(t.p_team1_3);
		dataValues[3] = setPlayerTable(t.p_team1_4);
		dataValues[4] = setPlayerTable(t.p_team1_5);
	}

	private String[] setPlayerTable(player p) {
		String[] pValue = new String[14];
		pValue[0] = p.getName();
		pValue[1] = String.valueOf(p.getExperience());
		pValue[2] = String.valueOf((int) p.getPpg());
		pValue[3] = String.valueOf((int) p.getApg());
		pValue[4] = String.valueOf((int) p.getoRpg());
		pValue[5] = String.valueOf((int) p.getTpg());
		pValue[6] = String.valueOf(p.getFgPercent());
		pValue[7] = String.valueOf(p.getFtPercent());
		pValue[8] = String.valueOf(p.getThreeptPercent());
		pValue[9] = String.valueOf(p.getTwoptPercent());
		pValue[10] = String.valueOf((int) p.getdRpg());
		pValue[11] = String.valueOf((int) (p.getFpg()));
		pValue[12] = String.valueOf((int) p.getBpg()*2);
		pValue[13] = String.valueOf((int) p.getSpg());

		return pValue;
	}

	public double round(double no, int precision) {
		return (double) Math.round(no * (Math.pow(10, precision)))
				/ (Math.pow(10, precision));
	}

	private String getWinner(int p1, int p2) {
		String winner = "";
		if (p1 > p2) {
			winner = "team1";
		} else if (p1 < p2) {
			winner = "team2";
		}
		return winner;
	}

	int i= 0;
	public void displayTable(team team1, team team2) {i++;
		String columnNames[] = { "Name", "Exp", "Pts", "Ast", "OR", "TOV",
				"FG%", "FT%", "3PT%", "2PT%", "DR", "Fls", "Blk", "Stl" };

		points1=0;
		points2=0;
		
		topPanel = Box.createVerticalBox();
		dataValues = new String[5][14];
		setTable(team1);

		for (int i = 0; i < dataValues.length; i++) {
			points1 += Integer.parseInt(dataValues[i][2]);
		}

		table = new JTable(dataValues, columnNames);
		table.setRowSelectionAllowed(false);
		table.setEnabled(false);
		// Add the table to a scrolling pane
		scrollPane = new JScrollPane(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setPreferredSize(new Dimension(700, 140));

		int vColIndex = 0;

		TableColumn col = table.getColumnModel().getColumn(vColIndex);

		int width = 100;

		col.setPreferredWidth(width);

		// ////////////

		dataValues = new String[5][14];
		setTable(team2);

		for (int i = 0; i < dataValues.length; i++) {
			points2 += Integer.parseInt(dataValues[i][2]);
		}

		winner = getWinner(points1, points2);

		table2 = new JTable(dataValues, columnNames);
		table2.setRowSelectionAllowed(false);
		table2.setEnabled(false);
		// Add the table to a scrolling pane
		scrollPane2 = new JScrollPane(table2);
		table2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane2.setPreferredSize(new Dimension(700, 140));
		scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		scrollPane2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		topPanel.add(new JLabel(String.valueOf(points1 + "  -  " + points2)), BorderLayout.EAST);

		JLabel tLabel1 = new JLabel(team1.p_team1_1.getTeam());
		topPanel.add(tLabel1);
		topPanel.add(scrollPane, BorderLayout.EAST);
		JLabel tLabel2 = new JLabel(team2.p_team1_1.getTeam());
		topPanel.add(tLabel2);
		topPanel.add(scrollPane2, BorderLayout.EAST);


		int vColIndex2 = 0;

		TableColumn col2 = table2.getColumnModel().getColumn(vColIndex2);

		int width2 = 100;

		col2.setPreferredWidth(width2);
		
		topPanel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.BLACK), "Game "+ i ));

		a.add(Box.createRigidArea(new Dimension(0,20)));
		a.add(topPanel);
	}
}
