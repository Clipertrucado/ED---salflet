package edu.Salflet.Servicios;

import java.util.Scanner;

/**
 * contiene las cabeceras de los metodos a los que puede accederse desde el metodo main 
 * SAV - 05122023
 */
public interface OperativaInterfaz {

	/**
	 * La aplicación solicitará el importe del nuevo gasto y lo restará a la cantidad total que lleva el
	 * día en ese momento.
	 * SAV - 05122023
	 * @param sc
	 * @param dinero
	 * @return
	 */
	public int anadir(Scanner sc, int dinero);
	
	/**
	 * La aplicación solicitará el importe del nuevo gasto y lo restará a la cantidad total que lleva el
	 * día en ese momento y dependiendo del total restante se mostraran 3 diferentes mensajes
	 * SAV - 05122023
	 * @param sc
	 * @param dinero
	 * @return
	 */
	public int gasto(Scanner sc,int dinero);
	
	/**
	 * Mostrará por consola la cantidad total que lleva el día en ese momento.
	 * Si es cero aparecerá el mensaje: “Vamos mal”.
	 * Si es menor de cero aparecerá el mensaje: “Vamos muy mal”.
	 * Ambos mensajes acompañados de su cifra y separados por un espacio de ella.
	 * SAV - 05122023
	 * @param sc
	 * @param dinero
	 */
	public void mostrar(Scanner sc,int dinero);

}
