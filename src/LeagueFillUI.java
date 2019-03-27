import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class LeagueFillUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField homeScore1;
	private JTextField homeScore2;
	private JTextField homeScore3;
	private JTextField homeScore4;
	private JTextField homeScore5;
	private JTextField homeScore6;
	private JTextField homeScore7;
	private JTextField homeScore8;
	private JTextField awayScore1;
	private JTextField awayScore2;
	private JTextField awayScore3;
	private JTextField awayScore4;
	private JTextField awayScore5;
	private JTextField awayScore6;
	private JTextField awayScore7;
	private JTextField awayScore8;

	private JTextField homeTeam1;
	private JTextField homeTeam2;
	private JTextField homeTeam3;
	private JTextField homeTeam4;
	private JTextField homeTeam5;
	private JTextField homeTeam6;
	private JTextField homeTeam7;
	private JTextField homeTeam8;
	private JTextField awayTeam1;
	private JTextField awayTeam2;
	private JTextField awayTeam3;
	private JTextField awayTeam4;
	private JTextField awayTeam5;
	private JTextField awayTeam6;
	private JTextField awayTeam7;
	private JTextField awayTeam8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeagueFillUI frame = new LeagueFillUI();
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
	public LeagueFillUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		homeTeam1 = new JTextField();
		homeTeam1.setEditable(false);
		homeTeam1.setBounds(25, 128, 252, 24);
		contentPane.add(homeTeam1);

		homeTeam2 = new JTextField();
		homeTeam2.setEditable(false);
		homeTeam2.setBounds(25, 165, 252, 24);
		contentPane.add(homeTeam2);

		homeTeam3 = new JTextField();
		homeTeam3.setEditable(false);
		homeTeam3.setBounds(25, 202, 252, 24);
		contentPane.add(homeTeam3);

		homeTeam4 = new JTextField();
		homeTeam4.setEditable(false);
		homeTeam4.setBounds(25, 387, 252, 24);
		contentPane.add(homeTeam4);

		homeTeam5 = new JTextField();
		homeTeam5.setEditable(false);
		homeTeam5.setBounds(25, 351, 252, 24);
		contentPane.add(homeTeam5);

		homeTeam6 = new JTextField();
		homeTeam6.setEditable(false);
		homeTeam6.setBounds(25, 316, 252, 24);
		contentPane.add(homeTeam6);

		homeTeam7 = new JTextField();
		homeTeam7.setEditable(false);
		homeTeam7.setBounds(25, 279, 252, 24);
		contentPane.add(homeTeam7);

		homeTeam8 = new JTextField();
		homeTeam8.setEditable(false);
		homeTeam8.setBounds(25, 239, 252, 24);
		contentPane.add(homeTeam8);

		awayTeam1 = new JTextField();
		awayTeam1.setEditable(false);
		awayTeam1.setBounds(483, 129, 252, 24);
		contentPane.add(awayTeam1);

		awayTeam2 = new JTextField();
		awayTeam2.setEditable(false);
		awayTeam2.setBounds(483, 166, 252, 24);
		contentPane.add(awayTeam2);

		awayTeam3 = new JTextField();
		awayTeam3.setEditable(false);
		awayTeam3.setBounds(483, 203, 252, 24);
		contentPane.add(awayTeam3);

		awayTeam4 = new JTextField();
		awayTeam4.setEditable(false);
		awayTeam4.setBounds(483, 241, 252, 24);
		contentPane.add(awayTeam4);

		awayTeam5 = new JTextField();
		awayTeam5.setEditable(false);
		awayTeam5.setBounds(483, 280, 252, 24);
		contentPane.add(awayTeam5);

		awayTeam6 = new JTextField();
		awayTeam6.setEditable(false);
		awayTeam6.setBounds(483, 315, 252, 24);
		contentPane.add(awayTeam6);

		awayTeam7 = new JTextField();
		awayTeam7.setEditable(false);
		awayTeam7.setBounds(483, 352, 252, 24);
		contentPane.add(awayTeam7);

		awayTeam8 = new JTextField();
		awayTeam8.setEditable(false);
		awayTeam8.setBounds(483, 387, 252, 24);
		contentPane.add(awayTeam8);

		List<JTextField> fields = new ArrayList<JTextField>();

		fields.add(homeTeam1);
		fields.add(awayTeam1);

		fields.add(homeTeam2);
		fields.add(awayTeam2);

		fields.add(homeTeam3);
		fields.add(awayTeam3);

		fields.add(homeTeam4);
		fields.add(awayTeam4);

		fields.add(homeTeam5);
		fields.add(awayTeam5);

		fields.add(homeTeam6);
		fields.add(awayTeam6);

		fields.add(homeTeam7);
		fields.add(awayTeam7);

		fields.add(homeTeam8);
		fields.add(awayTeam8);

		List<Integer> fixtures = new ArrayList<Integer>();
		for (int i = 1; i <= 30; i++) {
			fixtures.add(i);
		}

		homeScore1 = new JTextField();
		homeScore1.setBounds(289, 129, 37, 22);
		contentPane.add(homeScore1);
		homeScore1.setColumns(10);

		homeScore2 = new JTextField();
		homeScore2.setColumns(10);
		homeScore2.setBounds(289, 166, 37, 22);
		contentPane.add(homeScore2);

		homeScore3 = new JTextField();
		homeScore3.setColumns(10);
		homeScore3.setBounds(289, 203, 37, 22);
		contentPane.add(homeScore3);

		homeScore4 = new JTextField();
		homeScore4.setColumns(10);
		homeScore4.setBounds(289, 240, 37, 22);
		contentPane.add(homeScore4);

		homeScore5 = new JTextField();
		homeScore5.setColumns(10);
		homeScore5.setBounds(289, 280, 37, 22);
		contentPane.add(homeScore5);

		homeScore6 = new JTextField();
		homeScore6.setColumns(10);
		homeScore6.setBounds(289, 317, 37, 22);
		contentPane.add(homeScore6);

		homeScore7 = new JTextField();
		homeScore7.setColumns(10);
		homeScore7.setBounds(289, 352, 37, 22);
		contentPane.add(homeScore7);

		homeScore8 = new JTextField();
		homeScore8.setColumns(10);
		homeScore8.setBounds(289, 388, 37, 22);
		contentPane.add(homeScore8);

		awayScore1 = new JTextField();
		awayScore1.setColumns(10);
		awayScore1.setBounds(434, 129, 37, 22);
		contentPane.add(awayScore1);

		awayScore2 = new JTextField();
		awayScore2.setColumns(10);
		awayScore2.setBounds(434, 166, 37, 22);
		contentPane.add(awayScore2);

		awayScore3 = new JTextField();
		awayScore3.setColumns(10);
		awayScore3.setBounds(434, 203, 37, 22);
		contentPane.add(awayScore3);

		awayScore4 = new JTextField();
		awayScore4.setColumns(10);
		awayScore4.setBounds(434, 240, 37, 22);
		contentPane.add(awayScore4);

		awayScore5 = new JTextField();
		awayScore5.setColumns(10);
		awayScore5.setBounds(434, 280, 37, 22);
		contentPane.add(awayScore5);

		awayScore6 = new JTextField();
		awayScore6.setColumns(10);
		awayScore6.setBounds(434, 317, 37, 22);
		contentPane.add(awayScore6);

		awayScore7 = new JTextField();
		awayScore7.setColumns(10);
		awayScore7.setBounds(434, 352, 37, 22);
		contentPane.add(awayScore7);

		awayScore8 = new JTextField();
		awayScore8.setColumns(10);
		awayScore8.setBounds(434, 388, 37, 22);
		contentPane.add(awayScore8);

		List<JTextField> scoreFields = new ArrayList<JTextField>();

		scoreFields.add(homeScore1);
		scoreFields.add(awayScore1);

		scoreFields.add(homeScore2);
		scoreFields.add(awayScore2);

		scoreFields.add(homeScore3);
		scoreFields.add(awayScore3);

		scoreFields.add(homeScore4);
		scoreFields.add(awayScore4);

		scoreFields.add(homeScore5);
		scoreFields.add(awayScore5);

		scoreFields.add(homeScore6);
		scoreFields.add(awayScore6);

		scoreFields.add(homeScore7);
		scoreFields.add(awayScore7);

		scoreFields.add(homeScore8);
		scoreFields.add(awayScore8);

		/*
		 * The comboBox allows you to select the fixture number in order to add the
		 * results.
		 */
		JComboBox<Integer> comboBox = new JComboBox<Integer>(new Vector<>(fixtures));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Fixture f : League.getInstance().fixtures) {
					if (f.getFixtureNo() == Integer.parseInt(comboBox.getSelectedItem().toString())) {
						for (int i = 1; i <= 8; i++) {
							fields.get(i * 2 - 2).setText(f.matches.get(i - 1).getHomeTeam().getTeamName());
							fields.get(i * 2 - 1).setText(f.matches.get(i - 1).getAwayTeam().getTeamName());
						}
					}
				}
			}
		});
		comboBox.setBounds(125, 48, 44, 29);
		contentPane.add(comboBox);

		JLabel lblFixtures = new JLabel("Fixture");
		lblFixtures.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFixtures.setBounds(57, 51, 56, 26);
		contentPane.add(lblFixtures);

		JLabel lblResults = new JLabel("RESULTS");
		lblResults.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblResults.setBounds(317, 48, 116, 35);
		contentPane.add(lblResults);

		JLabel lblVs = new JLabel("VS");
		lblVs.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblVs.setBounds(363, 123, 27, 29);
		contentPane.add(lblVs);

		JLabel label = new JLabel("VS");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(363, 158, 27, 29);
		contentPane.add(label);

		JLabel label_1 = new JLabel("VS");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_1.setBounds(363, 195, 27, 29);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("VS");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_2.setBounds(363, 232, 27, 29);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("VS");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_3.setBounds(363, 272, 27, 29);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("VS");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_4.setBounds(363, 309, 27, 29);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("VS");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_5.setBounds(363, 344, 27, 29);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("VS");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_6.setBounds(363, 380, 27, 29);
		contentPane.add(label_6);

		/*
		 * This method saves all the results entered in the text boxes.
		 */
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= 8; i++) {
					Team homeTeam = League.getInstance().fixtures
							.get(Integer.parseInt(comboBox.getSelectedItem().toString())).matches.get(i - 1)
									.getHomeTeam();
					Team awayTeam = League.getInstance().fixtures
							.get(Integer.parseInt(comboBox.getSelectedItem().toString())).matches.get(i - 1)
									.getAwayTeam();
					int homeResult = Integer.parseInt(scoreFields.get(i * 2 - 2).getText().toString());
					int awayResult = Integer.parseInt(scoreFields.get(i * 2 - 1).getText().toString());
					homeTeam.setGoalsFor(homeResult);
					homeTeam.setGoalsAgainst(awayResult);
					awayTeam.setGoalsFor(awayResult);
					awayTeam.setGoalsAgainst(homeResult);
					League.getInstance().fixtures.get(Integer.parseInt(comboBox.getSelectedItem().toString())).matches
							.get(i - 1).setHomeScore(homeResult);
					League.getInstance().fixtures.get(Integer.parseInt(comboBox.getSelectedItem().toString())).matches
							.get(i - 1).setAwayScore(homeResult);

					if (homeResult > awayResult) {
						homeTeam.setWins(homeTeam.getWins() + 1);
						awayTeam.setLoses(awayTeam.getLoses() + 1);

					}

					else if (awayResult > homeResult) {
						homeTeam.setLoses(homeTeam.getLoses() + 1);
						awayTeam.setWins(awayTeam.getWins() + 1);
					} else {
						homeTeam.setDraws(homeTeam.getDraws() + 1);
						awayTeam.setDraws(awayTeam.getDraws() + 1);
					}
					SQLiteDatabase.updateTeam(homeTeam.getTeamName(), homeTeam.getWins(), homeTeam.getDraws(),
							homeTeam.getLoses(), homeTeam.getGoalsFor(), homeTeam.getGoalsAgainst(),
							homeTeam.getMatchesPlayed());

					SQLiteDatabase.updateTeam(awayTeam.getTeamName(), awayTeam.getWins(), awayTeam.getDraws(),
							awayTeam.getLoses(), awayTeam.getGoalsFor(), awayTeam.getGoalsAgainst(),
							awayTeam.getMatchesPlayed());
				}

				for (Fixture f : League.getInstance().fixtures) {
					if (f.getFixtureNo() == Integer.parseInt(comboBox.getSelectedItem().toString())) {

						for (int i = 1; i <= 8; i++) {

							f.matches.get(i - 1).setHomeScore(Integer.parseInt(scoreFields.get(i * 2 - 2).getText()));
							f.matches.get(i - 1).setAwayScore(Integer.parseInt(scoreFields.get(i * 2 - 1).getText()));

							SQLiteDatabase.updateScores(f.matches.get(i - 1).getHomeTeam().getTeamName(),
									f.matches.get(i - 1).getAwayTeam().getTeamName(),
									Integer.parseInt(scoreFields.get(i * 2 - 2).getText()),
									Integer.parseInt(scoreFields.get(i * 2 - 1).getText()));

						}

					}

				}

				AdminViewUI back = new AdminViewUI();
				back.setVisible(true);
				dispose();
			}

		});
		btnSave.setBounds(409, 440, 97, 25);
		contentPane.add(btnSave);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminViewUI back = new AdminViewUI();
				back.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(255, 440, 97, 25);
		contentPane.add(btnBack);
	}
}
