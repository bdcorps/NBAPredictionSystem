import java.util.ArrayList;
import java.util.Collections;

public class team {

	ArrayList<String> StatsNameList = new ArrayList<String>();
	ArrayList<String> StatsValueList = new ArrayList<String>();

	player[] p_team1_playing5 = new player[5];

	boolean error = false;

	center superPlayer = new center();
	
	center p_team1_1 = new center();
	smallForward p_team1_2 = new smallForward();
	powerForward p_team1_3 = new powerForward();
	pointGuard p_team1_4 = new pointGuard();
	shootingGuard p_team1_5 = new shootingGuard();
	center p_team1_6 = new center();
	smallForward p_team1_7 = new smallForward();
	powerForward p_team1_8 = new powerForward();
	pointGuard p_team1_9 = new pointGuard();
	shootingGuard p_team1_10 = new shootingGuard();

	ArrayList<String> p_team1_1_per = new ArrayList<String>();
	ArrayList<Double> p_team1_1_off = new ArrayList<Double>();
	ArrayList<Double> p_team1_1_def = new ArrayList<Double>();

	playerStatParser sp_team1_1;
	playerStatParser sp_team1_2;
	playerStatParser sp_team1_3;
	playerStatParser sp_team1_4;
	playerStatParser sp_team1_5;
	
	double oRating;
	double dRating;
	public double getoRating() {
		return oRating;
	}

	public double getdRating() {
		return dRating;
	}

	public team(ArrayList<playerStatParser> playerParsers) {
	
		sp_team1_1 = playerParsers.get(0);
		sp_team1_2 = playerParsers.get(1);
		sp_team1_3 = playerParsers.get(2);
		sp_team1_4 = playerParsers.get(3);
		sp_team1_5 = playerParsers.get(4);
		
		
		p_team1_playing5[0] = p_team1_1;
		p_team1_playing5[1] = p_team1_2;
		p_team1_playing5[2] = p_team1_3;
		p_team1_playing5[3] = p_team1_4;
		p_team1_playing5[4] = p_team1_5;

		// increasing offence of other team same as decreasing defence of our
		// team
		// fouls should be -defence
		// turnovers should be -offense

		// needs to be a modified stats arrayList
		// individual offensive/defensive rating will be for 1 min
		// should only be 5 players each team to calculate stats for

		if (!error) {
			StatsNameList = sp_team1_1.getplayerStatNameList();
			StatsValueList = sp_team1_1.getplayerStatValueList();

			if (StatsNameList == null || StatsValueList == null) {
				error = true;
			} else {
				setPlayerStats(p_team1_1);
				// p_team1_1.calculateEfficiency();
				// p_team1_1_per = p_team1_1.getPersonalStats();

				// p_team1_1_def= p_team1_1.getDefensiveStats();
			}
		}

		
		if (!error) {
			StatsNameList = sp_team1_2.getplayerStatNameList();
			StatsValueList = sp_team1_2.getplayerStatValueList();

			if (StatsNameList == null || StatsValueList == null) {
				error = true;
			} else {
				setPlayerStats(p_team1_2);
			}
		}
		
		if (!error) {
			StatsNameList = sp_team1_3.getplayerStatNameList();
			StatsValueList = sp_team1_3.getplayerStatValueList();

			if (StatsNameList == null || StatsValueList == null) {
				error = true;
			} else {
				setPlayerStats(p_team1_3);
			}
		}
		

		if (!error) {
			StatsNameList = sp_team1_4.getplayerStatNameList();
			StatsValueList = sp_team1_4.getplayerStatValueList();

			if (StatsNameList == null || StatsValueList == null) {
				error = true;
			} else {
				setPlayerStats(p_team1_4);
			}
		}
		

		if (!error) {
			StatsNameList = sp_team1_5.getplayerStatNameList();
			StatsValueList = sp_team1_5.getplayerStatValueList();

			if (StatsNameList == null || StatsValueList == null) {
				error = true;
			} else {
				setPlayerStats(p_team1_5);
			}
		}
	

		/*	if (!error) {
				playerStatParser sp_team1_6 = new playerStatParser("Miami Heat",
						"Ray Allen");
				StatsNameList = sp_team1_6.getplayerStatNameList();
				StatsValueList = sp_team1_6.getplayerStatValueList();

				if (StatsNameList == null || StatsValueList == null) {
					error = true;
				} else {
					setPlayerStats(p_team1_6);
				}
			}
			

			if (!error) {
				playerStatParser sp_team1_7 = new playerStatParser("Miami Heat",
						"Mario Chalmers");
				StatsNameList = sp_team1_7.getplayerStatNameList();
				StatsValueList = sp_team1_7.getplayerStatValueList();
				if (StatsNameList == null || StatsValueList == null) {
					error = true;
				} else {
					setPlayerStats(p_team1_7);
				}
			}
			
			if (!error) {
				playerStatParser sp_team1_8 = new playerStatParser("Miami Heat",
						"Norris Cole");
				StatsNameList = sp_team1_8.getplayerStatNameList();
				StatsValueList = sp_team1_8.getplayerStatValueList();

				if (StatsNameList == null || StatsValueList == null) {
					error = true;
				} else {
					setPlayerStats(p_team1_8);
				}
			}
		
			if (!error) {
				playerStatParser sp_team1_9 = new playerStatParser("Miami Heat",
						"Shane Battier");
				StatsNameList = sp_team1_9.getplayerStatNameList();
				StatsValueList = sp_team1_9.getplayerStatValueList();

				if (StatsNameList == null || StatsValueList == null) {
					error = true;
				} else {
					setPlayerStats(p_team1_9);
				}
			}
			
			if (!error) {
				playerStatParser sp_team1_10 = new playerStatParser("Miami Heat",
						"James Jones");
				StatsNameList = sp_team1_10.getplayerStatNameList();
				StatsValueList = sp_team1_10.getplayerStatValueList();

				if (StatsNameList == null || StatsValueList == null) {
					error = true;
				} else {
					setPlayerStats(p_team1_10);
				}
			}
			*/

		if (!error) {
			p_team1_1.calculateEfficiency();
			// p_team1_1.printPlayer();
			// p_team1_1.printStats();

			p_team1_2.calculateEfficiency();
			// p_team1_2.printPlayer();
			// p_team1_2.printStats();

			p_team1_3.calculateEfficiency();
			// p_team1_3.printPlayer();
			// p_team1_3.printStats();

			p_team1_4.calculateEfficiency();
			// p_team1_4.printPlayer();
			// p_team1_4.printStats();

			p_team1_5.calculateEfficiency();
			// p_team1_5.printPlayer();
			// p_team1_5.printStats();

			oRating= calOffRating();
			dRating = calDefRating();

			/*	p_team1_6.calculateEfficiency();
				p_team1_6.printPlayer();
				p_team1_6.printStats();

				p_team1_7.calculateEfficiency();
				p_team1_7.printPlayer();
				p_team1_7.printStats();

				p_team1_8.calculateEfficiency();
				p_team1_8.printPlayer();
				p_team1_8.printStats();

				p_team1_9.calculateEfficiency();
				p_team1_9.printPlayer();
				p_team1_9.printStats();

				p_team1_10.calculateEfficiency();
				p_team1_10.printPlayer();
				p_team1_10.printStats();*/
			}
		System.out.println("-----------------------End");
	}
	
