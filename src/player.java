import java.util.ArrayList;

abstract class player extends person {
	private String team; // team name
	private int number; // Jersey
	private int experience;
	private int gPlay; // Games played
	private int gStart; // Games started
	private int minutesPlayed; // total mins played season
	private int points;// points
	private int assists;// assists
	private int offRebounds;// offensive rebounds
	private int defRebounds;// defensive rebounds
	private int steals;// steals
	private int blockAttempt;// blocks attempted
	private int blocksMade;// blocks made

	private int flagrantFouls;// flagrant fouls
	private int personalFouls;// personal fouls
	private int techFouls;// technical fouls
	private int turnovers;// points
	private int fgMade; // field goals made
	private int fgAttempt; // field goals attempted
	private int ftMade; // free throws made
	private int ftAttempt; // free throws attempted
	private int twoptMade; // 2ptrs made
	private int twoptAttempt; // 2ptrs attempted
	private int threeptMade; // 3ptrs made
	private int threeptAttempt; // 3ptrs attempted
	private int fouls;

	// efficieny ratings
	private double ppg; // points per game
	private double oRpg; // offensive rebounds per game
	private double dRpg; // defensive rebounds per game
	private double apg; // assists per game
	private double spg; // steals per game

	// check the blocks: should there be bpg or blockPercent
	private double bpg; // blocks per game
	private double blockPercent;

	private double fpg; // fouls per game
	private double tpg; // turnovers per game
	private double minPG; // minutes played per game
	private double fgPercent; // field goal percentage
	private double ftPercent; // free throw percentage
	private double threeptPercent; // 3 point percentage
	private double twoptPercent; // 2 point percentage

	public double getTwoptPercent() {
		return twoptPercent;
	}

	// player plus/minus excluded from this
	private double rating;

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getFlagrantFouls() {
		return flagrantFouls;
	}

	public int getBlockAttempt() {
		return blockAttempt;
	}

	public void setBlockAttempt(int blockAttempt) {
		this.blockAttempt = blockAttempt;
	}

	public double getBlockPercent() {
		return blockPercent;
	}

	public void setFlagrantFouls(int falgrantFouls) {
		this.flagrantFouls = flagrantFouls;
	}

	public int getPersonalFouls() {
		return personalFouls;
	}

	public void setPersonalFouls(int personalFouls) {
		this.personalFouls = personalFouls;
	}

	public int getTechFouls() {
		return techFouls;
	}

	public void setTechFouls(int techFouls) {
		this.techFouls = techFouls;
	}

	public int getgPlay() {
		return gPlay;
	}

	public void setgPlay(int gPlay) {
		this.gPlay = gPlay;
	}

	public int getgStart() {
		return gStart;
	}

	public void setgStart(int gStart) {
		this.gStart = gStart;
	}

	public int getMinutesPlayed() {
		return minutesPlayed;
	}

