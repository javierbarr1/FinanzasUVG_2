import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.JSeparator;

import javax.swing.JComboBox;

public class Main {

	private JFrame ventana;
	
	// Main 2 JPanels
	private JPanel sidebar, content;
	
	// SIDEBAR main buttons
	private JButton btnResumen, btnIngresos, btnGastos, btnPresupuestos, btnSalir;
	
	// CONTENT main JPanels
	private JPanel resumen, ingresos, gastos, presupuestos;
	
	// PRESUPUESTOS main JPanel
	private JPanel presupuestoMain, selecPresCateg, presAlimentos, presAuto, presHogar, presEntretenimiento, presSalud;
	private JPanel presEducacion, presFinanzas, presRopa, presRegalos, presViajes;
	
	// PRESUPUESTOS main JButtons
	private JButton btnPresHogar, btnPresAuto, btnPresAlimentos, btnPresEntretenimiento, btnPresSalud;
	private JButton btnPresEducacion, btnPresFinanzas, btnPresRopa, btnPresRegalos, btnPresViajes;
	
	// PRESUPUESTOS JButtons Regresar
	private JButton btnHogarRegresar, btnAlimentosRegresar, btnAutoRegresar, btnEntretenimientoRegresar, btnSaludRegresar, btnEducacionRegresar;
	private JButton btnFinanzasRegresar, btnRopaRegresar, btnRegalosRegresar, btnViajesRegresar, btnSelecCategRegresar;
	
	// PRESUPUESTO JButtons Guardar
	private JButton btnHogarGuardar, btnAlimentosGuardar, btnAutoGuardar, btnEntretenimientoGuardar, btnSaludGuardar, btnEducacionGuardar;
	private JButton btnFinanzasGuardar, btnRopaGuardar, btnRegalosGuardar, btnViajesGuardar;
	
	//HOGAR inside JPanel
	private JPanel panelHogar, panelHogar2, panelHogar3, panelHogar4, panelHogar5, panelHogar6, panelHogar7, panelHogar8, panelHogar9;
	// HOGAR inside JTextField
	private JTextField fieldHogarTotal, fieldHogar2, fieldHogar3, fieldHogar4, fieldHogar5, fieldHogar6, fieldHogar7, fieldHogar8;
	// AUTO inside JTextField
	private JTextField fieldAutoTotal, fieldAuto2, fieldAuto3, fieldAuto4, fieldAuto5, fieldAuto6, fieldAuto7, fieldAuto8;
	
	// ALIMENTOS inside JPanel
	private JPanel panelAlimentos1, panelAlimentos2, panelAlimentos3, panelAlimentos4,panelAlimentos5;
	// ALIMENTOS inside JTextField
	private JTextField fieldAlimentosTotal, fieldAlimentos2, fieldAlimentos3, fieldAlimentos4;
	// ENTRETENIMIENTO inside JTextField
	private JTextField fieldEntretenimientoTotal, fieldEntretenimiento2, fieldEntretenimiento3, fieldEntretenimiento4;
	private JTextField fieldEntretenimiento5, fieldEntretenimiento6, fieldEntretenimiento7, fieldEntretenimiento8;
	// SALUD inside JTextField
	private JTextField fieldSaludTotal, fieldSalud2, fieldSalud3, fieldSalud4, fieldSalud5, fieldSalud6, fieldSalud7, fieldSalud8;
	// EDUCACION inside JTextField
	private JTextField fieldEducacionTotal, fieldEducacion2, fieldEducacion3, fieldEducacion4, fieldEducacion5, fieldEducacion6,
						fieldEducacion7, fieldEducacion8;
	// FINANZAS inside JTextField
	private JTextField fieldFinanzasTotal, fieldFinanzas2, fieldFinanzas3, fieldFinanzas4, fieldFinanzas5, fieldFinanzas6, fieldFinanzas7, fieldFinanzas8;
	// ROPA inside JTextField
	private JTextField fieldRopaTotal, fieldRopa2, fieldRopa3, fieldRopa4, fieldRopa5, fieldRopa6;
	// ROPA inside JTextField
	private JTextField fieldRegalosTotal, fieldRegalos2, fieldRegalos3, fieldRegalos4, fieldRegalos5, fieldRegalos6;
	// VIAJE inside JTextField
	private JTextField fieldViajesTotal, fieldViajes2, fieldViajes3, fieldViajes4, fieldViajes5, fieldViajes6, fieldViajes7;
	
	private JPanel panel, panel_10, panel_11, panel_12, panel_13, panel_14;
	
	private JLabel label_4, presIngresos, presTotalIngresos, lblPresupuestoTotal_1, label_6, label_7, lblNewLabel_1, lblSeleccioneUnaCategoria, lblDespensa, lblRestaurante,
	lblOtros, lblSubcategoras, label_8, label_3, lblTransportePublico, lblGasolina, lblUbertaxi, label_14, lblHogar;
	
	private JProgressBar progressBar;
	private JButton btnCrearPres;

	
	private JLabel lblHogar_1, label_12, lblConstruccionYRemodelacion, lblArticulosParaEl, lblMascotas, lblLimpiezaYMantenimiento, lblMueblesYAparatos,
	lblRentaOCompra, label_20, label_10, label_11, lblEntretenimiento, lblEntretenimiento_1, label_16, lblCineYMusica, lblJuegosYVideojuegos,
	lblMuseosYParques, lblSubscripcionesYApps, lblAlcoholYTabaco, lblEspectaculosYEventos, label_24, label_17, label_18, lblEducacion, lblEducacion_1, label_23,
	lblColegiatura, lblPapeleria, lblLibros, lblSotfware, lblCreditoEstudiantil, lblViajesEscolares, label_32, label_21, label_22, lblFinanzasEImpuestos,
	lblFinanzasEImpuestos_1, label_27, lblSeguros, lblImpuestos, lblMultas, lblServiciosFinanz, lblTransferenciasOChec , lblTarjetasDeCredito,
	label_36, label_25, label_26, lblRopaYCalzado, lblRopaYCalzado_1, label_31, lblCalzado, lblAccesorios, lblLavanderiaYTintoreria, lblRopa, label_40,
	label_29, label_30, lblRegalosYAyuda, lblRegalosYAyuda_1, label_35, lblDonaciones, lblApoyoAFamiliaresamigos, lblRegalos, lblAyudaHumanitaria,
	label_44, presMainLabel1, presMainLabel2, presMainLabel3, presMainLabel4, presMainLabel5, presMainLabel6, presMainLabel7, presMainLabel8,
	presMainLabel9, presMainLabel10, presMainLabel11, presMainLabel12, presMainLabel13, presMainLabel14, presMainLabel15, presMainLabel16,
	presMainLabel17, presMainLabel18, presMainLabel19, presMainLabel20, lblPresupuestoTotal, label_37;

	private JPanel panel_24, panel_25, panel_26, panel_27, panel_28,panel_29, panel_30, panel_31, panel_32, panel_42, panel_43, panel_44, panel_45,
	panel_46, panel_47 , panel_48, panel_49, panel_50, panel_51, panel_52, panel_53, panel_54, panel_55, panel_56, panel_57, panel_58, panel_59,
	panel_60, panel_61, panel_62, panel_63, panel_64, panel_65, panel_68, panel_66, panel_67, panel_69, panel_70, panel_71, panel_72, panel_75,
	panel_1,panel_2, panel_3, panel_4, panel_82, panel_15, panel_16, panel_17, panel_18;

	Presupuestos pres = new Presupuestos();
	private int presupuestoTotal, fieldTotalHogar, fieldTotalAuto, fieldTotalAlimentos, fieldTotalEntretenimiento, fieldTotalSalud, fieldTotalEducacion, fieldTotalFinanzas,
				fieldTotalRopa, fieldTotalRegalos, fieldTotalViajes;


	private int ingresosTotal = 0;
	

	private JLabel picLabel, lblUsername, lblIngresos, lblGastos_1, lblQ_1, lblQ_2, lblQ, lblUp, lblDown;
	private BufferedImage myPicture = null, imageUp = null, imageDown = null;
	
	private JPanel resumenMain, resumen1, resumen2, resumen3, resumen5, resumen4, resumen6, resumen8, resumen7, resumen12, resumen11, resumen10,
	resumen9, resumen14, resumen13;

	private JLabel resumenIngresos, resumenGastos, lblTotalIngresos, lblGastosTotal, res1, res2, res3, res4, res5, res6, res7, res8, res9, res10, res11;

	private JPanel pIngresosMain;
	private JPanel pIngresos2;
	
	private JPanel pIngSueldos, pIngBonos, pIngReembolsos, pIngRentas, pIngSubsidios, pIngInversiones, pIngOtros;
	private JLabel lblNombreSueldos, lblNombreBonos, lblNombreReembolsos, lblNombreRentas, lblNombreSubsidios,
				   lblNombreInversiones, lblNombreOtros;
	private JLabel lblIngresosTotal, lblSueldos, lblBonos, lblReembolsos, lblRentas, lblSubsidios, lblInversiones, lblOtros1;

	private JLabel lblEditar;
	private JLabel lblIngresosEdita;
	private JPanel panel_19;
	private JLabel lblNewLabel_4;
	private JLabel lblDe;
	private JLabel lblNewLabel_5;
	private JTextField tfIngresoMonto;
	private JComboBox<String> cbIngresoRep, cbIngresoCat, cbIngresoRec;
	private MiListener oyenteIngresos;
	private JButton btnIngresoRegresar, btnIngresoGuardar, btnAgregarIngreso;
	private JPanel gastosMain;
	private JPanel gastar;
	private JTextField fieldGastos;

	private JButton btnNuevoGasto;

	private JButton btnGuardarGasto;

	private JComboBox gastosComboBox;

	private JComboBox comboBox_1;

	private JLabel lblTotalGastos;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ventana = new JFrame();
		ventana.setTitle("UVG Finanzas");
		ventana.getContentPane().setBackground(Color.WHITE);
		ventana.setBackground(Color.WHITE);
		ventana.setSize(1280, 740);
		ventana.setLocationRelativeTo(null);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		sidebar = new JPanel();
		sidebar.setBackground(SystemColor.controlHighlight);
		sidebar.setBounds(0, 0, 240, 701);
		ventana.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		btnResumen = new JButton("Resumen");
		MiListener oyenteResumen = new MiListener();
		btnResumen.addActionListener(oyenteResumen);
		btnResumen.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnResumen.setForeground(Color.WHITE);
		btnResumen.setBackground(new Color(51, 153, 255));
		btnResumen.setBounds(0, 229, 239, 47);
		btnResumen.setBorder(null);
		sidebar.add(btnResumen);
		
		btnIngresos = new JButton("Ingresos");
		MiListener oyenteIngresos = new MiListener();
		btnIngresos.addActionListener(oyenteIngresos);
		btnIngresos.setForeground(SystemColor.controlDkShadow);
		btnIngresos.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnIngresos.setBackground(SystemColor.controlHighlight);
		btnIngresos.setBounds(0, 273, 239, 47);
		btnIngresos.setBorder(null);
		sidebar.add(btnIngresos);
		
		btnGastos = new JButton("Gastos");
		MiListener oyenteGastos = new MiListener();
		btnGastos.addActionListener(oyenteGastos);
		btnGastos.setForeground(SystemColor.controlDkShadow);
		btnGastos.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnGastos.setBackground(SystemColor.controlHighlight);
		btnGastos.setBounds(0, 318, 239, 47);
		btnGastos.setBorder(null);
		sidebar.add(btnGastos);
		
		btnPresupuestos = new JButton("Presupuestos");
		MiListener oyentePrespuesto = new MiListener();
		btnPresupuestos.addActionListener(oyentePrespuesto);
		btnPresupuestos.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnPresupuestos.setForeground(SystemColor.controlDkShadow);
		btnPresupuestos.setBackground(SystemColor.controlHighlight);
		btnPresupuestos.setBounds(0, 364, 239, 47);
		btnPresupuestos.setBorder(null);
		sidebar.add(btnPresupuestos);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBackground(SystemColor.controlHighlight);
		btnSalir.setForeground(SystemColor.controlDkShadow);
		btnSalir.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnSalir.setBounds(0, 410, 239, 47);
		btnSalir.setBorder(null);
		sidebar.add(btnSalir);		
		
