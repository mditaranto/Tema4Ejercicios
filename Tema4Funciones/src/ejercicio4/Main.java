package ejercicio4;

import java.util.Scanner;

public class Main {
	
	/* 
	 * Para la comprobacion de un correcto funcionamiento de este programa se han
	 * realizado diversas pruebas:
	 * 
	 * Caracteres introducidos: [5], [/], [8]
	 * Respuesta esperada: No hay solucion posible
	 * Respuesta dada: No hay solucion posible
	 * 
	 * Caracteres introducidos: [5], [*], [5]
	 * Respuesta esperada: 25
	 * Respuesta dada: 25
	 * 
	 * Caracteres introducidos: [5], [+], [60]
	 * Respuesta esperada: 65
	 * Respuesta dada: 65
	 */

	public static void main(String[] args) {
		// Creacion de la variable donde se guardaran los numeros a leer por el objeto tipo Scanner
		int num1, num2;
		// Creacion de la variable donde se guardara el operador introducido
		String operador;
		
		// Creacion del objeto tipo Scanner
		Scanner sca = new Scanner(System.in);
		
		// Se solicita al usuario que introduzca un numero
		System.out.print("Introduzca el primer numero: ");
		num1 = sca.nextInt(); // Se guarda el valor en la variable
		// Se solicita al usuario que introduzca un operador
		System.out.print("Introduzca el operador [(+)Suma; (-)Resta; (*)Multiplicacion; (/)Division]: ");
		operador = sca.next(); // Se guarda el valor en la variable
		System.out.print("Introduzca el segundo numero ");
		// Se solicita al usuario que introduzca un numero
		num2 = sca.nextInt(); // Se guarda el valor en la variable
		
		// Creacion del objeto tipo Operaciones
		Operaciones mates = new Operaciones();

		mates.num1 = num1; //Asignacion de valor a la varible global
		mates.num2 = num2; //Asignacion de valor a la varible global
		
		// Se ofrece al usuario la solucion: 
		System.out.print("El resultado es: ");
		
		// Segun el operador introducido la solucion varia segun a que funcion se llama:
		if (operador.equals("+")) {
			System.out.println(mates.sum());
		} else if (operador.equals("-")) {
			System.out.println(mates.res());
		}else if (operador.equals("*")) {
			System.out.println(mates.multi());
		}else if (operador.equals("/") && (num1 > num2)) {
			System.out.println(mates.div());
		} else {
			System.out.println("No hay solucion posible");
		}
		
		sca.close(); //Cerramos el objeto tipo Scanner
	}

}
