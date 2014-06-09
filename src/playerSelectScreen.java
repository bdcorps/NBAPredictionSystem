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

	ArrayList<String> team1PlayingPlayers = new ArrayList<String>();
	ArrayList<String> team1BenchedPlayers = new ArrayList<String>();
	ArrayList<String> team2PlayingPlayers = new ArrayList<String>();
	ArrayList<String> team2BenchedPlayers = new ArrayList<String>();
	
	DragPanel p1 = new DragPanel();
	DragPanel p11 = new DragPanel();

	public playerSelectScreen(String teamName1, String teamName2) {
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
		/*	
			JLabel label1 = new JLabel("Label1");
			p1.add(label1);
			JLabel label2 = new JLabel("Label2");
			p1.add(label2);
			JLabel label3 = new JLabel(UIManager.getIcon("OptionPane.warningIcon"));
			p1.add(label3);
			JLabel label4 = new JLabel(UIManager.getIcon("OptionPane.errorIcon"));
			p1.add(label4);
			label1.setAlignmentX(Component.CENTER_ALIGNMENT);
			label2.setAlignmentX(Component.CENTER_ALIGNMENT);
			label3.setAlignmentX(Component.CENTER_ALIGNMENT);
			label4.setAlignmentX(Component.CENTER_ALIGNMENT);*/

		MouseListener handler = new Handler();
		p1.addMouseListener(handler);
		final LabelTransferHandler th = new LabelTransferHandler();

		p1.setTransferHandler(th);
		JPanel p = new JPanel(new GridLayout(1, 2));
		p.add(p1);

		JPanel pp = new JPanel(new GridLayout(0, 1));

		DragPanel p2 = new DragPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p2.addMouseListener(handler);
		p2.setTransferHandler(th);
		pp.add(p2);
		p2.setName("team1_1");

		JPanel panel = new JPanel(new GridLayout(1, 0));
		p.add(pp);

		DragPanel a = new DragPanel();
		a.setLayout(new BoxLayout(a, BoxLayout.Y_AXIS));
		a.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		a.addMouseListener(handler);
		a.setTransferHandler(th);

		a.setName("team1_2");
		pp.add(a);

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
		/*JLabel label11 = new JLabel("Label1");
		p11.add(label11);
		JLabel label21 = new JLabel("Label2");
		p11.add(label21);
		JLabel label31 = new JLabel(UIManager.getIcon("OptionPane.warningIcon"));
		p11.add(label31);
		JLabel label41 = new JLabel(UIManager.getIcon("OptionPane.errorIcon"));
		p11.add(label41);
		label11.setAlignmentX(Component.CENTER_ALIGNMENT);
		label21.setAlignmentX(Component.CENTER_ALIGNMENT);
		label31.setAlignmentX(Component.CENTER_ALIGNMENT);
		label41.setAlignmentX(Component.CENTER_ALIGNMENT);*/

		MouseListener handler1 = new Handler();
		p11.addMouseListener(handler1);
		LabelTransferHandler th1 = new LabelTransferHandler();
		p11.setTransferHandler(th);
		b.add(p11);

		JPanel m = new JPanel(new GridLayout(0, 1));
		DragPanel a11 = new DragPanel();
		a11.setLayout(new BoxLayout(a11, BoxLayout.Y_AXIS));
		a11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		a11.addMouseListener(handler);
		a11.setTransferHandler(th);
		a11.setName("team2_1");

		DragPanel a111 = new DragPanel();
		a111.setLayout(new BoxLayout(a111, BoxLayout.Y_AXIS));
		a111.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		a111.addMouseListener(handler);
		a111.setTransferHandler(th);
		a111.setName("team2_2");
		m.add(a11);
		m.add(a111);
		b.add(m);
		panel.add(b);

		panel1.add(panel);

		JButton nextButton = new JButton("Next");
		nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel1.add(nextButton);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				team1PlayingPlayers = th.team1PlayingPlayers;
				team1BenchedPlayers=th.team1BenchedPlayers;
				team2PlayingPlayers=th.team2PlayingPlayers;
				team2BenchedPlayers=th.team2BenchedPlayers;
				
				System.out.println("playing: "+team1PlayingPlayers.toString());
				System.out.println("benched: "+team1BenchedPlayers.toString());
				System.out.println("playing2 : "+team2PlayingPlayers.toString());
				System.out.println("benched2: "+team2BenchedPlayers.toString());

				
				
				
				dispose();
				//playerSelectScreen p = new playerSelectScreen("s", "");
			}
		});
		Container cp = getContentPane();
		panel.setPreferredSize(new Dimension(800, 640));
		cp.add(panel1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Handle the CLOSE
														// button
		setTitle("Triangle Solver");
		pack(); // pack all the components in the JFrame
		setVisible(true); // show it

		requestFocus();
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
		if (e.getClickCount() == 2) {
			new playerStatScreen(p.draggingLabel.getText());
			}
		
		LabelTransferHandler.dragCount=0;
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
						System.out.println(dragCount);
						Point pt = dsde.getLocation();
					
					//	pt.translate(5, 5); // offset
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

				if (target.getName().toString().equals("team1_1")) {
					team1PlayingPlayers.add(src.draggingLabel.getText());
				} else if (target.getName().toString().equals("team1_2")) {
					team1BenchedPlayers.add(src.draggingLabel.getText());
				}else if (target.getName().toString().equals("team2_1")) {
					team2PlayingPlayers.add(src.draggingLabel.getText());
				} else if (target.getName().toString().equals("team2_2")) {
					team2BenchedPlayers.add(src.draggingLabel.getText());
				}

				target.add(l);
				target.revalidate();
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