		try {
			myPicture = ImageIO.read(new File("user.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image newImage = myPicture.getScaledInstance(75, 75, Image.SCALE_DEFAULT);
		picLabel = new JLabel(new ImageIcon(newImage));
		
		picLabel.setLocation(0, 21);
		picLabel.setSize(239, 100);
		sidebar.add(picLabel);
		
		lblUsername = new JLabel("Usuario");
		lblUsername.setForeground(new Color(51,51,51));
		lblUsername.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(0, 111, 239, 35);
		sidebar.add(lblUsername);
		
		lblIngresos = new JLabel("Ingresos");
		lblIngresos.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblIngresos.setBounds(50, 162, 60, 15);
		sidebar.add(lblIngresos);
		
		lblQ_1 = new JLabel("Q 00");
		lblQ_1.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblQ_1.setBounds(50, 181, 60, 15);
		sidebar.add(lblQ_1);
		
		lblQ_2 = new JLabel("Q 00");
		lblQ_2.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblQ_2.setBounds(165, 181, 60, 15);
		sidebar.add(lblQ_2);
		
		lblGastos_1 = new JLabel("Gastos");
		lblGastos_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblGastos_1.setBounds(165, 162, 60, 15);
		sidebar.add(lblGastos_1);
		
		try {
			imageUp = ImageIO.read(new File("up.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image imgUp = imageUp.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		lblUp = new JLabel(new ImageIcon(imgUp));
		lblUp.setBounds(15, 162, 30, 35);
		sidebar.add(lblUp);
		
		try {
			imageDown = ImageIO.read(new File("down.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image imgDown = imageDown.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		lblDown = new JLabel(new ImageIcon(imgDown));
		lblDown.setBounds(130, 162, 30, 35);
		sidebar.add(lblDown);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(SystemColor.windowBorder);
		separator.setForeground(SystemColor.windowBorder);
		separator.setBounds(122, 162, 1, 35);
		sidebar.add(separator);
		
		MiListener oyenteCrearPres = new MiListener();
		MiListener oyentePresAuto = new MiListener();
		MiListener oyentePresHogar = new MiListener();
		MiListener oyentePresAlimentos = new MiListener();
		MiListener oyentePresEntretenimiento = new MiListener();
		MiListener oyentePresSalud = new MiListener();
		MiListener oyentePresEducacion = new MiListener();
		MiListener oyentePresFinanzas = new MiListener();
		MiListener oyentePresRopa = new MiListener();
		MiListener oyentePresRegalos = new MiListener();
		MiListener oyentePresViajes = new MiListener();
		MiListener oyenteBtnSelecCategRegresar = new MiListener();
		MiListener oyenteBtnHogarGuardar = new MiListener();
		MiListener oyenteBtnHogarRegresar = new MiListener();
		MiListener oyenteBtnAlimentosRegresar = new MiListener();
		MiListener oyenteBtnAutoGuardar = new MiListener();
		MiListener oyenteBtnAutoRegresar = new MiListener();
		MiListener oyenteBtnEntretenimientoRegresar = new MiListener();
		MiListener oyenteBtnSaludRegresar = new MiListener();
		MiListener oyenteBtnEducacionRegresar = new MiListener();
		MiListener oyenteBtnFinanzasRegresar = new MiListener();
		MiListener oyenteBtnRopaRegresar = new MiListener();
		MiListener oyenteBtnRegalosRegresar = new MiListener();
		MiListener oyenteBtnViajesRegresar = new MiListener();
		
		content = new JPanel();
		content.setBackground(Color.WHITE);
		content.setBounds(240, 0, 1024, 701);
		ventana.getContentPane().add(content);
		content.setLayout(new CardLayout(0, 0));
		
		resumen = new JPanel();
		resumen.setBackground(Color.WHITE);
		content.add(resumen, "name_18739609784760");
		resumen.setLayout(null);
		
		resumen1 = new JPanel();
		resumen1.setBounds(70, 12, 560, 295);
		resumen.add(resumen1);
		
		resumen2 = new JPanel();
		resumen2.setLayout(null);
		resumen2.setBackground(new Color(0, 153, 255));
		resumen2.setBounds(652, 11, 300, 135);
		resumen.add(resumen2);
		
		JLabel label_41 = new JLabel("Ingresos");
		label_41.setHorizontalAlignment(SwingConstants.CENTER);
		label_41.setForeground(Color.WHITE);
		label_41.setFont(new Font("Verdana", Font.BOLD, 15));
		label_41.setBounds(0, 22, 300, 26);
		resumen2.add(label_41);
		
		resumenIngresos = new JLabel("00");
		resumenIngresos.setHorizontalAlignment(SwingConstants.CENTER);
		resumenIngresos.setForeground(Color.WHITE);
		resumenIngresos.setFont(new Font("Verdana", Font.BOLD, 17));
		resumenIngresos.setBounds(0, 59, 300, 41);
		resumen2.add(resumenIngresos);
		
		resumen3 = new JPanel();
		resumen3.setLayout(null);
		resumen3.setBackground(new Color(255, 153, 153));
		resumen3.setBounds(652, 172, 300, 135);
		resumen.add(resumen3);
		
		JLabel label_43 = new JLabel("Gastos");
		label_43.setHorizontalAlignment(SwingConstants.CENTER);
		label_43.setForeground(Color.WHITE);
		label_43.setFont(new Font("Verdana", Font.BOLD, 15));
		label_43.setBounds(0, 22, 300, 26);
		resumen3.add(label_43);
		
		resumenGastos = new JLabel("00");
		resumenGastos.setHorizontalAlignment(SwingConstants.CENTER);
		resumenGastos.setForeground(Color.WHITE);
		resumenGastos.setFont(new Font("Verdana", Font.BOLD, 17));
		resumenGastos.setBounds(0, 59, 300, 41);
		resumen3.add(resumenGastos);
		
		resumen5 = new JPanel();
		resumen5.setLayout(null);
		resumen5.setBackground(new Color(61, 172, 219));
		resumen5.setBounds(525, 332, 200, 87);
		resumen.add(resumen5);
		
		JLabel label_47 = new JLabel("Hogar");
		label_47.setHorizontalAlignment(SwingConstants.CENTER);
		label_47.setForeground(Color.WHITE);
		label_47.setFont(new Font("Verdana", Font.BOLD, 14));
		label_47.setBounds(0, 5, 200, 25);
		resumen5.add(label_47);
		
		res2 = new JLabel("");
		res2.setHorizontalAlignment(SwingConstants.CENTER);
		res2.setForeground(Color.WHITE);
		res2.setFont(new Font("Verdana", Font.BOLD, 16));
		res2.setBounds(0, 36, 200, 40);
		resumen5.add(res2);
		
		resumen4 = new JPanel();
		resumen4.setLayout(null);
		resumen4.setBackground(new Color(61, 172, 219));
		resumen4.setBounds(70, 332, 428, 87);
		resumen.add(resumen4);
		
		JLabel label_49 = new JLabel("Total presupuestos:");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setForeground(Color.WHITE);
		label_49.setFont(new Font("Verdana", Font.BOLD, 14));
		label_49.setBounds(85, 30, 164, 29);
		resumen4.add(label_49);
		
		res1 = new JLabel("0.0");
		res1.setHorizontalAlignment(SwingConstants.LEFT);
		res1.setForeground(Color.WHITE);
		res1.setFont(new Font("Verdana", Font.BOLD, 17));
		res1.setBounds(259, 30, 79, 29);
		resumen4.add(res1);
		
		resumen6 = new JPanel();
		resumen6.setLayout(null);
		resumen6.setBackground(new Color(61, 172, 219));
		resumen6.setBounds(752, 332, 200, 87);
		resumen.add(resumen6);
		
		JLabel label_51 = new JLabel("Auto y Transporte");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setForeground(Color.WHITE);
		label_51.setFont(new Font("Verdana", Font.BOLD, 14));
		label_51.setBounds(0, 5, 200, 25);
		resumen6.add(label_51);
		
		res3 = new JLabel("");
		res3.setHorizontalAlignment(SwingConstants.CENTER);
		res3.setForeground(Color.WHITE);
		res3.setFont(new Font("Verdana", Font.BOLD, 16));
		res3.setBounds(0, 36, 200, 40);
		resumen6.add(res3);
		
		resumen8 = new JPanel();
		resumen8.setLayout(null);
		resumen8.setBackground(new Color(61, 172, 219));
		resumen8.setBounds(298, 447, 200, 87);
		resumen.add(resumen8);
		
		JLabel label_53 = new JLabel("Entretenimiento");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setForeground(Color.WHITE);
		label_53.setFont(new Font("Verdana", Font.BOLD, 14));
		label_53.setBounds(0, 5, 200, 25);
		resumen8.add(label_53);
		
		res5 = new JLabel("");
		res5.setHorizontalAlignment(SwingConstants.CENTER);
		res5.setForeground(Color.WHITE);
		res5.setFont(new Font("Verdana", Font.BOLD, 16));
		res5.setBounds(0, 36, 200, 40);
		resumen8.add(res5);
		
		resumen7 = new JPanel();
		resumen7.setLayout(null);
		resumen7.setBackground(new Color(61, 172, 219));
		resumen7.setBounds(71, 447, 200, 87);
		resumen.add(resumen7);
		
		JLabel label_55 = new JLabel("Alimentos");
		label_55.setHorizontalAlignment(SwingConstants.CENTER);
		label_55.setForeground(Color.WHITE);
		label_55.setFont(new Font("Verdana", Font.BOLD, 14));
		label_55.setBounds(0, 5, 200, 25);
		resumen7.add(label_55);
		
		res4 = new JLabel("");
		res4.setHorizontalAlignment(SwingConstants.CENTER);
		res4.setForeground(Color.WHITE);
		res4.setFont(new Font("Verdana", Font.BOLD, 16));
		res4.setBounds(0, 36, 200, 40);
		resumen7.add(res4);
		
		resumen12 = new JPanel();
		resumen12.setLayout(null);
		resumen12.setBackground(new Color(61, 172, 219));
		resumen12.setBounds(298, 563, 200, 87);
		resumen.add(resumen12);
		
		JLabel label_57 = new JLabel("Ropa y Calzado");
		label_57.setHorizontalAlignment(SwingConstants.CENTER);
		label_57.setForeground(Color.WHITE);
		label_57.setFont(new Font("Verdana", Font.BOLD, 14));
		label_57.setBounds(0, 5, 200, 25);
		resumen12.add(label_57);
		
		res9 = new JLabel("");
		res9.setHorizontalAlignment(SwingConstants.CENTER);
		res9.setForeground(Color.WHITE);
		res9.setFont(new Font("Verdana", Font.BOLD, 16));
		res9.setBounds(0, 36, 200, 40);
		resumen12.add(res9);
		
		resumen11 = new JPanel();
		resumen11.setLayout(null);
		resumen11.setBackground(new Color(61, 172, 219));
		resumen11.setBounds(71, 563, 200, 87);
		resumen.add(resumen11);
		
		JLabel label_59 = new JLabel("Finanzas e Impuestos");
		label_59.setHorizontalAlignment(SwingConstants.CENTER);
		label_59.setForeground(Color.WHITE);
		label_59.setFont(new Font("Verdana", Font.BOLD, 14));
		label_59.setBounds(0, 5, 200, 25);
		resumen11.add(label_59);
		
		res8 = new JLabel("");
		res8.setHorizontalAlignment(SwingConstants.CENTER);
		res8.setForeground(Color.WHITE);
		res8.setFont(new Font("Verdana", Font.BOLD, 16));
		res8.setBounds(0, 36, 200, 40);
		resumen11.add(res8);
		
		resumen10 = new JPanel();
		resumen10.setLayout(null);
		resumen10.setBackground(new Color(61, 172, 219));
		resumen10.setBounds(752, 447, 200, 87);
		resumen.add(resumen10);
		
		JLabel label_61 = new JLabel("Educaci\u00F3n");
		label_61.setHorizontalAlignment(SwingConstants.CENTER);
		label_61.setForeground(Color.WHITE);
		label_61.setFont(new Font("Verdana", Font.BOLD, 14));
		label_61.setBounds(0, 5, 200, 25);
		resumen10.add(label_61);
		
		res7 = new JLabel("");
		res7.setHorizontalAlignment(SwingConstants.CENTER);
		res7.setForeground(Color.WHITE);
		res7.setFont(new Font("Verdana", Font.BOLD, 16));
		res7.setBounds(0, 36, 200, 40);
		resumen10.add(res7);
		
		resumen9 = new JPanel();
		resumen9.setLayout(null);
		resumen9.setBackground(new Color(61, 172, 219));
		resumen9.setBounds(525, 447, 200, 87);
		resumen.add(resumen9);
		
		JLabel label_63 = new JLabel("Salud y Belleza");
		label_63.setHorizontalAlignment(SwingConstants.CENTER);
		label_63.setForeground(Color.WHITE);
		label_63.setFont(new Font("Verdana", Font.BOLD, 14));
		label_63.setBounds(0, 5, 200, 25);
		resumen9.add(label_63);
		
		res6 = new JLabel("");
		res6.setHorizontalAlignment(SwingConstants.CENTER);
		res6.setForeground(Color.WHITE);
		res6.setFont(new Font("Verdana", Font.BOLD, 16));
		res6.setBounds(0, 36, 200, 40);
		resumen9.add(res6);
		
		resumen14 = new JPanel();
		resumen14.setLayout(null);
		resumen14.setBackground(new Color(61, 172, 219));
		resumen14.setBounds(752, 563, 200, 87);
		resumen.add(resumen14);
		
		JLabel label_65 = new JLabel("Viajes");
		label_65.setHorizontalAlignment(SwingConstants.CENTER);
		label_65.setForeground(Color.WHITE);
		label_65.setFont(new Font("Verdana", Font.BOLD, 14));
		label_65.setBounds(0, 5, 200, 25);
		resumen14.add(label_65);
		
		res11 = new JLabel("");
		res11.setHorizontalAlignment(SwingConstants.CENTER);
		res11.setForeground(Color.WHITE);
		res11.setFont(new Font("Verdana", Font.BOLD, 16));
		res11.setBounds(0, 36, 200, 40);
		resumen14.add(res11);
		
		resumen13 = new JPanel();
		resumen13.setLayout(null);
		resumen13.setBackground(new Color(61, 172, 219));
		resumen13.setBounds(525, 563, 200, 87);
		resumen.add(resumen13);
		
		res10 = new JLabel("");
		res10.setHorizontalAlignment(SwingConstants.CENTER);
		res10.setForeground(Color.WHITE);
		res10.setFont(new Font("Verdana", Font.BOLD, 16));
		res10.setBounds(0, 36, 200, 40);
		resumen13.add(res10);
		
		JLabel label_67 = new JLabel("Regalos y Ayuda");
		label_67.setHorizontalAlignment(SwingConstants.CENTER);
		label_67.setForeground(Color.WHITE);
		label_67.setFont(new Font("Verdana", Font.BOLD, 14));
		label_67.setBounds(0, 5, 200, 25);
		resumen13.add(label_67);
		
		
		
		presupuestos = new JPanel();
		presupuestos.setBackground(Color.WHITE);
		content.add(presupuestos);
		presupuestos.setLayout(new CardLayout(0, 0));
		
		presupuestoMain = new JPanel();
		presupuestoMain.setBackground(new Color(255, 255, 255));
		presupuestos.add(presupuestoMain);
		presupuestoMain.setLayout(null);
		
		label_4 = new JLabel("PRESUPUESTOS");
		label_4.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_4.setBounds(423, 60, 170, 64);
		presupuestoMain.add(label_4);
		
		lblPresupuestoTotal_1 = new JLabel("Presupuesto total:");
		lblPresupuestoTotal_1.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblPresupuestoTotal_1.setBounds(113, 149, 158, 19);
		presupuestoMain.add(lblPresupuestoTotal_1);
		
		label_6 = new JLabel("Total Ingresos:");
		label_6.setFont(new Font("Verdana", Font.PLAIN, 17));
		label_6.setBounds(679, 149, 133, 19);
		presupuestoMain.add(label_6);
		
		progressBar = new JProgressBar();
		
		progressBar.setStringPainted(true);
		progressBar.setForeground(new Color(50, 205, 50));
		progressBar.setBackground(Color.WHITE);
		progressBar.setBounds(113, 174, 800, 27);
		presupuestoMain.add(progressBar);
		
		btnCrearPres = new JButton("+");
		btnCrearPres.addActionListener(oyenteCrearPres);
		btnCrearPres.setForeground(Color.WHITE);
		btnCrearPres.setBackground(new Color(51, 153, 255));
		btnCrearPres.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCrearPres.setBounds(450, 246, 133, 50);
		btnCrearPres.setBorder(null);
		presupuestoMain.add(btnCrearPres);
		
		label_7 = new JLabel("Crear presupuesto");
		label_7.setFont(new Font("Verdana", Font.PLAIN, 14));
		label_7.setBounds(450, 296, 133, 27);
		presupuestoMain.add(label_7);
		
		panel_82 = new JPanel();
		panel_82.setBackground(new Color(240, 240, 240));
		panel_82.setBounds(113, 399, 365, 33);
		presupuestoMain.add(panel_82);
		panel_82.setLayout(null);
		
		presMainLabel1 = new JLabel("");
		presMainLabel1.setBackground(new Color(0, 153, 255));
		presMainLabel1.setForeground(new Color(255, 255, 255));
		presMainLabel1.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel1.setBounds(0, 0, 181, 33);
		panel_82.add(presMainLabel1);
		
		presMainLabel2 = new JLabel("");
		presMainLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel2.setForeground(Color.WHITE);
		presMainLabel2.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel2.setBackground(new Color(0, 153, 255));
		presMainLabel2.setBounds(184, 0, 181, 33);
		panel_82.add(presMainLabel2);
		
		panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(548, 399, 365, 33);
		presupuestoMain.add(panel);
		panel.setLayout(null);
		
		presMainLabel11 = new JLabel("");
		presMainLabel11.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel11.setForeground(Color.WHITE);
		presMainLabel11.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel11.setBackground(new Color(0, 153, 255));
		presMainLabel11.setBounds(0, 0, 181, 33);
		panel.add(presMainLabel11);
		
		presMainLabel12 = new JLabel("");
		presMainLabel12.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel12.setForeground(Color.WHITE);
		presMainLabel12.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel12.setBackground(new Color(0, 153, 255));
		presMainLabel12.setBounds(184, 0, 181, 33);
		panel.add(presMainLabel12);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 240, 240));
		panel_1.setBounds(113, 443, 365, 33);
		presupuestoMain.add(panel_1);
		panel_1.setLayout(null);
		
		presMainLabel3 = new JLabel("");
		presMainLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel3.setForeground(Color.WHITE);
		presMainLabel3.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel3.setBackground(new Color(0, 153, 255));
		presMainLabel3.setBounds(0, 0, 181, 33);
		panel_1.add(presMainLabel3);
		
		presMainLabel4 = new JLabel("");
		presMainLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel4.setForeground(Color.WHITE);
		presMainLabel4.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel4.setBackground(new Color(0, 153, 255));
		presMainLabel4.setBounds(184, 0, 181, 33);
		panel_1.add(presMainLabel4);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 240, 240));
		panel_2.setBounds(113, 487, 365, 33);
		presupuestoMain.add(panel_2);
		panel_2.setLayout(null);
		
		presMainLabel5 = new JLabel("");
		presMainLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel5.setForeground(Color.WHITE);
		presMainLabel5.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel5.setBackground(new Color(0, 153, 255));
		presMainLabel5.setBounds(0, 0, 181, 33);
		panel_2.add(presMainLabel5);
		
		presMainLabel6 = new JLabel("");
		presMainLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel6.setForeground(Color.WHITE);
		presMainLabel6.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel6.setBackground(new Color(0, 153, 255));
		presMainLabel6.setBounds(184, 0, 181, 33);
		panel_2.add(presMainLabel6);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 240, 240));
		panel_3.setBounds(113, 531, 365, 33);
		presupuestoMain.add(panel_3);
		panel_3.setLayout(null);
		
		presMainLabel7 = new JLabel("");
		presMainLabel7.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel7.setForeground(Color.WHITE);
		presMainLabel7.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel7.setBackground(new Color(0, 153, 255));
		presMainLabel7.setBounds(0, 0, 181, 33);
		panel_3.add(presMainLabel7);
		
		presMainLabel8 = new JLabel("");
		presMainLabel8.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel8.setForeground(Color.WHITE);
		presMainLabel8.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel8.setBackground(new Color(0, 153, 255));
		presMainLabel8.setBounds(184, 0, 181, 33);
		panel_3.add(presMainLabel8);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 240, 240));
		panel_4.setBounds(113, 575, 365, 33);
		presupuestoMain.add(panel_4);
		panel_4.setLayout(null);
		
		presMainLabel9 = new JLabel("");
		presMainLabel9.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel9.setForeground(Color.WHITE);
		presMainLabel9.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel9.setBackground(new Color(0, 153, 255));
		presMainLabel9.setBounds(0, 0, 181, 33);
		panel_4.add(presMainLabel9);
		
		presMainLabel10 = new JLabel("");
		presMainLabel10.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel10.setForeground(Color.WHITE);
		presMainLabel10.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel10.setBackground(new Color(0, 153, 255));
		presMainLabel10.setBounds(184, 0, 181, 33);
		panel_4.add(presMainLabel10);
		
		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(new Color(240, 240, 240));
		panel_15.setBounds(548, 443, 365, 33);
		presupuestoMain.add(panel_15);
		
		presMainLabel13 = new JLabel("");
		presMainLabel13.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel13.setForeground(Color.WHITE);
		presMainLabel13.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel13.setBackground(new Color(0, 153, 255));
		presMainLabel13.setBounds(0, 0, 181, 33);
		panel_15.add(presMainLabel13);
		
		presMainLabel14 = new JLabel("");
		presMainLabel14.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel14.setForeground(Color.WHITE);
		presMainLabel14.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel14.setBackground(new Color(0, 153, 255));
		presMainLabel14.setBounds(184, 0, 181, 33);
		panel_15.add(presMainLabel14);
		
		panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(new Color(240, 240, 240));
		panel_16.setBounds(548, 487, 365, 33);
		presupuestoMain.add(panel_16);
		
		presMainLabel15 = new JLabel("");
		presMainLabel15.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel15.setForeground(Color.WHITE);
		presMainLabel15.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel15.setBackground(new Color(0, 153, 255));
		presMainLabel15.setBounds(0, 0, 181, 33);
		panel_16.add(presMainLabel15);
		
		presMainLabel16 = new JLabel("");
		presMainLabel16.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel16.setForeground(Color.WHITE);
		presMainLabel16.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel16.setBackground(new Color(0, 153, 255));
		presMainLabel16.setBounds(184, 0, 181, 33);
		panel_16.add(presMainLabel16);
		
		panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBackground(new Color(240, 240, 240));
		panel_17.setBounds(548, 531, 365, 33);
		presupuestoMain.add(panel_17);
		
		presMainLabel17 = new JLabel("");
		presMainLabel17.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel17.setForeground(Color.WHITE);
		presMainLabel17.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel17.setBackground(new Color(0, 153, 255));
		presMainLabel17.setBounds(0, 0, 181, 33);
		panel_17.add(presMainLabel17);
		
		presMainLabel18 = new JLabel("");
		presMainLabel18.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel18.setForeground(Color.WHITE);
		presMainLabel18.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel18.setBackground(new Color(0, 153, 255));
		presMainLabel18.setBounds(184, 0, 181, 33);
		panel_17.add(presMainLabel18);
		
		panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBackground(new Color(240, 240, 240));
		panel_18.setBounds(548, 575, 365, 33);
		presupuestoMain.add(panel_18);
		
		presMainLabel19 = new JLabel("");
		presMainLabel19.setHorizontalAlignment(SwingConstants.RIGHT);
		presMainLabel19.setForeground(Color.WHITE);
		presMainLabel19.setFont(new Font("Verdana", Font.BOLD, 13));
		presMainLabel19.setBackground(new Color(0, 153, 255));
		presMainLabel19.setBounds(0, 0, 181, 33);
		panel_18.add(presMainLabel19);
		
		presMainLabel20 = new JLabel("");
		presMainLabel20.setHorizontalAlignment(SwingConstants.CENTER);
		presMainLabel20.setForeground(Color.WHITE);
		presMainLabel20.setFont(new Font("Verdana", Font.BOLD, 15));
		presMainLabel20.setBackground(new Color(0, 153, 255));
		presMainLabel20.setBounds(184, 0, 181, 33);
		panel_18.add(presMainLabel20);
		
		lblPresupuestoTotal = new JLabel("");
		lblPresupuestoTotal.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblPresupuestoTotal.setBounds(300, 143, 111, 27);
		presupuestoMain.add(lblPresupuestoTotal);
		
		lblQ = new JLabel("Q");
		lblQ.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblQ.setBounds(281, 143, 19, 27);
		presupuestoMain.add(lblQ);
		
		presIngresos = new JLabel("Q");
		presIngresos.setFont(new Font("Verdana", Font.PLAIN, 17));
		presIngresos.setBounds(817, 143, 19, 27);
		presupuestoMain.add(presIngresos);
		
		presTotalIngresos = new JLabel("");
		presTotalIngresos.setFont(new Font("Verdana", Font.PLAIN, 17));
		presTotalIngresos.setBounds(836, 143, 111, 27);
		presupuestoMain.add(presTotalIngresos);
		
		selecPresCateg = new JPanel();
		selecPresCateg.setBackground(new Color(255, 255, 255));
		presupuestos.add(selecPresCateg, "name_48129731668994");
		selecPresCateg.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Nuevo presupuesto");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(409, 71, 194, 25);
		selecPresCateg.add(lblNewLabel_1);
		
		lblSeleccioneUnaCategoria = new JLabel("Seleccione una categor\u00EDa");
		lblSeleccioneUnaCategoria.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblSeleccioneUnaCategoria.setBounds(409, 107, 210, 20);
		selecPresCateg.add(lblSeleccioneUnaCategoria);
		
		btnPresAuto = new JButton("Auto y Transporte");
		btnPresAuto.addActionListener(oyentePresAuto);
		btnPresAuto.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresAuto.setForeground(new Color(255, 255, 255));
		btnPresAuto.setBackground(new Color(61,172,219));
		btnPresAuto.setBounds(298, 191, 200, 87);
		btnPresAuto.setBorder(null);
		selecPresCateg.add(btnPresAuto);
		
		btnPresHogar = new JButton("Hogar");
		btnPresHogar.addActionListener(oyentePresHogar);
		btnPresHogar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresHogar.setForeground(new Color(255, 255, 255));
		btnPresHogar.setBackground(new Color(61,172,219));
		btnPresHogar.setBounds(70, 191, 200, 87);
		btnPresHogar.setBorder(null);
		selecPresCateg.add(btnPresHogar);
		
		btnPresAlimentos = new JButton("Alimentos");
		btnPresAlimentos.addActionListener(oyentePresAlimentos);
		btnPresAlimentos.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresAlimentos.setForeground(new Color(255, 255, 255));
		btnPresAlimentos.setBackground(new Color(61,172,219));
		btnPresAlimentos.setBounds(525, 191, 200, 87);
		btnPresAlimentos.setBorder(null);
		selecPresCateg.add(btnPresAlimentos);
		
		btnPresEntretenimiento = new JButton("Entretenimiento");
		btnPresEntretenimiento.addActionListener(oyentePresEntretenimiento);
		btnPresEntretenimiento.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresEntretenimiento.setForeground(new Color(255, 255, 255));
		btnPresEntretenimiento.setBackground(new Color(61,172,219));
		btnPresEntretenimiento.setBounds(752, 191, 200, 87);
		btnPresEntretenimiento.setBorder(null);
		selecPresCateg.add(btnPresEntretenimiento);
		
		btnPresSalud = new JButton("Salud y Belleza");
		btnPresSalud.addActionListener(oyentePresSalud);
		btnPresSalud.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresSalud.setForeground(new Color(255, 255, 255));
		btnPresSalud.setBackground(new Color(61,172,219));
		btnPresSalud.setBounds(70, 306, 200, 87);
		btnPresSalud.setBorder(null);
		selecPresCateg.add(btnPresSalud);
		
		btnPresEducacion = new JButton("Educaci\u00F3n");
		btnPresEducacion.addActionListener(oyentePresEducacion);
		btnPresEducacion.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresEducacion.setForeground(new Color(255, 255, 255));
		btnPresEducacion.setBackground(new Color(61,172,219));
		btnPresEducacion.setBounds(298, 306, 200, 87);
		btnPresEducacion.setBorder(null);
		selecPresCateg.add(btnPresEducacion);
		
		btnPresFinanzas = new JButton("Finanzas e Impuestos");
		btnPresFinanzas.addActionListener(oyentePresFinanzas);
		btnPresFinanzas.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresFinanzas.setForeground(new Color(255, 255, 255));
		btnPresFinanzas.setBackground(new Color(61,172,219));
		btnPresFinanzas.setBounds(525, 306, 200, 87);
		btnPresFinanzas.setBorder(null);
		selecPresCateg.add(btnPresFinanzas);
		
		btnPresRopa = new JButton("Ropa y Calzado");
		btnPresRopa.addActionListener(oyentePresRopa);
		btnPresRopa.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresRopa.setForeground(new Color(255, 255, 255));
		btnPresRopa.setBackground(new Color(61,172,219));
		btnPresRopa.setBounds(752, 306, 200, 87);
		btnPresRopa.setBorder(null);
		selecPresCateg.add(btnPresRopa);
		
		btnPresRegalos = new JButton("Regalos y Ayuda");
		btnPresRegalos.addActionListener(oyentePresRegalos);
		btnPresRegalos.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresRegalos.setForeground(new Color(255, 255, 255));
		btnPresRegalos.setBackground(new Color(61,172,219));
		btnPresRegalos.setBounds(70, 422, 200, 87);
		btnPresRegalos.setBorder(null);
		selecPresCateg.add(btnPresRegalos);
		
		btnPresViajes = new JButton("Viajes");
		btnPresViajes.addActionListener(oyentePresViajes);
		btnPresViajes.setFont(new Font("Verdana", Font.BOLD, 14));
		btnPresViajes.setForeground(new Color(255, 255, 255));
		btnPresViajes.setBackground(new Color(61,172,219));
		btnPresViajes.setBounds(298, 422, 200, 87);
		btnPresViajes.setBorder(null);
		selecPresCateg.add(btnPresViajes);
		
		btnSelecCategRegresar = new JButton("<- Regresar");
		btnSelecCategRegresar.addActionListener(oyenteBtnSelecCategRegresar);
		btnSelecCategRegresar.setForeground(Color.WHITE);
		btnSelecCategRegresar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnSelecCategRegresar.setBackground(new Color(0, 204, 153));
		btnSelecCategRegresar.setBounds(10, 11, 137, 33);
		btnSelecCategRegresar.setBorder(null);
		selecPresCateg.add(btnSelecCategRegresar);
		
		presHogar = new JPanel();
		presHogar.setBackground(new Color(255, 255, 255));
		presupuestos.add(presHogar, "name_93536112284701");
		presHogar.setLayout(null);
		
		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 0, 1024, 701);
		presHogar.add(panel_14);
		
