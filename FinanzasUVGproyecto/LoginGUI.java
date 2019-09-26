import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginGUI {


	private JFrame frame;
	private JTextField txtlUsuario;
	private JTextField txtlContrasena;
	private JButton btnEntrar;
	private JButton btnRegistrarse;
	private JPanel Login;
	private JPanel Register;
	private JLabel lblRegistrarse;
	private JLabel lblNewLabel_1;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblContrasea_1;
	private JTextField txtrUsuario;
	private JTextField txtrNombre;
	private JTextField txtrApellido;
	private JTextField txtrContrasena;
	private JButton btnRegistrarse1;
	private JButton btnRegresar;
	
	Metodos metodo = new Metodos();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
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
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MiListener oyente = new MiListener();
		
		frame = new JFrame();
		frame.setBounds(450, 200, 607, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		Register = new JPanel();
		Register.setVisible(false);
		
		Login = new JPanel();
		Login.setVisible(true);
		Login.setBackground(Color.BLUE);
		frame.getContentPane().add(Login, "name_156854598277775");
		Login.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(84, 58, 432, 241);
		Login.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Damascus", Font.PLAIN, 18));
		lblNewLabel.setBounds(183, 18, 53, 31);
		panel.add(lblNewLabel);
		
		txtlUsuario = new JTextField();
		txtlUsuario.setBounds(131, 76, 159, 26);
		panel.add(txtlUsuario);
		txtlUsuario.setColumns(10);
		
		txtlContrasena = new JTextField();
		txtlContrasena.setColumns(10);
		txtlContrasena.setBounds(131, 126, 159, 26);
		panel.add(txtlContrasena);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(58, 81, 67, 16);
		panel.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrasena:");
		lblContrasea.setBounds(36, 131, 83, 16);
		panel.add(lblContrasea);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(oyente);
		btnEntrar.setBounds(86, 182, 117, 29);
		panel.add(btnEntrar);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(oyente);
		btnRegistrarse.setBounds(227, 182, 117, 29);
		panel.add(btnRegistrarse);
		frame.getContentPane().add(Register, "name_156823637418067");
		Register.setLayout(null);
		
		lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 20));
		lblRegistrarse.setBounds(143, 21, 145, 24);
		Register.add(lblRegistrarse);
		
		lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(82, 101, 61, 16);
		Register.add(lblNewLabel_1);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(82, 144, 61, 16);
		Register.add(lblNombre);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(82, 192, 61, 16);
		Register.add(lblApellido);
		
		lblContrasea_1 = new JLabel("Contrasena:");
		lblContrasea_1.setBounds(67, 239, 83, 16);
		Register.add(lblContrasea_1);
		
		txtrUsuario = new JTextField();
		txtrUsuario.setBounds(155, 96, 190, 26);
		Register.add(txtrUsuario);
		txtrUsuario.setColumns(10);
		
		txtrNombre = new JTextField();
		txtrNombre.setColumns(10);
		txtrNombre.setBounds(155, 139, 190, 26);
		Register.add(txtrNombre);
		
		txtrApellido = new JTextField();
		txtrApellido.setColumns(10);
		txtrApellido.setBounds(155, 187, 190, 26);
		Register.add(txtrApellido);
		
		txtrContrasena = new JTextField();
		txtrContrasena.setColumns(10);
		txtrContrasena.setBounds(155, 234, 190, 26);
		Register.add(txtrContrasena);
		
		btnRegistrarse1 = new JButton("Registrarse");
		btnRegistrarse1.addActionListener(oyente);
		btnRegistrarse1.setBounds(67, 299, 117, 29);
		Register.add(btnRegistrarse1);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(oyente);
		btnRegresar.setBounds(208, 299, 117, 29);
		Register.add(btnRegresar);
	}
	
	
	
	private class MiListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource() == btnEntrar) {
				
			boolean verificado = metodo.verificarUsuario(txtlUsuario.getText(), txtlContrasena.getText());
			
			if (verificado == true) {
				System.out.println("bueno");
				
			}else {
				System.out.println("malo");
			}
			}
			
			
			
			/////
			if(e.getSource() == btnRegistrarse) {
				Login.setVisible(false);
				Register.setVisible(true);
				frame.setBounds(500, 200, 388, 386);
			}
			
			if(e.getSource() == btnRegresar) {
				Login.setVisible(true);
				Register.setVisible(false);
				frame.setBounds(450, 200, 607, 386);
				}
			
			if(e.getSource() == btnRegistrarse1) {
				metodo.crearUsuario(txtrUsuario.getText(), txtrNombre.getText(), txtrApellido.getText(), txtrContrasena.getText());
				Login.setVisible(true);
				Register.setVisible(false);
				frame.setBounds(450, 200, 607, 386);
			}
		
	}
}
}

