import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewMenuUI extends JFrame {

	/**
	 * 
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
	public ViewMenuUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("View League Standings");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeagueStandingsUI table = new LeagueStandingsUI();
				if (League.getInstance().teams.size() == 0) {
					JOptionPane.showMessageDialog(contentPane, "A league does not exist!");
					table.setVisible(false);
				}
				table.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(117, 112, 180, 55);
		contentPane.add(btnNewButton);

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

		JButton btnNewButton_2 = new JButton("View Team Stats");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeamStatsUI stats = new TeamStatsUI();
				stats.setVisible(true);
				dispose();

			}
		});
		btnNewButton_2.setBounds(293, 270, 180, 47);
		contentPane.add(btnNewButton_2);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginUI exitToLogin = new LoginUI();
				exitToLogin.run();
				dispose();

			}
		});
		btnExit.setBounds(338, 417, 97, 25);
		contentPane.add(btnExit);
	}

}
