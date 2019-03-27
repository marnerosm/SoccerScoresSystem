import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminViewMenuUI extends JFrame {

	/**
	 * serialVersionID
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenuUI frame = new ViewMenuUI();
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
	public AdminViewMenuUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/**
		 * A Button to move to the League Standings table.
		 **/
		JButton btnNewButton = new JButton("View League Standings");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeagueStandingsUI table = new LeagueStandingsUI();
				table.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(117, 112, 180, 55);
		contentPane.add(btnNewButton);

		/**
		 * A Button to move to the View Fixtures UI.
		 */
		JButton btnNewButton_1 = new JButton("View Fixtures");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatchesUI fixture = new MatchesUI();
				fixture.setVisible(true);
				dispose();

			}
		});
		btnNewButton_1.setBounds(475, 112, 163, 55);
		contentPane.add(btnNewButton_1);

		/*
		 * A button to move to the View Team Stats User Interface
		 */
		JButton btnNewButton_2 = new JButton("View Team Stats");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeamStatsUI stats = new TeamStatsUI();
				stats.setVisible(true);
				dispose();

			}
		});
		btnNewButton_2.setBounds(294, 284, 180, 47);
		contentPane.add(btnNewButton_2);

		/*
		 * A button to Exit the view.
		 */
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		btnExit.setBounds(467, 419, 97, 25);
		contentPane.add(btnExit);

		/*
		 * A button to move back to the Admin Menu
		 */
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminViewUI back = new AdminViewUI();
				back.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(242, 419, 97, 25);
		contentPane.add(btnBack);
	}

}
