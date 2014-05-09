abstract class player extends person{
	//private double salary; //Salary per year 
	private int experience;
	private int assist_turnover;
	private int gPlay; //Games played 
	private int gStart; //Games started
	private int minutesPlayed; //total mins played season
	private String team; //team name
	private int number; //Jersey 
	private int points;//points
	private int assists;//assists
	private int rebounds;//rebounds
	private int offRebounds;//offensive rebounds
 	private int defRebounds;//defensive rebounds
	private int steals;//steals
	private int blockAttempt;//blocks attempted
	private int blocks;//block
	
	private int flagrantFouls;
	private int personalFouls;//fouls
	private int techFouls;//fouls
	private int turnovers;//points
	private int fgMade; //field goals made
	private int fgAttempt; //field goals attempted
	private int ftMade; //free throws made
	private int ftAttempt; //free throws attempted
	private int twoptMade; //2ptrs made
	private int twoptAttempt; //2ptrs attempted
	private int threeptMade; //3ptrs made
	private int threeptAttempt; //3ptrs attempted
	
	//efficieny ratings
	private double ppg; //point int per game
	private double rpg; //rebounds per game
	private double oRpg; //offensive rebounds per game
 	private double dRpg; //defensive rebounds per game
	private double apg; //assists per game
	private double spg; //steals per game
	
	//check the blocks: should there be bpg or blockPercent
	private double bpg; //blocks per game
	private double blockPercent;
	///
	
	//all fouls added
	private double fpg; //fouls per game
	private double tpg; //turnovers per game
	private double minPG; //minutes played per game
	private double fgPercent; //field goal percentage
	private double ftPercent; //free throw percentage
	private double threeptPercent; //3 point percentage

	private double twoptPercent; //3 point percentage

	//player plus/minus excluded from this
	private double rating;

	
	public void printPlayer(){
		System.out.println("Name: " + name);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Birthday: " + birthdate );
		System.out.println("Birthplace: " + birthPlace );	
	}
	
	
	public void printStats(){
		System.out.println("Games Played: " + gPlay);
		System.out.println("Games Started: " + gStart);
	//	System.out.println("Total Minutes Played: " + minutesPlay);
		System.out.println("Team: " + team);
		System.out.println("Jersey Number: " + number);
		System.out.println("Points: " + points);
		System.out.println("Assists: " + assists);
		System.out.println("Rebounds: " + rebounds);
		System.out.println("Offensive Rebounds: " + offRebounds);
		System.out.println("Defensive Rebounds: " + defRebounds);
		System.out.println("Steals: " + steals);
		System.out.println("Blocks: " + blocks);
		//6System.out.println("Fouls: " + fouls);
		System.out.println("Turnovers: " + turnovers);
		System.out.println("Field Goals Made: " + fgMade);
		System.out.println("Field Goals Attempted: " + fgAttempt);
		System.out.println("Free Throws Made: " + ftMade);
		System.out.println("Free Throws Attempted: " + ftAttempt);
		System.out.println("Three Points Made: " + threeptMade);
		System.out.println("PPG: " + ppg );
		System.out.println("APG: " + apg);
		System.out.println("RPG: " + rpg);
		System.out.println("Offensive RPG: " + oRpg );
		System.out.println("Defensive RPG: " + dRpg);
		System.out.println("BPG: " + bpg );
		System.out.println("FPG: " + fpg);
		//System.out.println("TPG: " + );
		System.out.println("Minutes Played Per Game: " + minPG);
		System.out.println("FG Percentage: " + fgPercent );
		System.out.println("FT Percentage: " + ftPercent );
		System.out.println("3PT Percentage: " + threeptPercent );
	}
	
	
public void calculateEfficiency(){
	//TO DO - check zero
	
	
	
	try{
	//efficieny ratings
		 ppg = (points / gPlay) *100; //point int per game
		 rpg = (rebounds / gPlay) *100; //rebounds per game
		 oRpg = (offRebounds / gPlay) *100; //offensive rebounds per game
	 	 dRpg = (defRebounds / gPlay) *100; //defensive rebounds per game
		 apg = (assists / gPlay) *100; //assists per game
		 spg = (steals / gPlay) *100; //steals per game
		
		//check the blocks: should there be bpg or blockPercent
		 bpg = (blocks / gPlay) *100; //blocks per game
		 blockPercent = (blocks/blockAttempt)*100;
		///
		
		//all fouls added
		 fpg = ((flagrantFouls+techFouls+personalFouls) / gPlay) *100; //fouls per game
		 tpg = (turnovers / gPlay) *100; //turnovers per game
		 minPG = (minutesPlayed / gPlay) *100; //minutes played per game
		 fgPercent = (fgMade / fgAttempt) *100; //field goal percentage
		 ftPercent = (ftMade / ftAttempt) *100; //free throw percentage
		 threeptPercent = (threeptMade / threeptAttempt) *100; //3 point percentage

		 twoptPercent = (twoptMade / twoptAttempt) *100; //3 point percentage
	}
	catch (java.lang.ArithmeticException ex){
		
		
		
		
		
		
		
		
	}
}
	
	public player(){	
	
	
}


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
	
	public int getAssist_turnover() {
		return assist_turnover;
	}
	public void setAssist_turnover(int assist_turnover) {
		this.assist_turnover = assist_turnover;
	}
	/*
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}*/
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
	public int getRebounds() {
		return rebounds;
	}
	public void setRebounds(int rebounds) {
		this.rebounds = rebounds;
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
		return blocks;
	}
	public void setBlocks(int blocks) {
		this.blocks = blocks;
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
	public double getRpg() {
		return rpg;
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
	} //NBA player rating
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
}