		label_3 = new JLabel("Editar tu presupuesto");
		label_3.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_3.setBounds(422, 53, 218, 25);
		panel_14.add(label_3);
		
		label_8 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_8.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_8.setBounds(309, 89, 460, 25);
		panel_14.add(label_8);
		
		panelHogar = new JPanel();
		panelHogar.setLayout(null);
		panelHogar.setBackground(new Color(0, 153, 255));
		panelHogar.setBounds(129, 160, 252, 473);
		panel_14.add(panelHogar);
		
		lblHogar = new JLabel("Hogar");
		lblHogar.setForeground(Color.WHITE);
		lblHogar.setFont(new Font("Verdana", Font.BOLD, 20));
		lblHogar.setBounds(97, 199, 70, 31);
		panelHogar.add(lblHogar);
		
		panelHogar2 = new JPanel();
		panelHogar2.setBackground(new Color(0, 153, 255));
		panelHogar2.setBounds(414, 162, 252, 33);
		panel_14.add(panelHogar2);
		panelHogar2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblHogar_1 = new JLabel("Hogar");
		lblHogar_1.setForeground(Color.WHITE);
		lblHogar_1.setFont(new Font("Verdana", Font.BOLD, 14));
		panelHogar2.add(lblHogar_1);
		
		fieldHogarTotal = new JTextField();
		fieldHogarTotal.setText("0");
		fieldHogarTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogarTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldHogarTotal.setColumns(10);
		fieldHogarTotal.setBounds(686, 162, 196, 33);
		panel_14.add(fieldHogarTotal);
		
