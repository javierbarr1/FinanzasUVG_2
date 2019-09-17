import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.border.CompoundBorder;
import javax.swing.JToggleButton;

public class Dashboard extends Login{
	
	
	private JFrame frame;
	Login login;
	Ingresos ingresos;
	static Dashboard window;
	
	private JLabel lblSidebarHome, lblSidebarHomeIcon, lblSidebarIngresos, lblSidebarIngresosIcon, lblSidebarGastos, lblSidebarGastosIcon, 
	lblSidebarPresupuestos, lblSidebarPrespuestosIcon, lblSidebarSalir;
	public JLabel test;
	private JPanel sidebar;
		
	private JPanel btnSidebarHome, btnSidebarIngresos, btnSidebarGastos, btnSidebarPresupuestos, btnSidebarSalir;
	private JLabel lblSidebarSalirIcon;
	private JPanel pSidebarDashboard, pSidebarIngresos, pSidebarGastos, pSidebarPresupuestos, pSidebarSalir;
	private JLabel lblUserImage, lblUsername;
	private BufferedImage userImage = null;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Dashboard();
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
	public Dashboard() {
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
		
		test = new JLabel("");
		test.setHorizontalAlignment(SwingConstants.CENTER);
		test.setFont(new Font("Tahoma", Font.PLAIN, 16));
		test.setBounds(565, 151, 283, 84);
		frame.getContentPane().add(test);
		
		sidebar = new JPanel();
		sidebar.setBackground(new Color(251,251,251));
		sidebar.setBounds(0, 0, 245, 746);
		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		
		
		lblUsername = new JLabel(DB.getNombre(DB.leerUsu()));
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUsername.setToolTipText("");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(0, 131, 245, 30);
		sidebar.add(lblUsername);
		
		
		
		btnSidebarHome = new JPanel();
		btnSidebarHome.setBounds(0, 195, 245, 36);
		sidebar.add(btnSidebarHome);
		btnSidebarHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pSidebarDashboard.setBackground(new Color(0, 153, 204));
				pSidebarGastos.setBackground(new Color(251,251,251));
				pSidebarIngresos.setBackground(new Color(251,251,251));
				pSidebarPresupuestos.setBackground(new Color(251,251,251));
				
				lblSidebarHome.setForeground(new Color(0, 153, 204));
				lblSidebarGastos.setForeground(new Color(0, 0, 0));
				lblSidebarIngresos.setForeground(new Color(0, 0, 0));
				lblSidebarPresupuestos.setForeground(new Color(0, 0, 0));
			}
		});
		btnSidebarHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarHome.setBorder(new CompoundBorder());
		btnSidebarHome.setBackground(Color.CYAN);
		btnSidebarHome.setOpaque(false);
		
		btnSidebarIngresos = new JPanel();
		btnSidebarIngresos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//ingresos = new Ingresos();
				//ingresos.initialize();
				pSidebarIngresos.setBackground(new Color(0, 153, 204));
				pSidebarDashboard.setBackground(new Color(251,251,251));
				pSidebarGastos.setBackground(new Color(251,251,251));
				pSidebarPresupuestos.setBackground(new Color(251,251,251));
				
				lblSidebarIngresos.setForeground(new Color(0, 153, 204));
				lblSidebarHome.setForeground(new Color(0, 0, 0));
				lblSidebarGastos.setForeground(new Color(0, 0, 0));
				lblSidebarPresupuestos.setForeground(new Color(0, 0, 0));
			}
		});
		btnSidebarIngresos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarIngresos.setOpaque(false);
		btnSidebarIngresos.setBorder(new CompoundBorder());
		btnSidebarIngresos.setBackground(Color.CYAN);
		btnSidebarIngresos.setBounds(0, 241, 245, 36);
		sidebar.add(btnSidebarIngresos);
		
		btnSidebarGastos = new JPanel();
		btnSidebarGastos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pSidebarGastos.setBackground(new Color(0, 153, 204));
				pSidebarDashboard.setBackground(new Color(251,251,251));
				pSidebarIngresos.setBackground(new Color(251,251,251));
				pSidebarPresupuestos.setBackground(new Color(251,251,251));
				
				lblSidebarGastos.setForeground(new Color(0, 153, 204));
				lblSidebarHome.setForeground(new Color(0, 0, 0));
				lblSidebarIngresos.setForeground(new Color(0, 0, 0));
				lblSidebarPresupuestos.setForeground(new Color(0, 0, 0));	
			}
		});
		btnSidebarGastos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarGastos.setOpaque(false);
		btnSidebarGastos.setBorder(new CompoundBorder());
		btnSidebarGastos.setBackground(Color.CYAN);
		btnSidebarGastos.setBounds(0, 287, 245, 36);
		sidebar.add(btnSidebarGastos);
		
		btnSidebarPresupuestos = new JPanel();
		btnSidebarPresupuestos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pSidebarPresupuestos.setBackground(new Color(0, 153, 204));
				pSidebarDashboard.setBackground(new Color(251,251,251));
				pSidebarIngresos.setBackground(new Color(251,251,251));
				pSidebarGastos.setBackground(new Color(251,251,251));
				
				lblSidebarPresupuestos.setForeground(new Color(0, 153, 204));
				lblSidebarHome.setForeground(new Color(0, 0, 0));
				lblSidebarIngresos.setForeground(new Color(0, 0, 0));
				lblSidebarGastos.setForeground(new Color(0, 0, 0));
			}
		});
		btnSidebarPresupuestos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarPresupuestos.setOpaque(false);
		btnSidebarPresupuestos.setBorder(new CompoundBorder());
		btnSidebarPresupuestos.setBackground(Color.CYAN);
		btnSidebarPresupuestos.setBounds(0, 338, 245, 36);
		sidebar.add(btnSidebarPresupuestos);
		
		btnSidebarSalir = new JPanel();
		btnSidebarSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Login login = new Login();
				login.main(null);
				
			}
		});
		btnSidebarSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSidebarSalir.setOpaque(false);
		btnSidebarSalir.setBorder(new CompoundBorder());
		btnSidebarSalir.setBackground(Color.CYAN);
		btnSidebarSalir.setBounds(0, 389, 245, 36);
		sidebar.add(btnSidebarSalir);
		
		try {
			userImage = ImageIO.read(new File("src/user.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image userImg = userImage.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		
		lblUserImage = new JLabel(new ImageIcon(userImg) );
		lblUserImage.setBounds(0, 40, 245, 80);
		sidebar.add(lblUserImage);
		lblUserImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblSidebarHome = new JLabel("Dashboard");
		lblSidebarHome.setForeground(new Color(0, 153, 204));
		lblSidebarHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarHome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHome.setBounds(60, 195, 185, 36);
		sidebar.add(lblSidebarHome);
		
		Icon user = new ImageIcon("src/home.png");
		
		lblSidebarHomeIcon = new JLabel("", user, JLabel.CENTER);
		lblSidebarHomeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSidebarHomeIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarHomeIcon.setBounds(30, 195, 25, 36);
		sidebar.add(lblSidebarHomeIcon);
		
		pSidebarDashboard = new JPanel();
		pSidebarDashboard.setBackground(new Color(0, 153, 204));
		pSidebarDashboard.setBounds(0, 195, 5, 36);
		sidebar.add(pSidebarDashboard);
		
		lblSidebarIngresos = new JLabel("Ingresos");
		lblSidebarIngresos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarIngresos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarIngresos.setBounds(60, 241, 185, 36);
		sidebar.add(lblSidebarIngresos);
		
		Icon ingresosIcon = new ImageIcon("src/ingresos.png");
		
		lblSidebarIngresosIcon = new JLabel("", ingresosIcon, JLabel.CENTER);
		lblSidebarIngresosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarIngresosIcon.setBounds(30, 241, 25, 36);
		sidebar.add(lblSidebarIngresosIcon);
		
		
		lblSidebarGastos = new JLabel("Gastos");
		lblSidebarGastos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarGastos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarGastos.setBounds(60, 287, 185, 36);
		sidebar.add(lblSidebarGastos);
		
		Icon gastosIcon = new ImageIcon("src/gastos.png");
		
		lblSidebarGastosIcon = new JLabel("", gastosIcon, JLabel.CENTER);
		lblSidebarGastosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarGastosIcon.setBounds(30, 287, 25, 36);
		sidebar.add(lblSidebarGastosIcon);
		
		lblSidebarPresupuestos = new JLabel("Presupuestos");
		lblSidebarPresupuestos.setHorizontalAlignment(SwingConstants.LEFT);
		lblSidebarPresupuestos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPresupuestos.setBounds(60, 338, 185, 36);
		sidebar.add(lblSidebarPresupuestos);
		
		Icon presupuestosIcon = new ImageIcon("src/presupuestos.png");
		
		lblSidebarPrespuestosIcon = new JLabel("", presupuestosIcon, JLabel.CENTER);
		lblSidebarPrespuestosIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarPrespuestosIcon.setBounds(30, 338, 25, 36);
		sidebar.add(lblSidebarPrespuestosIcon);
		
		lblSidebarSalir = new JLabel("Salir");
		lblSidebarSalir.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarSalir.setBounds(60, 389, 185, 36);
		sidebar.add(lblSidebarSalir);
		
		Icon salirIcon = new ImageIcon("src/exit.png");
		
		lblSidebarSalirIcon = new JLabel("", salirIcon, JLabel.CENTER);
		lblSidebarSalirIcon.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSidebarSalirIcon.setBounds(30, 389, 25, 36);
		sidebar.add(lblSidebarSalirIcon);
		
		pSidebarIngresos = new JPanel();
		pSidebarIngresos.setBackground(new Color(251,251,251));
		pSidebarIngresos.setBounds(0, 241, 5, 36);
		sidebar.add(pSidebarIngresos);
		
		pSidebarGastos = new JPanel();
		pSidebarGastos.setBackground(new Color(251,251,251));
		pSidebarGastos.setBounds(0, 287, 5, 36);
		sidebar.add(pSidebarGastos);
		
		pSidebarPresupuestos = new JPanel();
		pSidebarPresupuestos.setBackground(new Color(251,251,251));
		pSidebarPresupuestos.setBounds(0, 338, 5, 36);
		sidebar.add(pSidebarPresupuestos);
		
		pSidebarSalir = new JPanel();
		pSidebarSalir.setBackground(new Color(251,251,251));
		pSidebarSalir.setBounds(0, 389, 5, 36);
		sidebar.add(pSidebarSalir);
		
		
		
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





