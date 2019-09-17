import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;

import javax.imageio.ImageIO;
import javax.swing.DropMode;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPasswordField;

public class Login {

	JFrame frame;
	static Login window;
	Dashboard dashboard;
	private JTextField txtUsuario;
	private JButton btnIngresar;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JLabel lblCrearCuenta;
	private JLabel lblOlvidoContrasena;
	private JPanel registrar;
	private JTextField txtCorreoReg;
	private JTextField txtNombre;
	private JButton btnRegistrar;
	private JLabel lblIngresar;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JPasswordField txtRegistrarPassword;
	private JPasswordField txtPassword;
	private JLabel lblCheck;
	private TextPrompt oculto_1;
	private JTextField txtApellido;
	ConexionMongoDB DB;
	private TextPrompt oculto_2;
	private JLabel lblAbout;
	private JLabel lblNewLabel;
	private JPanel recuperar;
	private JTextField txtCorreoRecuperacion;
	private TextPrompt oculto_3;
	private JTextField txtVerificarCodigo;
	private JLabel lblIngresarCdigo;
	private JLabel lblIngresarCodigo;
	private JButton btnVerificarCodigo;
	private JButton btnRecuperar;
	private JLabel lblNuevaContrasena;
	private JButton btnCambiarContrasena;
	private TextPrompt oculto_4;
	private TextPrompt oculto_5;
	private JPasswordField txtContrasenaNueva;
	private JPasswordField txtConfirmarContrasenaNueva;
	private JLabel lblUsuarioCreadoExitosamente;
	private JLabel lblBienvenidoAUvg;
	private JPanel ingresar;
	private JLabel lblTituloIngresar;
	
	private BufferedImage loginImage = null;
	private JLabel lblLoginImage;
	private JLabel lblRegistrarImage;
	private JLabel lblTeEnviaremos;
	private JLabel lblPaso1_1;
	private JLabel lblCopieElCodigo;
	private JLabel lblPaso2_3;
	private JLabel lblPaso3_3;
	private TextPrompt oculto_6;
	private JSeparator separator_3;
	private JSeparator SeparatorContrasena;
	private TextPrompt oculto_7;
	private JSeparator SeparatorContrasenaConfirmar;
	private TextPrompt oculto_8;
	private JLabel lblAdvertencia;
	protected String usuarioTemp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		DB = new ConexionMongoDB();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("UVG Finanzas");
		frame.setForeground(Color.BLACK);
		frame.setFont(new Font("Arial", Font.BOLD, 14));
		frame.setSize(900, 600);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(new ImageIcon("src/google.png").getImage());
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		ingresar = new JPanel();
		ingresar.setBackground(Color.WHITE);
		frame.getContentPane().add(ingresar, "name_241578656750058");
		ingresar.setLayout(null);
		
		// LADO DERECHO - AGREGANDO IMAGE
		try {
			loginImage = ImageIO.read(new File("src/login.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image loginImg = loginImage.getScaledInstance(450, 561, Image.SCALE_DEFAULT);
		
		lblLoginImage = new JLabel(new ImageIcon(loginImg));
		lblLoginImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginImage.setBounds(450, 0, 434, 561);
		ingresar.add(lblLoginImage);
		
		txtUsuario = new JTextField(null);
		txtUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtUsuario.setForeground(new Color(51,51,51));
		txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsuario.setBounds(100, 151, 250, 34);
		ingresar.add(txtUsuario);
		txtUsuario.setColumns(10);
		TextPrompt oculto = new TextPrompt("Correo electronico", txtUsuario);
		
		lblBienvenidoAUvg = new JLabel("Bienvenido a UVG Finanzas");
		lblBienvenidoAUvg.setFont(new Font("Arial", Font.BOLD, 20));
		lblBienvenidoAUvg.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoAUvg.setBounds(0, 32, 450, 34);
		ingresar.add(lblBienvenidoAUvg);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent m) {
				
				boolean verificado = false;
					
				if (txtUsuario.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Tiene una casilla vacia");
					txtUsuario.setText(null);
				}else if (txtPassword.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Tiene una casilla vacia");
					txtPassword.setText(null);
				}else {
					
					verificado = DB.verificarUsuario(txtUsuario.getText(), txtPassword.getText());
					
					if (verificado == true) {
						frame.dispose();
						dashboard = new Dashboard();
						DB.tempUsu(txtUsuario.getText());
						dashboard.main(null);
						
						
					}
					
					if (verificado == false){
						JOptionPane.showMessageDialog(null, "¡Usuario Incorrecto!");
					}
					
					txtUsuario.setText(null);
					txtPassword.setText(null);
					
				}
						
			}
		});
		btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setBorder(null);
		btnIngresar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnIngresar.setBackground(new Color(93,143,252));
		btnIngresar.setBounds(100, 314, 154, 34);
		ingresar.add(btnIngresar);
		
