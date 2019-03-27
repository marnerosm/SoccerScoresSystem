import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI window = new LoginUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void run() {
		try {
			LoginUI window = new LoginUI();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public LoginUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 703, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextPane txtpnSoccerScoresSystem = new JTextPane();
		txtpnSoccerScoresSystem.setEditable(false);
		txtpnSoccerScoresSystem.setBackground(SystemColor.text);
		txtpnSoccerScoresSystem.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		txtpnSoccerScoresSystem.setText("SOCCER SCORES SYSTEM");
		txtpnSoccerScoresSystem.setBounds(143, 13, 425, 50);
		frame.getContentPane().add(txtpnSoccerScoresSystem);

		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setEditable(false);
		txtpnUsername.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		txtpnUsername.setText("Username");
		txtpnUsername.setBounds(157, 133, 115, 31);
		frame.getContentPane().add(txtpnUsername);

		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setEditable(false);
		txtpnPassword.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		txtpnPassword.setText("Password:");
		txtpnPassword.setBounds(157, 190, 115, 28);
		frame.getContentPane().add(txtpnPassword);

		usernameField = new JTextField();
		usernameField.setBounds(341, 142, 116, 22);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = usernameField.getText();
				String password = passwordField.getPassword().toString();
				if (username.equals("admin") || password.equals("admin")) {
					JOptionPane.showMessageDialog(frame, "Successful Login");

					/**
					 * Move to AdminViewUI
					 */
					AdminViewUI adminView = new AdminViewUI();
					adminView.setVisible(true);

					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid Username or Password!");
				}
			}
		});
		btnLogin.setBounds(184, 320, 104, 28);
		frame.getContentPane().add(btnLogin);

		JButton btnContinueAsGuest = new JButton("Continue as Guest");
		btnContinueAsGuest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewMenuUI viewmenu = new ViewMenuUI();
				viewmenu.setVisible(true);
				frame.dispose();
			}
		});
		btnContinueAsGuest.setBounds(365, 319, 145, 31);
		frame.getContentPane().add(btnContinueAsGuest);

		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(341, 196, 115, 22);
		frame.getContentPane().add(passwordField);

		if (!SQLiteDatabase.checkDB()) {
			SQLiteDatabase.createTable();
		}
	}
}
