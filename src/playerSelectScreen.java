import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.activation.*;
import javax.swing.*;
import javax.swing.text.*;

public class playerSelectScreen extends JFrame {

	static ArrayList<String> team1PlayingPlayers = new ArrayList<String>();
	ArrayList<String> team1BenchedPlayers = new ArrayList<String>();
	static ArrayList<String> team2PlayingPlayers = new ArrayList<String>();
	ArrayList<String> team2BenchedPlayers = new ArrayList<String>();

	DragPanel p1 = new DragPanel();
	DragPanel p11 = new DragPanel();

	static String teamName1;
	static String teamName2;

	ArrayList<playerStatParser> team1_parsers;
	ArrayList<playerStatParser> team2_parsers;

	ArrayList<team> teamMatchups = new ArrayList<team>();

	public playerSelectScreen(final String teamName1, final String teamName2) {
		this.teamName1 = teamName1;
		this.teamName2 = teamName2;
		Box panel1 = Box.createVerticalBox();
		playerStatParser v = new playerStatParser(teamName1);
		ArrayList<String> team1AllPlayers = new ArrayList<String>();
		team1AllPlayers = v.getPlayerNameList();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

		p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		p1.setName("team1_0");
		for (int i = 0; i < team1AllPlayers.size(); i++) {
			JLabel j = new JLabel();
			j.setText(team1AllPlayers.get(i));
			j.setAlignmentX(Component.CENTER_ALIGNMENT);
			p1.add(j);
		}
		MouseListener handler = new Handler();
		p1.addMouseListener(handler);
		final LabelTransferHandler th = new LabelTransferHandler();

		p1.setTransferHandler(th);
		JPanel p = new JPanel(new GridLayout(1, 2));
		JPanel p5 = new JPanel();
		p5.setLayout(new BorderLayout());
		JLabel l =new JLabel("Available Players:");
		l.setAlignmentX(CENTER_ALIGNMENT);
		p5.add(l,BorderLayout.NORTH);
		p5.add(p1);
		p.add(p5);
		JPanel pp = new JPanel(new GridLayout(0, 1));

		DragPanel p2 = new DragPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p2.addMouseListener(handler);
		p2.setTransferHandler(th);
		
		JPanel p7 = new JPanel();
		p7.setLayout(new BorderLayout());
		JLabel l4 =new JLabel("Playing:");
		p7.add(l4,BorderLayout.NORTH);
		p7.add(p2);		
		
		pp.add(p7);
		
		p2.setName("team1_1");

		JPanel panel = new JPanel(new GridLayout(1, 0));
		p.add(pp);

		DragPanel a = new DragPanel();
		a.setLayout(new BoxLayout(a, BoxLayout.Y_AXIS));
		a.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		a.addMouseListener(handler);
		a.setTransferHandler(th);

		JPanel p8 = new JPanel();
		p8.setLayout(new BorderLayout());
		JLabel l5 =new JLabel("Benched:");
		p8.add(l5,BorderLayout.NORTH);
		p8.add(a);		
		
		pp.add(p8);

		a.setName("team1_2");

		panel.add(p);

		JPanel b = new JPanel(new GridLayout(1, 2));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		playerStatParser v2 = new playerStatParser(teamName2);
		ArrayList<String> team2AllPlayers = new ArrayList<String>();
		team2AllPlayers = v2.getPlayerNameList();
		for (int i = 0; i < team2AllPlayers.size(); i++) {
			JLabel j = new JLabel();
			j.setText(team2AllPlayers.get(i));
			j.setAlignmentX(Component.CENTER_ALIGNMENT);
			p11.add(j);
		}

		p11.setName("team2_0");
		p11.setLayout(new BoxLayout(p11, BoxLayout.Y_AXIS));
		p11.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		MouseListener handler1 = new Handler();
		p11.addMouseListener(handler1);
		LabelTransferHandler th1 = new LabelTransferHandler();
		p11.setTransferHandler(th);
		
		JPanel p6 = new JPanel();
		p6.setLayout(new BorderLayout());
		JLabel l1 =new JLabel("Available Players:");
		p6.add(l1,BorderLayout.NORTH);
		p6.add(p11);
		
		b.add(p6);

		JPanel m = new JPanel(new GridLayout(0, 1));
		DragPanel a11 = new DragPanel();
		a11.setLayout(new BoxLayout(a11, BoxLayout.Y_AXIS));
		a11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		a11.addMouseListener(handler);
		a11.setTransferHandler(th);
		a11.setName("team2_1");
		
		JPanel p9 = new JPanel();
		p9.setLayout(new BorderLayout());
		JLabel l6=new JLabel("Playing:");
		p9.add(l6,BorderLayout.NORTH);
		p9.add(a11);		
		
		m.add(p9);
		
		DragPanel a111 = new DragPanel();
		a111.setLayout(new BoxLayout(a111, BoxLayout.Y_AXIS));
		a111.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		a111.addMouseListener(handler);
		a111.setTransferHandler(th);
		a111.setName("team2_2");

		JPanel jp1 = new JPanel();
		jp1.setLayout(new BorderLayout());
		JLabel l7=new JLabel("Benched:");
		jp1.add(l7,BorderLayout.NORTH);
	
		
		jp1.add(a111);
		
		
		
		
		m.add(jp1);
		
		
		b.add(m);
		panel.add(b);

		panel1.add(panel);

		JButton nextButton = new JButton("Next");
		nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel1.add(nextButton);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				team1PlayingPlayers = th.team1PlayingPlayers;
				team1BenchedPlayers = th.team1BenchedPlayers;
				team2PlayingPlayers = th.team2PlayingPlayers;
				team2BenchedPlayers = th.team2BenchedPlayers;

				System.out.println("Playing Players: "
						+ team1PlayingPlayers.toString());
				System.out.println("Benched Players: "
						+ team1BenchedPlayers.toString());
				System.out.println("Playing 2 Players: "
						+ team2PlayingPlayers.toString());
				System.out.println("Benched 2 Players: "
						+ team2BenchedPlayers.toString());

				team1_parsers = new ArrayList<playerStatParser>();
				for (String playerString : team1PlayingPlayers) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					team1_parsers.add(new playerStatParser(teamName1,
							playerString));
				}

