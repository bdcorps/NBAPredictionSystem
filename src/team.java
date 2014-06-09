import java.util.ArrayList;
import java.util.Collections;

public class team {

	ArrayList<String> StatsNameList = new ArrayList<String>();
	ArrayList<String> StatsValueList = new ArrayList<String>();

	player[] p_team1_playing5 = new player[5];

	boolean error = false;

	center sp = new center();

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

	// offensive stat weights
	double weight_exp = 0.10;
	double weight_ppg = 0.15;
	double weight_apg = 0.5;
	double weight_orpg = 0.20;
	double weight_turnover = 0.25;
	double weight_fgPercent = 0.10;
	double weight_ftPercent = 0.5;
	double weight_threePoint =0.5;
	double weight_twoPoint =0.5;

	// defensive stat weights
	double weight_dRpg = 0.20;
			double weight_BlockPercent = 0.20;
			double weight_Fpg=0.30;
			double weight_spg = 0.30;
			
	public double getoRating() {
		return oRating;
	}

	public double getdRating() {
		return dRating;
	}

	public team(ArrayList<playerStatParser> playerParsers, int offRating, int defRating) {
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

		setSuperPlayer();
		sp.calculateEfficiency();

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

			oRating = calOffRating();
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

	private void setSuperPlayer() {
		sp.setBirthPlace("Canada");
		sp.setBirthdate("1995-10-19");
		sp.setName("The Magician");
		sp.setHeight(8);
		sp.setWeight(200);
		sp.setExperience(75);
		sp.setNumber(6969);
		sp.setAssists(1000);
		sp.setBlockAttempt(2500);
		sp.setBlocks(2500);
		sp.setDefRebounds(2500);
		sp.setFgAttempt(5000);
		sp.setFgMade(5000);
		sp.setFlagrantFouls(1000);
		sp.setPersonalFouls(1000);
		sp.setTechFouls(1000);
		sp.setFtAttempt(500);
		sp.setFtMade(500);
		sp.setgPlay(1000);
		sp.setgStart(1000);
		sp.setMinutesPlayed(10000);
		sp.setOffRebounds(2500);
		sp.setPoints(10000);
		sp.setSteals(1000);
		sp.setThreeptAttempt(500);
		sp.setThreeptMade(500);
		sp.setTurnovers(1000);
		sp.setTwoptAttempt(10000);
		sp.setTwoptMade(10000);
	}

	public double calOffRating() {
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

	public double calDefRating() {
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
	
	public double calIndiviOffRating(player p) {
		double rating = ((p.getExperience() / sp.getExperience())*weight_exp + (p.getPpg()
				/ sp.getPpg())*weight_ppg + (p.getApg() / p.getApg())*weight_apg + (p.getoRpg()
				/ sp.getoRpg())*weight_orpg - (p.getTurnovers() / sp.getTurnovers())*weight_turnover
				+ (p.getFgPercent() / sp.getFgPercent())*weight_fgPercent + (p.getFtPercent()
				/ sp.getFtPercent())*weight_ftPercent + (p.getThreeptPercent()
				/ sp.getThreeptPercent())*weight_threePoint + (p.getTwoptPercent()
				/ sp.getTwoptPercent())*weight_twoPoint) / 8;
		return rating;
	}
	

	public double calIndiviDefRating(player p) {
		double rating = ((p.getdRpg() / sp.getdRpg())*weight_dRpg - (p.getFpg() / sp.getFpg())*weight_Fpg + (p.getBlockPercent()
				/ sp.getBlockPercent())*weight_BlockPercent+(p.getSpg()/sp.getSpg())*weight_spg) / 4;
		return rating;

	}

	public void setPlayerStats(player p) {
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
