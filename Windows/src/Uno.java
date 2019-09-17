import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Uno {

	private JFrame frame;
	Login login;
	Dos dos;
	private JLabel lblSidebarHomeIcon;
	private JLabel lblSidebarHome;
	private JLabel test;
	static Uno window;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Uno();
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
	public Uno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setSize(1150, 700);
		frame.setLocationRelativeTo(null);
		frame.setTitle("UVG Finanzas");
		frame.setIconImage(new ImageIcon("src/google.png").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel sidebar = new JPanel();
		sidebar.setBackground(new Color(251,251,251));
		sidebar.setBounds(0, 0, 245, 746);
		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(37, 363, 183, 53);
		sidebar.add(btnNewButton);
		
		JButton btnDos = new JButton("DOS");
		btnDos.setBounds(37, 427, 183, 73);
		sidebar.add(btnDos);
		
		JLabel lblUno = new JLabel("UNO");
		lblUno.setBounds(48, 67, 152, 67);
		sidebar.add(lblUno);
		lblUno.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblSidebarHome = new JLabel("Dashboard");
//		MiListener oyentelblSidebarHome = new MiListener();
		lblSidebarHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				test.setText("HOla mundo");
			}
		});
		lblSidebarHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarHome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHome.setBounds(60, 183, 185, 36);
		sidebar.add(lblSidebarHome);
		
		Icon user = new ImageIcon("src/home.png");
		
		lblSidebarHomeIcon = new JLabel("", user, JLabel.CENTER);
		lblSidebarHomeIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblSidebarHomeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHomeIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHomeIcon.setBounds(35, 183, 25, 36);
		sidebar.add(lblSidebarHomeIcon);
		
		test = new JLabel("");
		test.setFont(new Font("Tahoma", Font.PLAIN, 15));
		test.setBounds(565, 151, 283, 84);
		frame.getContentPane().add(test);
		
		btnDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				dos = new Dos();
				dos.main(null);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Login login = new Login();
				login.main(null);
				
			}
		});
		
	}
	
	private class MiListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource() == lblSidebarHome) {
				test.setText("Hola mundo");
			}
			
		}
		
	}

}





