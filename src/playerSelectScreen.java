/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class playerSelectScreen extends JLayeredPane {
	public static final int WIDTH = 680;
	public static final int HEIGHT = 480;
	private static final int GRID_ROWS = 8;
	private static final int GRID_COLS = 6;
	private static final int GAP = 3;
	private static final Dimension LAYERED_PANE_SIZE = new Dimension(WIDTH,
			HEIGHT);
	private static final Dimension LABEL_SIZE = new Dimension(60, 40);
	private GridLayout gridlayout = new GridLayout(GRID_ROWS, GRID_COLS, GAP,
			GAP);
	private JPanel backingPanel = new JPanel(gridlayout);
	private JPanel[][] panelGrid = new JPanel[GRID_ROWS][GRID_COLS];
	private JLabel redLabel = new JLabel("Red", SwingConstants.CENTER);
	private JLabel blueLabel = new JLabel("Blue", SwingConstants.CENTER);

	public playerSelectScreen() {
		backingPanel.setSize(LAYERED_PANE_SIZE);
		backingPanel.setLocation(2 * GAP, 2 * GAP);
		backingPanel.setBackground(Color.black);
		for (int row = 0; row < GRID_ROWS; row++) {
			for (int col = 0; col < GRID_COLS; col++) {
				panelGrid[row][col] = new JPanel(new GridBagLayout());
				backingPanel.add(panelGrid[row][col]);
			}
		}

		redLabel.setOpaque(true);
		redLabel.setBackground(Color.red.brighter().brighter());
		redLabel.setPreferredSize(LABEL_SIZE);
		panelGrid[4][3].add(redLabel);

		blueLabel.setOpaque(true);
		blueLabel.setBackground(Color.blue.brighter().brighter());
		blueLabel.setPreferredSize(LABEL_SIZE);
		panelGrid[1][1].add(blueLabel);

		backingPanel.setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP,
				GAP));
		setPreferredSize(LAYERED_PANE_SIZE);
		add(backingPanel, JLayeredPane.DEFAULT_LAYER);
		MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
		addMouseListener(myMouseAdapter);
		addMouseMotionListener(myMouseAdapter);
	}

	private class MyMouseAdapter extends MouseAdapter {
		private JLabel dragLabel = null;
		private int dragLabelWidthDiv2;
		private int dragLabelHeightDiv2;
		private JPanel clickedPanel = null;

		@Override
		public void mousePressed(MouseEvent me) {
			clickedPanel = (JPanel) backingPanel.getComponentAt(me.getPoint());
			Component[] components = clickedPanel.getComponents();
			if (components.length == 0) {
				return;
			}
			// if we click on jpanel that holds a jlabel
			if (components[0] instanceof JLabel) {

				// remove label from panel
				dragLabel = (JLabel) components[0];
				clickedPanel.remove(dragLabel);
				clickedPanel.revalidate();
				clickedPanel.repaint();

				dragLabelWidthDiv2 = dragLabel.getWidth() / 2;
				dragLabelHeightDiv2 = dragLabel.getHeight() / 2;

				int x = me.getPoint().x - dragLabelWidthDiv2;
				int y = me.getPoint().y - dragLabelHeightDiv2;
				dragLabel.setLocation(x, y);
				add(dragLabel, JLayeredPane.DRAG_LAYER);
				repaint();
			}
		}

		@Override
		public void mouseDragged(MouseEvent me) {
			if (dragLabel == null) {
				return;
			}
			int x = me.getPoint().x - dragLabelWidthDiv2;
			int y = me.getPoint().y - dragLabelHeightDiv2;
			dragLabel.setLocation(x, y);
			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent me) {
			if (dragLabel == null) {
				return;
			}
			remove(dragLabel); // remove dragLabel for drag layer of
								// JLayeredPane
			JPanel droppedPanel = (JPanel) backingPanel.getComponentAt(me
					.getPoint());
			if (droppedPanel == null) {
				// if off the grid, return label to home
				clickedPanel.add(dragLabel);
				clickedPanel.revalidate();
			} else {
				int r = -1;
				int c = -1;
				searchPanelGrid: for (int row = 0; row < panelGrid.length; row++) {
					for (int col = 0; col < panelGrid[row].length; col++) {
						if (panelGrid[row][col] == droppedPanel) {
							r = row;
							c = col;
							break searchPanelGrid;
						}
					}
				}

				if (r == -1 || c == -1) {
					clickedPanel.add(dragLabel);
					clickedPanel.revalidate();
				} else {
					droppedPanel.add(dragLabel);
					droppedPanel.revalidate();
				}
			}

			repaint();
			dragLabel = null;
		}
	}

	private static void createAndShowUI() {
		JFrame frame = new JFrame("DragLabelOnLayeredPane");
		frame.getContentPane().add(new playerSelectScreen());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				createAndShowUI();
			}
		});
	}
}*/

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.activation.*;
import javax.swing.*;
import javax.swing.text.*;

