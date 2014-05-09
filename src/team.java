
<<<<<<< HEAD
public class team {
	private int wins; //regular season wins
	private int losses; //regular season losses
	private int seed ; //playoff seed(1-8)
	private double ppg; //point per game
	private double Opp_ppg; //opposing team’s points per game
	private double off_rpg; //offensive rebounds per game
	private double def_rpg; //defensive rebounds per game
	private double apg; //assists per game
	private double spg; //steals per game
	private double bpg; //blocks per game
	private double fpg; //fouls per game
	private double tpg; //turnovers per game
	private double fgPercent; //field goal percentage
	private double ftPercent; //free throw percentage
	private double threeptPercent; //three point percentage
	private int fgMade; //field goals made
	private int fgAttempt; //field goals attempted
	private int ftMade; //free throws made
	private int ftAttempt; //free throws attempted
	private int threeptMade; //threeptrs made
	private int threeptAttempt; //threeptrs attempted
	private boolean divLeader; //division leader (true =division leader)
=======
public class Team {
	private int gPlay; // games played
	private int wins; // regular season wins
	private int losses; // regular season losses
	private int seed; // playoff seed(1-8)
	// stats
	private int points;// points
	private int assists;// assists
	private int offRebounds;// offensive rebounds
	private int defRebounds;// defensive rebounds
	private int steals;// steals
	private int blocks;// block
	private int fouls;// fouls
	private int turnovers;// points
	private int fgMade; // field goals made
	private int fgAttempt; // field goals attempted
	private int ftMade; // free throws made
	private int ftAttempt; // free throws attempted
	private int threeptMade; // 3ptrs made
	private int threeptAttempt; // 3ptrs attempted
	// efficiency
	private double win_loss = wins / gPlay;// winning percentage
	private double ppg = gPlay / points; // point int per game
	private double rpg = gPlay / offRebounds; // offensive rebounds per game
	private double rpg = gPlay / defRebounds; // defensiverebounds per game
	private double apg = gPlay / assists; // assists per game
	private double spg = gPlay / steals; // steals per game
	private double bpg = gPlay / block; // blocks per game
	private double fpg = gPlay / fouls; // fouls per game
	private double tpg = gPlay / turnovers; // turnovers per game
	private double fgPercent = fgMade / fgAttempt; // field goal percentage
	private double ftPercent = ftMade / ftAttempt; // free throw percentage
	private double threeptPercent = threeptMade / threeptAttempt; // 3 point
																	// percentage
>>>>>>> ca42378dcdd75d05b7e7f2b925079a0f760fb055

	private boolean divLeader; // division leader (true =division leader)

	public int getgPlay() {
		return gPlay;
	}

	public void setgPlay(int gPlay) {
		this.gPlay = gPlay;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getSeed() {
		return seed;
	}

	public void setSeed(int seed) {
		this.seed = seed;
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

	public double getWin_loss() {
		return win_loss;
	}

	public void setWin_loss(double win_loss) {
		this.win_loss = win_loss;
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

	public double getRpg() {
		return rpg;
	}

	public void setRpg(double rpg) {
		this.rpg = rpg;
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

	public boolean isDivLeader() {
		return divLeader;
	}

	public void setDivLeader(boolean divLeader) {
		this.divLeader = divLeader;
	}
}
