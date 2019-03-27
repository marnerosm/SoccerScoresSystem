import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminViewUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public void run() {
		try {
			AdminViewUI frame = new AdminViewUI();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public AdminViewUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtpnSoccerScoresSystem = new JTextPane();
		txtpnSoccerScoresSystem.setFont(new Font("Cooper Black", Font.PLAIN, 32));
		txtpnSoccerScoresSystem.setText("Soccer Scores System");
		txtpnSoccerScoresSystem.setBounds(144, 13, 369, 46);
		contentPane.add(txtpnSoccerScoresSystem);

		/*
		 * A button that moves to the Create League User Interface
		 */
		JButton btnCreateLeague = new JButton("Create League");
		btnCreateLeague.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				CreateLeagueUI leaguecreator = new CreateLeagueUI();
				leaguecreator.setVisible(true);
				dispose();

			}
		});
		btnCreateLeague.setBounds(106, 118, 137, 38);
		contentPane.add(btnCreateLeague);

		/*
		 * A button that deletes the current League
		 **/
		JButton btnDiscardLeague = new JButton("Discard League");
		btnDiscardLeague.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SQLiteDatabase.deleteDb();
				League.getInstance().fixtures.clear();
				League.getInstance().teams.clear();
				JOptionPane.showMessageDialog(contentPane, "League was deleted successfully!");
			}
		});
		btnDiscardLeague.setForeground(Color.WHITE);
		btnDiscardLeague.setBackground(Color.RED);
		btnDiscardLeague.setBounds(392, 118, 137, 38);
		contentPane.add(btnDiscardLeague);

		/*
		 * A button that moves the user to the View Menu
		 **/
		JButton btnGoToView = new JButton("Go to View Menu");
		btnGoToView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				AdminViewMenuUI viewmenu = new AdminViewMenuUI();
				viewmenu.setVisible(true);
				dispose();
			}
		});
		btnGoToView.setBounds(392, 250, 137, 46);
		contentPane.add(btnGoToView);

		/*
		 * A button that moves back to the Login User Interface
		 **/
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginUI login = new LoginUI();
				login.run();
				dispose();
			}
		});
		btnBack.setBounds(12, 430, 97, 25);
		contentPane.add(btnBack);

		/*
		 * A button that moves to the LeagueFillUI
		 **/
		JButton btnFillResults = new JButton("Fill Results");
		btnFillResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LeagueFillUI results = new LeagueFillUI();
				results.setVisible(true);
				dispose();
			}
		});
		btnFillResults.setBounds(106, 250, 137, 46);
		contentPane.add(btnFillResults);
	}
}
