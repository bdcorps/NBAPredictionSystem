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
		System.out.println("off: " + team1.getoRating());
		System.out.println("def: " + team1.getdRating());

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

		System.out.println("team2");
		team team2 = new team(team2_parsers, 0,0);
		System.out.println("off: " + team2.getoRating());
		System.out.println("def: " + team2.getdRating());

		System.out.println("team 2 overall: "+(team2.getoRating() + team2.getdRating())/2);
		System.out.println("winner: " + getWinner(team1, team2));

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
