import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class main {

	static ArrayList<playerStatParser> team1_parsers;
	static ArrayList<playerStatParser> team2_parsers;
	
	static ArrayList<team> teamMatchups =new ArrayList<team>();

	public static void main(String[] args) {
		int sleepTime = 1000;
	team1_parsers = new ArrayList<playerStatParser>();
	team2_parsers = new ArrayList<playerStatParser>();

		playerStatParser sp_team1_1 = new playerStatParser("San Antonio Spurs",
				"Kawhi Leonard");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_2 = new playerStatParser("San Antonio Spurs",
				"Tim Duncan");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_3 = new playerStatParser("San Antonio Spurs",
				"Tony Parker");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_4 = new playerStatParser("San Antonio Spurs",
				"Boris Diaw");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_5 = new playerStatParser("San Antonio Spurs",
				"Danny Green");

		team1_parsers.add(sp_team1_1);
		team1_parsers.add(sp_team1_2);
		team1_parsers.add(sp_team1_3);
		team1_parsers.add(sp_team1_4);
		team1_parsers.add(sp_team1_5);
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		playerStatParser sp_team2_1 = new playerStatParser("Miami Heat",
				"LeBron James");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team2_2 = new playerStatParser("Miami Heat",
				"Chris Bosh");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team2_3 = new playerStatParser("Miami Heat",
				"Dwyane Wade");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team2_4 = new playerStatParser("Miami Heat",
				"Rashard Lewis");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team2_5 = new playerStatParser("Miami Heat",
				"Mario Chalmers");

		team2_parsers.add(sp_team2_1);
		team2_parsers.add(sp_team2_2);
		team2_parsers.add(sp_team2_3);
		team2_parsers.add(sp_team2_4);
		team2_parsers.add(sp_team2_5);

		team team1 = new team(team1_parsers, 0, 0);
		team team2 = new team(team2_parsers, 0, 0);

		
		for (int i = 0; i <7; i++) {

			AddMatchUp(team1,team2);
		}
		
					
		winScreen w= new winScreen(teamMatchups);
	}

	private String getWinner(int p1,int p2) {
		String winner = "";
		if (p1>p2) {
			winner = "team1";
		} else if (p1<p2) {
			winner = "team2";
		}
		return winner;
	}
	
public static void AddMatchUp(team t1 , team t2){
		

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