	public void setMinutesPlayed(int minutesPlayed) {
		this.minutesPlayed = minutesPlayed;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getOffRebounds() {
		return offRebounds;
	}

	public void setOffRebounds(int offRebounds) {
		this.offRebounds = offRebounds;
	}

	public int getDefRebounds() {
		return defRebounds;
	}

	public void setDefRebounds(int defRebounds) {
		this.defRebounds = defRebounds;
	}

	public int getSteals() {
		return steals;
	}

	public void setSteals(int steals) {
		this.steals = steals;
	}

	public int getBlocks() {
		return blocksMade;
	}

	public void setBlocks(int blocks) {
		this.blocksMade = blocks;
	}

	public int getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(int turnovers) {
		this.turnovers = turnovers;
	}

	public int getFgMade() {
		return fgMade;
	}

	public void setFgMade(int fgMade) {
		this.fgMade = fgMade;
	}

	public int getFgAttempt() {
		return fgAttempt;
	}

	public void setFgAttempt(int fgAttempt) {
		this.fgAttempt = fgAttempt;
	}

	public int getFtMade() {
		return ftMade;
	}

	public void setFtMade(int ftMade) {
		this.ftMade = ftMade;
	}

	public int getFtAttempt() {
		return ftAttempt;
	}

	public void setFtAttempt(int ftAttempt) {
		this.ftAttempt = ftAttempt;
	}

	public int getThreeptMade() {
		return threeptMade;
	}

	public void setThreeptMade(int threeptMade) {
		this.threeptMade = threeptMade;
	}

	public int getThreeptAttempt() {
		return threeptAttempt;
	}

	public void setThreeptAttempt(int threeptAttempt) {
		this.threeptAttempt = threeptAttempt;
	}

	public double getPpg() {
		return ppg;
	}

	public double getoRpg() {
		return oRpg;
	}

	public double getdRpg() {
		return dRpg;
	}

	public double getApg() {
		return apg;
	}

	public double getSpg() {
		return spg;
	}

	public double getBpg() {
		return bpg;
	}

	public double getFpg() {
		return fpg;
	}

	public double getTpg() {
		return tpg;
	}

	public double getMinPG() {
		return minPG;
	}

	public double getFgPercent() {
		return fgPercent;
	}

	public double getFtPercent() {
		return ftPercent;
	}

	public double getThreeptPercent() {
		return threeptPercent;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	} // NBA player rating

	public int getTwoptMade() {
		return twoptMade;
	}

	public void setTwoptMade(int twoptMade) {
		this.twoptMade = twoptMade;
	}

	public int getTwoptAttempt() {
		return twoptAttempt;
	}

	public void setTwoptAttempt(int twoptAttempt) {
		this.twoptAttempt = twoptAttempt;
	}

	public player() {

	}

	public void printPlayer() {
		System.out.println("Name: " + name);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Birthday: " + birthdate);
		System.out.println("Birthplace: " + birthPlace);
	}

	public void printStats() {
		System.out.println("Experience: " + experience);
		System.out.println("Games Played: " + gPlay);
		System.out.println("Games Started: " + gStart);
		System.out.println("Total Minutes Played: " + minutesPlayed);
		System.out.println("Team: " + team);
		System.out.println("Jersey Number: " + number);
		System.out.println("Points: " + points);
		System.out.println("Assists: " + assists);

		System.out.println("Offensive Rebounds: " + offRebounds);
		System.out.println("Defensive Rebounds: " + defRebounds);
		System.out.println("Steals: " + steals);
		System.out.println("Blocks Made: " + blocksMade);
		System.out.println("Blocks Attempted: " + blockAttempt);
		System.out.println("Fouls: " + fouls);
		System.out.println("Turnovers: " + turnovers);
		System.out.println("Field Goals Made: " + fgMade);
		System.out.println("Field Goals Attempted: " + fgAttempt);
		System.out.println("Free Throws Made: " + ftMade);
		System.out.println("Free Throws Attempted: " + ftAttempt);
		System.out.println("Three Points Made: " + threeptMade);
		System.out.println("Three Points Attempted: " + threeptAttempt);
		System.out.println("two Points Made: " + twoptMade);
		System.out.println("two Points Attempted: " + twoptAttempt);

		System.out.println("PPG: " + ppg);
		System.out.println("APG: " + apg);
		System.out.println("Offensive RPG: " + oRpg);
		System.out.println("Defensive RPG: " + dRpg);
		System.out.println("BPG: " + bpg);
		System.out.println("FPG: " + fpg);
		System.out.println("TPG: " + tpg);
		System.out.println("Minutes Played Per Game: " + minPG);
		System.out.println("FG Percentage: " + fgPercent);
		System.out.println("FT Percentage: " + ftPercent);
		System.out.println("3PT Percentage: " + threeptPercent);
		System.out.println("2PT Percentage: " + twoptPercent);
		System.out.println("Block Percentage: " + blockPercent);
	}

	public double round(double no, int precision) {
		return (double) Math.round(no * (Math.pow(10, precision)))
				/ (Math.pow(10, precision));
	}

	public void calculateEfficiency() {
		
			fouls = flagrantFouls + personalFouls + techFouls;
			// efficiency ratings

			if (gPlay != 0) {
				minPG = round((double) minutesPlayed / gPlay, 2); // minutes
																	// played
																	// per game
				ppg = round((double) points / gPlay * 100, 2); // point int per
																// game
				oRpg = round((double) offRebounds / gPlay * 100, 2); // offensive
																		// rebounds
																		// per
																		// game
				dRpg = round((double) defRebounds / gPlay * 100, 2); // defensive
																		// rebounds
																		// per
																		// game
				apg = round((double) assists / gPlay * 100, 2); // assists per
																// game
				spg = round((double) steals / gPlay * 100, 2); // steals per
																// game//all
																// fouls added
				fpg = round((double) fouls / gPlay * 100, 2);// fouls per game
				tpg = round((double) turnovers / gPlay * 100, 2);// turnovers
																	// per game
			}

			if (gPlay != 0) {
				// check the blocks: should there be bpg or blockPercent
				bpg = round((double) blocksMade / gPlay * 100, 2); // blocks per
																	// game
			}

			if (blockAttempt != 0) {
				blockPercent = round((double) blocksMade / blockAttempt * 100,
						2);
			} else {
				blockPercent = 0;
			}

			if (fgAttempt != 0) {
				fgPercent = round((double) fgMade / fgAttempt * 100, 2); // field
																			// goal
																			// percentage
			} else {
				fgPercent = 0;
			}
			if (ftAttempt != 0) {
				ftPercent = round((double) ftMade / ftAttempt * 100, 2); // free
																			// throw
																			// percentage
			} else {
				ftPercent = 0;
			}
			if (threeptAttempt != 0) {
				threeptPercent = round((double) threeptMade / threeptAttempt
						* 100, 2); // 3 point percentage
			} else {
				threeptPercent = 0;
			}
			if (twoptAttempt != 0) {
				twoptPercent = round((double) twoptMade / twoptAttempt * 100, 2);// 3
																					// point
																					// percentage
			} else {
				twoptPercent = 0;
			}

		
	}
	
	public ArrayList<String> getPersonalStats(){
		 ArrayList<String> personalStats = new ArrayList<String>();
		personalStats.add(name);		personalStats.add(String.valueOf(height));		personalStats.add(String.valueOf(weight));
		personalStats.add(birthdate);		personalStats.add(String.valueOf(birthPlace));	

	return (personalStats);}
	
	public ArrayList<Double> getOffensiveStats(){
		
		//Remember the negative in front of tpg
		
		System.out.println("PPG: " + ppg);
		System.out.println("APG: " + apg);
		System.out.println("Offensive RPG: " + oRpg);
		System.out.println("Defensive RPG: " + dRpg);
		System.out.println("BPG: " + bpg);
		System.out.println("FPG: " + fpg);
		System.out.println("TPG: " + tpg);
		System.out.println("Minutes Played Per Game: " + minPG);
		System.out.println("FG Percentage: " + fgPercent);
		System.out.println("FT Percentage: " + ftPercent);
		System.out.println("3PT Percentage: " + threeptPercent);
		System.out.println("2PT Percentage: " + twoptPercent);
		System.out.println("Block Percentage: " + blockPercent);
		
		
		 ArrayList<Double> offensiveStats = new ArrayList<Double>();
	offensiveStats.add(ppg);
	offensiveStats.add(apg);offensiveStats.add(oRpg);offensiveStats.add(-tpg);
	offensiveStats.add(minPG);
	return (offensiveStats);}
}
