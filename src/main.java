import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		int sleepTime = 1000;
		ArrayList<playerStatParser> team1_parsers = new ArrayList<playerStatParser>();
		ArrayList<playerStatParser> team2_parsers = new ArrayList<playerStatParser>();

		playerStatParser sp_team1_1 = new playerStatParser("Washington Wizards",
				"Trevor Ariza");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_2 = new playerStatParser("Washington Wizards",
				"Nene Hilario");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_3 = new playerStatParser("Washington Wizards",
				"Marcin Gortat");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_4 = new playerStatParser("Washington Wizards",
				"Bradley Beal");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_5 = new playerStatParser("Washington Wizards",
				"John Wall");

		team1_parsers.add(sp_team1_1);
		team1_parsers.add(sp_team1_2);
		team1_parsers.add(sp_team1_3);
		team1_parsers.add(sp_team1_4);
		team1_parsers.add(sp_team1_5);

		System.out.println("team1");
		team team1 = new team(team1_parsers, 0,0);

		System.out.println("team 1 overall: "+(team1.getoRating() + team1.getdRating())/2);
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		playerStatParser sp_team2_1 = new playerStatParser("Indiana Pacers",
				"Paul George");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team2_2 = new playerStatParser("Indiana Pacers",
				"Roy Hibbert");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team2_3 = new playerStatParser("Indiana Pacers",
				"David West");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team2_4 = new playerStatParser("Indiana Pacers",
				"Lance Stephenson");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team2_5 = new playerStatParser("Indiana Pacers",
				"George Hill");

		team2_parsers.add(sp_team2_1);
		team2_parsers.add(sp_team2_2);
		team2_parsers.add(sp_team2_3);
		team2_parsers.add(sp_team2_4);
		team2_parsers.add(sp_team2_5);
		team team2 = new team(team2_parsers, 0,0);
		
double t1Off =  team1.getoRating();
double t1Def =  team1.getdRating();

double t2Off =  team2.getoRating();
double t2Def =  team2.getdRating();

System.out.println(" 1 off: " + t1Off);
System.out.println(" 1 def: " + t1Def);

	//	System.out.println(" 2 off: " + t2Off);
		//System.out.println(" 2 def: " + t2Def);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	 team1 = new team(team1_parsers, 0.4,0.4);
		 team2 = new team(team2_parsers, t1Off,t1Def);
		

		//	System.out.println("after 1 off: " + team1.getoRating());
			//System.out.println("after 1 def: " + team1.getdRating());
			
			System.out.println("after 2 off: " + team2.getoRating());
			System.out.println("after 2 def: " + team2.getdRating());
		

	}

	private static String getWinner(team team1, team team2) {
		String winner = "";
		if (team1.getoRating() > team2.getdRating()) {
			winner = "team1";
		} else if (team1.getoRating() < team2.getdRating()) {
			winner = "team2";
		}
		return winner;
	}

}
