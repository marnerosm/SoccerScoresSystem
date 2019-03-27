import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TeamStatsUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField wins;
	private JTextField draws;
	private JTextField loses;
	private JTextField matchesPlayed;
	private JTextField points;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamStatsUI frame = new TeamStatsUI();
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
	public TeamStatsUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTeamName = new JLabel("Team Name");
		lblTeamName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTeamName.setBounds(34, 30, 86, 16);
		contentPane.add(lblTeamName);

		JLabel lblWins = new JLabel("Wins");
		lblWins.setBounds(34, 153, 56, 16);
		contentPane.add(lblWins);

		JLabel lblLoses = new JLabel("Loses");
		lblLoses.setBounds(34, 211, 56, 16);
		contentPane.add(lblLoses);

		JLabel lblDraws = new JLabel("Draws");
		lblDraws.setBounds(34, 182, 56, 16);
		contentPane.add(lblDraws);

		JLabel lblMatchesPlayed = new JLabel("Matches Played");
		lblMatchesPlayed.setBounds(34, 240, 111, 36);
		contentPane.add(lblMatchesPlayed);

		JLabel lblPoints = new JLabel("Points");
		lblPoints.setBounds(34, 289, 56, 16);
		contentPane.add(lblPoints);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMenuUI back = new ViewMenuUI();
				back.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(48, 437, 97, 25);
		contentPane.add(btnBack);
		Vector<String> comboBoxItems = new Vector<String>();
		for (Team t : League.getInstance().teams) {
			comboBoxItems.add(t.getTeamName());
		}
		final DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(comboBoxItems);
		JComboBox<String> comboBox = new JComboBox<String>(model);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Team team : League.getInstance().teams) {
					if (comboBox.getSelectedItem().equals(team.getTeamName())) {

						wins.setText(Integer.toString(team.getWins()));
						draws.setText(Integer.toString(team.getDraws()));
						loses.setText(Integer.toString(team.getLoses()));
						matchesPlayed.setText(Integer.toString(team.getMatchesPlayed()));
						points.setText(Integer.toString(team.getPoints()));

					}
				}
			}
		});

		comboBox.setBounds(150, 28, 116, 22);
		contentPane.add(comboBox);

		wins = new JTextField();
		wins.setEditable(false);
		wins.setBounds(101, 150, 116, 22);
		contentPane.add(wins);
		wins.setColumns(10);

		draws = new JTextField();
		draws.setEditable(false);
		draws.setColumns(10);
		draws.setBounds(102, 179, 116, 22);
		contentPane.add(draws);

		loses = new JTextField();
		loses.setEditable(false);
		loses.setColumns(10);
		loses.setBounds(101, 208, 116, 22);
		contentPane.add(loses);

		matchesPlayed = new JTextField();
		matchesPlayed.setEditable(false);
		matchesPlayed.setColumns(10);
		matchesPlayed.setBounds(131, 247, 116, 22);
		contentPane.add(matchesPlayed);

		points = new JTextField();
		points.setEditable(false);
		points.setColumns(10);
		points.setBounds(87, 289, 116, 22);
		contentPane.add(points);
	}
}
