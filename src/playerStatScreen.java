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
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class playerStatScreen extends JFrame {
	JLabel team1_image;
	center p = new center();
	playerStatParser sp;

	ArrayList<String> StatsNameList = new ArrayList<String>();
	ArrayList<String> StatsValueList = new ArrayList<String>();
	boolean error = false;
	
	public playerStatScreen(String teamName, String playerName) {
		System.out.println(teamName + " " + playerName);
		JPanel panel = new JPanel();
		
		sp =new playerStatParser(teamName,playerName);
		if (!error) {
			StatsNameList = sp.getplayerStatNameList();
			StatsValueList = sp.getplayerStatValueList();

			if (StatsNameList == null || StatsValueList == null) {
				error = true;
			} else {
				setPlayerStats(p);
				// p_team1_1.calculateEfficiency();
				// p_team1_1_per = p_team1_1.getPersonalStats();
				// p_team1_1_def= p_team1_1.getDefensiveStats();
			}
		}
		
		Box a = Box.createVerticalBox();
		Box a1 = Box.createHorizontalBox();
		Box b1 = Box.createVerticalBox();
		Box b2 = Box.createVerticalBox();
		a.add(a1);
		a1.add(b1);
		a1.add(b2);
		panel.setPreferredSize(new Dimension(800, 640));
a.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		team1_image = new JLabel();
		team1_image.setFont(team1_image.getFont().deriveFont(Font.ITALIC));
		team1_image.setHorizontalAlignment(JLabel.CENTER);
		updateLabel(teamName, playerName, team1_image);

		team1_image.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));

		team1_image.setAlignmentX(Component.CENTER_ALIGNMENT);

		b1.add(team1_image);

		
		
		
		
		
		
		
		
		
		
		
		JLabel label = new JLabel("d");
		b2.add(label);
		
		JLabel label2 = new JLabel("cc");
		b2.add(label2);
		
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

		requestFocus();
	}

	ImageIcon icon;

	protected void updateLabel(String teamName, String name, JLabel imgIcon) {
		int spaceIndex = 0;
		spaceIndex = name.indexOf(" ");
		name= (name.substring(spaceIndex+1)+(" ")+(name.substring(0 , spaceIndex)));

		
		icon = createImageIcon("headshots/" + teamName+ "/"+name + ".png");

		imgIcon.setIcon(scale(icon.getImage(), 1));
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
	
	public void setPlayerStats(player p) {
		ArrayList<Integer> refToKeep = new ArrayList<Integer>();

		for (String string : StatsNameList) {
			int ind = (StatsNameList.indexOf(string));
			if (ind != -1) {
				switch (StatsNameList.get(ind)) {
				case "team":
					p.setTeam(StatsValueList.get(ind));

					refToKeep.add(ind);
					break;
				case "birth_place":
					p.setBirthPlace(StatsValueList.get(ind));
					refToKeep.add(ind);
					break;
				case "birthdate":
					p.setBirthdate(StatsValueList.get(ind));
					refToKeep.add(ind);
					break;
				case "full_name":
					p.setName(StatsValueList.get(ind));
					refToKeep.add(ind);
					break;
				case "height":
					p.setHeight((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "weight":
					p.setWeight((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "experience":
					p.setExperience((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "jersey_number":
					p.setNumber((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "assists":
					p.setAssists((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "blocked_att":
					p.setBlockAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "blocks":
					p.setBlocks((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "defensive_rebounds":
					p.setDefRebounds((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "field_goals_att":
					p.setFgAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "field_goals_made":
					p.setFgMade((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "flagrant_fouls":
					p.setFlagrantFouls((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "personal_fouls":
					p.setPersonalFouls((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "tech_fouls":
					p.setTechFouls((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "free_throws_att":
					p.setFtAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "free_throws_made":
					p.setFtMade((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "games_played":
					p.setgPlay((int) Double.parseDouble(StatsValueList.get(ind)));
					refToKeep.add(ind);
					break;
				case "games_started":
					p.setgStart((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "minutes":
					p.setMinutesPlayed((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "offensive_rebounds":
					p.setOffRebounds((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "points":
					p.setPoints((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				// rebounds is off and def added
				case "steals":
					p.setSteals((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "three_points_att":
					p.setThreeptAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "three_points_made":
					p.setThreeptMade((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "turnovers":
					p.setTurnovers((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "two_points_att":
					p.setTwoptAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "two_points_made":
					p.setTwoptMade((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				}
			}
		}
		// Clean up stats list
		// reveresed so changing indices do not effect next removal
		Collections.sort(refToKeep, Collections.reverseOrder());

		for (int j = StatsNameList.size() - 1; j > 0; j--) {
			if (refToKeep.contains(j)) {

			} else {
				StatsNameList.remove(j);
				StatsValueList.remove(j);
			}

		}
	}

}
