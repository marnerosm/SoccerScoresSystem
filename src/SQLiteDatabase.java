import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDatabase {

	public static String url = "jdbc:sqlite:C:\\Users\\marne\\Desktop\\SoccerSystem.db";
	public static String file = "C:\\Users\\marne\\Desktop\\SoccerSystem.db";

	/*
	 * Make a connection
	 */
	public static void connect() {
		Connection conn = null;

		try {
			// db parameters

			// create a connection to the database
			conn = DriverManager.getConnection(url);

			System.out.println("Connection to SQLite has been established.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	/*
	 * Creates a new Database
	 */
	public static void createNewDatabase(String fileName) {

		try (Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database has been created.");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * Creates a new Table
	 */
	public static void createTable() {

		// SQL statement for creating a new table
		String sql = "CREATE TABLE `Team` ( `ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," + "`Name` TEXT NOT NULL,"
				+ "`Wins` INTEGER NOT NULL, " + "`Draws` INTEGER NOT NULL, " + "`Loses` INTEGER NOT NULL,"
				+ "`GoalsFor` INTEGER NOT NULL," + "`GoalsAgainst` INTEGER NOT NULL,"
				+ "`MatchesPlayed` INTEGER NOT NULL )";

		String sql2 = "CREATE TABLE `Match` ( `ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
				+ "`Fixture` INTEGER NOT NULL," + "`homeTeam` TEXT NOT NULL," + "`awayTeam` TEXT NOT NULL,"
				+ "`homeScore` INTEGER," + "`awayScore` INTEGER )";

		String sql3 = "CREATE TABLE `Stadium` (\r\n" + "	`ID`	INTEGER NOT  NULL,\r\n"
				+ "	`StadiumName`	TEXT NOT NULL,\r\n" + "	`Capacity`	TEXT NOT NULL,\r\n" + "	PRIMARY KEY(`ID`)\r\n"
				+ ");";

		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
			// create a new table
			stmt.execute(sql);
			stmt.execute(sql2);
			stmt.execute(sql3);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * Checks if the database exists
	 */
	public static boolean checkDB() {
		File file1 = new File(file);
		if (file1.exists()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Inserts in team table.
	 */
	public static void insertInTeam(String name, int wins, int draws, int loses, int goalsFor, int goalsAgainst,
			int matchesPlayed) {

		String sql = "INSERT INTO Team(name,wins,draws,loses,goalsFor,goalsAgainst,matchesPlayed) VALUES(?,?,?,?,?,?,?)";

		try (Connection conn = DriverManager.getConnection(url); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.setLong(2, wins);
			stmt.setLong(3, draws);
			stmt.setLong(4, loses);
			stmt.setLong(5, goalsFor);
			stmt.setLong(6, goalsAgainst);
			stmt.setLong(7, matchesPlayed);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}

	/*
	 * Inserts in Match Table.
	 */
	public static void insertInMatch(int fixture, String homeTeam, String awayTeam) {

		String sql = "INSERT INTO Match(fixture,homeTeam,awayTeam) VALUES(?,?,?)";

		try (Connection conn = DriverManager.getConnection(url); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, fixture);
			stmt.setString(2, homeTeam);
			stmt.setString(3, awayTeam);
			stmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	/*
	 * Insert in Stadium Table
	 */
	public static void insertInStadium(String stadiumName, String capacity) {

		String sql = "INSERT INTO Stadium(StadiumName,Capacity) VALUES(?,?)";

		try (Connection conn = DriverManager.getConnection(url); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, stadiumName);
			stmt.setString(2, capacity);
			stmt.executeUpdate();
		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	/*
	 * Show the Stadium Table.
	 */
	public static void selectStadium() {
		String sql = "SELECT * FROM Stadium";

		try (Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getDouble("capacity"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * Deletes the Database
	 */
	public static void deleteDb() {

		String sql = "DELETE FROM Team ";
		String sql1 = "DELETE FROM Stadium ";
		String sql2 = "DELETE FROM Match ";

		try (Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				Statement stmt = conn.createStatement();
				stmt.execute(sql);
				stmt.execute(sql1);
				stmt.execute(sql2);

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * Updates the scores in matches table.
	 */
	public static void updateScores(String homeTeam, String awayTeam, int homeScore, int awayScore) {
		String sql = "UPDATE Match SET homeScore = ? , " + "awayScore = ? " + "WHERE homeTeam = ? "
				+ "AND awayTeam = ? ";

		try (Connection conn = DriverManager.getConnection(url); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setInt(1, homeScore);
			pstmt.setInt(2, awayScore);
			pstmt.setString(3, homeTeam);
			pstmt.setString(4, awayTeam);
			// update
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * updates Team table
	 */
	public static void updateTeam(String teamName, int wins, int draws, int loses, int goalsFor, int goalsAgainst,
			int matchesPlayed) {
		String sql = "UPDATE Team SET Wins = ? , " + "Draws = ? , " + "Loses = ? , " + "GoalsFor = ? , "
				+ "GoalsAgainst = ? , " + "MatchesPlayed = ? " + "WHERE Name = ? ";

		try (Connection conn = DriverManager.getConnection(url); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			// set the corresponding param
			pstmt.setInt(1, wins);
			pstmt.setInt(2, draws);
			pstmt.setInt(3, loses);
			pstmt.setInt(4, goalsFor);
			pstmt.setInt(5, goalsAgainst);
			pstmt.setInt(6, matchesPlayed);
			pstmt.setString(7, teamName);
			// update
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
