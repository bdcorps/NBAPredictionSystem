
public class Player extends Person {
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
	private double rating; //NBA player rating

}