		label_12 = new JLabel("Subcategor\u00EDas");
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("Verdana", Font.BOLD, 15));
		label_12.setBounds(543, 215, 123, 31);
		panel_14.add(label_12);
		
		panelHogar3 = new JPanel();
		panelHogar3.setBackground(new Color(0, 153, 255));
		panelHogar3.setBounds(414, 257, 252, 33);
		panel_14.add(panelHogar3);
		
		lblConstruccionYRemodelacion = new JLabel("Construcci\u00F3n o Remodelaci\u00F3n");
		lblConstruccionYRemodelacion.setForeground(Color.WHITE);
		lblConstruccionYRemodelacion.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar3.add(lblConstruccionYRemodelacion);
		
		fieldHogar2 = new JTextField();
		fieldHogar2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar2.setText("0");
		fieldHogar2.setColumns(10);
		fieldHogar2.setBounds(686, 257, 196, 33);
		panel_14.add(fieldHogar2);
		
		panelHogar4 = new JPanel();
		panelHogar4.setBackground(new Color(0, 153, 255));
		panelHogar4.setBounds(414, 311, 252, 33);
		panel_14.add(panelHogar4);
		
		lblArticulosParaEl = new JLabel("Art\u00EDculos, muebles y apartos");
		lblArticulosParaEl.setForeground(Color.WHITE);
		lblArticulosParaEl.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar4.add(lblArticulosParaEl);
		
		fieldHogar3 = new JTextField();
		fieldHogar3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar3.setText("0");
		fieldHogar3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar3.setColumns(10);
		fieldHogar3.setBounds(686, 311, 196, 33);
		panel_14.add(fieldHogar3);
		
		panelHogar5 = new JPanel();
		panelHogar5.setBackground(new Color(0, 153, 255));
		panelHogar5.setBounds(414, 366, 252, 33);
		panel_14.add(panelHogar5);
		
		lblMascotas = new JLabel("Mascotas");
		lblMascotas.setForeground(Color.WHITE);
		lblMascotas.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar5.add(lblMascotas);
		
		fieldHogar4 = new JTextField();
		fieldHogar4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar4.setText("0");
		fieldHogar4.setColumns(10);
		fieldHogar4.setBounds(686, 366, 196, 33);
		panel_14.add(fieldHogar4);
		
		btnHogarGuardar = new JButton("Guardar");
		btnHogarGuardar.addActionListener(oyenteBtnHogarGuardar);
		btnHogarGuardar.setForeground(Color.WHITE);
		btnHogarGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnHogarGuardar.setBackground(new Color(1, 162, 82));
		btnHogarGuardar.setBounds(706, 624, 155, 33);
		panel_14.add(btnHogarGuardar);
		
		panelHogar6 = new JPanel();
		panelHogar6.setBackground(new Color(0, 153, 255));
		panelHogar6.setBounds(414, 419, 252, 33);
		panel_14.add(panelHogar6);
		
		lblLimpiezaYMantenimiento = new JLabel("Limpieza y Mantenimiento");
		lblLimpiezaYMantenimiento.setForeground(Color.WHITE);
		lblLimpiezaYMantenimiento.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar6.add(lblLimpiezaYMantenimiento);
		
		fieldHogar5 = new JTextField();
		fieldHogar5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar5.setText("0");
		fieldHogar5.setColumns(10);
		fieldHogar5.setBounds(686, 419, 196, 33);
		panel_14.add(fieldHogar5);
		
		panelHogar7 = new JPanel();
		panelHogar7.setBackground(new Color(0, 153, 255));
		panelHogar7.setBounds(414, 473, 252, 33);
		panel_14.add(panelHogar7);
		
		lblMueblesYAparatos = new JLabel("Servicios P\u00FAblicos");
		lblMueblesYAparatos.setForeground(Color.WHITE);
		lblMueblesYAparatos.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar7.add(lblMueblesYAparatos);
		
		fieldHogar6 = new JTextField();
		fieldHogar6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar6.setText("0");
		fieldHogar6.setColumns(10);
		fieldHogar6.setBounds(686, 473, 196, 33);
		panel_14.add(fieldHogar6);
		
		panelHogar8 = new JPanel();
		panelHogar8.setBackground(new Color(0, 153, 255));
		panelHogar8.setBounds(414, 528, 252, 33);
		panel_14.add(panelHogar8);
		
		lblRentaOCompra = new JLabel("Renta o Compra");
		lblRentaOCompra.setForeground(Color.WHITE);
		lblRentaOCompra.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar8.add(lblRentaOCompra);
		
		fieldHogar7 = new JTextField();
		fieldHogar7.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar7.setText("0");
		fieldHogar7.setColumns(10);
		fieldHogar7.setBounds(686, 528, 196, 33);
		panel_14.add(fieldHogar7);
		
		panelHogar9 = new JPanel();
		panelHogar9.setBackground(new Color(0, 153, 255));
		panelHogar9.setBounds(414, 580, 252, 33);
		panel_14.add(panelHogar9);
		
		label_20 = new JLabel("Otros");
		label_20.setForeground(Color.WHITE);
		label_20.setFont(new Font("Verdana", Font.BOLD, 13));
		panelHogar9.add(label_20);
		
		fieldHogar8 = new JTextField();
		fieldHogar8.setHorizontalAlignment(SwingConstants.CENTER);
		fieldHogar8.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldHogar8.setText("0");
		fieldHogar8.setColumns(10);
		fieldHogar8.setBounds(686, 580, 196, 33);
		panel_14.add(fieldHogar8);
		
		btnHogarRegresar = new JButton("Regresar");
		btnHogarRegresar.addActionListener(oyenteBtnHogarRegresar);
		btnHogarRegresar.setForeground(new Color(255, 255, 255));
		btnHogarRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHogarRegresar.setBackground(new Color(0, 204, 153));
		btnHogarRegresar.setBounds(10, 11, 137, 33);
		btnHogarRegresar.setBorder(null);
		panel_14.add(btnHogarRegresar);
		
		presAuto = new JPanel();
		presAuto.setBackground(new Color(255, 255, 255));
		presupuestos.add(presAuto, "name_93526237639773");
		presAuto.setLayout(null);
		
		JLabel label_1 = new JLabel("Editar tu presupuesto");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(430, 53, 196, 25);
		presAuto.add(label_1);
		
		JLabel label_2 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(335, 89, 404, 25);
		presAuto.add(label_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(0, 153, 255));
		panel_5.setBounds(129, 160, 252, 473);
		presAuto.add(panel_5);
		
		JLabel lblAutoYTransporte = new JLabel("Auto y Transporte");
		lblAutoYTransporte.setForeground(Color.WHITE);
		lblAutoYTransporte.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAutoYTransporte.setBounds(32, 187, 187, 31);
		panel_5.add(lblAutoYTransporte);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 153, 255));
		panel_6.setBounds(414, 162, 252, 33);
		presAuto.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblAutoYTransporte_1 = new JLabel("Auto y Transporte");
		lblAutoYTransporte_1.setForeground(Color.WHITE);
		lblAutoYTransporte_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_6.add(lblAutoYTransporte_1);
		
		fieldAutoTotal = new JTextField();
		fieldAutoTotal.setText("0");
		fieldAutoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAutoTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldAutoTotal.setColumns(10);
		fieldAutoTotal.setBounds(686, 162, 196, 33);
		presAuto.add(fieldAutoTotal);
		
		JLabel label_9 = new JLabel("Subcategor\u00EDas");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(559, 215, 107, 31);
		presAuto.add(label_9);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 153, 255));
		panel_7.setBounds(414, 257, 252, 33);
		presAuto.add(panel_7);
		
		JLabel lblCarroYMoto = new JLabel("Parqueo");
		lblCarroYMoto.setForeground(Color.WHITE);
		lblCarroYMoto.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_7.add(lblCarroYMoto);
		
		fieldAuto2 = new JTextField();
		fieldAuto2.setText("0");
		fieldAuto2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto2.setColumns(10);
		fieldAuto2.setBounds(686, 257, 196, 33);
		presAuto.add(fieldAuto2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 153, 255));
		panel_8.setBounds(414, 311, 252, 33);
		presAuto.add(panel_8);
		
		JLabel lblMantenimientoYReparacin = new JLabel("Mantenimiento y Reparaci\u00F3n");
		lblMantenimientoYReparacin.setForeground(Color.WHITE);
		lblMantenimientoYReparacin.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_8.add(lblMantenimientoYReparacin);
		
		fieldAuto3 = new JTextField();
		fieldAuto3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto3.setText("0");
		fieldAuto3.setColumns(10);
		fieldAuto3.setBounds(686, 311, 196, 33);
		presAuto.add(fieldAuto3);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 153, 255));
		panel_9.setBounds(414, 366, 252, 33);
		presAuto.add(panel_9);
		
		JLabel lblAutolabado = new JLabel("Autolavado");
		lblAutolabado.setForeground(Color.WHITE);
		lblAutolabado.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_9.add(lblAutolabado);
		
		fieldAuto4 = new JTextField();
		fieldAuto4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto4.setText("0");
		fieldAuto4.setColumns(10);
		fieldAuto4.setBounds(686, 366, 196, 33);
		presAuto.add(fieldAuto4);
		
		btnAutoGuardar = new JButton("Guardar");
		btnAutoGuardar.addActionListener(oyenteBtnAutoGuardar);
		btnAutoGuardar.setForeground(Color.WHITE);
		btnAutoGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAutoGuardar.setBackground(new Color(1,162,82));
		btnAutoGuardar.setBounds(706, 624, 155, 33);
		presAuto.add(btnAutoGuardar);
		
		panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 153, 255));
		panel_10.setBounds(414, 419, 252, 33);
		presAuto.add(panel_10);
		
		lblTransportePublico = new JLabel("Transporte p\u00FAblico");
		lblTransportePublico.setForeground(Color.WHITE);
		lblTransportePublico.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_10.add(lblTransportePublico);
		
		fieldAuto5 = new JTextField();
		fieldAuto5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto5.setText("0");
		fieldAuto5.setColumns(10);
		fieldAuto5.setBounds(686, 419, 196, 33);
		presAuto.add(fieldAuto5);
		
		panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 153, 255));
		panel_11.setBounds(414, 473, 252, 33);
		presAuto.add(panel_11);
		
		lblGasolina = new JLabel("Gasolina");
		lblGasolina.setForeground(Color.WHITE);
		lblGasolina.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_11.add(lblGasolina);
		
		fieldAuto6 = new JTextField();
		fieldAuto6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto6.setText("0");
		fieldAuto6.setColumns(10);
		fieldAuto6.setBounds(686, 473, 196, 33);
		presAuto.add(fieldAuto6);
		
		panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 153, 255));
		panel_12.setBounds(414, 528, 252, 33);
		presAuto.add(panel_12);
		
		lblUbertaxi = new JLabel("Uber/Taxi");
		lblUbertaxi.setForeground(Color.WHITE);
		lblUbertaxi.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_12.add(lblUbertaxi);
		
		fieldAuto7 = new JTextField();
		fieldAuto7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto7.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto7.setText("0");
		fieldAuto7.setColumns(10);
		fieldAuto7.setBounds(686, 528, 196, 33);
		presAuto.add(fieldAuto7);
		
		panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 153, 255));
		panel_13.setBounds(414, 580, 252, 33);
		presAuto.add(panel_13);
		
		label_14 = new JLabel("Otros");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_13.add(label_14);
		
		fieldAuto8 = new JTextField();
		fieldAuto8.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAuto8.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAuto8.setText("0");
		fieldAuto8.setColumns(10);
		fieldAuto8.setBounds(686, 580, 196, 33);
		presAuto.add(fieldAuto8);
		
		btnAutoRegresar = new JButton("Regresar");
		btnAutoRegresar.addActionListener(oyenteBtnAutoRegresar);
		btnAutoRegresar.setForeground(Color.WHITE);
		btnAutoRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAutoRegresar.setBackground(new Color(0, 204, 153));
		btnAutoRegresar.setBounds(10, 11, 137, 33);
		btnAutoRegresar.setBorder(null);
		presAuto.add(btnAutoRegresar);
		
		presAlimentos = new JPanel();
		presAlimentos.setBackground(Color.WHITE);
		presupuestos.add(presAlimentos, "name_48139226900300");
		presAlimentos.setLayout(null);
		
		JLabel lblEditarTuPresupuesto = new JLabel("Editar tu presupuesto");
		lblEditarTuPresupuesto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEditarTuPresupuesto.setBounds(434, 59, 196, 25);
		presAlimentos.add(lblEditarTuPresupuesto);
		
		JLabel lblAsignaUnMonto = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		lblAsignaUnMonto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAsignaUnMonto.setBounds(339, 95, 404, 25);
		presAlimentos.add(lblAsignaUnMonto);
		
		panelAlimentos1 = new JPanel();
		panelAlimentos1.setBackground(new Color(0, 153, 255));
		panelAlimentos1.setBounds(133, 202, 252, 401);
		presAlimentos.add(panelAlimentos1);
		panelAlimentos1.setLayout(null);
		
		JLabel label = new JLabel("Alimentos");
		label.setBounds(65, 181, 123, 31);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Verdana", Font.BOLD, 20));
		panelAlimentos1.add(label);
		
		panelAlimentos2 = new JPanel();
		panelAlimentos2.setBackground(new Color(0, 153, 255));
		panelAlimentos2.setBounds(418, 244, 252, 33);
		presAlimentos.add(panelAlimentos2);
		
		JLabel lblAlimentos = new JLabel("Alimentos");
		lblAlimentos.setFont(new Font("Verdana", Font.BOLD, 13));
		lblAlimentos.setForeground(new Color(255, 255, 255));
		panelAlimentos2.add(lblAlimentos);
		
		panelAlimentos3 = new JPanel();
		panelAlimentos3.setBackground(new Color(0, 153, 255));
		panelAlimentos3.setBounds(418, 392, 252, 33);
		presAlimentos.add(panelAlimentos3);
		
		lblDespensa = new JLabel("Despensa");
		lblDespensa.setForeground(Color.WHITE);
		lblDespensa.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAlimentos3.add(lblDespensa);
		
		panelAlimentos4 = new JPanel();
		panelAlimentos4.setBackground(new Color(0, 153, 255));
		panelAlimentos4.setBounds(418, 446, 252, 33);
		presAlimentos.add(panelAlimentos4);
		
		lblRestaurante = new JLabel("Restaurante");
		lblRestaurante.setForeground(Color.WHITE);
		lblRestaurante.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAlimentos4.add(lblRestaurante);
		
		panelAlimentos5 = new JPanel();
		panelAlimentos5.setBackground(new Color(0, 153, 255));
		panelAlimentos5.setBounds(418, 501, 252, 33);
		presAlimentos.add(panelAlimentos5);
		
		lblOtros = new JLabel("Otros");
		lblOtros.setForeground(Color.WHITE);
		lblOtros.setFont(new Font("Verdana", Font.BOLD, 13));
		panelAlimentos5.add(lblOtros);
		
		fieldAlimentosTotal = new JTextField();
		fieldAlimentosTotal.setText("0");
		fieldAlimentosTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldAlimentosTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAlimentosTotal.setBounds(690, 244, 196, 33);
		presAlimentos.add(fieldAlimentosTotal);
		fieldAlimentosTotal.setColumns(10);
		
		fieldAlimentos2 = new JTextField();
		fieldAlimentos2.setText("0");
		fieldAlimentos2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAlimentos2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAlimentos2.setColumns(10);
		fieldAlimentos2.setBounds(690, 392, 196, 33);
		presAlimentos.add(fieldAlimentos2);
		
		fieldAlimentos3 = new JTextField();
		fieldAlimentos3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAlimentos3.setText("0");
		fieldAlimentos3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAlimentos3.setColumns(10);
		fieldAlimentos3.setBounds(690, 446, 196, 33);
		presAlimentos.add(fieldAlimentos3);
		
		fieldAlimentos4 = new JTextField();
		fieldAlimentos4.setText("0");
		fieldAlimentos4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldAlimentos4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldAlimentos4.setColumns(10);
		fieldAlimentos4.setBounds(690, 501, 196, 33);
		presAlimentos.add(fieldAlimentos4);
		
		btnAlimentosGuardar = new JButton("Guardar");
		MiListener oyenteBtnAlimentosGuardar = new MiListener();
		btnAlimentosGuardar.addActionListener(oyenteBtnAlimentosGuardar);
		btnAlimentosGuardar.setBackground(new Color(1,162,82));
		btnAlimentosGuardar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnAlimentosGuardar.setForeground(new Color(255, 255, 255));
		btnAlimentosGuardar.setBounds(713, 570, 155, 33);
		presAlimentos.add(btnAlimentosGuardar);
		
		lblSubcategoras = new JLabel("Subcategor\u00EDas");
		lblSubcategoras.setForeground(new Color(0, 0, 0));
		lblSubcategoras.setFont(new Font("Verdana", Font.BOLD, 15));
		lblSubcategoras.setBounds(548, 350, 122, 31);
		presAlimentos.add(lblSubcategoras);
		
		btnAlimentosRegresar = new JButton("Regresar");
		btnAlimentosRegresar.addActionListener(oyenteBtnAlimentosRegresar);
		btnAlimentosRegresar.setForeground(Color.WHITE);
		btnAlimentosRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAlimentosRegresar.setBackground(new Color(0, 204, 153));
		btnAlimentosRegresar.setBounds(10, 11, 137, 33);
		btnAlimentosRegresar.setBorder(null);
		presAlimentos.add(btnAlimentosRegresar);
		
		presEntretenimiento = new JPanel();
		presEntretenimiento.setBackground(new Color(255, 255, 255));
		presupuestos.add(presEntretenimiento, "name_93540924999455");
		presEntretenimiento.setLayout(null);
		
		label_10 = new JLabel("Editar tu presupuesto");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_10.setBounds(439, 51, 196, 25);
		presEntretenimiento.add(label_10);
		
		label_11 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_11.setBounds(344, 87, 404, 25);
		presEntretenimiento.add(label_11);
		
		panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(new Color(0, 153, 255));
		panel_24.setBounds(138, 158, 252, 473);
		presEntretenimiento.add(panel_24);
		
		lblEntretenimiento = new JLabel("Entretenimiento");
		lblEntretenimiento.setForeground(Color.WHITE);
		lblEntretenimiento.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEntretenimiento.setBounds(47, 199, 163, 31);
		panel_24.add(lblEntretenimiento);
		
		panel_25 = new JPanel();
		panel_25.setBackground(new Color(0, 153, 255));
		panel_25.setBounds(423, 160, 252, 33);
		presEntretenimiento.add(panel_25);
		panel_25.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblEntretenimiento_1 = new JLabel("Entretenimiento");
		lblEntretenimiento_1.setForeground(Color.WHITE);
		lblEntretenimiento_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_25.add(lblEntretenimiento_1);
		
		fieldEntretenimientoTotal = new JTextField();
		fieldEntretenimientoTotal.setText("0");
		fieldEntretenimientoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimientoTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldEntretenimientoTotal.setColumns(10);
		fieldEntretenimientoTotal.setBounds(695, 160, 196, 33);
		presEntretenimiento.add(fieldEntretenimientoTotal);
		
		label_16 = new JLabel("Subcategor\u00EDas");
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_16.setBounds(568, 213, 107, 31);
		presEntretenimiento.add(label_16);
		
		panel_26 = new JPanel();
		panel_26.setBackground(new Color(0, 153, 255));
		panel_26.setBounds(423, 255, 252, 33);
		presEntretenimiento.add(panel_26);
		
		lblCineYMusica = new JLabel("Cine y M\u00FAsica");
		lblCineYMusica.setForeground(Color.WHITE);
		lblCineYMusica.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_26.add(lblCineYMusica);
		
		fieldEntretenimiento2 = new JTextField();
		fieldEntretenimiento2.setText("0");
		fieldEntretenimiento2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento2.setColumns(10);
		fieldEntretenimiento2.setBounds(695, 255, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento2);
		
		panel_27 = new JPanel();
		panel_27.setBackground(new Color(0, 153, 255));
		panel_27.setBounds(423, 309, 252, 33);
		presEntretenimiento.add(panel_27);
		
		lblJuegosYVideojuegos = new JLabel("Juegos y Videojuegos");
		lblJuegosYVideojuegos.setForeground(Color.WHITE);
		lblJuegosYVideojuegos.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_27.add(lblJuegosYVideojuegos);
		
		fieldEntretenimiento3 = new JTextField();
		fieldEntretenimiento3.setText("0");
		fieldEntretenimiento3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento3.setColumns(10);
		fieldEntretenimiento3.setBounds(695, 309, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento3);
		
		panel_28 = new JPanel();
		panel_28.setBackground(new Color(0, 153, 255));
		panel_28.setBounds(423, 364, 252, 33);
		presEntretenimiento.add(panel_28);
		
		lblMuseosYParques = new JLabel("Museos y Parques");
		lblMuseosYParques.setForeground(Color.WHITE);
		lblMuseosYParques.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_28.add(lblMuseosYParques);
		
		fieldEntretenimiento4 = new JTextField();
		fieldEntretenimiento4.setText("0");
		fieldEntretenimiento4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento4.setColumns(10);
		fieldEntretenimiento4.setBounds(695, 364, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento4);
		
		panel_29 = new JPanel();
		panel_29.setBackground(new Color(0, 153, 255));
		panel_29.setBounds(423, 417, 252, 33);
		presEntretenimiento.add(panel_29);
		
		lblSubscripcionesYApps = new JLabel("Subscripciones y Apps");
		lblSubscripcionesYApps.setForeground(Color.WHITE);
		lblSubscripcionesYApps.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_29.add(lblSubscripcionesYApps);
		
		fieldEntretenimiento5 = new JTextField();
		fieldEntretenimiento5.setText("0");
		fieldEntretenimiento5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento5.setColumns(10);
		fieldEntretenimiento5.setBounds(695, 417, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento5);
		
		panel_30 = new JPanel();
		panel_30.setBackground(new Color(0, 153, 255));
		panel_30.setBounds(423, 471, 252, 33);
		presEntretenimiento.add(panel_30);
		
		lblAlcoholYTabaco = new JLabel("Alcohol y Tabaco");
		lblAlcoholYTabaco.setForeground(Color.WHITE);
		lblAlcoholYTabaco.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_30.add(lblAlcoholYTabaco);
		
		fieldEntretenimiento6 = new JTextField();
		fieldEntretenimiento6.setText("0");
		fieldEntretenimiento6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento6.setColumns(10);
		fieldEntretenimiento6.setBounds(695, 471, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento6);
		
		panel_31 = new JPanel();
		panel_31.setBackground(new Color(0, 153, 255));
		panel_31.setBounds(423, 526, 252, 33);
		presEntretenimiento.add(panel_31);
		
		lblEspectaculosYEventos = new JLabel("Espect\u00E1culos y Eventos");
		lblEspectaculosYEventos.setForeground(Color.WHITE);
		lblEspectaculosYEventos.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_31.add(lblEspectaculosYEventos);
		
		fieldEntretenimiento7 = new JTextField();
		fieldEntretenimiento7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento7.setText("0");
		fieldEntretenimiento7.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento7.setColumns(10);
		fieldEntretenimiento7.setBounds(695, 526, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento7);
		
		panel_32 = new JPanel();
		panel_32.setBackground(new Color(0, 153, 255));
		panel_32.setBounds(423, 578, 252, 33);
		presEntretenimiento.add(panel_32);
		
		label_24 = new JLabel("Otros");
		label_24.setForeground(Color.WHITE);
		label_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_32.add(label_24);
		
		fieldEntretenimiento8 = new JTextField();
		fieldEntretenimiento8.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEntretenimiento8.setText("0");
		fieldEntretenimiento8.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntretenimiento8.setColumns(10);
		fieldEntretenimiento8.setBounds(695, 578, 196, 33);
		presEntretenimiento.add(fieldEntretenimiento8);
		
		btnEntretenimientoGuardar = new JButton("Guardar");
		MiListener oyentebtnEntretenimientoGuardar = new MiListener();
		btnEntretenimientoGuardar.addActionListener(oyentebtnEntretenimientoGuardar);
		btnEntretenimientoGuardar.setForeground(Color.WHITE);
		btnEntretenimientoGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEntretenimientoGuardar.setBackground(new Color(1, 162, 82));
		btnEntretenimientoGuardar.setBounds(715, 622, 155, 33);
		presEntretenimiento.add(btnEntretenimientoGuardar);
		
		btnEntretenimientoRegresar = new JButton("Regresar");
		btnEntretenimientoRegresar.addActionListener(oyenteBtnEntretenimientoRegresar);
		btnEntretenimientoRegresar.setForeground(Color.WHITE);
		btnEntretenimientoRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEntretenimientoRegresar.setBackground(new Color(0, 204, 153));
		btnEntretenimientoRegresar.setBounds(10, 11, 137, 33);
		btnEntretenimientoRegresar.setBorder(null);
		presEntretenimiento.add(btnEntretenimientoRegresar);
		
		presSalud = new JPanel();
		presSalud.setBackground(new Color(255, 255, 255));
		presupuestos.add(presSalud, "name_93546162884562");
		presSalud.setLayout(null);
		
		JLabel label_13 = new JLabel("Editar tu presupuesto");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_13.setBounds(429, 42, 196, 25);
		presSalud.add(label_13);
		
		JLabel label_15 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_15.setBounds(334, 78, 404, 25);
		presSalud.add(label_15);
		
		JPanel panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBackground(new Color(0, 153, 255));
		panel_33.setBounds(128, 149, 252, 473);
		presSalud.add(panel_33);
		
		JLabel lblSaludYBelleza = new JLabel("Salud y Belleza");
		lblSaludYBelleza.setForeground(Color.WHITE);
		lblSaludYBelleza.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSaludYBelleza.setBounds(47, 199, 163, 31);
		panel_33.add(lblSaludYBelleza);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(0, 153, 255));
		panel_34.setBounds(413, 151, 252, 33);
		presSalud.add(panel_34);
		panel_34.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblSaludYBelleza_1 = new JLabel("Salud y Belleza");
		lblSaludYBelleza_1.setForeground(Color.WHITE);
		lblSaludYBelleza_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_34.add(lblSaludYBelleza_1);
		
		fieldSaludTotal = new JTextField();
		fieldSaludTotal.setText("0");
		fieldSaludTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSaludTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldSaludTotal.setColumns(10);
		fieldSaludTotal.setBounds(685, 151, 196, 33);
		presSalud.add(fieldSaludTotal);
		
		JLabel label_19 = new JLabel("Subcategor\u00EDas");
		label_19.setForeground(Color.BLACK);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_19.setBounds(558, 204, 107, 31);
		presSalud.add(label_19);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(new Color(0, 153, 255));
		panel_35.setBounds(413, 246, 252, 33);
		presSalud.add(panel_35);
		
		JLabel lblPerfumesYCosmeticos = new JLabel("Perfumes y cosm\u00E9ticos");
		lblPerfumesYCosmeticos.setForeground(Color.WHITE);
		lblPerfumesYCosmeticos.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_35.add(lblPerfumesYCosmeticos);
		
		fieldSalud2 = new JTextField();
		fieldSalud2.setText("0");
		fieldSalud2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSalud2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldSalud2.setColumns(10);
		fieldSalud2.setBounds(685, 246, 196, 33);
		presSalud.add(fieldSalud2);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(new Color(0, 153, 255));
		panel_36.setBounds(413, 300, 252, 33);
		presSalud.add(panel_36);
		
		JLabel lblSalonDeBelleza = new JLabel("Cuidado Personal");
		lblSalonDeBelleza.setForeground(Color.WHITE);
		lblSalonDeBelleza.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_36.add(lblSalonDeBelleza);
		
		fieldSalud3 = new JTextField();
		fieldSalud3.setText("0");
		fieldSalud3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSalud3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldSalud3.setColumns(10);
		fieldSalud3.setBounds(685, 300, 196, 33);
		presSalud.add(fieldSalud3);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(new Color(0, 153, 255));
		panel_37.setBounds(413, 355, 252, 33);
		presSalud.add(panel_37);
		
		JLabel lblDentisat = new JLabel("Dentista");
		lblDentisat.setForeground(Color.WHITE);
		lblDentisat.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_37.add(lblDentisat);
		
		fieldSalud4 = new JTextField();
		fieldSalud4.setText("0");
		fieldSalud4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSalud4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldSalud4.setColumns(10);
		fieldSalud4.setBounds(685, 355, 196, 33);
		presSalud.add(fieldSalud4);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(new Color(0, 153, 255));
		panel_38.setBounds(413, 408, 252, 33);
		presSalud.add(panel_38);
		
		JLabel lblDeportesYEquipos = new JLabel("Deportes y Equipos deportivos");
		lblDeportesYEquipos.setForeground(Color.WHITE);
		lblDeportesYEquipos.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_38.add(lblDeportesYEquipos);
		
		fieldSalud5 = new JTextField();
		fieldSalud5.setText("0");
		fieldSalud5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSalud5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldSalud5.setColumns(10);
		fieldSalud5.setBounds(685, 408, 196, 33);
		presSalud.add(fieldSalud5);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(new Color(0, 153, 255));
		panel_39.setBounds(413, 462, 252, 33);
		presSalud.add(panel_39);
		
		JLabel lblFarmacia = new JLabel("Farmacia");
		lblFarmacia.setForeground(Color.WHITE);
		lblFarmacia.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_39.add(lblFarmacia);
		
		fieldSalud6 = new JTextField();
		fieldSalud6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldSalud6.setText("0");
		fieldSalud6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSalud6.setColumns(10);
		fieldSalud6.setBounds(685, 462, 196, 33);
		presSalud.add(fieldSalud6);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(new Color(0, 153, 255));
		panel_40.setBounds(413, 517, 252, 33);
		presSalud.add(panel_40);
		
		JLabel lblMedico = new JLabel("M\u00E9dico");
		lblMedico.setForeground(Color.WHITE);
		lblMedico.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_40.add(lblMedico);
		
		fieldSalud7 = new JTextField();
		fieldSalud7.setText("0");
		fieldSalud7.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSalud7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldSalud7.setColumns(10);
		fieldSalud7.setBounds(685, 517, 196, 33);
		presSalud.add(fieldSalud7);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(new Color(0, 153, 255));
		panel_41.setBounds(413, 569, 252, 33);
		presSalud.add(panel_41);
		
		JLabel label_28 = new JLabel("Otros");
		label_28.setForeground(Color.WHITE);
		label_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_41.add(label_28);
		
		fieldSalud8 = new JTextField();
		fieldSalud8.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldSalud8.setText("0");
		fieldSalud8.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSalud8.setColumns(10);
		fieldSalud8.setBounds(685, 569, 196, 33);
		presSalud.add(fieldSalud8);
		
		btnSaludGuardar = new JButton("Guardar");
		MiListener oyentebtnSaludGuardar = new MiListener();
		btnSaludGuardar.addActionListener(oyentebtnSaludGuardar);
		btnSaludGuardar.setForeground(Color.WHITE);
		btnSaludGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSaludGuardar.setBackground(new Color(1, 162, 82));
		btnSaludGuardar.setBounds(705, 613, 155, 33);
		presSalud.add(btnSaludGuardar);
		
		btnSaludRegresar = new JButton("Regresar");
		btnSaludRegresar.addActionListener(oyenteBtnSaludRegresar);
		btnSaludRegresar.setForeground(Color.WHITE);
		btnSaludRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSaludRegresar.setBackground(new Color(0, 204, 153));
		btnSaludRegresar.setBounds(10, 11, 137, 33);
		btnSaludRegresar.setBorder(null);
		presSalud.add(btnSaludRegresar);
		
		presEducacion = new JPanel();
		presEducacion.setBackground(new Color(255, 255, 255));
		presupuestos.add(presEducacion, "name_93556950205240");
		presEducacion.setLayout(null);
		
		label_17 = new JLabel("Editar tu presupuesto");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_17.setBounds(432, 47, 196, 25);
		presEducacion.add(label_17);
		
		label_18 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_18.setBounds(337, 83, 404, 25);
		presEducacion.add(label_18);
		
		panel_42 = new JPanel();
		panel_42.setLayout(null);
		panel_42.setBackground(new Color(0, 153, 255));
		panel_42.setBounds(131, 154, 252, 473);
		presEducacion.add(panel_42);
		
		lblEducacion = new JLabel("Educaci\u00F3n");
		lblEducacion.setForeground(Color.WHITE);
		lblEducacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEducacion.setBounds(47, 199, 163, 31);
		panel_42.add(lblEducacion);
		
		panel_43 = new JPanel();
		panel_43.setBackground(new Color(0, 153, 255));
		panel_43.setBounds(416, 156, 252, 33);
		presEducacion.add(panel_43);
		panel_43.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblEducacion_1 = new JLabel("Educaci\u00F3n");
		lblEducacion_1.setForeground(Color.WHITE);
		lblEducacion_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_43.add(lblEducacion_1);
		
		fieldEducacionTotal = new JTextField();
		fieldEducacionTotal.setText("0");
		fieldEducacionTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEducacionTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldEducacionTotal.setColumns(10);
		fieldEducacionTotal.setBounds(688, 156, 196, 33);
		presEducacion.add(fieldEducacionTotal);
		
		label_23 = new JLabel("Subcategor\u00EDas");
		label_23.setForeground(Color.BLACK);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_23.setBounds(561, 209, 107, 31);
		presEducacion.add(label_23);
		
		panel_44 = new JPanel();
		panel_44.setBackground(new Color(0, 153, 255));
		panel_44.setBounds(416, 251, 252, 33);
		presEducacion.add(panel_44);
		
		lblColegiatura = new JLabel("Colegiatura");
		lblColegiatura.setForeground(Color.WHITE);
		lblColegiatura.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_44.add(lblColegiatura);
		
		fieldEducacion2 = new JTextField();
		fieldEducacion2.setText("0");
		fieldEducacion2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEducacion2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEducacion2.setColumns(10);
		fieldEducacion2.setBounds(688, 251, 196, 33);
		presEducacion.add(fieldEducacion2);
		
		panel_45 = new JPanel();
		panel_45.setBackground(new Color(0, 153, 255));
		panel_45.setBounds(416, 305, 252, 33);
		presEducacion.add(panel_45);
		
		lblPapeleria = new JLabel("Papeler\u00EDa");
		lblPapeleria.setForeground(Color.WHITE);
		lblPapeleria.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_45.add(lblPapeleria);
		
		fieldEducacion3 = new JTextField();
		fieldEducacion3.setText("0");
		fieldEducacion3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEducacion3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEducacion3.setColumns(10);
		fieldEducacion3.setBounds(688, 305, 196, 33);
		presEducacion.add(fieldEducacion3);
		
		panel_46 = new JPanel();
		panel_46.setBackground(new Color(0, 153, 255));
		panel_46.setBounds(416, 360, 252, 33);
		presEducacion.add(panel_46);
		
		lblLibros = new JLabel("Libros");
		lblLibros.setForeground(Color.WHITE);
		lblLibros.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_46.add(lblLibros);
		
		fieldEducacion4 = new JTextField();
		fieldEducacion4.setText("0");
		fieldEducacion4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEducacion4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEducacion4.setColumns(10);
		fieldEducacion4.setBounds(688, 360, 196, 33);
		presEducacion.add(fieldEducacion4);
		
		panel_47 = new JPanel();
		panel_47.setBackground(new Color(0, 153, 255));
		panel_47.setBounds(416, 413, 252, 33);
		presEducacion.add(panel_47);
		
		lblSotfware = new JLabel("Sotfware");
		lblSotfware.setForeground(Color.WHITE);
		lblSotfware.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_47.add(lblSotfware);
		
		fieldEducacion5 = new JTextField();
		fieldEducacion5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEducacion5.setText("0");
		fieldEducacion5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEducacion5.setColumns(10);
		fieldEducacion5.setBounds(688, 413, 196, 33);
		presEducacion.add(fieldEducacion5);
		
		panel_48 = new JPanel();
		panel_48.setBackground(new Color(0, 153, 255));
		panel_48.setBounds(416, 467, 252, 33);
		presEducacion.add(panel_48);
		
		lblCreditoEstudiantil = new JLabel("Cr\u00E9dito Estudiantil");
		lblCreditoEstudiantil.setForeground(Color.WHITE);
		lblCreditoEstudiantil.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_48.add(lblCreditoEstudiantil);
		
		fieldEducacion6 = new JTextField();
		fieldEducacion6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEducacion6.setText("0");
		fieldEducacion6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEducacion6.setColumns(10);
		fieldEducacion6.setBounds(688, 467, 196, 33);
		presEducacion.add(fieldEducacion6);
		
		panel_49 = new JPanel();
		panel_49.setBackground(new Color(0, 153, 255));
		panel_49.setBounds(416, 522, 252, 33);
		presEducacion.add(panel_49);
		
		lblViajesEscolares = new JLabel("Viajes Escolares");
		lblViajesEscolares.setForeground(Color.WHITE);
		lblViajesEscolares.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_49.add(lblViajesEscolares);
		
		fieldEducacion7 = new JTextField();
		fieldEducacion7.setText("0");
		fieldEducacion7.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEducacion7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEducacion7.setColumns(10);
		fieldEducacion7.setBounds(688, 522, 196, 33);
		presEducacion.add(fieldEducacion7);
		
		panel_50 = new JPanel();
		panel_50.setBackground(new Color(0, 153, 255));
		panel_50.setBounds(416, 574, 252, 33);
		presEducacion.add(panel_50);
		
		label_32 = new JLabel("Otros");
		label_32.setForeground(Color.WHITE);
		label_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_50.add(label_32);
		
		fieldEducacion8 = new JTextField();
		fieldEducacion8.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldEducacion8.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEducacion8.setText("0");
		fieldEducacion8.setColumns(10);
		fieldEducacion8.setBounds(688, 574, 196, 33);
		presEducacion.add(fieldEducacion8);
		
		btnEducacionGuardar = new JButton("Guardar");
		MiListener oyentebtnEducacionGuardar = new MiListener();
		btnEducacionGuardar.addActionListener(oyentebtnEducacionGuardar);
		btnEducacionGuardar.setForeground(Color.WHITE);
		btnEducacionGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEducacionGuardar.setBackground(new Color(1, 162, 82));
		btnEducacionGuardar.setBounds(708, 618, 155, 33);
		presEducacion.add(btnEducacionGuardar);
		
		btnEducacionRegresar = new JButton("Regresar");
		btnEducacionRegresar.addActionListener(oyenteBtnEducacionRegresar);
		btnEducacionRegresar.setForeground(Color.WHITE);
		btnEducacionRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEducacionRegresar.setBackground(new Color(0, 204, 153));
		btnEducacionRegresar.setBounds(10, 11, 137, 33);
		btnEducacionRegresar.setBorder(null);
		presEducacion.add(btnEducacionRegresar);
		
		presFinanzas = new JPanel();
		presFinanzas.setBackground(new Color(255, 255, 255));
		presupuestos.add(presFinanzas, "name_93560809709073");
		presFinanzas.setLayout(null);
		
		label_21 = new JLabel("Editar tu presupuesto");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_21.setBounds(439, 50, 196, 25);
		presFinanzas.add(label_21);
		
		label_22 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_22.setBounds(344, 86, 404, 25);
		presFinanzas.add(label_22);
		
		panel_51 = new JPanel();
		panel_51.setLayout(null);
		panel_51.setBackground(new Color(0, 153, 255));
		panel_51.setBounds(138, 157, 252, 473);
		presFinanzas.add(panel_51);
		
		lblFinanzasEImpuestos = new JLabel("Finanzas e Impuestos");
		lblFinanzasEImpuestos.setForeground(Color.WHITE);
		lblFinanzasEImpuestos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFinanzasEImpuestos.setBounds(10, 217, 220, 31);
		panel_51.add(lblFinanzasEImpuestos);
		
		panel_52 = new JPanel();
		panel_52.setBackground(new Color(0, 153, 255));
		panel_52.setBounds(423, 159, 252, 33);
		presFinanzas.add(panel_52);
		panel_52.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblFinanzasEImpuestos_1 = new JLabel("Finanzas e Impuestos");
		lblFinanzasEImpuestos_1.setForeground(Color.WHITE);
		lblFinanzasEImpuestos_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_52.add(lblFinanzasEImpuestos_1);
		
		fieldFinanzasTotal = new JTextField();
		fieldFinanzasTotal.setText("0");
		fieldFinanzasTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldFinanzasTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldFinanzasTotal.setColumns(10);
		fieldFinanzasTotal.setBounds(695, 159, 196, 33);
		presFinanzas.add(fieldFinanzasTotal);
		
		label_27 = new JLabel("Subcategor\u00EDas");
		label_27.setForeground(Color.BLACK);
		label_27.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_27.setBounds(568, 212, 107, 31);
		presFinanzas.add(label_27);
		
		panel_53 = new JPanel();
		panel_53.setBackground(new Color(0, 153, 255));
		panel_53.setBounds(423, 254, 252, 33);
		presFinanzas.add(panel_53);
		
		lblSeguros = new JLabel("Seguros");
		lblSeguros.setForeground(Color.WHITE);
		lblSeguros.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_53.add(lblSeguros);
		
		fieldFinanzas2 = new JTextField();
		fieldFinanzas2.setText("0");
		fieldFinanzas2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldFinanzas2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldFinanzas2.setColumns(10);
		fieldFinanzas2.setBounds(695, 254, 196, 33);
		presFinanzas.add(fieldFinanzas2);
		
		panel_54 = new JPanel();
		panel_54.setBackground(new Color(0, 153, 255));
		panel_54.setBounds(423, 308, 252, 33);
		presFinanzas.add(panel_54);
		
		lblImpuestos = new JLabel("Impuestos");
		lblImpuestos.setForeground(Color.WHITE);
		lblImpuestos.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_54.add(lblImpuestos);
		
		fieldFinanzas3 = new JTextField();
		fieldFinanzas3.setText("0");
		fieldFinanzas3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldFinanzas3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldFinanzas3.setColumns(10);
		fieldFinanzas3.setBounds(695, 308, 196, 33);
		presFinanzas.add(fieldFinanzas3);
		
		panel_55 = new JPanel();
		panel_55.setBackground(new Color(0, 153, 255));
		panel_55.setBounds(423, 363, 252, 33);
		presFinanzas.add(panel_55);
		
		lblMultas = new JLabel("Multas");
		lblMultas.setForeground(Color.WHITE);
		lblMultas.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_55.add(lblMultas);
		
		fieldFinanzas4 = new JTextField();
		fieldFinanzas4.setText("0");
		fieldFinanzas4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldFinanzas4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldFinanzas4.setColumns(10);
		fieldFinanzas4.setBounds(695, 363, 196, 33);
		presFinanzas.add(fieldFinanzas4);
		
		panel_56 = new JPanel();
		panel_56.setBackground(new Color(0, 153, 255));
		panel_56.setBounds(423, 416, 252, 33);
		presFinanzas.add(panel_56);
		
		lblServiciosFinanz = new JLabel("Servicios Financieros");
		lblServiciosFinanz.setForeground(Color.WHITE);
		lblServiciosFinanz.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_56.add(lblServiciosFinanz);
		
		fieldFinanzas5 = new JTextField();
		fieldFinanzas5.setText("0");
		fieldFinanzas5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldFinanzas5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldFinanzas5.setColumns(10);
		fieldFinanzas5.setBounds(695, 416, 196, 33);
		presFinanzas.add(fieldFinanzas5);
		
		panel_57 = new JPanel();
		panel_57.setBackground(new Color(0, 153, 255));
		panel_57.setBounds(423, 470, 252, 33);
		presFinanzas.add(panel_57);
		
		lblTransferenciasOChec = new JLabel("Transferencias o Cheques");
		lblTransferenciasOChec.setForeground(Color.WHITE);
		lblTransferenciasOChec.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_57.add(lblTransferenciasOChec);
		
		fieldFinanzas6 = new JTextField();
		fieldFinanzas6.setText("0");
		fieldFinanzas6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldFinanzas6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldFinanzas6.setColumns(10);
		fieldFinanzas6.setBounds(695, 470, 196, 33);
		presFinanzas.add(fieldFinanzas6);
		
		panel_58 = new JPanel();
		panel_58.setBackground(new Color(0, 153, 255));
		panel_58.setBounds(423, 525, 252, 33);
		presFinanzas.add(panel_58);
		
		lblTarjetasDeCredito = new JLabel("Tarjetas de Cr\u00E9dito");
		lblTarjetasDeCredito.setForeground(Color.WHITE);
		lblTarjetasDeCredito.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_58.add(lblTarjetasDeCredito);
		
		fieldFinanzas7 = new JTextField();
		fieldFinanzas7.setText("0");
		fieldFinanzas7.setHorizontalAlignment(SwingConstants.CENTER);
		fieldFinanzas7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldFinanzas7.setColumns(10);
		fieldFinanzas7.setBounds(695, 525, 196, 33);
		presFinanzas.add(fieldFinanzas7);
		
		panel_59 = new JPanel();
		panel_59.setBackground(new Color(0, 153, 255));
		panel_59.setBounds(423, 577, 252, 33);
		presFinanzas.add(panel_59);
		
		label_36 = new JLabel("Otros");
		label_36.setForeground(Color.WHITE);
		label_36.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_59.add(label_36);
		
		fieldFinanzas8 = new JTextField();
		fieldFinanzas8.setText("0");
		fieldFinanzas8.setHorizontalAlignment(SwingConstants.CENTER);
		fieldFinanzas8.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldFinanzas8.setColumns(10);
		fieldFinanzas8.setBounds(695, 577, 196, 33);
		presFinanzas.add(fieldFinanzas8);
		
		btnFinanzasGuardar = new JButton("Guardar");
		MiListener oyentebtnFinanzasGuardar = new MiListener();
		btnFinanzasGuardar.addActionListener(oyentebtnFinanzasGuardar);
		btnFinanzasGuardar.setForeground(Color.WHITE);
		btnFinanzasGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFinanzasGuardar.setBackground(new Color(1, 162, 82));
		btnFinanzasGuardar.setBounds(715, 621, 155, 33);
		presFinanzas.add(btnFinanzasGuardar);
		
		btnFinanzasRegresar = new JButton("Regresar");
		btnFinanzasRegresar.addActionListener(oyenteBtnFinanzasRegresar);
		btnFinanzasRegresar.setForeground(Color.WHITE);
		btnFinanzasRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFinanzasRegresar.setBackground(new Color(0, 204, 153));
		btnFinanzasRegresar.setBounds(10, 11, 137, 33);
		btnFinanzasRegresar.setBorder(null);
		presFinanzas.add(btnFinanzasRegresar);
		
		presRopa = new JPanel();
		presRopa.setBackground(new Color(255, 255, 255));
		presupuestos.add(presRopa, "name_93605216254044");
		presRopa.setLayout(null);
		
		label_25 = new JLabel("Editar tu presupuesto");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_25.setBounds(434, 46, 196, 25);
		presRopa.add(label_25);
		
		label_26 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_26.setBounds(339, 82, 404, 25);
		presRopa.add(label_26);
		
		panel_60 = new JPanel();
		panel_60.setLayout(null);
		panel_60.setBackground(new Color(0, 153, 255));
		panel_60.setBounds(133, 153, 252, 473);
		presRopa.add(panel_60);
		
		lblRopaYCalzado = new JLabel("Ropa y Calzado");
		lblRopaYCalzado.setForeground(Color.WHITE);
		lblRopaYCalzado.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRopaYCalzado.setBounds(47, 199, 163, 31);
		panel_60.add(lblRopaYCalzado);
		
		panel_61 = new JPanel();
		panel_61.setBackground(new Color(0, 153, 255));
		panel_61.setBounds(418, 201, 252, 33);
		presRopa.add(panel_61);
		panel_61.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblRopaYCalzado_1 = new JLabel("Ropa y Calzado");
		lblRopaYCalzado_1.setForeground(Color.WHITE);
		lblRopaYCalzado_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_61.add(lblRopaYCalzado_1);
		
		fieldRopaTotal = new JTextField();
		fieldRopaTotal.setText("0");
		fieldRopaTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRopaTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldRopaTotal.setColumns(10);
		fieldRopaTotal.setBounds(690, 201, 196, 33);
		presRopa.add(fieldRopaTotal);
		
		label_31 = new JLabel("Subcategor\u00EDas");
		label_31.setForeground(Color.BLACK);
		label_31.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_31.setBounds(563, 270, 107, 31);
		presRopa.add(label_31);
		
		panel_62 = new JPanel();
		panel_62.setBackground(new Color(0, 153, 255));
		panel_62.setBounds(418, 312, 252, 33);
		presRopa.add(panel_62);
		
		lblCalzado = new JLabel("Calzado");
		lblCalzado.setForeground(Color.WHITE);
		lblCalzado.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_62.add(lblCalzado);
		
		fieldRopa2 = new JTextField();
		fieldRopa2.setText("0");
		fieldRopa2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRopa2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRopa2.setColumns(10);
		fieldRopa2.setBounds(690, 312, 196, 33);
		presRopa.add(fieldRopa2);
		
		panel_63 = new JPanel();
		panel_63.setBackground(new Color(0, 153, 255));
		panel_63.setBounds(418, 366, 252, 33);
		presRopa.add(panel_63);
		
		lblAccesorios = new JLabel("Accesorios");
		lblAccesorios.setForeground(Color.WHITE);
		lblAccesorios.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_63.add(lblAccesorios);
		
		fieldRopa3 = new JTextField();
		fieldRopa3.setText("0");
		fieldRopa3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRopa3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRopa3.setColumns(10);
		fieldRopa3.setBounds(690, 366, 196, 33);
		presRopa.add(fieldRopa3);
		
		panel_64 = new JPanel();
		panel_64.setBackground(new Color(0, 153, 255));
		panel_64.setBounds(418, 421, 252, 33);
		presRopa.add(panel_64);
		
		lblLavanderiaYTintoreria = new JLabel("Lavander\u00EDa y Tintorer\u00EDa");
		lblLavanderiaYTintoreria.setForeground(Color.WHITE);
		lblLavanderiaYTintoreria.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_64.add(lblLavanderiaYTintoreria);
		
		fieldRopa4 = new JTextField();
		fieldRopa4.setText("0");
		fieldRopa4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRopa4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRopa4.setColumns(10);
		fieldRopa4.setBounds(690, 421, 196, 33);
		presRopa.add(fieldRopa4);
		
		panel_65 = new JPanel();
		panel_65.setBackground(new Color(0, 153, 255));
		panel_65.setBounds(418, 474, 252, 33);
		presRopa.add(panel_65);
		
		lblRopa = new JLabel("Ropa");
		lblRopa.setForeground(Color.WHITE);
		lblRopa.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_65.add(lblRopa);
		
		fieldRopa5 = new JTextField();
		fieldRopa5.setText("0");
		fieldRopa5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRopa5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRopa5.setColumns(10);
		fieldRopa5.setBounds(690, 474, 196, 33);
		presRopa.add(fieldRopa5);
		
		panel_68 = new JPanel();
		panel_68.setBackground(new Color(0, 153, 255));
		panel_68.setBounds(418, 528, 252, 33);
		presRopa.add(panel_68);
		
		label_40 = new JLabel("Otros");
		label_40.setForeground(Color.WHITE);
		label_40.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_68.add(label_40);
		
		fieldRopa6 = new JTextField();
		fieldRopa6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRopa6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRopa6.setText("0");
		fieldRopa6.setColumns(10);
		fieldRopa6.setBounds(690, 528, 196, 33);
		presRopa.add(fieldRopa6);
		
		btnRopaGuardar = new JButton("Guardar");
		MiListener oyentebtnRopaGuardar = new MiListener();
		btnRopaGuardar.addActionListener(oyentebtnRopaGuardar);
		btnRopaGuardar.setForeground(Color.WHITE);
		btnRopaGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRopaGuardar.setBackground(new Color(1, 162, 82));
		btnRopaGuardar.setBounds(710, 572, 155, 33);
		presRopa.add(btnRopaGuardar);
		
		btnRopaRegresar = new JButton("Regresar");
		btnRopaRegresar.addActionListener(oyenteBtnRopaRegresar);
		btnRopaRegresar.setForeground(Color.WHITE);
		btnRopaRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRopaRegresar.setBackground(new Color(0, 204, 153));
		btnRopaRegresar.setBounds(10, 11, 137, 33);
		btnRopaRegresar.setBorder(null);
		presRopa.add(btnRopaRegresar);
		
		presRegalos = new JPanel();
		presRegalos.setBackground(new Color(255, 255, 255));
		presupuestos.add(presRegalos, "name_93610422125253");
		presRegalos.setLayout(null);
		
		label_29 = new JLabel("Editar tu presupuesto");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_29.setBounds(436, 48, 196, 25);
		presRegalos.add(label_29);
		
		label_30 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_30.setBounds(341, 84, 404, 25);
		presRegalos.add(label_30);
		
		panel_66 = new JPanel();
		panel_66.setLayout(null);
		panel_66.setBackground(new Color(0, 153, 255));
		panel_66.setBounds(135, 155, 252, 473);
		presRegalos.add(panel_66);
		
		lblRegalosYAyuda = new JLabel("Regalos y Ayuda");
		lblRegalosYAyuda.setForeground(Color.WHITE);
		lblRegalosYAyuda.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegalosYAyuda.setBounds(43, 200, 175, 31);
		panel_66.add(lblRegalosYAyuda);
		
		panel_67 = new JPanel();
		panel_67.setBackground(new Color(0, 153, 255));
		panel_67.setBounds(420, 190, 252, 33);
		presRegalos.add(panel_67);
		panel_67.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblRegalosYAyuda_1 = new JLabel("Regalos y Ayuda");
		lblRegalosYAyuda_1.setForeground(Color.WHITE);
		lblRegalosYAyuda_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_67.add(lblRegalosYAyuda_1);
		
		fieldRegalosTotal = new JTextField();
		fieldRegalosTotal.setText("0");
		fieldRegalosTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalosTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldRegalosTotal.setColumns(10);
		fieldRegalosTotal.setBounds(692, 190, 196, 33);
		presRegalos.add(fieldRegalosTotal);
		
		label_35 = new JLabel("Subcategor\u00EDas");
		label_35.setForeground(Color.BLACK);
		label_35.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_35.setBounds(565, 270, 107, 31);
		presRegalos.add(label_35);
		
		panel_69 = new JPanel();
		panel_69.setBackground(new Color(0, 153, 255));
		panel_69.setBounds(420, 312, 252, 33);
		presRegalos.add(panel_69);
		
		lblDonaciones = new JLabel("Donaciones");
		lblDonaciones.setForeground(Color.WHITE);
		lblDonaciones.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_69.add(lblDonaciones);
		
		fieldRegalos2 = new JTextField();
		fieldRegalos2.setText("0");
		fieldRegalos2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos2.setColumns(10);
		fieldRegalos2.setBounds(692, 312, 196, 33);
		presRegalos.add(fieldRegalos2);
		
		panel_70 = new JPanel();
		panel_70.setBackground(new Color(0, 153, 255));
		panel_70.setBounds(420, 366, 252, 33);
		presRegalos.add(panel_70);
		
		lblApoyoAFamiliaresamigos = new JLabel("Apoyo a Familiares/Amigos");
		lblApoyoAFamiliaresamigos.setForeground(Color.WHITE);
		lblApoyoAFamiliaresamigos.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_70.add(lblApoyoAFamiliaresamigos);
		
		fieldRegalos3 = new JTextField();
		fieldRegalos3.setText("0");
		fieldRegalos3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos3.setColumns(10);
		fieldRegalos3.setBounds(692, 366, 196, 33);
		presRegalos.add(fieldRegalos3);
		
		panel_71 = new JPanel();
		panel_71.setBackground(new Color(0, 153, 255));
		panel_71.setBounds(420, 421, 252, 33);
		presRegalos.add(panel_71);
		
		lblRegalos = new JLabel("Regalos");
		lblRegalos.setForeground(Color.WHITE);
		lblRegalos.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_71.add(lblRegalos);
		
		fieldRegalos4 = new JTextField();
		fieldRegalos4.setText("0");
		fieldRegalos4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos4.setColumns(10);
		fieldRegalos4.setBounds(692, 421, 196, 33);
		presRegalos.add(fieldRegalos4);
		
		panel_72 = new JPanel();
		panel_72.setBackground(new Color(0, 153, 255));
		panel_72.setBounds(420, 474, 252, 33);
		presRegalos.add(panel_72);
		
		lblAyudaHumanitaria = new JLabel("Ayuda Humanitaria");
		lblAyudaHumanitaria.setForeground(Color.WHITE);
		lblAyudaHumanitaria.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_72.add(lblAyudaHumanitaria);
		
		fieldRegalos5 = new JTextField();
		fieldRegalos5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos5.setText("0");
		fieldRegalos5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos5.setColumns(10);
		fieldRegalos5.setBounds(692, 474, 196, 33);
		presRegalos.add(fieldRegalos5);
		
		panel_75 = new JPanel();
		panel_75.setBackground(new Color(0, 153, 255));
		panel_75.setBounds(420, 528, 252, 33);
		presRegalos.add(panel_75);
		
		label_44 = new JLabel("Otros");
		label_44.setForeground(Color.WHITE);
		label_44.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_75.add(label_44);
		
		fieldRegalos6 = new JTextField();
		fieldRegalos6.setText("0");
		fieldRegalos6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRegalos6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldRegalos6.setColumns(10);
		fieldRegalos6.setBounds(692, 528, 196, 33);
		presRegalos.add(fieldRegalos6);
		
		btnRegalosGuardar = new JButton("Guardar");
		MiListener oyentebtnRegalosGuardar = new MiListener();
		btnRegalosGuardar.addActionListener(oyentebtnRegalosGuardar);
		btnRegalosGuardar.setForeground(Color.WHITE);
		btnRegalosGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegalosGuardar.setBackground(new Color(1, 162, 82));
		btnRegalosGuardar.setBounds(713, 572, 155, 33);
		presRegalos.add(btnRegalosGuardar);
		
		btnRegalosRegresar = new JButton("Regresar");
		btnRegalosRegresar.addActionListener(oyenteBtnRegalosRegresar);
		btnRegalosRegresar.setForeground(Color.WHITE);
		btnRegalosRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegalosRegresar.setBackground(new Color(0, 204, 153));
		btnRegalosRegresar.setBounds(10, 11, 137, 33);
		btnRegalosRegresar.setBorder(null);
		presRegalos.add(btnRegalosRegresar);
		
		presViajes = new JPanel();
		presViajes.setBackground(new Color(255, 255, 255));
		presupuestos.add(presViajes, "name_93617179042699");
		presViajes.setLayout(null);
		
		JLabel label_33 = new JLabel("Editar tu presupuesto");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_33.setBounds(433, 51, 196, 25);
		presViajes.add(label_33);
		
		JLabel label_34 = new JLabel("Asigna un monto a las subcategorias que prefieras ");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_34.setBounds(338, 87, 404, 25);
		presViajes.add(label_34);
		
		JPanel panel_73 = new JPanel();
		panel_73.setLayout(null);
		panel_73.setBackground(new Color(0, 153, 255));
		panel_73.setBounds(132, 158, 252, 473);
		presViajes.add(panel_73);
		
		JLabel lblViajes = new JLabel("Viajes");
		lblViajes.setForeground(Color.WHITE);
		lblViajes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblViajes.setBounds(92, 199, 73, 31);
		panel_73.add(lblViajes);
		
		JPanel panel_74 = new JPanel();
		panel_74.setBackground(new Color(0, 153, 255));
		panel_74.setBounds(416, 168, 252, 33);
		presViajes.add(panel_74);
		panel_74.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblViajes_1 = new JLabel("Viajes");
		lblViajes_1.setForeground(Color.WHITE);
		lblViajes_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_74.add(lblViajes_1);
		
		fieldViajesTotal = new JTextField();
		fieldViajesTotal.setText("0");
		fieldViajesTotal.setFont(new Font("Verdana", Font.PLAIN, 14));
		fieldViajesTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajesTotal.setColumns(10);
		fieldViajesTotal.setBounds(688, 168, 196, 33);
		presViajes.add(fieldViajesTotal);
		
		JLabel label_39 = new JLabel("Subcategor\u00EDas");
		label_39.setForeground(Color.BLACK);
		label_39.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_39.setBounds(561, 238, 107, 31);
		presViajes.add(label_39);
		
		JPanel panel_76 = new JPanel();
		panel_76.setBackground(new Color(0, 153, 255));
		panel_76.setBounds(416, 280, 252, 33);
		presViajes.add(panel_76);
		
		JLabel lblHospedaje = new JLabel("Hospedaje");
		lblHospedaje.setForeground(Color.WHITE);
		lblHospedaje.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_76.add(lblHospedaje);
		
		fieldViajes2 = new JTextField();
		fieldViajes2.setText("0");
		fieldViajes2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes2.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes2.setColumns(10);
		fieldViajes2.setBounds(688, 280, 196, 33);
		presViajes.add(fieldViajes2);
		
		JPanel panel_77 = new JPanel();
		panel_77.setBackground(new Color(0, 153, 255));
		panel_77.setBounds(416, 334, 252, 33);
		presViajes.add(panel_77);
		
		JLabel lblBote = new JLabel("Botes y Cruceros");
		lblBote.setForeground(Color.WHITE);
		lblBote.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_77.add(lblBote);
		
		fieldViajes3 = new JTextField();
		fieldViajes3.setText("0");
		fieldViajes3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes3.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes3.setColumns(10);
		fieldViajes3.setBounds(688, 334, 196, 33);
		presViajes.add(fieldViajes3);
		
		JPanel panel_78 = new JPanel();
		panel_78.setBackground(new Color(0, 153, 255));
		panel_78.setBounds(416, 389, 252, 33);
		presViajes.add(panel_78);
		
		JLabel lblTransporteViajes = new JLabel("Transporte de Viaje");
		lblTransporteViajes.setForeground(Color.WHITE);
		lblTransporteViajes.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_78.add(lblTransporteViajes);
		
		fieldViajes4 = new JTextField();
		fieldViajes4.setText("0");
		fieldViajes4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes4.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes4.setColumns(10);
		fieldViajes4.setBounds(688, 389, 196, 33);
		presViajes.add(fieldViajes4);
		
		JPanel panel_79 = new JPanel();
		panel_79.setBackground(new Color(0, 153, 255));
		panel_79.setBounds(416, 442, 252, 33);
		presViajes.add(panel_79);
		
		JLabel lblVuelos = new JLabel("Vuelos");
		lblVuelos.setForeground(Color.WHITE);
		lblVuelos.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_79.add(lblVuelos);
		
		fieldViajes5 = new JTextField();
		fieldViajes5.setText("0");
		fieldViajes5.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes5.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes5.setColumns(10);
		fieldViajes5.setBounds(688, 442, 196, 33);
		presViajes.add(fieldViajes5);
		
		JPanel panel_80 = new JPanel();
		panel_80.setBackground(new Color(0, 153, 255));
		panel_80.setBounds(416, 539, 252, 33);
		presViajes.add(panel_80);
		
		JLabel label_46 = new JLabel("Otros");
		label_46.setForeground(Color.WHITE);
		label_46.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_80.add(label_46);
		
		fieldViajes7 = new JTextField();
		fieldViajes7.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes7.setText("0");
		fieldViajes7.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes7.setColumns(10);
		fieldViajes7.setBounds(688, 539, 196, 33);
		presViajes.add(fieldViajes7);
		
		btnViajesGuardar = new JButton("Guardar");
		MiListener oyentebtnViajesGuardar = new MiListener();
		btnViajesGuardar.addActionListener(oyentebtnViajesGuardar);
		btnViajesGuardar.setForeground(Color.WHITE);
		btnViajesGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViajesGuardar.setBackground(new Color(1, 162, 82));
		btnViajesGuardar.setBounds(709, 583, 155, 33);
		presViajes.add(btnViajesGuardar);
		
		JPanel panel_81 = new JPanel();
		panel_81.setBackground(new Color(0, 153, 255));
		panel_81.setBounds(416, 495, 252, 33);
		presViajes.add(panel_81);
		
		JLabel lblSouvenir = new JLabel("Souvenir");
		lblSouvenir.setForeground(Color.WHITE);
		lblSouvenir.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_81.add(lblSouvenir);
		
		fieldViajes6 = new JTextField();
		fieldViajes6.setText("0");
		fieldViajes6.setHorizontalAlignment(SwingConstants.CENTER);
		fieldViajes6.setFont(new Font("Verdana", Font.PLAIN, 13));
		fieldViajes6.setColumns(10);
		fieldViajes6.setBounds(688, 495, 196, 33);
		presViajes.add(fieldViajes6);
		
		btnViajesRegresar = new JButton("Regresar");
		btnViajesRegresar.addActionListener(oyenteBtnViajesRegresar);
		btnViajesRegresar.setForeground(Color.WHITE);
		btnViajesRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViajesRegresar.setBackground(new Color(0, 204, 153));
		btnViajesRegresar.setBounds(10, 11, 137, 33);
		btnViajesRegresar.setBorder(null);
		presViajes.add(btnViajesRegresar);
		presupuestos.setVisible(true);
		
		res11 = new JLabel("");
		res11.setHorizontalAlignment(SwingConstants.CENTER);
		res11.setForeground(Color.WHITE);
		res11.setFont(new Font("Verdana", Font.BOLD, 16));
		res11.setBounds(0, 36, 200, 40);
		
		res10 = new JLabel("");
		res10.setHorizontalAlignment(SwingConstants.CENTER);
		res10.setForeground(Color.WHITE);
		res10.setFont(new Font("Verdana", Font.BOLD, 16));
		res10.setBounds(0, 36, 200, 40);
		
		ingresos = new JPanel();
		ingresos.setBackground(Color.WHITE);
		content.add(ingresos, "name_18777845815723");
		ingresos.setLayout(new CardLayout(0, 0));
		
		pIngresosMain = new JPanel();
		pIngresosMain.setBackground(Color.WHITE);
		ingresos.add(pIngresosMain, "name_163373685705900");
		pIngresosMain.setLayout(null);
		
		JLabel lblIngresoTitulo = new JLabel("Ingresos");
		lblIngresoTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblIngresoTitulo.setBounds(452, 42, 130, 42);
		pIngresosMain.add(lblIngresoTitulo);
		
		lblIngresosTotal = new JLabel("00");
		lblIngresosTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblIngresosTotal.setBounds(452, 115, 130, 42);
		pIngresosMain.add(lblIngresosTotal);
		
		JLabel lblNewLabel_2 = new JLabel("Total ingresos:     Q");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(222, 125, 219, 23);
		pIngresosMain.add(lblNewLabel_2);
		
		oyenteIngresos = new MiListener();
		btnAgregarIngreso = new JButton("+");
		btnAgregarIngreso.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAgregarIngreso.setBackground(new Color(51, 153, 255));
		btnAgregarIngreso.addActionListener(oyenteIngresos);
		btnAgregarIngreso.setBounds(452, 199, 130, 65);
		btnAgregarIngreso.setBorder(null);
		pIngresosMain.add(btnAgregarIngreso);
		
		JLabel lblAgregaringresoo = new JLabel("Agregar un nuevo ingreso");
		lblAgregaringresoo.setBounds(452, 275, 130, 23);
		pIngresosMain.add(lblAgregaringresoo);
		
		pIngSueldos = new JPanel();
		pIngSueldos.setBounds(117, 330, 392, 36);
		pIngresosMain.add(pIngSueldos);
		pIngSueldos.setLayout(null);
		
		lblNombreSueldos = new JLabel("");
		lblNombreSueldos.setForeground(Color.WHITE);
		lblNombreSueldos.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreSueldos.setBounds(0, 0, 187, 36);
		pIngSueldos.add(lblNombreSueldos);
		
		lblSueldos = new JLabel("0");
		lblSueldos.setForeground(Color.WHITE);
		lblSueldos.setBounds(197, 0, 195, 36);
		pIngSueldos.add(lblSueldos);
		
		pIngReembolsos = new JPanel();
		pIngReembolsos.setBounds(117, 391, 392, 36);
		pIngresosMain.add(pIngReembolsos);
		pIngReembolsos.setLayout(null);
		
		lblNombreReembolsos = new JLabel("");
		lblNombreReembolsos.setForeground(Color.WHITE);
		lblNombreReembolsos.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreReembolsos.setBounds(0, 0, 187, 36);
		pIngReembolsos.add(lblNombreReembolsos);
		
		lblReembolsos = new JLabel("0");
		lblReembolsos.setForeground(Color.WHITE);
		lblReembolsos.setBounds(197, 0, 195, 36);
		pIngReembolsos.add(lblReembolsos);
		
		pIngSubsidios = new JPanel();
		pIngSubsidios.setBounds(117, 455, 392, 36);
		pIngresosMain.add(pIngSubsidios);
		pIngSubsidios.setLayout(null);
		
		lblNombreSubsidios = new JLabel("");
		lblNombreSubsidios.setForeground(Color.WHITE);
		lblNombreSubsidios.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreSubsidios.setBounds(0, 0, 183, 36);
		pIngSubsidios.add(lblNombreSubsidios);
		
		lblSubsidios = new JLabel("0");
		lblSubsidios.setForeground(Color.WHITE);
		lblSubsidios.setBounds(193, 0, 199, 36);
		pIngSubsidios.add(lblSubsidios);
		
		pIngOtros = new JPanel();
		pIngOtros.setBounds(117, 519, 392, 36);
		pIngresosMain.add(pIngOtros);
		pIngOtros.setLayout(null);
		
		lblNombreOtros = new JLabel("");
		lblNombreOtros.setForeground(Color.WHITE);
		lblNombreOtros.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreOtros.setBounds(0, 0, 183, 36);
		pIngOtros.add(lblNombreOtros);
		
		lblOtros1 = new JLabel("0");
		lblOtros1.setForeground(Color.WHITE);
		lblOtros1.setBounds(193, 0, 199, 36);
		pIngOtros.add(lblOtros1);
		
		pIngBonos = new JPanel();
		pIngBonos.setBounds(541, 330, 392, 36);
		pIngresosMain.add(pIngBonos);
		pIngBonos.setLayout(null);
		
		lblNombreBonos = new JLabel("");
		lblNombreBonos.setForeground(Color.WHITE);
		lblNombreBonos.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreBonos.setBounds(0, 0, 183, 36);
		pIngBonos.add(lblNombreBonos);
		
		lblBonos = new JLabel("0");
		lblBonos.setForeground(Color.WHITE);
		lblBonos.setBounds(193, 0, 199, 36);
		pIngBonos.add(lblBonos);
		
		pIngRentas = new JPanel();
		pIngRentas.setBounds(541, 391, 392, 36);
		pIngresosMain.add(pIngRentas);
		pIngRentas.setLayout(null);
		
		lblNombreRentas = new JLabel("");
		lblNombreRentas.setForeground(Color.WHITE);
		lblNombreRentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreRentas.setBounds(0, 0, 183, 36);
		pIngRentas.add(lblNombreRentas);
		
		lblRentas = new JLabel("0");
		lblRentas.setForeground(Color.WHITE);
		lblRentas.setBounds(193, 0, 199, 36);
		pIngRentas.add(lblRentas);
		
		pIngInversiones = new JPanel();
		pIngInversiones.setBounds(541, 455, 392, 36);
		pIngresosMain.add(pIngInversiones);
		pIngInversiones.setLayout(null);
		
		lblNombreInversiones = new JLabel("");
		lblNombreInversiones.setForeground(Color.WHITE);
		lblNombreInversiones.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreInversiones.setBounds(0, 0, 183, 36);
		pIngInversiones.add(lblNombreInversiones);
		
		lblInversiones = new JLabel("0");
		lblInversiones.setForeground(Color.WHITE);
		lblInversiones.setBounds(193, 0, 199, 36);
		pIngInversiones.add(lblInversiones);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(541, 330, 46, 14);
		pIngresosMain.add(lblNewLabel_3);
		
		pIngresos2 = new JPanel();
		pIngresos2.setBackground(Color.WHITE);
		ingresos.add(pIngresos2, "name_163382642808700");
		pIngresos2.setLayout(null);
		
		lblEditar = new JLabel("INGRESOS");
		lblEditar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEditar.setBounds(478, 44, 152, 52);
		pIngresos2.add(lblEditar);
		
		lblIngresosEdita = new JLabel("Edita las caracteristicas de tu ingreso");
		lblIngresosEdita.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIngresosEdita.setBounds(401, 101, 303, 14);
		pIngresos2.add(lblIngresosEdita);
		
		panel_19 = new JPanel();
		panel_19.setBackground(new Color(0, 153, 255));
		panel_19.setBounds(88, 168, 278, 445);
		pIngresos2.add(panel_19);
		panel_19.setLayout(null);
		
		lblNewLabel_4 = new JLabel("Edicion");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(68, 126, 141, 45);
		panel_19.add(lblNewLabel_4);
		
		lblDe = new JLabel("de Ingresos");
		lblDe.setForeground(Color.WHITE);
		lblDe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDe.setBounds(68, 176, 160, 31);
		panel_19.add(lblDe);
		
		lblNewLabel_5 = new JLabel("Monto: ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(513, 244, 73, 31);
		pIngresos2.add(lblNewLabel_5);
		
		tfIngresoMonto = new JTextField();
		tfIngresoMonto.setBounds(637, 252, 185, 22);
		pIngresos2.add(tfIngresoMonto);
		tfIngresoMonto.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Categoria: ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(487, 308, 99, 22);
		pIngresos2.add(lblNewLabel_6);
		
		cbIngresoCat = new JComboBox<String>();
		cbIngresoCat.addItem("Sueldos");
		cbIngresoCat.addItem("Bonos");
		cbIngresoCat.addItem("Reembolsos");
		cbIngresoCat.addItem("Rentas");
		cbIngresoCat.addItem("Subsidios");
		cbIngresoCat.addItem("Inversiones");
		cbIngresoCat.addItem("Otros");
		cbIngresoCat.setBounds(639, 313, 183, 20);
		pIngresos2.add(cbIngresoCat);
		
		JLabel lblNewLabel_7 = new JLabel("Repetir: ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(513, 369, 77, 22);
		pIngresos2.add(lblNewLabel_7);
		
		cbIngresoRep = new JComboBox<String>();
		cbIngresoRep.addItem("Nunca");
		cbIngresoRep.addItem("Diario");
		cbIngresoRep.addItem("Semanal");
		cbIngresoRep.addItem("Mensual");
		cbIngresoRep.addItem("Anual");
		cbIngresoRep.setBounds(637, 373, 185, 22);
		pIngresos2.add(cbIngresoRep);
		
		JLabel lblNewLabel_8 = new JLabel("Recordatorio: ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(460, 420, 126, 31);
		pIngresos2.add(lblNewLabel_8);
		
		cbIngresoRec = new JComboBox<String>();
		cbIngresoRec.addItem("Nunca");
		cbIngresoRec.addItem("El dia de vencimiento");
		cbIngresoRec.addItem("Un dia antes de vencer");
		cbIngresoRec.setBounds(632, 428, 190, 22);
		pIngresos2.add(cbIngresoRec);
		
		btnIngresoRegresar = new JButton("Regresar");
		btnIngresoRegresar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIngresoRegresar.setForeground(Color.WHITE);
		btnIngresoRegresar.setBackground(new Color(0, 204, 153));
		btnIngresoRegresar.setBounds(88, 44, 117, 36);
		btnIngresoRegresar.addActionListener(oyenteIngresos);
		pIngresos2.add(btnIngresoRegresar);
		
		btnIngresoGuardar = new JButton("Guardar");
		btnIngresoGuardar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIngresoGuardar.setBackground(new Color(0, 204, 153));
		btnIngresoGuardar.setForeground(Color.WHITE);
		btnIngresoGuardar.addActionListener(oyenteIngresos);
		btnIngresoGuardar.setBounds(715, 582, 107, 31);
		btnIngresoGuardar.addActionListener(oyenteIngresos);
		pIngresos2.add(btnIngresoGuardar);
		
		
		gastos = new JPanel();
		gastos.setBackground(Color.WHITE);
		content.add(gastos, "name_18782269186194");
		gastos.setLayout(new CardLayout(0, 0));
		
		gastosMain = new JPanel();
		gastosMain.setBackground(Color.WHITE);
		gastos.add(gastosMain, "name_473969418326918");
		gastosMain.setLayout(null);
		
		JLabel label_5 = new JLabel("GASTOS");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_5.setBounds(413, 68, 170, 64);
		gastosMain.add(label_5);
		
		btnNuevoGasto = new JButton("+");
		MiListener oyentebtnNuevoGasto = new MiListener();
		btnNuevoGasto.addActionListener(oyentebtnNuevoGasto);
		btnNuevoGasto.setForeground(Color.WHITE);
		btnNuevoGasto.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNuevoGasto.setBorder(null);
		btnNuevoGasto.setBackground(new Color(51, 153, 255));
		btnNuevoGasto.setBounds(440, 254, 133, 50);
		gastosMain.add(btnNuevoGasto);
		
		JLabel label_38 = new JLabel("Nuevo gasto");
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setFont(new Font("Verdana", Font.PLAIN, 14));
		label_38.setBounds(440, 304, 133, 27);
		gastosMain.add(label_38);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBackground(SystemColor.menu);
		panel_20.setBounds(103, 407, 365, 33);
		gastosMain.add(panel_20);
		
		JLabel label_42 = new JLabel("");
		label_42.setHorizontalAlignment(SwingConstants.RIGHT);
		label_42.setForeground(Color.WHITE);
		label_42.setFont(new Font("Verdana", Font.BOLD, 13));
		label_42.setBackground(new Color(0, 153, 255));
		label_42.setBounds(0, 0, 181, 40);
		panel_20.add(label_42);
		
		JLabel label_45 = new JLabel("");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setForeground(Color.WHITE);
		label_45.setFont(new Font("Verdana", Font.BOLD, 15));
		label_45.setBackground(new Color(0, 153, 255));
		label_45.setBounds(184, 0, 181, 40);
		panel_20.add(label_45);
		
		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(SystemColor.menu);
		panel_21.setBounds(538, 407, 365, 33);
		gastosMain.add(panel_21);
		
		JLabel label_48 = new JLabel("");
		label_48.setHorizontalAlignment(SwingConstants.RIGHT);
		label_48.setForeground(Color.WHITE);
		label_48.setFont(new Font("Verdana", Font.BOLD, 13));
		label_48.setBackground(new Color(0, 153, 255));
		label_48.setBounds(0, 0, 181, 40);
		panel_21.add(label_48);
		
		JLabel label_50 = new JLabel("");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setForeground(Color.WHITE);
		label_50.setFont(new Font("Verdana", Font.BOLD, 15));
		label_50.setBackground(new Color(0, 153, 255));
		label_50.setBounds(184, 0, 181, 40);
		panel_21.add(label_50);
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBackground(SystemColor.menu);
		panel_22.setBounds(103, 451, 365, 33);
		gastosMain.add(panel_22);
		
		JLabel label_52 = new JLabel("");
		label_52.setHorizontalAlignment(SwingConstants.RIGHT);
		label_52.setForeground(Color.WHITE);
		label_52.setFont(new Font("Verdana", Font.BOLD, 13));
		label_52.setBackground(new Color(0, 153, 255));
		label_52.setBounds(0, 0, 181, 40);
		panel_22.add(label_52);
		
		JLabel label_54 = new JLabel("");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setForeground(Color.WHITE);
		label_54.setFont(new Font("Verdana", Font.BOLD, 15));
		label_54.setBackground(new Color(0, 153, 255));
		label_54.setBounds(184, 0, 181, 40);
		panel_22.add(label_54);
		
		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBackground(SystemColor.menu);
		panel_23.setBounds(103, 495, 365, 33);
		gastosMain.add(panel_23);
		
		JLabel label_56 = new JLabel("");
		label_56.setHorizontalAlignment(SwingConstants.RIGHT);
		label_56.setForeground(Color.WHITE);
		label_56.setFont(new Font("Verdana", Font.BOLD, 13));
		label_56.setBackground(new Color(0, 153, 255));
		label_56.setBounds(0, 0, 181, 40);
		panel_23.add(label_56);
		
		JLabel label_58 = new JLabel("");
		label_58.setHorizontalAlignment(SwingConstants.CENTER);
		label_58.setForeground(Color.WHITE);
		label_58.setFont(new Font("Verdana", Font.BOLD, 15));
		label_58.setBackground(new Color(0, 153, 255));
		label_58.setBounds(184, 0, 181, 40);
		panel_23.add(label_58);
		
		JPanel panel_83 = new JPanel();
		panel_83.setLayout(null);
		panel_83.setBackground(SystemColor.menu);
		panel_83.setBounds(103, 539, 365, 33);
		gastosMain.add(panel_83);
		
		JLabel label_60 = new JLabel("");
		label_60.setHorizontalAlignment(SwingConstants.RIGHT);
		label_60.setForeground(Color.WHITE);
		label_60.setFont(new Font("Verdana", Font.BOLD, 13));
		label_60.setBackground(new Color(0, 153, 255));
		label_60.setBounds(0, 0, 181, 40);
		panel_83.add(label_60);
		
		JLabel label_62 = new JLabel("");
		label_62.setHorizontalAlignment(SwingConstants.CENTER);
		label_62.setForeground(Color.WHITE);
		label_62.setFont(new Font("Verdana", Font.BOLD, 15));
		label_62.setBackground(new Color(0, 153, 255));
		label_62.setBounds(184, 0, 181, 40);
		panel_83.add(label_62);
		
		JPanel panel_84 = new JPanel();
		panel_84.setLayout(null);
		panel_84.setBackground(SystemColor.menu);
		panel_84.setBounds(538, 451, 365, 33);
		gastosMain.add(panel_84);
		
		JLabel label_64 = new JLabel("");
		label_64.setHorizontalAlignment(SwingConstants.RIGHT);
		label_64.setForeground(Color.WHITE);
		label_64.setFont(new Font("Verdana", Font.BOLD, 13));
		label_64.setBackground(new Color(0, 153, 255));
		label_64.setBounds(0, 0, 181, 40);
		panel_84.add(label_64);
		
		JLabel label_66 = new JLabel("");
		label_66.setHorizontalAlignment(SwingConstants.CENTER);
		label_66.setForeground(Color.WHITE);
		label_66.setFont(new Font("Verdana", Font.BOLD, 15));
		label_66.setBackground(new Color(0, 153, 255));
		label_66.setBounds(184, 0, 181, 40);
		panel_84.add(label_66);
		
		JPanel panel_85 = new JPanel();
		panel_85.setLayout(null);
		panel_85.setBackground(SystemColor.menu);
		panel_85.setBounds(538, 495, 365, 33);
		gastosMain.add(panel_85);
		
		JLabel label_68 = new JLabel("");
		label_68.setHorizontalAlignment(SwingConstants.RIGHT);
		label_68.setForeground(Color.WHITE);
		label_68.setFont(new Font("Verdana", Font.BOLD, 13));
		label_68.setBackground(new Color(0, 153, 255));
		label_68.setBounds(0, 0, 181, 40);
		panel_85.add(label_68);
		
		JLabel label_69 = new JLabel("");
		label_69.setHorizontalAlignment(SwingConstants.CENTER);
		label_69.setForeground(Color.WHITE);
		label_69.setFont(new Font("Verdana", Font.BOLD, 15));
		label_69.setBackground(new Color(0, 153, 255));
		label_69.setBounds(184, 0, 181, 40);
		panel_85.add(label_69);
		
		JPanel panel_86 = new JPanel();
		panel_86.setLayout(null);
		panel_86.setBackground(SystemColor.menu);
		panel_86.setBounds(538, 539, 365, 33);
		gastosMain.add(panel_86);
		
		JLabel label_70 = new JLabel("");
		label_70.setHorizontalAlignment(SwingConstants.RIGHT);
		label_70.setForeground(Color.WHITE);
		label_70.setFont(new Font("Verdana", Font.BOLD, 13));
		label_70.setBackground(new Color(0, 153, 255));
		label_70.setBounds(0, 0, 181, 40);
		panel_86.add(label_70);
		
		JLabel label_71 = new JLabel("");
		label_71.setHorizontalAlignment(SwingConstants.CENTER);
		label_71.setForeground(Color.WHITE);
		label_71.setFont(new Font("Verdana", Font.BOLD, 15));
		label_71.setBackground(new Color(0, 153, 255));
		label_71.setBounds(184, 0, 181, 40);
		panel_86.add(label_71);
		
		JLabel label_72 = new JLabel("Total gastos");
		label_72.setHorizontalAlignment(SwingConstants.CENTER);
		label_72.setFont(new Font("Verdana", Font.PLAIN, 15));
		label_72.setBounds(280, 152, 133, 27);
		gastosMain.add(label_72);
		
		lblTotalGastos = new JLabel("0");
		lblTotalGastos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalGastos.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblTotalGastos.setBounds(413, 168, 170, 64);
		gastosMain.add(lblTotalGastos);
		
		JPanel panel_87 = new JPanel();
		panel_87.setLayout(null);
		panel_87.setBackground(SystemColor.menu);
		panel_87.setBounds(103, 583, 365, 33);
		gastosMain.add(panel_87);
		
		JLabel label_74 = new JLabel("");
		label_74.setHorizontalAlignment(SwingConstants.RIGHT);
		label_74.setForeground(Color.WHITE);
		label_74.setFont(new Font("Verdana", Font.BOLD, 13));
		label_74.setBackground(new Color(0, 153, 255));
		label_74.setBounds(0, 0, 181, 40);
		panel_87.add(label_74);
		
		JLabel label_75 = new JLabel("");
		label_75.setHorizontalAlignment(SwingConstants.CENTER);
		label_75.setForeground(Color.WHITE);
		label_75.setFont(new Font("Verdana", Font.BOLD, 15));
		label_75.setBackground(new Color(0, 153, 255));
		label_75.setBounds(184, 0, 181, 40);
		panel_87.add(label_75);
		
		JPanel panel_88 = new JPanel();
		panel_88.setLayout(null);
		panel_88.setBackground(SystemColor.menu);
		panel_88.setBounds(538, 583, 365, 33);
		gastosMain.add(panel_88);
		
		JLabel label_76 = new JLabel("");
		label_76.setHorizontalAlignment(SwingConstants.RIGHT);
		label_76.setForeground(Color.WHITE);
		label_76.setFont(new Font("Verdana", Font.BOLD, 13));
		label_76.setBackground(new Color(0, 153, 255));
		label_76.setBounds(0, 0, 181, 40);
		panel_88.add(label_76);
		
		JLabel label_77 = new JLabel("");
		label_77.setHorizontalAlignment(SwingConstants.CENTER);
		label_77.setForeground(Color.WHITE);
		label_77.setFont(new Font("Verdana", Font.BOLD, 15));
		label_77.setBackground(new Color(0, 153, 255));
		label_77.setBounds(184, 0, 181, 40);
		panel_88.add(label_77);
		
		gastar = new JPanel();
		gastar.setBackground(Color.WHITE);
		gastos.add(gastar, "name_473974705430124");
		gastar.setLayout(null);
		
		JLabel label_78 = new JLabel("GASTOS");
		label_78.setHorizontalAlignment(SwingConstants.CENTER);
		label_78.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_78.setBounds(413, 115, 170, 64);
		gastar.add(label_78);
		
		fieldGastos = new JTextField();
		fieldGastos.setText("0");
		fieldGastos.setHorizontalAlignment(SwingConstants.CENTER);
		fieldGastos.setFont(new Font("Verdana", Font.BOLD, 14));
		fieldGastos.setColumns(10);
		fieldGastos.setBounds(413, 233, 170, 35);
		gastar.add(fieldGastos);
		
		gastosComboBox = new JComboBox();
		gastosComboBox.addItem("Sueldos");
		gastosComboBox.addItem("Bonos");
		gastosComboBox.addItem("Reembolsos");
		gastosComboBox.addItem("Rentas");
		gastosComboBox.addItem("Subsidios");
		gastosComboBox.addItem("Inversiones");
		gastosComboBox.addItem("Otros");
		gastosComboBox.setForeground(new Color(0, 0, 51));
		gastosComboBox.setFont(new Font("Verdana", Font.PLAIN, 12));
		gastosComboBox.setBackground(Color.WHITE);
		gastosComboBox.setBounds(413, 318, 170, 35);
		gastar.add(gastosComboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setForeground(new Color(0, 0, 51));
		comboBox_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(413, 377, 170, 35);
		gastar.add(comboBox_1);
		
		JLabel label_79 = new JLabel("Categor\u00EDa");
		label_79.setHorizontalAlignment(SwingConstants.RIGHT);
		label_79.setFont(new Font("Verdana", Font.PLAIN, 14));
		label_79.setBounds(309, 316, 94, 35);
		gastar.add(label_79);
		
		JLabel label_80 = new JLabel("Repetir");
		label_80.setHorizontalAlignment(SwingConstants.RIGHT);
		label_80.setFont(new Font("Verdana", Font.PLAIN, 14));
		label_80.setBounds(309, 377, 94, 35);
		gastar.add(label_80);
		
		btnGuardarGasto = new JButton("Guardar");
		MiListener oyentebtnGuardarGasto = new MiListener();
		btnGuardarGasto.addActionListener(oyentebtnGuardarGasto);
		btnGuardarGasto.setForeground(Color.WHITE);
		btnGuardarGasto.setFont(new Font("Verdana", Font.BOLD, 13));
		btnGuardarGasto.setBackground(new Color(0, 204, 153));
		btnGuardarGasto.setBounds(413, 451, 170, 35);
		gastar.add(btnGuardarGasto);

	}
	
	private class MiListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			// SIDEBAR BUTTONS
			if(e.getSource() == btnResumen) {
				resumen.setVisible(true);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
				btnResumen.setForeground(Color.WHITE);
				btnResumen.setBackground(new Color(51, 153, 255));
				btnIngresos.setBackground(SystemColor.controlHighlight);
				btnIngresos.setForeground(SystemColor.controlDkShadow);
				btnGastos.setBackground(SystemColor.controlHighlight);
				btnGastos.setForeground(SystemColor.controlDkShadow);
				btnPresupuestos.setBackground(SystemColor.controlHighlight);
				btnPresupuestos.setForeground(SystemColor.controlDkShadow);
			}
			if(e.getSource() == btnIngresos) {
				ingresos.setVisible(true);
				resumen.setVisible(false);
				gastos.setVisible(false);
				presupuestos.setVisible(false);
				btnIngresos.setForeground(Color.WHITE);
				btnIngresos.setBackground(new Color(51, 153, 255));
				btnResumen.setBackground(SystemColor.controlHighlight);
				btnResumen.setForeground(SystemColor.controlDkShadow);
				btnGastos.setBackground(SystemColor.controlHighlight);
				btnGastos.setForeground(SystemColor.controlDkShadow);
				btnPresupuestos.setBackground(SystemColor.controlHighlight);
				btnPresupuestos.setForeground(SystemColor.controlDkShadow);
			}
			if(e.getSource() == btnGastos) {
				gastos.setVisible(true);
				resumen.setVisible(false);
				ingresos.setVisible(false);
				presupuestos.setVisible(false);
				btnGastos.setForeground(Color.WHITE);
				btnGastos.setBackground(new Color(51, 153, 255));
				btnResumen.setBackground(SystemColor.controlHighlight);
				btnResumen.setForeground(SystemColor.controlDkShadow);
				btnIngresos.setBackground(SystemColor.controlHighlight);
				btnIngresos.setForeground(SystemColor.controlDkShadow);
				btnPresupuestos.setBackground(SystemColor.controlHighlight);
				btnPresupuestos.setForeground(SystemColor.controlDkShadow);
			}
			if(e.getSource() == btnPresupuestos) {
				presupuestos.setVisible(true);
				resumen.setVisible(false);
				ingresos.setVisible(false);
				gastos.setVisible(false);
				btnPresupuestos.setForeground(Color.WHITE);
				btnPresupuestos.setBackground(new Color(51, 153, 255));
				btnResumen.setBackground(SystemColor.controlHighlight);
				btnResumen.setForeground(SystemColor.controlDkShadow);
				btnIngresos.setBackground(SystemColor.controlHighlight);
				btnIngresos.setForeground(SystemColor.controlDkShadow);
				btnGastos.setBackground(SystemColor.controlHighlight);
				btnGastos.setForeground(SystemColor.controlDkShadow);
			}
			
			if(e.getSource() == btnCrearPres) {
				selecPresCateg.setVisible(true);
				presupuestoMain.setVisible(false);
			}
			
			
			if(e.getSource() == btnPresHogar) {
				presHogar.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresAuto) {
				presAuto.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresAlimentos) {
				presAlimentos.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresEntretenimiento) {
				presEntretenimiento.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresSalud) {
				presSalud.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresEducacion) {
				presEducacion.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresFinanzas) {
				presFinanzas.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresRopa) {
				presRopa.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresRegalos) {
				presRegalos.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			if(e.getSource() == btnPresViajes) {
				presViajes.setVisible(true);
				selecPresCateg.setVisible(false);
			}
			
			// REGRESAR JButtons
			if(e.getSource() == btnSelecCategRegresar) {
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			if(e.getSource() == btnHogarRegresar) {
				presHogar.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			if(e.getSource() == btnAutoRegresar) {
				presAuto.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			if(e.getSource() == btnAlimentosRegresar) {
				presAlimentos.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			if(e.getSource() == btnEntretenimientoRegresar) {
				presEntretenimiento.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			if(e.getSource() == btnSaludRegresar) {
				presSalud.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			if(e.getSource() == btnEducacionRegresar) {
				presEducacion.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			if(e.getSource() == btnFinanzasRegresar) {
				presFinanzas.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			if(e.getSource() == btnRopaRegresar) {
				presRopa.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			if(e.getSource() == btnRegalosRegresar) {
				presRegalos.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			if(e.getSource() == btnViajesRegresar) {
				presViajes.setVisible(false);
				selecPresCateg.setVisible(true);
			}
			
			
			// GUARDAR HOGAR
			if(e.getSource() == btnHogarGuardar) {
				fieldTotalHogar = Integer.parseInt(fieldHogar2.getText()) + Integer.parseInt(fieldHogar3.getText()) + Integer.parseInt(fieldHogar4.getText()) + Integer.parseInt(fieldHogar5.getText())
									+ Integer.parseInt(fieldHogar6.getText()) + Integer.parseInt(fieldHogar7.getText()) + Integer.parseInt(fieldHogar8.getText());
				
				
				fieldHogarTotal.setText(Integer.toString(fieldTotalHogar));
				panel_82.setBackground(new Color(51, 153, 255));
				presMainLabel1.setText("Hogar");
				presMainLabel2.setText(Integer.toString(fieldTotalHogar));
				
				presHogar.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			// GUARDAR AUTO Y TRANSPORTE
			if(e.getSource() == btnAutoGuardar) {
				fieldTotalAuto = Integer.parseInt(fieldAuto2.getText()) + Integer.parseInt(fieldAuto3.getText()) + Integer.parseInt(fieldAuto4.getText()) + Integer.parseInt(fieldAuto5.getText())
								+ Integer.parseInt(fieldAuto6.getText()) + Integer.parseInt(fieldAuto7.getText()) + Integer.parseInt(fieldAuto8.getText());
				
				fieldAutoTotal.setText(Integer.toString(fieldTotalAuto));
				panel_1.setBackground(new Color(51, 153, 255));
				presMainLabel3.setText("Auto y Transporte");
				presMainLabel4.setText(Integer.toString(fieldTotalAuto));
				
				presAuto.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			
			// ALIMENTOS
			if(e.getSource() == btnAlimentosGuardar) {
				fieldTotalAlimentos = Integer.parseInt(fieldAlimentos2.getText()) + Integer.parseInt(fieldAlimentos3.getText()) + Integer.parseInt(fieldAlimentos4.getText());
				
				fieldAlimentosTotal.setText(Integer.toString(fieldTotalAlimentos));
				panel_2.setBackground(new Color(51, 153, 255));
				presMainLabel5.setText("Alimentos");
				presMainLabel6.setText(Integer.toString(fieldTotalAlimentos));
				
				presAlimentos.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			
			// ENTRETENIMIENTO
			if(e.getSource() == btnEntretenimientoGuardar) {
				fieldTotalEntretenimiento = Integer.parseInt(fieldEntretenimiento2.getText()) + Integer.parseInt(fieldEntretenimiento3.getText()) + Integer.parseInt(fieldEntretenimiento4.getText()) + Integer.parseInt(fieldEntretenimiento5.getText())
								+ Integer.parseInt(fieldEntretenimiento6.getText()) + Integer.parseInt(fieldEntretenimiento7.getText()) + Integer.parseInt(fieldEntretenimiento8.getText());
				
				fieldEntretenimientoTotal.setText(Integer.toString(fieldTotalEntretenimiento));
				panel_3.setBackground(new Color(51, 153, 255));
				presMainLabel7.setText("Entretenimiento");
				presMainLabel8.setText(Integer.toString(fieldTotalEntretenimiento));
				
				presEntretenimiento.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
				
			}
			// SALUD Y BELLEZA
			if(e.getSource() == btnSaludGuardar) {
				fieldTotalSalud = Integer.parseInt(fieldSalud2.getText()) + Integer.parseInt(fieldSalud3.getText()) + Integer.parseInt(fieldSalud4.getText()) + Integer.parseInt(fieldSalud5.getText())
								+ Integer.parseInt(fieldSalud6.getText()) + Integer.parseInt(fieldSalud7.getText()) + Integer.parseInt(fieldSalud8.getText());
				
				fieldSaludTotal.setText(Integer.toString(fieldTotalSalud));
				panel_4.setBackground(new Color(51, 153, 255));
				presMainLabel9.setText("Salud y Belleza");
				presMainLabel10.setText(Integer.toString(fieldTotalSalud));
				
				presSalud.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
				
			}
			// EDUCACION
			if(e.getSource() == btnEducacionGuardar) {
				fieldTotalEducacion = Integer.parseInt(fieldEducacion2.getText()) + Integer.parseInt(fieldEducacion3.getText()) + Integer.parseInt(fieldEducacion4.getText()) + Integer.parseInt(fieldEducacion5.getText())
								+ Integer.parseInt(fieldEducacion6.getText()) + Integer.parseInt(fieldEducacion7.getText()) + Integer.parseInt(fieldEducacion8.getText());
				
				fieldSaludTotal.setText(Integer.toString(fieldTotalEducacion));
				panel.setBackground(new Color(51, 153, 255));
				presMainLabel11.setText("EducaciÃ³n");
				presMainLabel12.setText(Integer.toString(fieldTotalEducacion));
				
				presEducacion.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			// FINANZAS E IMPUESTOS
			if(e.getSource() == btnFinanzasGuardar) {
				fieldTotalFinanzas = Integer.parseInt(fieldFinanzas2.getText()) + Integer.parseInt(fieldFinanzas3.getText()) + Integer.parseInt(fieldFinanzas4.getText()) + Integer.parseInt(fieldFinanzas5.getText())
								+ Integer.parseInt(fieldFinanzas6.getText()) + Integer.parseInt(fieldFinanzas7.getText()) + Integer.parseInt(fieldFinanzas8.getText());
				
				fieldFinanzasTotal.setText(Integer.toString(fieldTotalFinanzas));
				panel_15.setBackground(new Color(51, 153, 255));
				presMainLabel13.setText("Finanzas e Impuestos");
				presMainLabel14.setText(Integer.toString(fieldTotalFinanzas));
				
				presFinanzas.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			// ROPA y CALZADO
			if(e.getSource() == btnRopaGuardar) {
				fieldTotalRopa = Integer.parseInt(fieldRopa2.getText()) + Integer.parseInt(fieldRopa3.getText()) + Integer.parseInt(fieldRopa4.getText())
								+ Integer.parseInt(fieldRopa5.getText()) + Integer.parseInt(fieldRopa6.getText());
				
				fieldRopaTotal.setText(Integer.toString(fieldTotalRopa));
				panel_16.setBackground(new Color(51, 153, 255));
				presMainLabel15.setText("Ropa y Calzado");
				presMainLabel16.setText(Integer.toString(fieldTotalRopa));
				
				presRopa.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			// REGALOS
			if(e.getSource() == btnRegalosGuardar) {
				fieldTotalRegalos = Integer.parseInt(fieldRegalos2.getText()) + Integer.parseInt(fieldRegalos3.getText()) + Integer.parseInt(fieldRegalos4.getText())
								+ Integer.parseInt(fieldRegalos5.getText()) + Integer.parseInt(fieldRegalos6.getText());
				
				fieldRegalosTotal.setText(Integer.toString(fieldTotalRegalos));
				panel_17.setBackground(new Color(51, 153, 255));
				presMainLabel17.setText("Regalos");
				presMainLabel18.setText(Integer.toString(fieldTotalRegalos));
				
				presRegalos.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			
			// VIAJES
			if(e.getSource() == btnViajesGuardar) {
				fieldTotalViajes = Integer.parseInt(fieldViajes2.getText()) + Integer.parseInt(fieldViajes3.getText()) + Integer.parseInt(fieldViajes4.getText())
								+ Integer.parseInt(fieldViajes5.getText()) + Integer.parseInt(fieldViajes6.getText()) + Integer.parseInt(fieldViajes7.getText());
				
				fieldViajesTotal.setText(Integer.toString(fieldTotalViajes));
				panel_18.setBackground(new Color(51, 153, 255));
				presMainLabel19.setText("Viajes");
				presMainLabel20.setText(Integer.toString(fieldTotalViajes));
				
				presViajes.setVisible(false);
				selecPresCateg.setVisible(false);
				presupuestoMain.setVisible(true);
			}
			
			if(e.getSource() == btnAgregarIngreso) {
				pIngresos2.setVisible(true);
				pIngresosMain.setVisible(false);
				
			}
			if(e.getSource() == btnIngresoRegresar) {
				pIngresosMain.setVisible(true);
				pIngresos2.setVisible(false);
			}
			
			if(e.getSource() == btnIngresoGuardar) {
				int opcion = cbIngresoCat.getSelectedIndex();
				pIngresosMain.setVisible(true);
				pIngresos2.setVisible(false);
				
				switch (opcion) {
					case 0:
						pIngSueldos.setBackground(new Color(51, 153, 255));
						lblNombreSueldos.setText("Sueldos");
						lblSueldos.setText(tfIngresoMonto.getText());
						break;
					case 1:
						pIngBonos.setBackground(new Color(51, 153, 255));
						lblNombreBonos.setText("Bonos");
						lblBonos.setText(tfIngresoMonto.getText());
						break;
					case 2:
						pIngReembolsos.setBackground(new Color(51, 153, 255));
						lblNombreReembolsos.setText("Reembolsos");
						lblReembolsos.setText(tfIngresoMonto.getText());
						break;
					case 3:
						pIngRentas.setBackground(new Color(51, 153, 255));
						lblNombreRentas.setText("Rentas");
						lblRentas.setText(tfIngresoMonto.getText());
						break;
					case 4:
						pIngSubsidios.setBackground(new Color(51, 153, 255));
						lblNombreSubsidios.setText("Subsidios");
						lblSubsidios.setText(tfIngresoMonto.getText());
						break;
					case 5:
						pIngInversiones.setBackground(new Color(51, 153, 255));
						lblNombreInversiones.setText("Inversiones");
						lblInversiones.setText(tfIngresoMonto.getText());
						break;
					case 6:
						pIngOtros.setBackground(new Color(51, 153, 255));
						lblNombreOtros.setText("Otros");
						lblOtros1.setText(tfIngresoMonto.getText());
						break;
				}
						
				int cantIng1 = Integer.parseInt(lblSueldos.getText());
				int cantIng2 = Integer.parseInt(lblBonos.getText());
				int cantIng3 = Integer.parseInt(lblReembolsos.getText());
				int cantIng4 = Integer.parseInt(lblRentas.getText());
				int cantIng5 = Integer.parseInt(lblSubsidios.getText());
				int cantIng6 = Integer.parseInt(lblInversiones.getText());
				int cantIng7 = Integer.parseInt(lblOtros1.getText());
						
				int totalIngresos = pres.totalPresupuesto(cantIng1, cantIng2 , cantIng3, cantIng4, cantIng5, cantIng6, cantIng7, 0, 0, 0);
				lblIngresosTotal.setText(""+totalIngresos);
				resumenIngresos.setText(""+totalIngresos);
				lblQ_1.setText("Q "+totalIngresos);
				
			}
			
				
			// PRESUPUESTOS
			
			presupuestoTotal = pres.totalPresupuesto(fieldTotalHogar, fieldTotalAuto, fieldTotalAlimentos, fieldTotalEntretenimiento, fieldTotalSalud, fieldTotalEducacion,
					fieldTotalFinanzas, fieldTotalRopa, fieldTotalRegalos, fieldTotalViajes);
			
			String totIngresos =  lblIngresosTotal.getText();
			presTotalIngresos.setText(totIngresos);
			ingresosTotal = Integer.parseInt(totIngresos);
			
			
			progressBar.setValue(pres.porcentajePresupuesto(presupuestoTotal, ingresosTotal));
			
			
			lblPresupuestoTotal.setText(Integer.toString(presupuestoTotal));
			
			
			// GASTOS 
			if(e.getSource() == btnNuevoGasto) {
				gastosMain.setVisible(false);
				gastar.setVisible(true);
			}
			if(e.getSource() == btnGuardarGasto) {
				gastar.setVisible(false);
				gastosMain.setVisible(true);
				
				lblTotalGastos.setText(fieldGastos.getText());
				lblQ_2.setText("Q " + fieldGastos.getText());
			}

			
			// RESUMEN 
			
			res1.setText(lblPresupuestoTotal.getText());
			res2.setText(fieldHogarTotal.getText());
			res3.setText(fieldAutoTotal.getText());
			res4.setText(fieldAlimentosTotal.getText());
			res5.setText(fieldEntretenimientoTotal.getText());
			res6.setText(fieldSaludTotal.getText());
			res7.setText(fieldEducacionTotal.getText());
			res8.setText(fieldFinanzasTotal.getText());
			res9.setText(fieldRopaTotal.getText());
			res10.setText(fieldRegalosTotal.getText());
			res11.setText(fieldViajesTotal.getText());
			
		}
			
		
	}
}