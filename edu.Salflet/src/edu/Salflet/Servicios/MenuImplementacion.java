package edu.Salflet.Servicios;

import java.util.Scanner;

/**
 * contiene la logiga de nuestro menu y como minimo las cabeceras creadas en la interfaz
 * SAV - 05122023
 */
public class MenuImplementacion implements MenuInterfaz {

	

	@Override
	public int menuSeleccion(Scanner sc) {
		// TODO Auto-generated method stub
		

		
		System.out.println("-------------------------------");
		System.out.println("1. Añadir venta");
		System.out.println("2. Añadir gasto");
		System.out.println("3. Mostrar total");
		System.out.println("0. Cerrar aplicacion");
		System.out.println("-------------------------------");

		int i = sc.nextInt();
		
		
		return i;
	}

	

}