	private void setSuperPlayer(){
		superPlayer.setBirthPlace("Canada");
		superPlayer.setBirthdate("1995-10-19");
		superPlayer.setName("The Magician");
		superPlayer.setHeight(8);
		superPlayer.setWeight(200);
		superPlayer.setExperience(30);
		superPlayer.setNumber(6969);
		superPlayer.setAssists();
		superPlayer.setBlockAttempt();
		superPlayer.setBlocks();
		superPlayer.setDefRebounds();
		superPlayer.setFgAttempt();
		superPlayer.setFgMade();
		superPlayer.setFlagrantFouls();
		superPlayer.setPersonalFouls();
		superPlayer.setTechFouls();
		superPlayer.setFtAttempt();
		superPlayer.setFtMade();
		superPlayer.setgPlay();
		superPlayer.setgStart();
		superPlayer.setMinutesPlayed();
		superPlayer.setOffRebounds();
		superPlayer.setPoints();
		superPlayer.setSteals();
		superPlayer.setThreeptAttempt();
		superPlayer.setThreeptMade();
		superPlayer.setTurnovers();
		superPlayer.setTwoptAttempt();
		superPlayer.setTwoptMade();
	}

	private double calOffRating() {
		double p1_offensive = calIndiviOffRating(p_team1_playing5[0])
				/ p_team1_playing5[0].getMinPG();
		double p2_offensive = calIndiviOffRating(p_team1_playing5[1])
				/ p_team1_playing5[1].getMinPG();
		double p3_offensive = calIndiviOffRating(p_team1_playing5[2])
				/ p_team1_playing5[2].getMinPG();
		double p4_offensive = calIndiviOffRating(p_team1_playing5[3])
				/ p_team1_playing5[3].getMinPG();
		double p5_offensive = calIndiviOffRating(p_team1_playing5[4])
				/ p_team1_playing5[4].getMinPG();

		return p1_offensive + p2_offensive + p3_offensive + p4_offensive
				+ p5_offensive;
	}

