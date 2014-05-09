<<<<<<< HEAD
abstract class player extends person {
=======
abstract class player extends person{
>>>>>>> ca42378dcdd75d05b7e7f2b925079a0f760fb055
	private double salary; //Salary per year 
	private int gPlay; //Games played 
	private int gStart; //Games started
	private int minutesPlayed; //total mins played season
	private String team; //team name
	private boolean handed; //Right, true
	private int number; //Jersey 
	private int points;//points
	private int assists;//assists
	private int rebounds;//rebounds
	private int offRebounds;//offensive rebounds
 	private int defRebounds;//defensive rebounds
	private int steals;//steals
	private int blocks;//block
	private int fouls;//fouls
	private int turnovers;//points
	private int fgMade; //field goals made
	private int fgAttempt; //field goals attempted
	private int ftMade; //free throws made
	private int ftAttempt; //free throws attempted
	private int threeptMade; //3ptrs made
	private int threeptAttempt; //3ptrs attempted
	//efficieny ratings
	private double ppg = (points / gPlay) *100; //point int per game
	private double rpg = (rebounds / gPlay) *100; //rebounds per game
	private double oRpg = (offRebounds / gPlay) *100; //offensive rebounds per game
 +	private double dRpg = (defRebounds / gPlay) *100; //defensive rebounds per game
	private double apg = (assists / gPlay) *100; //assists per game
	private double spg = (steals / gPlay) *100; //steals per game
	private double bpg = (blocks / gPlay) *100; //blocks per game
	private double fpg = (fouls / gPlay) *100; //fouls per game
	private double tpg = (turnovers / gPlay) *100; //turnovers per game
	private double minPG = (minutesPlayed / gPlay) *100; //minutes played per game
	private double fgPercent = (fgMade / fgAttempt) *100; //field goal percentage
	private double ftPercent = (ftMade / ftAttempt) *100; //free throw percentage
	private double threeptPercent = (threeptMade / threeptAttempt) *100; //3 point percentage
	//player plus/minus excluded from this
	private double rating;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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
	public boolean isHanded() {
		return handed;
	}
	public void setHanded(boolean handed) {
		this.handed = handed;
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
	public int getFouls() {
		return fouls;
	}
	public void setFouls(int fouls) {
		this.fouls = fouls;
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
	public void setPpg(double ppg) {
		this.ppg = ppg;
	}
	public double getRpg() {
		return rpg;
	}
	public void setRpg(double rpg) {
		this.rpg = rpg;
	}
	public double getoRpg() {
		return oRpg;
	}
	public void setoRpg(double oRpg) {
		this.oRpg = oRpg;
	}
	public double getdRpg() {
		return dRpg;
	}
	public void setdRpg(double dRpg) {
		this.dRpg = dRpg;
	}
	public double getApg() {
		return apg;
	}
	public void setApg(double apg) {
		this.apg = apg;
	}
	public double getSpg() {
		return spg;
	}
	public void setSpg(double spg) {
		this.spg = spg;
	}
	public double getBpg() {
		return bpg;
	}
	public void setBpg(double bpg) {
		this.bpg = bpg;
	}
	public double getFpg() {
		return fpg;
	}
	public void setFpg(double fpg) {
		this.fpg = fpg;
	}
	public double getTpg() {
		return tpg;
	}
	public void setTpg(double tpg) {
		this.tpg = tpg;
	}
	public double getMinPG() {
		return minPG;
	}
	public void setMinPG(double minPG) {
		this.minPG = minPG;
	}
	public double getFgPercent() {
		return fgPercent;
	}
	public void setFgPercent(double fgPercent) {
		this.fgPercent = fgPercent;
	}
	public double getFtPercent() {
		return ftPercent;
	}
	public void setFtPercent(double ftPercent) {
		this.ftPercent = ftPercent;
	}
	public double getThreeptPercent() {
		return threeptPercent;
	}
	public void setThreeptPercent(double threeptPercent) {
		this.threeptPercent = threeptPercent;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	} //NBA player rating

}

