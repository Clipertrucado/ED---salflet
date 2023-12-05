package edu.Salflet.Servicios;
import java.util.Scanner;

/**
 * contiene la logiga de cada funcionalidad de nuestra aplicacion y como minimo las cabeceras creadas en la interfaz
 * SAV - 05122023
 */
public class OperativaImplementacion implements OperativaInterfaz {

	
	
	public int anadir(Scanner sc, int dinero) {
		
		
		
		System.out.println("Inserta la cantidad del ingreso");
		
		int ingreso = sc.nextInt();					
		
		dinero = dinero + ingreso;
		
		System.out.println("Saldo de la empresa: " + dinero);
		
		
		
		return dinero;
	}

	public int gasto(Scanner sc, int dinero) {
		
		
		System.out.println("Inserta la cantidad del gasto");
		int gasto = sc.nextInt();
		
		//di la resta del dinero total menos el gasto es igual a cero se ejecuta este caso 
		if (dinero - gasto == 0) {
			
			dinero = dinero - gasto;
			System.out.println("Saldo llego a 0");
		//si la resta del dinero total menos el gato es menor a cero se ejecuta este caso	
		}else if ((dinero - gasto) < 0) {
			
			dinero = dinero - gasto;
			System.out.println("Saldo esta en negativo, debe dinero");
		//si no es ninguna de los anteriores casos...	
		}else{
			
			dinero = dinero - gasto;
		}
		
		return dinero;
	}
	
	public void mostrar(Scanner sc, int dinero) {
		
		
		if (dinero == 0) {
			
			System.out.println("Saldo de la empresa: " + dinero);

			System.out.println("Vamos mal");
			
		}else if ((dinero) < 0) {
			
			System.out.println("Saldo de la empresa: " + dinero);

			System.out.println("Vamos muy mal");
			
		}else{
			
			System.out.println("Saldo de la empresa: " + dinero);

		}
	}
}


