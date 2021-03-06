import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class coach extends person {
	private String team;
	private int S_wins; // total regular season wins
	private int S_losses; // total regular season losses
	private int S_games; // total regular season games coached
	private int PF_wins; // total playoff wins
	private int PF_losses; // total playoff losses
	private int PF_game; // total play games coached
	private int exp; // years of coaching experience
	private int championships; // number of championships
	private boolean shouldUpdate;

	public coach(String team) {
		this.team = team;

		URL path = ClassLoader.getSystemResource("coachData.txt");
		if (path == null) {
		}
		File f = null;
		try {
			f = new File(path.toURI());
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}

		String line = null;

		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains(team)) {
					shouldUpdate = true;
				} else {
					shouldUpdate = false;
				}
				if (shouldUpdate) {
					S_wins = Integer.parseInt(bufferedReader.readLine());
					S_losses = Integer.parseInt(bufferedReader.readLine());
					S_games = Integer.parseInt(bufferedReader.readLine());
					PF_wins = Integer.parseInt(bufferedReader.readLine());
					PF_losses = Integer.parseInt(bufferedReader.readLine());
					PF_game = Integer.parseInt(bufferedReader.readLine());
					exp = Integer.parseInt(bufferedReader.readLine());
					championships = Integer.parseInt(bufferedReader.readLine());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void printstats() {
		System.out.println(team);
		System.out.println(S_wins);
		System.out.println(S_losses);
		System.out.println(S_games);
		System.out.println(PF_wins);
		System.out.println(PF_losses);
		System.out.println(PF_game);
		System.out.println(exp);
		System.out.println(championships);
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
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
