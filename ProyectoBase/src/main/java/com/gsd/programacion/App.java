package com.gsd.programacion;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( int[] input )
    {
    		ArrayList<Integer> lista = new ArrayList<Integer>();
    	     for (int k = 0; k < input.length; k++) {
    	        lista.add(input[k]);
    	     } 
    	    System.out.println(lista);
    	    int resultado = 0;
    	    boolean continua = true;
    	    int tamaño = lista.size();
    	    
    	    do {   
    	    
    	    int num = 0;
    	    ArrayList<Integer> lista2 = new ArrayList<Integer>();
    	      if (lista2.size()==1) {
    	          resultado = lista2.get(0);
    	          continua = false;
    	      }
    	    
    	    for (int i = 0; i < tamaño; i++) {
    	      num = lista.get(i);
    	      int cont = 1;
    	      
    	      for (int j = 0; j < tamaño; j++) {
    	        if (j+1 < tamaño && (num == lista.get(j) && num == lista.get(j+1))) {
    	          cont++;
    	        }
    	      }
    	      lista2.add(cont);
    	      i = i + (cont-1);
    	    }
    	    System.out.println(lista2);
    	      
    	    tamaño = lista2.size();
    	    lista.clear();
    	    for (int x = 0; x < lista2.size(); x++) {
    	      lista.add(lista.get(x));
    	    }
    	      

    	    } while (continua == true);
//    	    return resultado;
    	  }
    	
}
