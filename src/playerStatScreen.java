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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class playerStatScreen extends JFrame{
		JLabel team1_image ;
		public playerStatScreen(String playerName){
			
		JPanel panel = new JPanel ();
		Box a = Box.createVerticalBox();
		panel.setPreferredSize(new Dimension(800, 640));
		JPanel b = new JPanel ();
		
		 team1_image = new JLabel();
		team1_image.setFont(team1_image.getFont().deriveFont(Font.ITALIC));
		team1_image.setHorizontalAlignment(JLabel.CENTER);
		
		//updateLabel(petStrings[team1_list.getSelectedIndex()], team1_image);
		
		team1_image.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
		
		team1_image.setAlignmentX(Component.CENTER_ALIGNMENT);

		a.add(team1_image);
	
		a.add(b);
		JButton nextButton = new JButton("Back");
		nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		a.add(nextButton);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(a);
		Container cp = getContentPane();
		cp.add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Handle the CLOSE
														// button
		setTitle("Triangle Solver");
		pack(); // pack all the components in the JFrame
		setVisible(true); // show it

		requestFocus();}
		
		ImageIcon icon;
		protected void updateLabel(String name, JLabel imgIcon) {
			icon = createImageIcon("team_images/" + name + ".jpg");

			imgIcon.setIcon(scale(icon.getImage(), 0.35));
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

	}
