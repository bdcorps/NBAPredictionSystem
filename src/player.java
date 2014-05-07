
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
	//efficieny
	private double ppg = gPlay / points; //point int per game
	private double rpg = gPlay / rebounds; //rebounds per game
	private double apg = gPlay / assists; //assists per game
	private double spg = gPlay / steals; //steals per game
	private double bpg = gPlay / block; //blocks per game
	private double fpg = gPlay / fouls; //fouls per game
	private double tpg = gPlay / turnovers; //turnovers per game
	private double minPG = gPlay / minutesPlayes; //minutes played per game
	private double fgPercent = fgMade / fgAttempt; //field goal percentage
	private double ftPercent = ftMade / ftAttempt; //free throw percentage
	private double threeptPercent = threeptMade / threeptAttempt; //3 point percentage
	private double plusMin; //player plus/minus
	private double rating; //NBA player rating

}
