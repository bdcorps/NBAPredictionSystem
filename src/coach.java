public class couch {
	public class Coach extends Person {
		private int S_wins; //total regular season wins 
		private int S_losses; //total regular season losses
		private int S_games; //total regular season games coached
		private int PF_wins; //total playoff wins 
		private int PF_losses; //total playoff losses
		private int PF_game; //total play games coached
		private int exp; //years of coaching experience
		private int championships; //number of championships
		public int getS_wins() {
			return S_wins;
		}
		public void setS_wins(int s_wins) {
			S_wins = s_wins;
		}
		public int getS_losses() {
			return S_losses;
		}
		public void setS_losses(int s_losses) {
			S_losses = s_losses;
		}
		public int getS_games() {
			return S_games;
		}
		public void setS_games(int s_games) {
			S_games = s_games;
		}
		public int getPF_wins() {
			return PF_wins;
		}
		public void setPF_wins(int pF_wins) {
			PF_wins = pF_wins;
		}
		public int getPF_losses() {
			return PF_losses;
		}
		public void setPF_losses(int pF_losses) {
			PF_losses = pF_losses;
		}
		public int getPF_game() {
			return PF_game;
		}
		public void setPF_game(int pF_game) {
			PF_game = pF_game;
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
}