		lblTituloIngresar = new JLabel("Ingresar");
		lblTituloIngresar.setBackground(new Color(0, 51, 51));
		lblTituloIngresar.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloIngresar.setFont(new Font("Arial", Font.BOLD, 18));
		lblTituloIngresar.setBounds(100, 88, 200, 34);
		ingresar.add(lblTituloIngresar);
		
		lblOlvidoContrasena = new JLabel("\u00BFOlvid\u00F3 contrase\u00F1a?");
		lblOlvidoContrasena.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent m) {
				ingresar.setVisible(false);
				recuperar.setVisible(true);
			}
		});
		
		lblOlvidoContrasena.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblOlvidoContrasena.setForeground(new Color(0, 0, 51));
		lblOlvidoContrasena.setFont(new Font("Arial", Font.PLAIN, 13));
		lblOlvidoContrasena.setBounds(275, 323, 140, 21);
		ingresar.add(lblOlvidoContrasena);
		
		JLabel lblAunNoTiene = new JLabel("\u00BFA\u00FAn no tienes una cuenta?");
		lblAunNoTiene.setForeground(new Color(0, 0, 51));
		lblAunNoTiene.setFont(new Font("Arial", Font.PLAIN, 13));
		lblAunNoTiene.setBounds(100, 497, 164, 21);
		ingresar.add(lblAunNoTiene);
		
		lblCrearCuenta = new JLabel("Crear cuenta");
		lblCrearCuenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent m) {
				ingresar.setVisible(false);
				registrar.setVisible(true);
			}
		});
		lblCrearCuenta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCrearCuenta.setForeground(new Color(0, 153, 255));
		lblCrearCuenta.setFont(new Font("Arial", Font.BOLD, 13));
		lblCrearCuenta.setBounds(270, 497, 98, 21);
		ingresar.add(lblCrearCuenta);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(85,85,85));
		separator_1.setBackground(new Color(85,85,85));
		separator_1.setBounds(100, 185, 250, 1);
		ingresar.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(85,85,85));
		separator_2.setBackground(new Color(85,85,85));
		separator_2.setBounds(100, 241, 250, 1);
		ingresar.add(separator_2);
		
		txtPassword = new JPasswordField(null);
		txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtPassword.setForeground(new Color(51,51,51));
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setBounds(100, 207, 250, 34);
		ingresar.add(txtPassword);
		oculto_1 = new TextPrompt("Contraseña", txtPassword);
		
		lblAbout = new JLabel("About");
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent m) {
				JOptionPane.showMessageDialog(null, "Creadores:\n- Francisco Andrei Portales Okrassa 19825\n- Edman Trinidad Cota Silvestre 19830\n"
						+ "- Javier Andres Barrios Rios 19774\n- Rafael Eduardo Francois Dubois Pappa 19093\n- Oscar Leonel Godoy Godoy 19183\n\n Version: 1.0");

			}
		});
		lblAbout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAbout.setForeground(Color.GREEN);
		lblAbout.setFont(new Font("Arial", Font.BOLD, 13));
		lblAbout.setBounds(211, 529, 43, 14);
		ingresar.add(lblAbout);
		
		lblUsuarioCreadoExitosamente = new JLabel("");
		lblUsuarioCreadoExitosamente.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuarioCreadoExitosamente.setForeground(new Color(0, 204, 51));
		lblUsuarioCreadoExitosamente.setFont(new Font("Arial", Font.PLAIN, 15));
		lblUsuarioCreadoExitosamente.setBounds(0, 9, 450, 26);
		ingresar.add(lblUsuarioCreadoExitosamente);
		
		
		
		
		
		oculto_1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		
		registrar = new JPanel();
		registrar.setBackground(Color.WHITE);
		frame.getContentPane().add(registrar, "name_241584205813524");
		registrar.setLayout(null);
		
		JLabel label = new JLabel("Bienvenido a UVG Finanzas");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setBounds(0, 32, 450, 34);
		registrar.add(label);
		
		txtCorreoReg = new JTextField();
		txtCorreoReg.setForeground(new Color(119,119,119));
		txtCorreoReg.setForeground(new Color(51,51,51));
		txtCorreoReg.setFont(new Font("Arial", Font.PLAIN, 14));
		txtCorreoReg.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtCorreoReg.setBounds(100, 150, 250, 34);
		registrar.add(txtCorreoReg);
		txtCorreoReg.setColumns(10);
		oculto = new TextPrompt("Correo electronico", txtCorreoReg);
		
		JLabel lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegistrarse.setFont(new Font("Arial", Font.BOLD, 18));
		lblRegistrarse.setBackground(new Color(0, 51, 51));
		lblRegistrarse.setBounds(100, 88, 200, 34);
		registrar.add(lblRegistrarse);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(new Color(119,119,119));
		txtNombre.setForeground(new Color(51,51,51));
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtNombre.setColumns(10);
		txtNombre.setBounds(100, 207, 250, 34);
		registrar.add(txtNombre);
		oculto = new TextPrompt("Nombre", txtNombre);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtCorreoReg.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Falta llenar casillas");
				}else if (txtNombre.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Falta llenar casillas");
				}else if (txtApellido.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Falta llenar casillas");
				}else if (txtRegistrarPassword.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Falta llenar casillas");
				}else {
						
				String respuesta = DB.crearUsuario(txtCorreoReg.getText(), txtRegistrarPassword.getText(),txtNombre.getText(), txtApellido.getText() );
				
				
				if (respuesta.equals("completado")) {
					lblUsuarioCreadoExitosamente.setText("\u00A1Usuario creado exitosamente! Ingresar abajo.");
					txtCorreoReg.setText(null);
					txtRegistrarPassword.setText(null);
					txtNombre.setText(null);
					txtApellido.setText(null);
					registrar.setVisible(false);
					ingresar.setVisible(true);
					lblAdvertencia.setVisible(false);
					
					
				}
				
				if (respuesta.equals("novalido")) {
					JOptionPane.showMessageDialog(null, "El correo que ingreso no es valido");
					txtCorreoReg.setText(null);
				}
				
				if (respuesta.equals("existe")) {
					JOptionPane.showMessageDialog(null, "El correo que ingreso ya esta en uso");
					txtCorreoReg.setText(null);
				}
				
				if (respuesta.equals("contrasenaCorta")) {
					txtRegistrarPassword.setText(null);
					lblAdvertencia.setVisible(true);
				}
				
				
				
				}
				
			}
		});
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnRegistrar.setBorder(null);
		btnRegistrar.setBackground(new Color(93, 143, 252));
		btnRegistrar.setBounds(100, 383, 154, 34);
		registrar.add(btnRegistrar);
		
		JLabel lblyaTienesUna = new JLabel("\u00BFYa  tienes una cuenta?");
		lblyaTienesUna.setForeground(new Color(0, 0, 51));
		lblyaTienesUna.setFont(new Font("Arial", Font.PLAIN, 13));
		lblyaTienesUna.setBounds(90, 497, 154, 21);
		registrar.add(lblyaTienesUna);
		
		lblIngresar = new JLabel("Ingresar");
		lblIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCorreoReg.setText(null);
				txtNombre.setText(null);
				txtApellido.setText(null);
				txtRegistrarPassword.setText(null);
				registrar.setVisible(false);
				ingresar.setVisible(true);
				lblAdvertencia.setVisible(false);
			}
		});
		lblIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIngresar.setForeground(new Color(0, 153, 255));
		lblIngresar.setFont(new Font("Arial", Font.BOLD, 13));
		lblIngresar.setBounds(238, 497, 98, 21);
		registrar.add(lblIngresar);
		
		separator_4 = new JSeparator();
		separator_4.setForeground(new Color(85, 85, 85));
		separator_4.setBackground(new Color(85, 85, 85));
		separator_4.setBounds(100, 185, 250, 1);
		registrar.add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setForeground(new Color(85, 85, 85));
		separator_5.setBackground(new Color(85, 85, 85));
		separator_5.setBounds(100, 241, 250, 1);
		registrar.add(separator_5);
		
		separator_6 = new JSeparator();
		separator_6.setForeground(new Color(85, 85, 85));
		separator_6.setBackground(new Color(85, 85, 85));
		separator_6.setBounds(100, 297, 250, 1);
		registrar.add(separator_6);
		
		separator_7 = new JSeparator();
		separator_7.setForeground(new Color(85, 85, 85));
		separator_7.setBackground(new Color(85, 85, 85));
		separator_7.setBounds(100, 353, 250, 1);
		registrar.add(separator_7);
		
		txtRegistrarPassword = new JPasswordField("");
		txtRegistrarPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtRegistrarPassword.setForeground(new Color(51,51,51));
		txtRegistrarPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtRegistrarPassword.setBounds(100, 319, 250, 34);
		registrar.add(txtRegistrarPassword);
		oculto_2 = new TextPrompt("Contraseña", txtRegistrarPassword);
		oculto_2.setFont(new Font("Arial", Font.PLAIN, 15));
		
		txtApellido = new JTextField();
		txtApellido.setForeground(new Color(119,119,119));
		txtApellido.setForeground(new Color(51,51,51));
		txtApellido.setFont(new Font("Arial", Font.PLAIN, 14));
		txtApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtApellido.setColumns(10);
		txtApellido.setBounds(100, 263, 250, 34);
		registrar.add(txtApellido);
		oculto = new TextPrompt("Apellido", txtApellido);
		
		lblRegistrarImage = new JLabel(new ImageIcon(loginImg));
		lblRegistrarImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarImage.setBounds(450, 0, 434, 561);
		registrar.add(lblRegistrarImage);
		
		lblAdvertencia = new JLabel("\u00A1La contrase\u00F1a debe tener 8 o mas caracteres!");
		lblAdvertencia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAdvertencia.setForeground(Color.RED);
		lblAdvertencia.setBounds(100, 358, 312, 14);
		registrar.add(lblAdvertencia);
		lblAdvertencia.setVisible(false);
		
		
		recuperar = new JPanel();
		recuperar.setBackground(Color.WHITE);
		frame.getContentPane().add(recuperar, "name_52441745648272");
		recuperar.setLayout(null);
		
		lblNewLabel = new JLabel("Recuperar Contrase\u00F1a");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(339, 11, 263, 46);
		recuperar.add(lblNewLabel);
		
		txtCorreoRecuperacion = new JTextField();
		txtCorreoRecuperacion.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtCorreoRecuperacion.setFont(new Font("Arial", Font.PLAIN, 15));
		txtCorreoRecuperacion.setBounds(330, 150, 263, 33);
		recuperar.add(txtCorreoRecuperacion);
		txtCorreoRecuperacion.setColumns(10);
		oculto_3 = new TextPrompt("Correo", txtCorreoRecuperacion);
		oculto_3.setText("Correo electr\u00F3nico");
		oculto_3.setFont(new Font("Arial", Font.PLAIN, 14));
		
		btnRecuperar = new JButton("Recuperar");
		btnRecuperar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (txtCorreoRecuperacion.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "No ha ingresado ningun correo");
				}else {
					
				boolean respuesta = DB.mandarCorreoRecuperacion(txtCorreoRecuperacion.getText());
				
				if (respuesta == true) {
					JOptionPane.showMessageDialog(null,"Se envio el correo exitosamente.");
					separator_3.setVisible(true);
					btnVerificarCodigo.setVisible(true);
					lblIngresarCodigo.setVisible(true);
					txtVerificarCodigo.setVisible(true);
					txtCorreoRecuperacion.setEnabled(false);;
					btnRecuperar.setEnabled(false);
					
					
				}else if (respuesta == false) {
					JOptionPane.showMessageDialog(null,"No existe un usuario con ese correo");
				}
				}
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(330, 183, 263, 1);
		recuperar.add(separator);
		btnRecuperar.setBackground(new Color(93,143,252));
		btnRecuperar.setBorder(null);
		btnRecuperar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnRecuperar.setForeground(Color.WHITE);
		btnRecuperar.setBounds(636, 150, 174, 33);
		recuperar.add(btnRecuperar);
		
		txtVerificarCodigo = new JTextField();
		txtVerificarCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtVerificarCodigo.setFont(new Font("Arial", Font.PLAIN, 15));
		txtVerificarCodigo.setBounds(330, 310, 263, 33);
		txtVerificarCodigo.setVisible(false);
		oculto_6 = new TextPrompt("Codigo", txtVerificarCodigo);
		oculto_6.setFont(new Font("Arial", Font.PLAIN, 15));
		oculto_6.setText("C\u00F3digo");
		recuperar.add(txtVerificarCodigo);
		
		txtVerificarCodigo.setColumns(10);
		
		lblIngresarCodigo = new JLabel("Ingresar codigo");
		lblIngresarCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresarCodigo.setFont(new Font("Arial", Font.BOLD, 24));
		lblIngresarCodigo.setBounds(0, 227, 894, 33);
		lblIngresarCodigo.setVisible(false);
		
		separator_3 = new JSeparator();
		separator_3.setVisible(false);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(330, 343, 263, 1);
		recuperar.add(separator_3);
		recuperar.add(lblIngresarCodigo);
		
		btnVerificarCodigo = new JButton("Verificar codigo");
		btnVerificarCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (txtVerificarCodigo.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "No ha ingresado ningun correo");
				}else {
					boolean b = DB.validarCodigo(txtVerificarCodigo.getText(), txtCorreoRecuperacion.getText());
					
					if (b == true) {
						lblPaso3_3.setVisible(true);
						lblNuevaContrasena.setVisible(true);
						txtContrasenaNueva.setVisible(true);
						txtConfirmarContrasenaNueva.setVisible(true);
						btnCambiarContrasena.setVisible(true);
						SeparatorContrasena.setVisible(true);
						SeparatorContrasenaConfirmar.setVisible(true);
						
						lblPaso2_3.setVisible(false);
						lblIngresarCodigo.setVisible(false);
						txtVerificarCodigo.setEnabled(false);
						txtVerificarCodigo.setVisible(false);
						btnVerificarCodigo.setEnabled(false);
						btnVerificarCodigo.setVisible(false);
						
						
						
						
					}else if (b == false) {
						JOptionPane.showMessageDialog(null, "El codigo que ingreso es invalido");
						
					}
					
				}
				
				
				
			}
		});
		btnVerificarCodigo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnVerificarCodigo.setForeground(Color.WHITE);
		btnVerificarCodigo.setBorder(null);
		btnVerificarCodigo.setBackground(new Color(93,143,252));
		btnVerificarCodigo.setBounds(637, 310, 173, 33);
		btnVerificarCodigo.setVisible(false);
		recuperar.add(btnVerificarCodigo);
		
		lblNuevaContrasena = new JLabel("Nueva contrase\u00F1a");
		lblNuevaContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevaContrasena.setFont(new Font("Arial", Font.BOLD, 24));
		lblNuevaContrasena.setBounds(0, 227, 894, 33);
		recuperar.add(lblNuevaContrasena);
		lblNuevaContrasena.setVisible(false);
		
		
		btnCambiarContrasena = new JButton("Cambiar contrase\u00F1a");
		btnCambiarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtContrasenaNueva.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "No ha llenado las dos casillas");
					txtContrasenaNueva.setText(null);
					txtConfirmarContrasenaNueva.setText(null);
				}else if(txtConfirmarContrasenaNueva.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "No ha llenado las dos casillas");
					txtContrasenaNueva.setText(null);
					txtConfirmarContrasenaNueva.setText(null);
				}else {
					
					if(txtContrasenaNueva.getText().equals(txtConfirmarContrasenaNueva.getText())) {
						
						boolean r = DB.cambiarContrasena(txtCorreoRecuperacion.getText(), txtConfirmarContrasenaNueva.getText());
						
						if (r == true) {
							JOptionPane.showMessageDialog(null, "La contraseña se cambio correctamente");
							txtUsuario.setText(txtCorreoRecuperacion.getText());
							ingresar.setVisible(true);
							recuperar.setVisible(false);
							
							btnVerificarCodigo.setVisible(false);
							lblIngresarCodigo.setVisible(false);
							txtVerificarCodigo.setVisible(false);
							txtCorreoRecuperacion.setEnabled(true);
							txtCorreoRecuperacion.setText(null);
							txtVerificarCodigo.setText(null);
							btnRecuperar.setEnabled(true);
							lblNuevaContrasena.setVisible(false);
							txtContrasenaNueva.setVisible(false);
							txtConfirmarContrasenaNueva.setVisible(false);
							txtContrasenaNueva.setText(null);
							txtConfirmarContrasenaNueva.setText(null);
							btnCambiarContrasena.setVisible(false);
							txtVerificarCodigo.setEnabled(true);
							btnVerificarCodigo.setEnabled(true);
							
							
							
						}else if (r == false) {
							JOptionPane.showMessageDialog(null, "No se logro cambiar la contraseña\nIntente hacer el proceso de nuevo");
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
						txtContrasenaNueva.setText(null);
						txtConfirmarContrasenaNueva.setText(null);
					}
					
				}
			}
		});
		btnCambiarContrasena.setForeground(Color.WHITE);
		btnCambiarContrasena.setBackground(new Color(93,143,252));
		btnCambiarContrasena.setBorder(null);
		btnCambiarContrasena.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnCambiarContrasena.setBounds(636, 360, 174, 33);
		recuperar.add(btnCambiarContrasena);
		
		txtConfirmarContrasenaNueva = new JPasswordField();
		txtConfirmarContrasenaNueva.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtConfirmarContrasenaNueva.setFont(new Font("Arial", Font.PLAIN, 15));
		txtConfirmarContrasenaNueva.setBounds(330, 360, 263, 33);
		recuperar.add(txtConfirmarContrasenaNueva);
		oculto_8 = new TextPrompt("Confirmar contraseña", txtConfirmarContrasenaNueva);
		oculto_8.setFont(new Font("Arial", Font.PLAIN, 15));
		txtConfirmarContrasenaNueva.setVisible(false);
		
		txtContrasenaNueva = new JPasswordField();
		txtContrasenaNueva.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtContrasenaNueva.setFont(new Font("Arial", Font.PLAIN, 15));
		txtContrasenaNueva.setBounds(330, 310, 263, 33);
		recuperar.add(txtContrasenaNueva);
		oculto_7 = new TextPrompt("Contraseña nueva", txtContrasenaNueva);
		oculto_7.setFont(new Font("Arial", Font.PLAIN, 15));
		txtContrasenaNueva.setVisible(false);
		btnCambiarContrasena.setVisible(false);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingresar.setVisible(true);
				recuperar.setVisible(false);
				
				btnVerificarCodigo.setVisible(false);
				lblIngresarCodigo.setVisible(false);
				txtVerificarCodigo.setVisible(false);
				txtCorreoRecuperacion.setEnabled(true);
				txtCorreoRecuperacion.setText(null);
				txtVerificarCodigo.setText(null);
				btnRecuperar.setEnabled(true);
				lblNuevaContrasena.setVisible(false);
				txtContrasenaNueva.setVisible(false);
				txtConfirmarContrasenaNueva.setVisible(false);
				txtContrasenaNueva.setText(null);
				txtConfirmarContrasenaNueva.setText(null);
				btnCambiarContrasena.setVisible(false);
				txtVerificarCodigo.setEnabled(true);
				btnVerificarCodigo.setEnabled(true);
				
				
				
			}
		});
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBorder(null);
		btnCancelar.setBackground(new Color(255, 51, 102));
		btnCancelar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnCancelar.setBounds(415, 487, 112, 33);
		recuperar.add(btnCancelar);
		
		lblTeEnviaremos = new JLabel("Te enviaremos  un correo con un codigo de verificacion. ");
		lblTeEnviaremos.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTeEnviaremos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeEnviaremos.setBounds(10, 89, 894, 33);
		recuperar.add(lblTeEnviaremos);
		
		lblPaso1_1 = new JLabel("Paso: 1 / 3");
		lblPaso1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblPaso1_1.setBounds(251, 68, 70, 24);
		recuperar.add(lblPaso1_1);
		
		lblCopieElCodigo = new JLabel("Copie el codigo e ingresele en el paso 2");
		lblCopieElCodigo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCopieElCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopieElCodigo.setBounds(10, 108, 894, 30);
		recuperar.add(lblCopieElCodigo);
		
		lblPaso2_3 = new JLabel("Paso: 2 / 3");
		lblPaso2_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblPaso2_3.setBounds(251, 275, 70, 24);
		recuperar.add(lblPaso2_3);
		
		lblPaso3_3 = new JLabel("Paso: 3 / 3");
		lblPaso3_3.setVisible(false);
		lblPaso3_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblPaso3_3.setBounds(251, 275, 70, 24);
		recuperar.add(lblPaso3_3);
		
		SeparatorContrasena = new JSeparator();
		SeparatorContrasena.setVisible(false);
		SeparatorContrasena.setForeground(new Color(0, 0, 0));
		SeparatorContrasena.setBounds(330, 343, 263, 1);
		recuperar.add(SeparatorContrasena);
		
		SeparatorContrasenaConfirmar = new JSeparator();
		SeparatorContrasenaConfirmar.setVisible(false);
		SeparatorContrasenaConfirmar.setForeground(Color.BLACK);
		SeparatorContrasenaConfirmar.setBounds(330, 393, 263, 1);
		recuperar.add(SeparatorContrasenaConfirmar);
		
		
		
		
	}
}