				team2_parsers = new ArrayList<playerStatParser>();
				for (String playerString : team2PlayingPlayers) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					team2_parsers.add(new playerStatParser(teamName2,
							playerString));
				}

				team team1 = new team(team1_parsers, 0, 0);
				team team2 = new team(team2_parsers, 0, 0);

				for (int i = 0; i < 7; i++) {
					AddMatchUp(team1, team2);
				}

				winScreen w = new winScreen(teamMatchups);
				dispose();
			}

		});
		Container cp = getContentPane();
		panel.setPreferredSize(new Dimension(800, 640));
		
		cp.add(panel1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Handle the CLOSE
														// button
		setTitle("NBA Prediction System");
		pack(); // pack all the components in the JFrame
		setVisible(true); // show it

		requestFocus();
	}

	public void AddMatchUp(team t1, team t2) {

		double t1Off = t1.getoRating();
		double t1Def = t1.getdRating();

		double t2Off = t2.getoRating();
		double t2Def = t2.getdRating();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		t1 = new team(team1_parsers, t2Off, t2Def);
		t2 = new team(team2_parsers, t1Off, t1Def);

		teamMatchups.add(t1);
		teamMatchups.add(t2);
	}

}

class DragPanel extends JPanel {
	public DragPanel() {
		super();
	}

	public JLabel draggingLabel;
}

class Handler extends MouseAdapter {
	@Override
	public void mousePressed(MouseEvent e) {

		DragPanel p = (DragPanel) e.getSource();
		Component c = SwingUtilities.getDeepestComponentAt(p, e.getX(),
				e.getY());
		if (c != null && c instanceof JLabel) {
			p.draggingLabel = (JLabel) c;
			p.getTransferHandler().exportAsDrag(p, e, TransferHandler.MOVE);

		}
		System.out.println(playerSelectScreen.team1PlayingPlayers);
		if (e.getClickCount() == 2) {
			int index;
			if (p.getName().contains("team1")) {
												new playerStatScreen(playerSelectScreen.teamName1,
												p.draggingLabel.getText());
												} else {
												new playerStatScreen(playerSelectScreen.teamName2,
												p.draggingLabel.getText());
												
			}

		}

		LabelTransferHandler.dragCount = 0;
	}
}

class LabelTransferHandler extends TransferHandler {
	String draggedFrom = "";
	DragPanel sourcePanel;
	static int dragCount = 0;

	ArrayList<String> team1PlayingPlayers = new ArrayList<String>();
	ArrayList<String> team1BenchedPlayers = new ArrayList<String>();
	ArrayList<String> team2PlayingPlayers = new ArrayList<String>();
	ArrayList<String> team2BenchedPlayers = new ArrayList<String>();

	private final DataFlavor localObjectFlavor;
	private final JLabel label = new JLabel() {
		@Override
		public boolean contains(int x, int y) {
			return false;
		}
	};
	private final JWindow window = new JWindow();

	public LabelTransferHandler() {
		localObjectFlavor = new ActivationDataFlavor(DragPanel.class,
				DataFlavor.javaJVMLocalObjectMimeType, "JLabel");
		window.add(label);
		window.setAlwaysOnTop(true);
		window.setBackground(new Color(0, true));
		DragSource.getDefaultDragSource().addDragSourceMotionListener(
				new DragSourceMotionListener() {
					@Override
					public void dragMouseMoved(DragSourceDragEvent dsde) {
						dragCount++;
						Point pt = dsde.getLocation();

						// pt.translate(5, 5); // offset
						window.setLocation(pt);
					}
				});
	}

