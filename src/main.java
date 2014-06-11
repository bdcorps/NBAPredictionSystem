import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		int sleepTime = 1000;
		ArrayList<playerStatParser> team1_parsers = new ArrayList<playerStatParser>();
		ArrayList<playerStatParser> team2_parsers = new ArrayList<playerStatParser>();

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

		System.out.println("team1");
		team team1 = new team(team1_parsers, 0,0);

		System.out.println("team 1 overall: "+(team1.getoRating() + team1.getdRating())/2);
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
		team team2 = new team(team2_parsers, 0,0);
		
double t1Off =  team1.getoRating();
double t1Def =  team1.getdRating();

double t2Off =  team2.getoRating();
double t2Def =  team2.getdRating();

System.out.println(" 1 off: " + t1Off);
System.out.println(" 1 def: " + t1Def);

		System.out.println(" 2 off: " + t2Off);
		System.out.println(" 2 def: " + t2Def);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
 team1 = new team(team1_parsers,  t2Off,t2Def);
		team2 = new team(team2_parsers, t1Off,t1Def);
		

			System.out.println("after 1 off: " + team1.getoRating());
		System.out.println("after 1 def: " + team1.getdRating());
			
			System.out.println("after 2 off: " + team2.getoRating());
			System.out.println("after 2 def: " + team2.getdRating());
		

			new winScreen (team1,team2);
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

}
