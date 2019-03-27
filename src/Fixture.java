import java.util.List;

public class Fixture {

	private int fixtureNo = 0;
	List<Match> matches;

	/*
	 * Constructor
	 */
	public Fixture(int fixtureNo, List<Match> matches) {
		super();
		this.matches = matches;
		this.fixtureNo = fixtureNo;
	}

	public int getFixtureNo() {
		return fixtureNo;
	}

	public void setFixtureNo(int fixtureNo) {
		this.fixtureNo = fixtureNo;
	}

}
