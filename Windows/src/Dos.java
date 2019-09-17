import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dos {

	private JFrame frame;
	static Dos window;
	Uno uno;
	Login login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Dos();
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
	public Dos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setSize(1280, 740);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				login = new Login();
				login.main(null);
			}
		});
		btnNewButton.setBounds(262, 203, 311, 125);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnUno = new JButton("UNO");
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				uno = new Uno();
				uno.main(null);
			}
		});
		btnUno.setBounds(636, 203, 311, 125);
		frame.getContentPane().add(btnUno);
		
		JLabel lblDos = new JLabel("DOS");
		lblDos.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDos.setBounds(582, 32, 184, 66);
		frame.getContentPane().add(lblDos);
	}

}
