/*
 * @author Javier Barrios 
 * @doc Interfaz Resumne
 * 
 */
public class Presupuestos {
	
	public int totalPresupuesto(int uno, int dos, int tres, int cuatro, int cinco, int seis, int siete, int ocho, int nueve, int diez) {
		int total;
		
		total = uno + dos + tres + cuatro + cinco + seis + siete + ocho + nueve + diez;
		
		return total;
	}
	
	public int porcentajePresupuesto(int totalPresupuesto, int totalIngresos) {
		double porcentaje;
		totalIngresos += 1;
		
		porcentaje = (totalPresupuesto * 100) / totalIngresos; 
;
		return (int) Math.round(porcentaje) ;
	}
}
