import java.util.ArrayList;
import java.util.List;

/*
 * Singleton League class
 * */
public class League {
	private static League instance = null;
	private static int NUMBER_OF_TEAMS = 16;
	private static int NUMBER_OF_FIXTURES = 30;
	List<Fixture> fixtures = new ArrayList<Fixture>(NUMBER_OF_FIXTURES);
	List<Team> teams = new ArrayList<Team>(NUMBER_OF_TEAMS);

	protected League() {

	}

	public static League getInstance() {
		if (instance == null) {
			instance = new League();
		}
		return instance;
	}

	public void insertTeams() {
		for (Team team : teams) {
			teams.add(team);
		}

	}

	/*
	 * This method generates random Fixtures by selecting numbers from the array,
	 * assigning each team to play a match with another team.
	 */
	public void generateFixtures() {

		int[][] fixturesArray = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
				{ 11, 6, 15, 8, 9, 2, 7, 10, 5, 12, 13, 0, 1, 14, 3, 4 },
				{ 5, 3, 10, 13, 4, 9, 2, 15, 14, 7, 0, 6, 8, 1, 12, 11 },
				{ 11, 5, 6, 8, 4, 14, 7, 2, 10, 0, 1, 12, 9, 3, 15, 13 },
				{ 9, 15, 8, 5, 2, 4, 12, 7, 6, 10, 3, 11, 13, 1, 14, 0 },
				{ 1, 2, 15, 3, 0, 12, 7, 4, 5, 9, 13, 6, 11, 8, 10, 14 },
				{ 3, 10, 9, 1, 8, 7, 2, 0, 12, 6, 5, 15, 14, 13, 4, 11 },
				{ 0, 9, 6, 14, 10, 12, 15, 4, 7, 1, 13, 5, 8, 3, 11, 2 },
				{ 12, 8, 4, 6, 15, 10, 7, 0, 9, 14, 3, 13, 1, 11, 5, 2 },
				{ 10, 1, 8, 4, 6, 15, 2, 12, 13, 7, 11, 9, 14, 3, 0, 5 },
				{ 15, 11, 2, 8, 4, 10, 12, 14, 9, 13, 3, 0, 1, 6, 5, 7 },
				{ 13, 4, 10, 2, 14, 8, 1, 5, 6, 3, 7, 9, 0, 11, 12, 15 },
				{ 8, 13, 4, 1, 2, 14, 5, 10, 9, 6, 3, 12, 11, 7, 15, 0 },
				{ 13, 11, 6, 2, 10, 9, 12, 4, 7, 15, 0, 8, 1, 3, 14, 5 },
				{ 8, 10, 15, 1, 4, 0, 9, 12, 11, 14, 5, 6, 3, 7, 2, 13 } };

		for (int i = 0; i < 15; i++) {

			List<Match> fixtureMatches = new ArrayList<Match>();
			List<Match> fixtureMatchesReverse = new ArrayList<Match>();
			for (int j = 1; j < 9; j++) {
				int homeTeam = fixturesArray[i][j * 2 - 2];
				int awayTeam = fixturesArray[i][j * 2 - 1];
				Match match = new Match(teams.get(homeTeam), teams.get(awayTeam));
				Match reverseMatch = new Match(teams.get(awayTeam), teams.get(homeTeam));
				fixtureMatches.add(match);
				fixtureMatchesReverse.add(reverseMatch);

				SQLiteDatabase.insertInMatch(i + 1, teams.get(homeTeam).getTeamName(),
						teams.get(awayTeam).getTeamName());
				SQLiteDatabase.insertInMatch(i + 16, teams.get(awayTeam).getTeamName(),
						teams.get(homeTeam).getTeamName());
			}
			Fixture fixture = new Fixture(i + 1, fixtureMatches);
			Fixture fixtureReverse = new Fixture(i + 16, fixtureMatchesReverse);

			League.getInstance().fixtures.add(fixture);
			League.getInstance().fixtures.add(fixtureReverse);

		}

	}

	/*
	 * This method auto-generates Teams and inserts them into the ArrayList.
	 */
	public void autoGenerateTeams() {
		Stadium stadium = new Stadium("Stadium", "10000");

		teams.clear();

		Team team = new Team("Team1", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team);
		Team team1 = new Team("Team2", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team1);
		Team team2 = new Team("Team3", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team2);
		Team team3 = new Team("Team4", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team3);
		Team team4 = new Team("Team5", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team4);
		Team team5 = new Team("Team6", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team5);
		Team team6 = new Team("Team7", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team6);
		Team team7 = new Team("Team8", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team7);
		Team team8 = new Team("Team9", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team8);
		Team team9 = new Team("Team10", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team9);
		Team team10 = new Team("Team11", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team10);
		Team team11 = new Team("Team12", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team11);
		Team team12 = new Team("Team13", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team12);
		Team team13 = new Team("Team14", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team13);
		Team team14 = new Team("Team15", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team14);
		Team team15 = new Team("Team16", 0, 0, 0, 0, 0, 0, 0, stadium);
		teams.add(team15);

	}
}
