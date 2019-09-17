import java.awt.EventQueue;

public class Ingresos extends Dashboard {
	
	static Ingresos ingresos;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresos = new Ingresos();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Ingresos(){
		initialize();
	}
	
	public void initialize() {
		test.setText("Hola mundo");
	}

}
