import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**Purpose:
 * This class parses live sports statistics for a given player in a team. 
 * Several api keys are being used to avoid timeouts.
 * To grab player's stats, we need player's id. 
 * To grab player's id, we need team 's id.
 * Team's id is grabbed from league heirachy page.
 * Player's stat names and values are stored in two arraylists   
 * 
 * Part Of: NBA Prediction System
 * @author Tavneet Uppal, Vasu Kamra, Mankirt, Sukhpal S. Saini
 * Last Modified: 10-05-2014 at 2:20 PM
 */

public class playerStatParser {
	String api1 = "8udezbnqaugun5degyjt2x8g";
	String api2 = "8ntxr2s4bxk8wpf6wtetstnc";
	String api3 = "u7nqmxhtfgffubyuq28aypbf";
	int teamNodeCounter = 0;
	String teamName = "";
	String teamID = "";
	String playerID = "";
	String playerName = "";
	boolean error = false;
	boolean shouldLoop = true;

	ArrayList<String> teamNameList = new ArrayList<String>();
	ArrayList<String> teamIDList = new ArrayList<String>();
	ArrayList<String> playerNameList = new ArrayList<String>();
	ArrayList<String> playerIDList = new ArrayList<String>();
	ArrayList<String> playerStatNameList = new ArrayList<String>();
	ArrayList<String> playerStatValueList = new ArrayList<String>();

	public ArrayList<String> getplayerStatNameList() {
		return playerStatNameList;
	}

	public ArrayList<String> getplayerStatValueList() {
		return playerStatValueList;
	}

	/**Parses live data for a given player inside the given team
	 * @param teamName Team Name
	 * @param playerName Player Name
	 */
	public playerStatParser(String teamName, String playerName) {
		this.teamName = teamName;
		this.playerName = playerName;

		if (!error) {
			try { 
				DocumentBuilderFactory dbf = DocumentBuilderFactory
						.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doc = db.parse(new URL(
						"http://api.sportsdatallc.org/nba-t3/league/hierarchy.xml?api_key="
								+ api1).openStream());
				if (doc.hasChildNodes()) {
					printNote(doc.getChildNodes());
				}

				if (teamNameList.contains(teamName)) {
					teamID = teamIDList.get(teamNameList.indexOf(teamName));
				}

			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				error = true;
			}
		}

		if (!error) {
			if (!teamID.equals("")) {
				try {
					DocumentBuilderFactory dbf = DocumentBuilderFactory
							.newInstance();
					DocumentBuilder db = dbf.newDocumentBuilder();
					Document doc = db.parse(new URL(
							"http://api.sportsdatallc.org/nba-t3/teams/"
									+ teamID + "/profile.xml?api_key=" + api2)
							.openStream());
					if (doc.hasChildNodes()) {
						printNote(doc.getChildNodes());
					}

					if (playerNameList.contains(playerName)) {
						playerID = playerIDList.get(playerNameList
								.indexOf(playerName));
					}

				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
					error = true;
				}
			}

			if (!error) {
				playerStatNameList.add("team");
				playerStatValueList.add(teamName);

				if (!playerID.equals("")) {
					try {
						DocumentBuilderFactory dbf = DocumentBuilderFactory
								.newInstance();
						DocumentBuilder db = dbf.newDocumentBuilder();
						Document doc = db.parse(new URL(
								"http://api.sportsdatallc.org/nba-t3/players/"
										+ playerID + "/profile.xml?api_key="
										+ api3).openStream());
						if (doc.hasChildNodes()) {
							printNote(doc.getChildNodes());
						}

					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
						error = true;
					}
				}
			}
		}
		if (error) {
			playerStatNameList = null;
			playerStatValueList = null;
		}
	}

	/**Separates the nodes and grabs the attribute values
	 * @param nodeList Xml page nodeList
	 */
	protected void printNote(NodeList nodeList) {
		for (int count = 0; count < nodeList.getLength(); count++) {
			Node tempNode = nodeList.item(count);
			if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
				if (tempNode.hasAttributes()) {
					NamedNodeMap nodeMap = tempNode.getAttributes();
					for (int i = 0; i < nodeMap.getLength(); i++) {
						Node node = nodeMap.item(i);

						// suitable method is run for league, team and player
						if ((teamID.equals("")) && (playerID.equals(""))) {
							sortTeams(tempNode, node);
						} else if (!(teamID.equals(""))
								&& (playerID.equals(""))) {
							sortPlayers(tempNode, node);
						} else if (!(teamID.equals(""))
								&& (!playerID.equals(""))) {
							sortStats(tempNode, node);
						}

					}
				}

				if (tempNode.hasChildNodes()) {
					printNote(tempNode.getChildNodes());

				}
			}

		}

	}

	String tempteamName = "";

	/**Sorts the nodes for specific stats
	 * @param node1 The primary node
	 * @param node2 The secondary node
	 */
	protected void sortTeams(Node node1, Node node2) {
		if (node1.getNodeName().equals("team")) {
			if (node2.getNodeName().equals("name")) {
				teamNodeCounter++;
				tempteamName = tempteamName + " " + node2.getNodeValue();
			} else if (node2.getNodeName().equals("market")) {
				teamNodeCounter++;
				tempteamName = tempteamName + node2.getNodeValue();
			} else if (node2.getNodeName().equals("id")) {
				teamIDList.add(node2.getNodeValue());
			}
			if (teamNodeCounter >= 2) {
				teamNameList.add(tempteamName);
				tempteamName = "";
				teamNodeCounter = 0;
			}
		}
	}

	/**Sorts the nodes for specific stats
	 * @param node1 The primary node
	 * @param node2 The secondary node
	 */
	protected void sortPlayers(Node node1, Node node2) {

		if (node1.getNodeName().equals("player")) {
			if (node2.getNodeName().equals("full_name")) {
				playerNameList.add(node2.getNodeValue());
			} else if (node2.getNodeName().equals("id")) {
				playerIDList.add(node2.getNodeValue());
			}

		}
	}

	/**Sorts the nodes for specific stats
	 * @param node1 The primary node
	 * @param node2 The secondary node
	 */
	protected void sortStats(Node node1, Node node2) {
		if (node1.getNodeName().equals("team")) {
			if (node2.getNodeName().equals("name")) {
				if ((teamName).contains(node2.getNodeValue())) {
					shouldLoop = true;
				} else {
					shouldLoop = false;
				}
			}
		}

		if (node1.getNodeName().equals("player")
				|| node1.getNodeName().equals("total")
				|| node1.getNodeName().equals("team")) {
			if (!(node2.getNodeName()).contains("pct")) {
				if (shouldLoop) {
					playerStatNameList.add(node2.getNodeName());
					playerStatValueList.add(node2.getNodeValue());
				}
			}
		}
	}

}