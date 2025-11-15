package com.luisantolin.daw.prog.geometria;

/**
 * Representa un punto en el espacio.
 * Esta clase genera un punto en el espacio en base a las coordenadas dadas,
 * Un punto está definido por sus coordenadas x e y en el plano 2D.
 */

public class Punto2d {
	private int x;
	private int y;
/**
 * Constructor de la clase.
 * Guarda los valores que le pasaron a los atributos privados de la clase.
 * @param x entero con las coordenadas del eje x del punto.
 * @param y entero con las coordenadas del eje y del punto.
 */
	public Punto2d(int x, int y) {
		this.x = x;
		this.y = y;
	}
/**
 * Leer las cordenadas del punto del eje x.
 * Leen la coordenada x del atributo privado.
 * @return x coordenadas del punto en el eje x.
 */
	public int getX() {
		return x;
	}
/**
 * Leer las coordenadas del punto del eje y.
 * Leen la coordenada y del atributo privado.
 * @return y coordenadas del punto en el eje y.
 */
	public int getY() {
		return y;
	}
/**
 * Suma de coordenadas.
 * Suma las coordenadas X e Y del punto recibido con la X e Y del punto actual
 * creando y devolviendo un nuevo punto con las coordenadas resultantes pero
 * no modifica ninguno de los 2 puntos.
 * @param p1 objeto que contiene coordenadas de el punto.
 * @return El objeto Punto2d con la suma de las coordenadas x e y de los 2 puntos.
 */
	public Punto2d sumar( Punto2d p1 ) {
		// FIXME: esta función es dificil de leer, ¿sabrías hacerla en 6-8 lineas para
		// que sea mas facil de leer?

		int cordXp1 = p1.getX();
		int cordXactual = this.getX();
		int CordXtotal = cordXp1 + cordXactual;
		
		int cordYp1 = p1.getY();
		int cordYactual = this.getY();
		int CordYtotal = cordYp1 + cordYactual;
		
		return new Punto2d (CordXtotal, CordYtotal);
		
		//return new Punto2d(p1.getX() + this.getX(), p1.getY() + this.getY() ); 
	}
/**
 * Modificar el punto actual.
 * Suma la coordenadas X e Y del punto recibido a la X e Y del punto actual
 * modificando el punto actual.
 * @param p1 objeto que contiene coordenadas de el punto.
 */
	public void acumular(Punto2d p1) {
		x += p1.getX();
		y += p1.getY();
	}
/**
 * Resta de coordenadas.
 * Resta la coordenada X e Y del punto actual de la X e Y del punto recibido
 * creando y devolviendo un nuevo punto con las coordenadas resultantes pero
 * no modifica ninguno de los puntos originales.
 * @param p1 objeto que contiene coordenadas de el punto.
 * @return El objeto Punto2d con la resta de las coordenadas x e y de los 2 puntos.
 */
	public Punto2d restar( Punto2d p1 ) {
		// FIXME: esta función es dificil de leer, ¿sabrías hacerla en 6-8 lineas para
		// que sea mas facil de leer?
		
		int cordXp1 = p1.getX();
		int cordXactual = this.getX();
		int CordXtotal = cordXp1 - cordXactual;
		
		int cordYp1 = p1.getY();
		int cordYactual = this.getY();
		int CordYtotal = cordYp1 - cordYactual;
		
		return new Punto2d (CordXtotal, CordYtotal);
		
		//return new Punto2d(p1.getX() - this.getX(), p1.getY() - this.getY() ); 
	}
/**
 * Pasar a cadena de texto.
 * Hace casting de los enteros x e y pasandolos a String.
 * @return String con las coordenadas de el punto.
 */
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
