import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class MatchesUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
					MatchesUI frame = new MatchesUI();
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
	public MatchesUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblVs = new JLabel("VS");
		lblVs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVs.setBounds(397, 153, 33, 40);
		contentPane.add(lblVs);

		JLabel label = new JLabel("VS");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(397, 340, 33, 40);
		contentPane.add(label);

		JLabel label_1 = new JLabel("VS");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(397, 263, 33, 40);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("VS");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(397, 194, 33, 40);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("VS");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(397, 229, 33, 40);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("VS");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(397, 304, 33, 40);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("VS");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBounds(397, 78, 33, 40);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("VS");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setBounds(397, 119, 33, 40);
		contentPane.add(label_6);

		homeTeam1 = new JTextField();
		homeTeam1.setEditable(false);
		homeTeam1.setBounds(133, 94, 252, 24);
		contentPane.add(homeTeam1);

		homeTeam2 = new JTextField();
		homeTeam2.setEditable(false);
		homeTeam2.setBounds(133, 131, 252, 24);
		contentPane.add(homeTeam2);

		homeTeam3 = new JTextField();
		homeTeam3.setEditable(false);
		homeTeam3.setBounds(133, 168, 252, 24);
		contentPane.add(homeTeam3);

		homeTeam4 = new JTextField();
		homeTeam4.setEditable(false);
		homeTeam4.setBounds(133, 353, 252, 24);
		contentPane.add(homeTeam4);

		homeTeam5 = new JTextField();
		homeTeam5.setEditable(false);
		homeTeam5.setBounds(133, 317, 252, 24);
		contentPane.add(homeTeam5);

		homeTeam6 = new JTextField();
		homeTeam6.setEditable(false);
		homeTeam6.setBounds(133, 282, 252, 24);
		contentPane.add(homeTeam6);

		homeTeam7 = new JTextField();
		homeTeam7.setEditable(false);
		homeTeam7.setBounds(133, 245, 252, 24);
		contentPane.add(homeTeam7);

		homeTeam8 = new JTextField();
		homeTeam8.setEditable(false);
		homeTeam8.setBounds(133, 205, 252, 24);
		contentPane.add(homeTeam8);

		awayTeam1 = new JTextField();
		awayTeam1.setEditable(false);
		awayTeam1.setBounds(430, 94, 252, 24);
		contentPane.add(awayTeam1);

		awayTeam2 = new JTextField();
		awayTeam2.setEditable(false);
		awayTeam2.setBounds(430, 131, 252, 24);
		contentPane.add(awayTeam2);

		awayTeam3 = new JTextField();
		awayTeam3.setEditable(false);
		awayTeam3.setBounds(430, 168, 252, 24);
		contentPane.add(awayTeam3);

		awayTeam4 = new JTextField();
		awayTeam4.setEditable(false);
		awayTeam4.setBounds(430, 206, 252, 24);
		contentPane.add(awayTeam4);

		awayTeam5 = new JTextField();
		awayTeam5.setEditable(false);
		awayTeam5.setBounds(430, 245, 252, 24);
		contentPane.add(awayTeam5);

		awayTeam6 = new JTextField();
		awayTeam6.setEditable(false);
		awayTeam6.setBounds(430, 280, 252, 24);
		contentPane.add(awayTeam6);

		awayTeam7 = new JTextField();
		awayTeam7.setEditable(false);
		awayTeam7.setBounds(430, 317, 252, 24);
		contentPane.add(awayTeam7);

		awayTeam8 = new JTextField();
		awayTeam8.setEditable(false);
		awayTeam8.setBounds(430, 352, 252, 24);
		contentPane.add(awayTeam8);

		List<Integer> fixtures = new ArrayList<Integer>();
		for (int i = 1; i <= 30; i++) {
			fixtures.add(i);
		}

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

		/*
		 * This comboBox allows you to select the fixture to view the matches of the
		 * specified fixtures.
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

		comboBox.setBounds(129, 29, 44, 30);
		contentPane.add(comboBox);

		Label label_7 = new Label("Fixture:");
		label_7.setFont(new Font("Dialog", Font.PLAIN, 24));
		label_7.setBounds(33, 29, 90, 24);
		contentPane.add(label_7);

		Label label_8 = new Label("Matches");
		label_8.setFont(new Font("Dialog", Font.PLAIN, 34));
		label_8.setBounds(352, 29, 141, 40);
		contentPane.add(label_8);

		/*
		 * This button moves back to the ViewMenu UI.
		 */
		Button button = new Button("BACK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewMenuUI back = new ViewMenuUI();
				back.setVisible(true);
				dispose();
			}
		});
		button.setBounds(369, 409, 79, 24);
		contentPane.add(button);

	}
}
