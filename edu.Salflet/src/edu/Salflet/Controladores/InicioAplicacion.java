package edu.Salflet.Controladores;

import java.util.Scanner;

import edu.Salflet.Servicios.MenuImplementacion;
import edu.Salflet.Servicios.MenuInterfaz;
import edu.Salflet.Servicios.OperativaImplementacion;
import edu.Salflet.Servicios.OperativaInterfaz;

/**
 * Es la clase principal de nuestra aplicacion
 * SAV - 051122023
 */
public class InicioAplicacion {
	
	/**
	 * Nuestro metodo main se contiene el fliujo de nuestra aplicacion 
	 * SAV - 051122023
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos nuestro escanes y las copias de las interfaces
		Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		
		int cerrar = 0;
		//esta sera la variable engargada de guadar el dinero que tiene la empresa en cada momento
		int dinero = 0;
		
		//hacemos que se mantenga en bucle 
		while(cerrar == 0) {
			
			//llamamos al menu
			int seleccion = mi.menuSeleccion(sc);
			
			
				//comparamos la seleccion con las diferentes funcionalidades que tiene nuestra aplicacion
				if(seleccion == 0) {
					cerrar=1;
					break;
				
				}else if(seleccion == 1) {
					
					int saldo = dinero;
					dinero = oi.anadir(sc,saldo);
					
				}else if(seleccion == 2) {
					
					int saldo = dinero;
					dinero = oi.gasto(sc,saldo);
					
					
				}else if(seleccion == 3) {
					
					int saldo = dinero;
					oi.mostrar(sc,saldo);
					
					
				}else {
					
			
				}
			
				
			}
			
			
		}
	
	
	}


