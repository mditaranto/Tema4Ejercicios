package ejercicio5;

import java.util.Scanner;

public class Main {
	
	/*
	 * Para la comprobacion de un correcto funcionamiento de este programa se han
	 * realizado diversas pruebas:
	 * 
	 * Numeros introducidos: [6], [4] y [3]
	 * Respuesta esperada: [21], [64] y [13]
	 * Respuesta dada: [21], [64] y [13]
	 */

	public static void main(String[] args) {
		// Creacion de la variable donde se guarda el valor para el sumatorio y la serie Fibonacci
		int num;
		// Creacion de las variables donde se guardaran los valores para la potencia
		int a, n;
		
		// Creacion del objeto tipo Scanner
		Scanner sca = new Scanner(System.in); 
		
		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un numero");
		num = sca.nextInt(); // Se guarda el valor en la variable
		
		System.out.println(FuncionesRecursivas.sumatorio(num)); // Se llama a la funcion sumatorio

		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca dos numeros");
		a = sca.nextInt(); // Se guarda el valor en la variable
		n = sca.nextInt(); // Se guarda el valor en la variable
		
		System.out.println(FuncionesRecursivas.potencia(a,n)); // Se llama a la funcion potencia
		
		System.out.println(FuncionesRecursivas.serieFibonacci(num)); // Se llama a la funcion serieFibonacci
		sca.close(); // Se cierra el objeti tipo Scanner
		
	}

}
