import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
		int sleepTime = 1000;
		ArrayList<playerStatParser> team1_parsers = new ArrayList<playerStatParser>();
		ArrayList<playerStatParser> team2_parsers = new ArrayList<playerStatParser>();
		
		playerStatParser sp_team1_1= new playerStatParser("Miami Heat",
					"LeBron James");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		playerStatParser sp_team1_2= new playerStatParser("Miami Heat",
				"Dwyane Wade");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		playerStatParser sp_team1_3= new playerStatParser("Miami Heat",
				"Chris Bosh");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_4= new playerStatParser("Miami Heat",
				"Greg Oden");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		playerStatParser sp_team1_5= new playerStatParser("Miami Heat",
				"Chris Andersen");
	
		team1_parsers.add(sp_team1_1);
		team1_parsers.add(sp_team1_2);
		team1_parsers.add(sp_team1_3);
		team1_parsers.add(sp_team1_4);
		team1_parsers.add(sp_team1_5);
		
		System.out.println("team1");
team team1 = new team(team1_parsers);

try {
	Thread.sleep(sleepTime);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
playerStatParser sp_team2_1= new playerStatParser("Brooklyn Nets",
			"Alan Anderson");
try {
	Thread.sleep(sleepTime);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

playerStatParser sp_team2_2= new playerStatParser("Brooklyn Nets",
		"Brook Lopez");
try {
	Thread.sleep(sleepTime);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

playerStatParser sp_team2_3= new playerStatParser("Brooklyn Nets",
		"Jason Collins");
try {
	Thread.sleep(sleepTime);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

playerStatParser sp_team2_4= new playerStatParser("Brooklyn Nets",
		"Marcus Thornton");
try {
	Thread.sleep(sleepTime);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

playerStatParser sp_team2_5= new playerStatParser("Brooklyn Nets",
		"Andrei Kirilenko");

team2_parsers.add(sp_team2_1);
team2_parsers.add(sp_team2_2);
team2_parsers.add(sp_team2_3);
team2_parsers.add(sp_team2_4);
team2_parsers.add(sp_team2_5);

System.out.println("team2");
team team2 = new team(team2_parsers);
	}

}