public class playerSelectScreen {
  public JComponent makeUI() {
    DragPanel p1 = new DragPanel();
    p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
    p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    JLabel label1 = new JLabel("Label1");
    p1.add(label1);
    JLabel label2 = new JLabel("Label2");
    p1.add(label2);
    JLabel label3  =new JLabel(UIManager.getIcon("OptionPane.warningIcon"));
    p1.add(label3);
    JLabel label4  =new JLabel(UIManager.getIcon("OptionPane.errorIcon"));
    p1.add(label4);
    label1.setAlignmentX(Component.CENTER_ALIGNMENT);
    label2.setAlignmentX(Component.CENTER_ALIGNMENT);
    label3.setAlignmentX(Component.CENTER_ALIGNMENT);
    label4.setAlignmentX(Component.CENTER_ALIGNMENT);
    
    MouseListener handler = new Handler();
    p1.addMouseListener(handler);
    LabelTransferHandler th = new LabelTransferHandler();
    p1.setTransferHandler(th);
    JPanel p = new JPanel(new GridLayout(1,2));
    p.add(p1);

    DragPanel p2 = new DragPanel();
    p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
    p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    p2.addMouseListener(handler);
    p2.setTransferHandler(th);
    p.add(p2);

    JPanel panel = new JPanel(new GridLayout(0,1));
    panel.add(p);
    //panel.add(new JScrollPane(new JTextArea()));
    return panel;
  }
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      @Override public void run() {
        createAndShowGUI();
      }
    });
  }
  public static void createAndShowGUI() {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    f.getContentPane().add(new playerSelectScreen().makeUI());
    f.setSize(640, 800);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
  }
}
class DragPanel extends JPanel {
  public DragPanel() {
    super();
  }
  public JLabel draggingLabel;
}
class Handler extends MouseAdapter {
  @Override public void mousePressed(MouseEvent e) {
    DragPanel p = (DragPanel)e.getSource();
    Component c = SwingUtilities.getDeepestComponentAt(p, e.getX(), e.getY());
    if(c!=null && c instanceof JLabel) {
      p.draggingLabel = (JLabel)c;
      p.getTransferHandler().exportAsDrag(p, e, TransferHandler.MOVE);
    }
  }
}
class LabelTransferHandler extends TransferHandler {
  private final DataFlavor localObjectFlavor;
  private final JLabel label = new JLabel() {
    @Override public boolean contains(int x, int y) {
      return false;
    }
  };
  private final JWindow window = new JWindow();
  public LabelTransferHandler() {
    System.out.println("LabelTransferHandler");
    localObjectFlavor = new ActivationDataFlavor(
      DragPanel.class, DataFlavor.javaJVMLocalObjectMimeType, "JLabel");
    window.add(label);
    window.setAlwaysOnTop(true);
    window.setBackground(new Color(0,true));
    DragSource.getDefaultDragSource().addDragSourceMotionListener(
    new DragSourceMotionListener() {
      @Override public void dragMouseMoved(DragSourceDragEvent dsde) {
        Point pt = dsde.getLocation();
        pt.translate(5, 5); // offset
        window.setLocation(pt);
      }
    });
  }
  @Override protected Transferable createTransferable(JComponent c) {
    System.out.println("createTransferable");
    DragPanel p = (DragPanel)c;
    JLabel l = p.draggingLabel;
    String text = l.getText();
    final DataHandler dh = new DataHandler(c, localObjectFlavor.getMimeType());
    if(text==null) return dh;
    final StringSelection ss = new StringSelection(text+"\n");
    return new Transferable() {
      @Override public DataFlavor[] getTransferDataFlavors() {
        ArrayList<DataFlavor> list = new ArrayList<>();
        for(DataFlavor f:ss.getTransferDataFlavors()) {
          list.add(f);
        }
        for(DataFlavor f:dh.getTransferDataFlavors()) {
          list.add(f);
        }
        return list.toArray(dh.getTransferDataFlavors());
      }
      public boolean isDataFlavorSupported(DataFlavor flavor) {
        for (DataFlavor f: getTransferDataFlavors()) {
          if (flavor.equals(f)) {
            return true;
          }
        }
        return false;
      }
      public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        if(flavor.equals(localObjectFlavor)) {
          return dh.getTransferData(flavor);
        } else {
          return ss.getTransferData(flavor);
        }
      }
    };
  }
  @Override public boolean canImport(TransferSupport support) {
    if(!support.isDrop()) {
      return false;
    }
    return true;
  }
  @Override public int getSourceActions(JComponent c) {
    System.out.println("getSourceActions");
    DragPanel p = (DragPanel)c;
    label.setIcon(p.draggingLabel.getIcon());
    label.setText(p.draggingLabel.getText());
    window.pack();
    Point pt = p.draggingLabel.getLocation();
    SwingUtilities.convertPointToScreen(pt, p);
    window.setLocation(pt);
    window.setVisible(true);
    return MOVE;
  }
  @Override public boolean importData(TransferSupport support) {
    System.out.println("importData");
    if(!canImport(support)) return false;
    DragPanel target = (DragPanel)support.getComponent();
    try {
      DragPanel src = (DragPanel)support.getTransferable().getTransferData(localObjectFlavor);
      JLabel l = new JLabel();
      l.setIcon(src.draggingLabel.getIcon());
      l.setText(src.draggingLabel.getText());
      l.setAlignmentX(Component.CENTER_ALIGNMENT);
      target.add(l);
      target.revalidate();
      return true;
    } catch(UnsupportedFlavorException ufe) {
      ufe.printStackTrace();
    } catch(java.io.IOException ioe) {
      ioe.printStackTrace();
    }
    return false;
  }
  @Override protected void exportDone(JComponent c, Transferable data, int action) {
    System.out.println("exportDone");
    DragPanel src = (DragPanel)c;
    if(action == TransferHandler.MOVE) {
      src.remove(src.draggingLabel);
      src.revalidate();
      src.repaint();
    }
    src.draggingLabel = null;
    window.setVisible(false);
  }
}

