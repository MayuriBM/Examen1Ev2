package es.salesianos.edu.connection;

import java.util.ArrayList;

import es.salesianos.edu.models.Player;
import es.salesianos.edu.models.Team;

public class DataBase {

	private ArrayList<Team> teams = new ArrayList<Team>();

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
	
	private ArrayList<Player> players = new ArrayList<Player>();

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

}
