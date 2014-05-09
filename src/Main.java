import java.util.ArrayList;

public class Main {

	static ArrayList<String> StatsNameList = new ArrayList<String>();
	static ArrayList<String> StatsValueList = new ArrayList<String>();

	public static void main(String[] args) {

		System.out.println("Team 1");

		sportsDataParse sp_team1_1 = new sportsDataParse("New York Knicks",
				"Shannon Brown");
		StatsNameList = sp_team1_1.getplayerStatNameList();
		StatsValueList = sp_team1_1.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "1");
		center p_team1_1 = new center();
		setPlayerStats(p_team1_1);
		p_team1_1.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team1_2 = new sportsDataParse("Toronto Raptors",
				"Patrick Patterson");
		StatsNameList = sp_team1_2.getplayerStatNameList();
		StatsValueList = sp_team1_2.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "2");
		center p_team1_2 = new center();
		setPlayerStats(p_team1_2);
		p_team1_2.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team1_3 = new sportsDataParse("Toronto Raptors",
				"Kyle Lowry");
		StatsNameList = sp_team1_3.getplayerStatNameList();
		StatsValueList = sp_team1_3.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "3");
		center p_team1_3 = new center();
		setPlayerStats(p_team1_3);
		p_team1_3.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team1_4 = new sportsDataParse("Toronto Raptors",
				"Chuck Hayes");
		StatsNameList = sp_team1_4.getplayerStatNameList();
		StatsValueList = sp_team1_4.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "4");
		center p_team1_4 = new center();
		setPlayerStats(p_team1_4);
		p_team1_4.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team1_5 = new sportsDataParse("Toronto Raptors",
				"John Salmons");
		StatsNameList = sp_team1_5.getplayerStatNameList();
		StatsValueList = sp_team1_5.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "5");
		center p_team1_5 = new center();
		setPlayerStats(p_team1_5);
		p_team1_5.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		sportsDataParse sp_team1_6 = new sportsDataParse("New York Knicks",
				"Shannon Brown");
		StatsNameList = sp_team1_6.getplayerStatNameList();
		StatsValueList = sp_team1_6.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "1");
		center p_team1_6 = new center();
		setPlayerStats(p_team1_6);
		p_team1_6.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team1_7 = new sportsDataParse("Toronto Raptors",
				"Patrick Patterson");
		StatsNameList = sp_team1_7.getplayerStatNameList();
		StatsValueList = sp_team1_7.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "2");
		center p_team1_7 = new center();
		setPlayerStats(p_team1_7);
		p_team1_7.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team1_8 = new sportsDataParse("Toronto Raptors",
				"Kyle Lowry");
		StatsNameList = sp_team1_8.getplayerStatNameList();
		StatsValueList = sp_team1_8.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "3");
		center p_team1_8 = new center();
		setPlayerStats(p_team1_8);
		p_team1_8.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team1_9 = new sportsDataParse("Toronto Raptors",
				"Chuck Hayes");
		StatsNameList = sp_team1_9.getplayerStatNameList();
		StatsValueList = sp_team1_9.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "4");
		center p_team1_9 = new center();
		setPlayerStats(p_team1_9);
		p_team1_4.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team1_10 = new sportsDataParse("Toronto Raptors",
				"John Salmons");
		StatsNameList = sp_team1_10.getplayerStatNameList();
		StatsValueList = sp_team1_10.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "5");
		center p_team1_10 = new center();
		setPlayerStats(p_team1_10);
		p_team1_10.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("Team 2");

		sportsDataParse sp_team2_1 = new sportsDataParse("New York Knicks",
				"Shannon Brown");
		StatsNameList = sp_team2_1.getplayerStatNameList();
		StatsValueList = sp_team2_1.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "6");
		center p_team2_1 = new center();
		setPlayerStats(p_team2_1);
		p_team2_1.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team2_2 = new sportsDataParse("New York Knicks",
				"Raymond Felton");
		StatsNameList = sp_team2_2.getplayerStatNameList();
		StatsValueList = sp_team2_2.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "7");
		center p_team2_2 = new center();
		setPlayerStats(p_team2_2);
		p_team2_2.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team2_3 = new sportsDataParse("New York Knicks",
				"Lamar Odom");
		StatsNameList = sp_team2_3.getplayerStatNameList();
		StatsValueList = sp_team2_3.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "8");
		center p_team2_3 = new center();
		setPlayerStats(p_team2_3);
		p_team2_3.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team2_4 = new sportsDataParse("New York Knicks",
				"Pablo Prigioni");
		StatsNameList = sp_team2_4.getplayerStatNameList();
		StatsValueList = sp_team2_4.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "9");
		center p_team2_4 = new center();
		setPlayerStats(p_team2_4);
		p_team2_4.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team2_5 = new sportsDataParse("New York Knicks",
				"Iman Shumpert");
		StatsNameList = sp_team2_5.getplayerStatNameList();
		StatsValueList = sp_team2_5.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "10");
		center p_team2_5 = new center();
		setPlayerStats(p_team2_5);
		p_team2_5.calculateEfficiency();
		
		
		sportsDataParse sp_team2_6 = new sportsDataParse("New York Knicks",
				"Shannon Brown");
		StatsNameList = sp_team2_6.getplayerStatNameList();
		StatsValueList = sp_team2_6.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "6");
		center p_team2_6 = new center();
		setPlayerStats(p_team2_6);
		p_team2_6.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team2_7 = new sportsDataParse("New York Knicks",
				"Raymond Felton");
		StatsNameList = sp_team2_7.getplayerStatNameList();
		StatsValueList = sp_team2_7.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "7");
		center p_team2_7 = new center();
		setPlayerStats(p_team2_7);
		p_team2_7.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team2_8 = new sportsDataParse("New York Knicks",
				"Lamar Odom");
		StatsNameList = sp_team2_8.getplayerStatNameList();
		StatsValueList = sp_team2_8.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "8");
		center p_team2_8 = new center();
		setPlayerStats(p_team2_8);
		p_team2_8.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team2_9 = new sportsDataParse("New York Knicks",
				"Pablo Prigioni");
		StatsNameList = sp_team2_9.getplayerStatNameList();
		StatsValueList = sp_team2_9.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "9");
		center p_team2_9 = new center();
		setPlayerStats(p_team2_9);
		p_team2_9.calculateEfficiency();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sportsDataParse sp_team2_10 = new sportsDataParse("New York Knicks",
				"Iman Shumpert");
		StatsNameList = sp_team2_10.getplayerStatNameList();
		StatsValueList = sp_team2_10.getplayerStatValueList();
		System.out.println(StatsValueList.toString() + "10");
		center p_team2_10 = new center();
		setPlayerStats(p_team2_10);
		p_team2_10.calculateEfficiency();

	}

	private static void setPlayerStats(player p) {
		for (String string : StatsNameList) {
			int ind = (StatsNameList.indexOf(string));
			if (ind != 1) {
				switch (StatsValueList.get(ind)) {
				case "birth_place":
					p.setBirthPlace(StatsValueList.get(ind));
				case "birthdate":
					p.setBirthdate(StatsValueList.get(ind));
				case "full_name":
					p.setName(StatsValueList.get(ind));
				case "height":
					p.setHeight(Integer.parseInt(StatsValueList.get(ind)));
				case "weight":
					p.setWeight(Integer.parseInt(StatsValueList.get(ind)));
				case "experience":
					p.setExperience(Integer.parseInt(StatsValueList.get(ind)));
				case "jersey":
					p.setNumber(Integer.parseInt(StatsValueList.get(ind)));
				case "assists":
					p.setAssists((Integer.parseInt(StatsValueList.get(ind))));
				case "assists_turnover_ratio":
					p.setAssist_turnover(Integer.parseInt(StatsValueList
							.get(ind)));
				case "blocked_att":
					p.setBlockAttempt(Integer.parseInt(StatsValueList.get(ind)));
				case "blocks":
					p.setBlocks(Integer.parseInt(StatsValueList.get(ind)));
				case "defensive_rebounds":
					p.setDefRebounds(Integer.parseInt(StatsValueList.get(ind)));
				case "field_goals_att":
					p.setFgAttempt(Integer.parseInt(StatsValueList.get(ind)));
				case "field_goals_made":
					p.setFgMade(Integer.parseInt(StatsValueList.get(ind)));
				case "flagrant_fouls":
					p.setFlagrantFouls(Integer.parseInt(StatsValueList.get(ind)));
				case "personal_fouls":
					p.setPersonalFouls(Integer.parseInt(StatsValueList.get(ind)));
				case "tech_fouls":
					p.setTechFouls(Integer.parseInt(StatsValueList.get(ind)));
				case "free_throws_att":
					p.setFtAttempt(Integer.parseInt(StatsValueList.get(ind)));
				case "free_throws_made":
					p.setFtMade(Integer.parseInt(StatsValueList.get(ind)));
				case "games_played":
					p.setgPlay(Integer.parseInt(StatsValueList.get(ind)));
				case "games_started":
					p.setgStart(Integer.parseInt(StatsValueList.get(ind)));
				case "minutes":
					p.setMinutesPlayed(Integer.parseInt(StatsValueList.get(ind)));
				case "offensive_rebounds":
					p.setOffRebounds(Integer.parseInt(StatsValueList.get(ind)));
				case "points":
					p.setPoints(Integer.parseInt(StatsValueList.get(ind)));
					// rebounds is off and def added
				case "steals":
					p.setSteals(Integer.parseInt(StatsValueList.get(ind)));
				case "three_points_att":
					p.setThreeptAttempt(Integer.parseInt(StatsValueList
							.get(ind)));
				case "three_points_made":
					p.setThreeptMade(Integer.parseInt(StatsValueList.get(ind)));
				case "turnovers":
					p.setTurnovers(Integer.parseInt(StatsValueList.get(ind)));
				case "two_points_att":
					p.setThreeptAttempt(Integer.parseInt(StatsValueList
							.get(ind)));
				case "two_points_made":
					p.setTwoptMade(Integer.parseInt(StatsValueList.get(ind)));

				}
			}

		}

	}

}
