import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class LeagueStandingsUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeagueStandingsUI frame = new LeagueStandingsUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LeagueStandingsUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtpnLeagueStandings = new JTextPane();
		txtpnLeagueStandings.setEditable(false);
		txtpnLeagueStandings.setFont(new Font("Dialog", Font.PLAIN, 30));
		txtpnLeagueStandings.setText("League Standings");
		txtpnLeagueStandings.setBounds(286, 13, 259, 47);
		contentPane.add(txtpnLeagueStandings);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 76, 807, 420);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Name", "Wins", "Draws", "Loses", "GA", "GF", "GD", "MP", "Points" }));
		DefaultTableModel tm = (DefaultTableModel) table.getModel();
		League.getInstance().teams.sort(new ComparatorClass());
		for (int i = 0; i < 16; i++) {
			String teamName = League.getInstance().teams.get(i).getTeamName();
			int wins = League.getInstance().teams.get(i).getWins();
			int draws = League.getInstance().teams.get(i).getDraws();
			int loses = League.getInstance().teams.get(i).getLoses();
			int goalsAgainst = League.getInstance().teams.get(i).getGoalsAgainst();
			int goalsFor = League.getInstance().teams.get(i).getGoalsFor();
			int goalDifference = goalsFor - goalsAgainst;
			int matchesPlayed = League.getInstance().teams.get(i).getMatchesPlayed();
			int points = League.getInstance().teams.get(i).getPoints();
			Object[] teamObject = { teamName, wins, draws, loses, goalsAgainst, goalsFor, goalDifference, matchesPlayed,
					points };
			tm.addRow(teamObject);
		}

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMenuUI back = new ViewMenuUI();
				back.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(36, 24, 97, 25);
		contentPane.add(btnBack);
	}
}
