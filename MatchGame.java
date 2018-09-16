import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;


public class MatchGame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchGame window = new MatchGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MatchGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Matching Game");
		frame.setBounds(100, 100, 650, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnEasy = new JRadioButton("Easy");
		rdbtnEasy.setBounds(22, 41, 109, 28);
		frame.getContentPane().add(rdbtnEasy);
		
		JRadioButton rdbtnDifficulty = new JRadioButton("Medium");
		rdbtnDifficulty.setBounds(22, 72, 109, 23);
		frame.getContentPane().add(rdbtnDifficulty);
		
		JLabel lblDifficulty = new JLabel("Difficulty");
		lblDifficulty.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDifficulty.setBounds(22, 11, 87, 23);
		frame.getContentPane().add(lblDifficulty);
		
		JRadioButton rdbtnHard = new JRadioButton("Hard");
		rdbtnHard.setBounds(22, 98, 109, 23);
		frame.getContentPane().add(rdbtnHard);
	}
}