	private double calDefRating() {
		double p1_defensive = calIndiviDefRating(p_team1_playing5[0])
				/ p_team1_playing5[0].getMinPG();
		double p2_defensive = calIndiviDefRating(p_team1_playing5[1])
				/ p_team1_playing5[1].getMinPG();
		double p3_defensive = calIndiviDefRating(p_team1_playing5[2])
				/ p_team1_playing5[2].getMinPG();
		double p4_defensive = calIndiviDefRating(p_team1_playing5[3])
				/ p_team1_playing5[3].getMinPG();
		double p5_defensive = calIndiviDefRating(p_team1_playing5[4])
				/ p_team1_playing5[4].getMinPG();
		return p1_defensive + p2_defensive + p3_defensive + p4_defensive
				+ p5_defensive;

	}

	private double calIndiviOffRating(player p) {
		double rating = (p.getPpg() + p.getApg() + p.getoRpg()
				- p.getTurnovers() + p.getFgPercent() + p.getFtPercent()
				+ p.getThreeptPercent() + p.getTwoptPercent()) / 8;
		return rating;
	}

	private double calIndiviDefRating(player p) {
		double rating = (p.getdRpg() + p.getBpg() - p.getFpg() + p
				.getBlockPercent()) / 4;
		return rating;

	}

	private void setPlayerStats(player p) {
		ArrayList<Integer> refToKeep = new ArrayList<Integer>();

		for (String string : StatsNameList) {
			int ind = (StatsNameList.indexOf(string));
			if (ind != -1) {
				switch (StatsNameList.get(ind)) {
				case "team":
					p.setTeam(StatsValueList.get(ind));

					refToKeep.add(ind);
					break;
				case "birth_place":
					p.setBirthPlace(StatsValueList.get(ind));
					refToKeep.add(ind);
					break;
				case "birthdate":
					p.setBirthdate(StatsValueList.get(ind));
					refToKeep.add(ind);
					break;
				case "full_name":
					p.setName(StatsValueList.get(ind));
					refToKeep.add(ind);
					break;
				case "height":
					p.setHeight((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "weight":
					p.setWeight((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "experience":
					p.setExperience((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "jersey_number":
					p.setNumber((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "assists":
					p.setAssists(((int) Double.parseDouble(StatsValueList
							.get(ind))));
					refToKeep.add(ind);
					break;
				case "blocked_att":
					p.setBlockAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "blocks":
					p.setBlocks((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "defensive_rebounds":
					p.setDefRebounds((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "field_goals_att":
					p.setFgAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "field_goals_made":
					p.setFgMade((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "flagrant_fouls":
					p.setFlagrantFouls((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "personal_fouls":
					p.setPersonalFouls((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "tech_fouls":
					p.setTechFouls((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "free_throws_att":
					p.setFtAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "free_throws_made":
					p.setFtMade((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "games_played":
					p.setgPlay((int) Double.parseDouble(StatsValueList.get(ind)));
					refToKeep.add(ind);
					break;
				case "games_started":
					p.setgStart((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "minutes":
					p.setMinutesPlayed((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "offensive_rebounds":
					p.setOffRebounds((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "points":
					p.setPoints((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				// rebounds is off and def added
				case "steals":
					p.setSteals((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "three_points_att":
					p.setThreeptAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "three_points_made":
					p.setThreeptMade((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "turnovers":
					p.setTurnovers((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "two_points_att":
					p.setTwoptAttempt((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				case "two_points_made":
					p.setTwoptMade((int) Double.parseDouble(StatsValueList
							.get(ind)));
					refToKeep.add(ind);
					break;
				}
			}
		}
		// Clean up stats list
		// reveresed so changing indices do not effect next removal
		Collections.sort(refToKeep, Collections.reverseOrder());

		for (int j = StatsNameList.size() - 1; j > 0; j--) {
			if (refToKeep.contains(j)) {

			} else {
				StatsNameList.remove(j);
				StatsValueList.remove(j);
			}

		}
	}

}
