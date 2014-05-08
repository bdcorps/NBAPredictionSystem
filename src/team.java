
public class Team {
	private int gPlay; //games played
	private int wins; //regular season wins
	private int losses; //regular season losses
	private int seed ; //playoff seed(1-8)
	//stats
	private int points;//points
 +	private int assists;//assists
 +	private int offRebounds;//offensive rebounds
 	private int defRebounds;//defensive rebounds
 +	private int steals;//steals
 +	private int blocks;//block
 +	private int fouls;//fouls
 +	private int turnovers;//points
  	private int fgMade; //field goals made
  	private int fgAttempt; //field goals attempted
  	private int ftMade; //free throws made
  	private int ftAttempt; //free throws attempted
  	private int threeptMade; //3ptrs made
  	private int threeptAttempt; //3ptrs attempted
	//efficiency
	private double win_loss = wins / gPlay;//winning percentage
	private double ppg = gPlay / points; //point int per game
 +	private double rpg = gPlay / offRebounds; //offensive rebounds per game
 +	private double rpg = gPlay / defRebounds; //defensiverebounds per game
 +	private double apg = gPlay / assists; //assists per game
 +	private double spg = gPlay / steals; //steals per game
 +	private double bpg = gPlay / block; //blocks per game
 +	private double fpg = gPlay / fouls; //fouls per game
 +	private double tpg = gPlay / turnovers; //turnovers per game
 +	private double fgPercent = fgMade / fgAttempt; //field goal percentage
 +	private double ftPercent = ftMade / ftAttempt; //free throw percentage
 +	private double threeptPercent = threeptMade / threeptAttempt; //3 point percentage
	
	private boolean divLeader; //division leader (true =division leader)

}
