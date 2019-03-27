
public class Team {
	private String teamName = null;
	private int wins = 0;
	private int draws = 0;
	private int loses = 0;
	private int goalsAgainst = 0;
	private int goalsFor = 0;
	private int matchesPlayed = 0;
	private Stadium stadium = null;

	public Team(String teamName, int wins, int draws, int loses, int goalsAgainst, int goalsFor, int matchesPlayed,
			int points, Stadium stadium) {
		super();
		this.teamName = teamName;
		this.wins = wins;
		this.draws = draws;
		this.loses = loses;
		this.goalsAgainst = goalsAgainst;
		this.goalsFor = goalsFor;
		this.matchesPlayed = matchesPlayed;
		this.stadium = stadium;
	}

	public String getTeamName() {
		return teamName;
	}

	public int getWins() {
		return wins;
	}

	public int getDraws() {
		return draws;
	}

	public int getLoses() {
		return loses;
	}

	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	public int getGoalsFor() {
		return goalsFor;
	}

	/*
	 * Calculates the matches Played.
	 */
	public int getMatchesPlayed() {
		matchesPlayed = getWins() + getLoses() + getDraws();
		return matchesPlayed;
	}

	/*
	 * Calculates the points
	 */
	public int getPoints() {
		return this.getWins() * 3 + this.getDraws();
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}

	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

}
