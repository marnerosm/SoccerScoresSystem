import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;

public class CreateLeagueUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldTeam;
	private JTextField textFieldStadium;
	private JTable table;
	private JTextField textFieldCapacity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateLeagueUI frame = new CreateLeagueUI();
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
	public CreateLeagueUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/**
		 * This button calls the generateFixtures method that creates the League.
		 */
		JButton btnCreateLeague = new JButton("Create League");
		btnCreateLeague.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// league.insertTeams();

				League.getInstance().generateFixtures();
				JOptionPane.showMessageDialog(contentPane, "League Created Successfully");
			}
		});
		btnCreateLeague.setBounds(651, 445, 167, 41);
		contentPane.add(btnCreateLeague);

		textFieldTeam = new JTextField();
		textFieldTeam.setBounds(149, 45, 116, 22);
		contentPane.add(textFieldTeam);
		textFieldTeam.setColumns(10);

		JTextPane txtpnTeamName = new JTextPane();
		txtpnTeamName.setEditable(false);
		txtpnTeamName.setText("Team Name");
		txtpnTeamName.setBounds(28, 45, 109, 22);
		contentPane.add(txtpnTeamName);

		JButton btnAdd = new JButton("Add");

		btnAdd.setBounds(309, 59, 109, 45);
		contentPane.add(btnAdd);

		/**
		 * This button moves back to the AdminView Menu.
		 */
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminViewUI admin = new AdminViewUI();
				admin.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(28, 453, 97, 25);
		contentPane.add(btnBack);

		textFieldStadium = new JTextField();
		textFieldStadium.setBounds(149, 69, 116, 25);
		contentPane.add(textFieldStadium);
		textFieldStadium.setColumns(10);

		JTextPane txtpnStadium = new JTextPane();
		txtpnStadium.setEditable(false);
		txtpnStadium.setText("Stadium");
		txtpnStadium.setBounds(28, 72, 109, 22);
		contentPane.add(txtpnStadium);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(28, 137, 254, 293);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Name", "Stadium", "Capacity" }));
		scrollPane.setViewportView(table);

		JTextPane txtpnCapacity = new JTextPane();
		txtpnCapacity.setEditable(false);
		txtpnCapacity.setText("Capacity");
		txtpnCapacity.setBounds(28, 102, 109, 22);
		contentPane.add(txtpnCapacity);

		textFieldCapacity = new JTextField();
		textFieldCapacity.setColumns(10);
		textFieldCapacity.setBounds(149, 102, 116, 22);
		contentPane.add(textFieldCapacity);

		DefaultTableModel tm = (DefaultTableModel) table.getModel();
		/**
		 * This button auto-generates teams to be added in the league.
		 */
		JButton btnAutogenerateteams = new JButton("Auto-Generate Teams");
		btnAutogenerateteams.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAutogenerateteams.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// League.getInstance().autoGenerateTeams();
				League.getInstance().autoGenerateTeams();
				for (int i = 0; i < 16; i++) {

					String teamName = League.getInstance().teams.get(i).getTeamName();
					String stadium = League.getInstance().teams.get(i).getStadium().getStadiumName();
					String capacity = League.getInstance().teams.get(i).getStadium().getCapacity();
					Object[] teamObject = { teamName, stadium, capacity };
					tm.addRow(teamObject);
					SQLiteDatabase.insertInStadium(stadium, capacity);
					SQLiteDatabase.insertInTeam(teamName, 0, 0, 0, 0, 0, 0);
				}
			}
		});
		btnAutogenerateteams.setBounds(294, 132, 169, 45);
		contentPane.add(btnAutogenerateteams);

		/**
		 * This button adds Teams to the JTable and Database.
		 */
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textFieldTeam.getText().isEmpty() || textFieldStadium.getText().isEmpty()
						|| textFieldCapacity.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Enter a valid value in the boxes!!!");
				} else

				{

					Object[] teamObject = { textFieldTeam.getText(), textFieldStadium.getText(),
							textFieldCapacity.getText() };
					Stadium stadium = new Stadium(textFieldStadium.getText(), textFieldCapacity.getText());
					Team team = new Team(textFieldTeam.getText(), 0, 0, 0, 0, 0, 0, 0, stadium);
					League.getInstance().teams.add(team);
					if (tm.getRowCount() == 16) {
						btnAdd.setEnabled(false);
						JOptionPane.showMessageDialog(contentPane, "A league consists of 16 teams!");
					} else {
						League.getInstance().teams.add(team);
						tm.addRow(teamObject);
						SQLiteDatabase.insertInStadium(textFieldStadium.getText(), textFieldCapacity.getText());
						SQLiteDatabase.insertInTeam(textFieldTeam.getText(), 0, 0, 0, 0, 0, 0);

						textFieldTeam.setText("");
						textFieldStadium.setText("");
						textFieldCapacity.setText("");
					}
				}
			}
		});

	}
}
