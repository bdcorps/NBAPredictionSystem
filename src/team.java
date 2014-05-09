
public class Team {
	private int gPlay; //games played
	private int wins; //regular season wins
	private int losses; //regular season losses
	private int seed ; //playoff seed(1-8)
	//stats
	private int points;//points
 	private int assists;//assists
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
	//efficiency
	private double win_loss = (wins / gPlay)*100;//winning percentage
	private double ppg = (points / gPlay) *100; //point int per game
 +	private double rpg = (rebounds / gPlay) *100; //total rebounds per game
  +	private double oRpg = (offRebounds / gPlay) *100; //offensive rebounds per game
 +	private double dRpg = (defRebounds / gPlay) *100; //defensive rebounds per game
 +	private double apg = (assists / gPlay) *100; //assists per game
 +	private double spg = (steals / gPlay) *100; //steals per game
 +	private double bpg = (blocks / gPlay) *100; //blocks per game
 +	private double fpg = (fouls / gPlay) *100; //fouls per game
 +	private double tpg = (turnovers / gPlay) *100; //turnovers per game
 +	private double fgPercent = (fgMade / fgAttempt) *100; //field goal percentage
 +	private double ftPercent = (ftMade / ftAttempt) *100; //free throw percentage
 +	private double threeptPercent = (threeptMade / threeptAttempt) *100; //3 point percentage
	
	private boolean divLeader; //division leader (true =division leader)

}
