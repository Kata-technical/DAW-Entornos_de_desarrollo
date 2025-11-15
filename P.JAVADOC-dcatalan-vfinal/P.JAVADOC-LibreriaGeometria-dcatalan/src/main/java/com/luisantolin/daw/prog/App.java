package com.luisantolin.daw.prog;

import com.luisantolin.daw.prog.geometria.Punto2d;
import com.luisantolin.daw.prog.geometria.Segmento2d;

/**
 * Imprimir la distancia entre 2 puntos.
 * Esta clase da 2 puntos en un espacio y llamando a unas funciones especificas, printa el segmento de esos 2 puntos
 * para usarlo simplemente tienes que cambiar los valores de x e y, puedes usar numeros negativos pero no se aceptaran
 * caracteres, numeros decimales y cadenas de caracteres.
 */
public class App 
{
	/**
	 * Constructor privado para evitar la instanciacion.
	 * Esta clase solo contiene el metodo main y no debe ser instanciada.
	 */
	private App() {
		// Constructor privado
	}
	
	/**
	 * Punto de entrada de la aplicacion.
	 * Crea dos segmentos en el plano 2D y muestra su representacion
	 * textual y las coordenadas de sus puntos extremos.
	 * @param args argumentos de linea de comandos (no utilizados).
	 */
	public static void main(String[] args) {
		Segmento2d segmento0 = new Segmento2d(new Punto2d(100, 100), new Punto2d(100, 200));
		Segmento2d segmento1 = new Segmento2d(new Punto2d(100, 200), new Punto2d(200, 200));

		System.out.println(segmento1.toString());
		System.out.println(segmento0.getPuntoA().getX() + " " + segmento0.getPuntoA().getY() + " "
				+ segmento0.getPuntoB().getX() + " " + segmento0.getPuntoB().getY());
	}
}
