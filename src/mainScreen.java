import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class mainScreen extends JFrame implements ActionListener {
	JLabel team1_image;
	JLabel team2_image;
	
	String teamName1 ="";
	String teamName2 ="";

	public mainScreen() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		//this.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		Box panel1 = Box.createVerticalBox();
		Box panel2 = Box.createVerticalBox();
		Box panel3 = Box.createVerticalBox();

		String[] teams = { "Boston Celtics", "Brooklyn Nets",
				"New York Knicks", "Philadelphia 76ers", "Toronto Raptors",
				"Chicago Bulls", "Cleveland Cavaliers", "Detroit Pistons",
				"Indiana Pacers", "Milwaukee Bucks", "Atlanta Hawks", "Miami Heat", "Orlando Magic",
				"Washington Wizards", "Dallas Mavericks", "Houston Rockets",
				"Memphis Grizzlies", "New Orleans Pelicans",
				"San Antonio Spurs", "Denver Nuggets",
				"Minnesota Timberwolves", "Portland Trail Blazers",
				"Oklahoma City Thunder", "Utah Jazz", "Golden State Warriors",
				"Los Angeles Clippers", "Los Angeles Lakers", "Phoenix Suns",
				"Sacramento Kings" };

		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * REMEMBER
		 * 
		 * minute played shit
		 * 
		 */
		panel1.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		final JComboBox team1_list = new JComboBox(teams);
		team1_list.setSelectedIndex(0);
		team1_list.addActionListener(new ActionListener() {//add actionlistner to listen for change
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	String petName = (String) team1_list.getSelectedItem();
				updateLabel(petName, team1_image);
		    }
		});
		team1_list.setMaximumSize(new Dimension(200, 10));

		team1_list.setAlignmentX(Component.CENTER_ALIGNMENT);
		team1_image = new JLabel();
		team1_image.setFont(team1_image.getFont().deriveFont(Font.ITALIC));
		team1_image.setHorizontalAlignment(JLabel.CENTER);
		updateLabel(teams[team1_list.getSelectedIndex()], team1_image);
		team1_image.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
		team1_image.setPreferredSize(new Dimension(icon.getIconWidth(), icon
				.getIconHeight()));

		team1_image.setAlignmentX(Component.CENTER_ALIGNMENT);

		panel1.add(team1_image);
		panel1.add(team1_list);

		final JComboBox team2_list = new JComboBox(teams);
		team2_list.setSelectedIndex(1);
		team2_list.addActionListener(new ActionListener() {//add actionlistner to listen for change
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	String petName = (String) team2_list.getSelectedItem();
				updateLabel(petName, team2_image);
		    }
		});

		team2_list.setMaximumSize(new Dimension(200, 10));
		team2_list.setAlignmentX(Component.CENTER_ALIGNMENT);

		team2_image = new JLabel();
		team2_image.setFont(team2_image.getFont().deriveFont(Font.ITALIC));
		team2_image.setHorizontalAlignment(JLabel.CENTER);
		updateLabel(teams[team2_list.getSelectedIndex()], team2_image);
		team2_image.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));

		team2_image.setPreferredSize(new Dimension(icon.getIconWidth(), icon
				.getIconHeight()));
		team2_image.setAlignmentX(Component.CENTER_ALIGNMENT);

		panel2.add(team2_image);
		panel2.add(team2_list);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(panel1);
		panel.add(new JSeparator(SwingConstants.VERTICAL));
		panel.add(panel2);

		JButton nextButton = new JButton("Next");
		this.add(nextButton);
		nextButton.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		teamName1=team1_list.getSelectedItem().toString();
				teamName2 = team2_list.getSelectedItem().toString();
		dispose();
		    	playerSelectScreen p =new playerSelectScreen(teamName1,teamName2);
		    }
		});
		panel3.add(panel);
		panel3.add(nextButton);
		add(panel3);
		nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);

		panel3.setPreferredSize(new Dimension(800, 640));
		panel.setOpaque(true);   
		panel.setBackground(Color.WHITE); 
		panel1.setOpaque(true);   
		panel1.setBackground(Color.WHITE); 
		panel2.setOpaque(true);   
		panel2.setBackground(Color.WHITE); 
		panel3.setOpaque(true);   
		panel3.setBackground(Color.WHITE); 
		
		Container cp = getContentPane();	

		cp.add(panel3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Handle the CLOSE
														// button
		setTitle("Triangle Solver");
		pack(); // pack all the components in the JFrame
		setVisible(true); // show it

		requestFocus();
	}


	ImageIcon icon;

	protected void updateLabel(String name, JLabel imgIcon) {
		icon = createImageIcon("team_images/" + name + ".jpg");

		imgIcon.setIcon(scale(icon.getImage(),0.35));
		imgIcon.setToolTipText("A drawing of a " + name.toLowerCase());
		if (icon != null) {
			imgIcon.setText(null);
		} else {
			imgIcon.setText("Image not found");
		}
	}

	private ImageIcon scale(Image src, double scale) {
		int w = (int) (scale * src.getWidth(this));
		int h = (int) (scale * src.getHeight(this));
		int type = BufferedImage.TYPE_INT_RGB;
		BufferedImage dst = new BufferedImage(w, h, type);
		Graphics2D g2 = dst.createGraphics();

		Image scaledImage = src.getScaledInstance(w, h, Image.SCALE_SMOOTH);
		g2.drawImage(scaledImage, 0, 0, w, h, this);
		g2.dispose();
		return new ImageIcon(scaledImage);
	}

	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = mainScreen.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

		public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			new mainScreen();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
