package com.luisantolin.daw.prog.geometria;

/**
 * Representar una linea en el espacio
 * Esta clase devuelve la longitud que hay entre los 2 puntos utilizando geometria
 */
public class Segmento2d {
	private Punto2d p1;
	private Punto2d p2;
	
/**
 * Constructor de la clase.
 * Guarda los 2 puntos que definen el segmento.
 * @param p1 objeto que contiene coordenadas de el punto 1.
 * @param p2 objeto que contiene coordenadas de el punto 2.
 */
	public Segmento2d(Punto2d p1, Punto2d p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
    /**
     * Leer las cordenadas del punto 1.
     * Devuelve el primer extremo del segmento.
     * @return p1 objeto con las coordenadas del primer punto del segmento.
     */
	public Punto2d getPuntoA () {
		return p1;
	}
	/**
	 * Leer las coordenadas del punto 2.
	 * Devuelve el segundo extremo del segmento.
	 * @return p2 objeto con las coordenadas del segundo punto del segmento.
	 */
	public Punto2d getPuntoB () {
		return p2;
	}
	
	/**
	 * Calcular la distancia entre puntos.
	 * Primero calcula la diferencia en x e y. Luego aplica el teorema de  pitagoras.
	 * @return devuelve la longitud que hay entre los 2 puntos (en decimales).
	 */
	public double longitud() {
		// FIXME: por puro deporte, ¿podrías hacer esta función en 1 sola línea y sin variables intermedias?
		/*
		int cateto1 = p1.getX() - p2.getX();
		int cateto2 = p1.getY() - p2.getY();
		double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		return hipotenusa;
		*/
		return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
	}
	/**
	 * Convertir los enteros a cadena de caracteres.
	 * convierte el segmento a texto con formato [(x1,y1),(x2,y2)].
	 * @return String de las coordenadas del punto 1 y el punto 2.
	 */
	public String toString() {
		return "[(" + p1.getX() + "," + p1.getY() + ")" + ",(" + p2.getX() + "," + p2.getY() + ")]";  
	}
}
