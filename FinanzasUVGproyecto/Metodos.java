



import java.io.*;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Metodos {

	
	
	/**
	 * @param nombre
	 */
	public void crearArchivo(String nombre) {
			
		File f;
		FileWriter w;
		try {
			
		f = new File(nombre+".txt" );
		w = new FileWriter(f);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha sucedido un error " + e);
		}	
	}
	
	
	/**
	 * @param archivo
	 * @param texto
	 */
	public void escribirArchivo(String archivo, String[] texto) {
		
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		String cuenta = "";
		
		for  (int x=0; x<texto.length; x++) {
			cuenta = cuenta + texto[x] + "|";
			
		}
		
		
		try {
			f = new File(archivo);
			w = new FileWriter(f);
			bw = new BufferedWriter(w);
			wr = new PrintWriter(bw);
			
			wr.write(cuenta);
			//wr.append("\ndasd");
			
			wr.close();
			bw.close();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha sucedido un error " + e);
		}

	}
	
	
	/**
	 * @param nombreArchivo
	 */
	public void leerArchivo(String nombreArchivo) {
		
		File archivo;
		FileReader fr;
		BufferedReader br;
		
		try {
			
			archivo = new File(nombreArchivo);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;
			
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
				
			}
			
			br.close();
			fr.close();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha sucedido un error leyendo el archivo " + e);
		}
		
	}
	
	
	
	public void crearUsuario(String usuario, String nombre, String apellido, String contrasena) {
	
		File archivo;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
				
		try {
			
			archivo = new File("Usuarios.txt");
			w = new FileWriter(archivo);
			bw = new BufferedWriter(w);
			wr = new PrintWriter(bw);
			
			wr.append("\n"+usuario+":"+nombre+":"+apellido+":"+contrasena);
			
			wr.close();
			bw.close();
			
			String crear = (nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase()) + (apellido.substring(0,1).toUpperCase() + apellido.substring(1).toLowerCase());
			
			crearArchivo(crear);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha sucedido un error " + e);
		}
	}
	
	
	/**
	 * @param usuario
	 * @param contraseña
	 * @return 
	 */
	public boolean verificarUsuario(String usuario, String contrasena) {
		
		boolean retorno = false;
		

		File archivo;
		FileReader fr;
		BufferedReader br;
		
		try {
			
			archivo = new File("Usuarios.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;
			
			String[] datos;
			
			
			
			while((linea = br.readLine()) != null) {
							
				datos = linea.split(":");
				
				if (datos[0].equals(usuario) && datos[3].equals(contrasena)) {
					retorno = true;
					break;
					
				}
				
			}
			
			br.close();
			fr.close();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha sucedido un error leyendo el archivo " + e);
		}
		
		return retorno;
	}
	
	
	
	
	
	
	
	
}
