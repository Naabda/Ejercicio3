//Created by David Abell�n Navarro
//
package EjerciciosEntregados;

import java.util.Scanner;

public class Ejercicio3DavidAbellanNavarro {

	// TODO Auto-generated method stub
	public static void mostrarSubMenu() {
		Scanner sc=new Scanner(System.in);
		boolean continuar=true;
		int subopcion;

		do {
			//Escribimos las opciones que posteriormente pondremos en las cajas.
			System.out.println("Elige una opci�n");
			System.out.println("4.1-Administrar");
			System.out.println("4.2-Inspeccionar");
			System.out.println("4.3-Revisar");
			System.out.println("4.4-Volver al Men�");
			subopcion=sc.nextInt();
			//Definimos las cajas con nuestras opciones para el SubMen�.
			switch (subopcion) {
			case 1:
				System.out.println("4.1-Administrando...");
				break;
			case 2:
				System.out.println("4.2-Llamando hacienda para inspecci�n.");
				break;
			case 3:
				System.out.println("4.3-Revisando su antivirus esto va para rato...");
				break;
			case 4:
				System.out.println("4.4-Aqu� tiene su men�.");
				continuar = false;
				break;
			default:
				System.out.println("Inserta una opci�n correcta");
			} 
		}
		while (continuar);
	//Indicamos el cierre de esta funci�n.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Definimos las variables.
		Scanner sc= new Scanner(System.in);
		boolean continuar =true;
		int opcion;

		do {
			//Escribimos las opciones que posteriormente pondremos en las cajas.
			System.out.println("Elige una opci�n");
			System.out.println("1.Abrir programa");
			System.out.println("2.Cerrar programa");
			System.out.println("3.Guardar");
			System.out.println("4.Submen�");
			System.out.println("5.Salir");
			opcion=sc.nextInt();
			//Definimos las cajas con las opciones del men�.
			switch (opcion) {
			case 1:
				System.out.println("Programa abierto");
				break;
			case 2:
				System.out.println("Cerrar programa");
				break;
			case 3:
				System.out.println("Programa guardado");
				break;
			case 4:
				mostrarSubMenu();
				break;
			case 5: 
				System.out.println("Pague el men� antes de irse");
				continuar = false;
				break;
			default:
				System.out.println("Inserta una opci�n correcta");
			} 
		}
		while (continuar); 
		//Cerramos el escaner.
		sc.close();		
	}
//Cerramos programa.
}
