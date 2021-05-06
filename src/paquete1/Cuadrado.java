/**
 * 
 */
package paquete1;

/**
 * @author Martin
 *
 */
public class Cuadrado {
	double lado;
	
	public Cuadrado(){};
	
	public Cuadrado(double milado) {
		lado = milado;
	}
	
	public double calculaPerimetro() {
		return 4*lado;
	}
}
