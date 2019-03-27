import java.util.Comparator;

public class ComparatorClass implements Comparator<Team> {

	/**
	 * This method compares the points of the teams and goal difference of the team
	 * and sorts them accordingly on the League Standings table.
	 * 
	 */
	@Override
	public int compare(Team team, Team team1) {

		if (team.getPoints() > team1.getPoints())
			return -1;
		else if (team.getPoints() < team1.getPoints())
			return 1;
		else {
			int goalDif = team.getGoalsFor() - team.getGoalsAgainst();
			int goalDif1 = team1.getGoalsFor() - team1.getGoalsAgainst();
			if (goalDif > goalDif1)
				return -1;
			else if (goalDif < goalDif1)
				return 1;
			else
				return 0;
		}

	}
}