	@Override
	protected Transferable createTransferable(JComponent c) {
		DragPanel p = (DragPanel) c;
		sourcePanel = p;
		draggedFrom = p.getName().substring(0, 5);
		JLabel l = p.draggingLabel;
		String text = l.getText();
		final DataHandler dh = new DataHandler(c,
				localObjectFlavor.getMimeType());
		if (text == null)
			return dh;
		final StringSelection ss = new StringSelection(text + "\n");
		return new Transferable() {
			@Override
			public DataFlavor[] getTransferDataFlavors() {
				ArrayList<DataFlavor> list = new ArrayList<>();
				for (DataFlavor f : ss.getTransferDataFlavors()) {
					list.add(f);
				}
				for (DataFlavor f : dh.getTransferDataFlavors()) {
					list.add(f);
				}
				return list.toArray(dh.getTransferDataFlavors());
			}

			public boolean isDataFlavorSupported(DataFlavor flavor) {
				for (DataFlavor f : getTransferDataFlavors()) {
					if (flavor.equals(f)) {
						return true;
					}
				}
				return false;
			}

			public Object getTransferData(DataFlavor flavor)
					throws UnsupportedFlavorException, IOException {
				if (flavor.equals(localObjectFlavor)) {
					return dh.getTransferData(flavor);
				} else {
					return ss.getTransferData(flavor);
				}
			}
		};
	}

	@Override
	public boolean canImport(TransferSupport support) {
		if (!support.isDrop()) {
			return false;
		}
		return true;
	}

	@Override
	public int getSourceActions(JComponent c) {
		DragPanel p = (DragPanel) c;
		label.setIcon(p.draggingLabel.getIcon());
		label.setText(p.draggingLabel.getText());
		window.pack();
		Point pt = p.draggingLabel.getLocation();
		SwingUtilities.convertPointToScreen(pt, p);
		window.setLocation(pt);
		window.setVisible(true);
		return MOVE;
	}

	@Override
	public boolean importData(TransferSupport support) {
		if (!canImport(support))
			return false;
		DragPanel target = (DragPanel) support.getComponent();
		try {
			DragPanel src = (DragPanel) support.getTransferable()
					.getTransferData(localObjectFlavor);

			if (draggedFrom.equals((target.getName().toString())
					.substring(0, 5))) {
				JLabel l = new JLabel();
				l.setIcon(src.draggingLabel.getIcon());
				l.setText(src.draggingLabel.getText());
				l.setAlignmentX(Component.CENTER_ALIGNMENT);

				target.add(l);
				target.revalidate();

				if (target.getName().toString().equals("team1_1")) {	team1PlayingPlayers.clear();
					for (int i = 0; i < target.getComponentCount(); i++) {
					
						String temp =((JLabel)target.getComponent(i)).getText();
						team1PlayingPlayers.add(temp);
					}
				} else if (target.getName().toString().equals("team1_2")) {team1BenchedPlayers.clear();
					for (int i = 0; i < target.getComponentCount(); i++) {
						String temp =((JLabel)target.getComponent(i)).getText();
						team1BenchedPlayers.add(temp);
					}
				} else if (target.getName().toString().equals("team2_1")) {			team2PlayingPlayers.clear();
					for (int i = 0; i < target.getComponentCount(); i++) {
						String temp =((JLabel)target.getComponent(i)).getText();
						team2PlayingPlayers.add(temp);
					}
				} else if (target.getName().toString().equals("team2_2")) {team2BenchedPlayers.clear();
					for (int i = 0; i < target.getComponentCount(); i++) {
						String temp =((JLabel)target.getComponent(i)).getText();
						team2BenchedPlayers.add(temp);
					}
				}
			} else {
				sendBack(sourcePanel, src.draggingLabel.getText());
			}

			return true;
		} catch (UnsupportedFlavorException ufe) {
			ufe.printStackTrace();
		} catch (java.io.IOException ioe) {
			ioe.printStackTrace();
		}
		return false;
	}

	private void sendBack(DragPanel srcPanel, String playerName) {
		JLabel j = new JLabel(playerName);
		j.setAlignmentX(Component.CENTER_ALIGNMENT);
		srcPanel.add(j);
		srcPanel.revalidate();
	}

	@Override
	protected void exportDone(JComponent c, Transferable data, int action) {

		DragPanel src = (DragPanel) c;
		if (action == TransferHandler.MOVE) {
			src.remove(src.draggingLabel);
			src.revalidate();
			src.repaint();
		}
		src.draggingLabel = null;
		window.setVisible(false);
	}

}
