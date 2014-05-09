import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	public class coach extends person {
		private String team;
		private int S_wins; //total regular season wins 
		private int S_losses; //total regular season losses
		private int S_games; //total regular season games coached
		private int PF_wins; //total playoff wins 
		private int PF_losses; //total playoff losses
		private int PF_game; //total play games coached
		private int exp; //years of coaching experience
		private int championships; //number of championships
		
		public coach(String team){
		
		FileReader fr;
		try {
			fr = new FileReader("/coachData.txt");
		 
		BufferedReader br = new BufferedReader(fr);
		
		while ((br.readLine()) == team){	
				setTeam(br.readLine());
			}
		
		setS_wins(Integer.parseInt(br.readLine()));
		setS_losses(Integer.parseInt(br.readLine()));
		setS_games(Integer.parseInt(br.readLine()));
		setPF_wins(Integer.parseInt(br.readLine()));
		setPF_losses(Integer.parseInt(br.readLine()));
		setPF_game(Integer.parseInt(br.readLine()));
		setExp(Integer.parseInt(br.readLine()));
		setChampionships(Integer.parseInt(br.readLine()));
		br.close();} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
		
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team ;
		}
		
		public int getS_wins() {
			return S_wins;
		}
		public void setS_wins(int s_wins) {
			this.S_wins = s_wins;
		}
		public int getS_losses() {
			return S_losses;
		}
		public void setS_losses(int s_losses) {
			this.S_losses = s_losses;
		}
		public int getS_games() {
			return S_games;
		}
		public void setS_games(int s_games) {
			this.S_games = s_games;
		}
		public int getPF_wins() {
			return PF_wins;
		}
		public void setPF_wins(int pF_wins) {
			this.PF_wins = pF_wins;
		}
		public int getPF_losses() {
			return PF_losses;
		}
		public void setPF_losses(int pF_losses) {
			this.PF_losses = pF_losses;
		}
		public int getPF_game() {
			return PF_game;
		}
		public void setPF_game(int pF_game) {
			this.PF_game = pF_game;
		}
		public int getExp() {
			return exp;
		}
		public void setExp(int exp) {
			this.exp = exp;
		}
		public int getChampionships() {
			return championships;
		}
		public void setChampionships(int championships) {
			this.championships = championships;
		}
		
	}
