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

public class sportsDataParse {
	String api1 = "8udezbnqaugun5degyjt2x8g";
	String api2 = "8ntxr2s4bxk8wpf6wtetstnc";
	String api3 = "u7nqmxhtfgffubyuq28aypbf";
	int teamNodeCounter = 0;
	String teamName = "";
	String teamID = "";

	String playerID = "";
	String playerName = "";

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

	public sportsDataParse(String teamName, String playerName) {
		this.teamName = teamName;
		this.playerName = playerName;

		try { // or if you prefer DOM:
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new URL(
					"http://api.sportsdatallc.org/nba-t3/league/hierarchy.xml?api_key="
							+ api1).openStream());
			if (doc.hasChildNodes()) {
				printNote(doc.getChildNodes());
			}

			if (teamNameList.contains(teamName)) {
				teamID = teamIDList.get(teamNameList.indexOf(teamName));
				// System.out.println(teamID);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if (!teamID.equals("")) {
			try {
				DocumentBuilderFactory dbf = DocumentBuilderFactory
						.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doc = db.parse(new URL(
						"http://api.sportsdatallc.org/nba-t3/teams/" + teamID
								+ "/profile.xml?api_key=" + api2).openStream());
				if (doc.hasChildNodes()) {
					printNote(doc.getChildNodes());
				}

				if (playerNameList.contains(playerName)) {
					playerID = playerIDList.get(playerNameList
							.indexOf(playerName));
					// System.out.println(playerID);
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		// teamID = "583ecd4f-fb46-11e1-82cb-f4ce4684ea4c";
		// playerID = "098f0b33-9a6b-47b0-95c7-4aba176a4206";

		if (!playerID.equals("")) {
			try {
				DocumentBuilderFactory dbf = DocumentBuilderFactory
						.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doc = db.parse(new URL(
						"http://api.sportsdatallc.org/nba-t3/players/"
								+ playerID + "/profile.xml?api_key=" + api3)
						.openStream());
				if (doc.hasChildNodes()) {
					printNote(doc.getChildNodes());
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		/*
		 * playerStatNameList.remove(playerStatNameList.size()-1);
		 * playerStatNameList.remove(playerStatNameList.size()-1);
		 * playerStatNameList.remove(playerStatNameList.size()-1); //
		 * System.out.print(playerStatNameList.toString());
		 * 
		 * playerStatValueList.remove(playerStatValueList.size()-1);
		 * playerStatValueList.remove(playerStatValueList.size()-1);
		 * playerStatValueList.remove(playerStatValueList.size()-1); //
		 * System.out.print(playerStatValueList.toString());
		 */
	}

	protected void printNote(NodeList nodeList) {
		for (int count = 0; count < nodeList.getLength(); count++) {
			Node tempNode = nodeList.item(count);
			if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
				if (tempNode.hasAttributes()) {
					NamedNodeMap nodeMap = tempNode.getAttributes();
					for (int i = 0; i < nodeMap.getLength(); i++) {
						Node node = nodeMap.item(i);

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

	protected void sortTeams(Node node1, Node node2) {
		if (node1.getNodeName().equals("team")) {
			if (node2.getNodeName().equals("name")) {
				teamNodeCounter++;
				tempteamName = tempteamName + " " + node2.getNodeValue();
			} else if (node2.getNodeName().equals("market")) {
				teamNodeCounter++;
				tempteamName = tempteamName + node2.getNodeValue();

				// System.out.println(teamName);
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

	protected void sortPlayers(Node node1, Node node2) {

		if (node1.getNodeName().equals("player")) {
			if (node2.getNodeName().equals("full_name")) {
				playerNameList.add(node2.getNodeValue());
			} else if (node2.getNodeName().equals("id")) {
				playerIDList.add(node2.getNodeValue());
			}

		}
	}

	boolean shouldLoop = true;

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
					// System.out.println(node1.getNodeName()+
					// " : "+node2.getNodeName());
				}
			}
		}
	}

}