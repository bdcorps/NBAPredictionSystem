import java.util.ArrayList;
import java.util.Collections;

public class Main {

	static ArrayList<String> StatsNameList = new ArrayList<String>();
	static ArrayList<String> StatsValueList = new ArrayList<String>();

	public static void main(String[] args) {
		boolean error = false;
		int sleepTime = 1000;

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

		center p_team2_1 = new center();
		smallForward p_team2_2 = new smallForward();
		powerForward p_team2_3 = new powerForward();
		pointGuard p_team2_4 = new pointGuard();
		shootingGuard p_team2_5 = new shootingGuard();
		center p_team2_6 = new center();
		smallForward p_team2_7 = new smallForward();
		powerForward p_team2_8 = new powerForward();
		pointGuard p_team2_9 = new pointGuard();
		shootingGuard p_team2_10 = new shootingGuard();

		if (!error) {
			playerStatParser sp_team1_1 = new playerStatParser("Miami Heat",
					"LeBron James");
			StatsNameList = sp_team1_1.getplayerStatNameList();
			StatsValueList = sp_team1_1.getplayerStatValueList();

			if (StatsNameList == null || StatsValueList == null) {
				error = true;
			} else {
				setPlayerStats(p_team1_1);
			}
		}

		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
				if (!error) {
					playerStatParser sp_team1_2 = new playerStatParser("Miami Heat",
							"Dwyane Wade");
					StatsNameList = sp_team1_2.getplayerStatNameList();
					StatsValueList = sp_team1_2.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team1_2);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team1_3 = new playerStatParser("Miami Heat",
							"Chris Bosh");
					StatsNameList = sp_team1_3.getplayerStatNameList();
					StatsValueList = sp_team1_3.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team1_3);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team1_4 = new playerStatParser("Miami Heat",
							"Greg Oden");
					StatsNameList = sp_team1_4.getplayerStatNameList();
					StatsValueList = sp_team1_4.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team1_4);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team1_5 = new playerStatParser("Miami Heat",
							"Chris Andersen");
					StatsNameList = sp_team1_5.getplayerStatNameList();
					StatsValueList = sp_team1_5.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team1_5);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
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
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team2_1 = new playerStatParser("Brooklyn Nets",
							"Deron Williams");
					StatsNameList = sp_team2_1.getplayerStatNameList();
					StatsValueList = sp_team2_1.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_1);
					}
				}

				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team2_2 = new playerStatParser("Brooklyn Nets",
							"Kevin Garnett");
					StatsNameList = sp_team2_2.getplayerStatNameList();
					StatsValueList = sp_team2_2.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_2);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team2_3 = new playerStatParser("Brooklyn Nets",
							"Paul Pierce");
					StatsNameList = sp_team2_3.getplayerStatNameList();
					StatsValueList = sp_team2_3.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_3);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team2_4 = new playerStatParser("Brooklyn Nets",
							"Jason Collins");
					StatsNameList = sp_team2_4.getplayerStatNameList();
					StatsValueList = sp_team2_4.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_4);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team2_5 = new playerStatParser("Brooklyn Nets",
							"Joe Johnson");
					StatsNameList = sp_team2_5.getplayerStatNameList();
					StatsValueList = sp_team2_5.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_5);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team2_6 = new playerStatParser("Brooklyn Nets",
							"Brook Lopez");
					StatsNameList = sp_team2_6.getplayerStatNameList();
					StatsValueList = sp_team2_6.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_6);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team2_7 = new playerStatParser("Brooklyn Nets",
							"Mason Plumlee");
					StatsNameList = sp_team2_7.getplayerStatNameList();
					StatsValueList = sp_team2_7.getplayerStatValueList();
					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_7);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team2_8 = new playerStatParser("Brooklyn Nets",
							"Shaun Livingston");
					StatsNameList = sp_team2_8.getplayerStatNameList();
					StatsValueList = sp_team2_8.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_8);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					playerStatParser sp_team2_9 = new playerStatParser("Brooklyn Nets",
							"Jorge Gutierrez");
					StatsNameList = sp_team2_9.getplayerStatNameList();
					StatsValueList = sp_team2_9.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_9);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (!error) {
					playerStatParser sp_team2_10 = new playerStatParser("Brooklyn Nets",
							"Andrei Kirilenko");
					StatsNameList = sp_team2_10.getplayerStatNameList();
					StatsValueList = sp_team2_10.getplayerStatValueList();

					if (StatsNameList == null || StatsValueList == null) {
						error = true;
					} else {
						setPlayerStats(p_team2_10);
					}
				}
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (!error) {
					System.out.println("\nTeam 1\n");
					p_team1_1.calculateEfficiency();
					p_team1_1.printPlayer();
					p_team1_1.printStats();

					p_team1_2.calculateEfficiency();
					p_team1_2.printPlayer();
					p_team1_2.printStats();

					p_team1_3.calculateEfficiency();
					p_team1_3.printPlayer();
					p_team1_3.printStats();

					p_team1_4.calculateEfficiency();
					p_team1_4.printPlayer();
					p_team1_4.printStats();

					p_team1_5.calculateEfficiency();
					p_team1_5.printPlayer();
					p_team1_5.printStats();

					p_team1_6.calculateEfficiency();
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
					p_team1_10.printStats();

					System.out.println("\nTeam 2\n");
					
					p_team2_1.calculateEfficiency();
					p_team2_1.printPlayer();
					p_team2_1.printStats();

					p_team2_2.calculateEfficiency();
					p_team2_2.printPlayer();
					p_team2_2.printStats();

					p_team2_3.calculateEfficiency();
					p_team2_3.printPlayer();
					p_team2_3.printStats();

					p_team2_4.calculateEfficiency();
					p_team2_4.printPlayer();
					p_team2_4.printStats();

					p_team2_5.calculateEfficiency();
					p_team2_5.printPlayer();
					p_team2_5.printStats();

					p_team2_6.calculateEfficiency();
					p_team2_6.printPlayer();
					p_team2_6.printStats();

					p_team2_7.calculateEfficiency();
					p_team2_7.printPlayer();
					p_team2_7.printStats();

					p_team2_8.calculateEfficiency();
					p_team2_8.printPlayer();
					p_team2_8.printStats();

					p_team2_9.calculateEfficiency();
					p_team2_9.printPlayer();
					p_team2_9.printStats();

					p_team2_10.calculateEfficiency();
					p_team2_10.printPlayer();
					p_team2_10.printStats();

				}*/
		System.out.println("-----------------------End");
	}

	private static void setPlayerStats(player p) {
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
		Collections.sort(refToKeep, Collections.reverseOrder());

		for (int i = 0; i < refToKeep.size(); i++) {
			int value = refToKeep.get(i);
			StatsValueList.remove(value);
			StatsNameList.remove(value);
		}

	}

}
