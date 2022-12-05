package ejercicio3;

import java.util.Scanner;

public class Main {
	
	/*
	 * Para la comprobacion de un correcto funcionamiento de este programa se han
	 * realizado diversas pruebas:
	 * 
	 * Numeros introducidos: [5] [5 y 8] [2 , 5 y 6]
	 * Respuesta esperada: 
	 * [5] Secuencia de 5 numeros aleatorios desde 0 hasta 1
	 * [5 y 8] Secuencia de 5 numeros aleatorios desde 0 hasta 8 (enteros)
	 * [2 , 5 y 6] Secuencia de 2 numeros aleatorios desde 5 hasta 6
	 */

	public static void main(String[] args) {

		/* Creacion de la variable donde se guardara el valor del numero para la
		 * comprobacion de la primera funcion */
		int num;
		/* Creacion de la variable donde se guardara el valor del numero para la
		 * comprobacion de la segunda funcion */
		int num1;
		int num2;
		/* Creacion de la variable donde se guardara el valor del numero para la
		 * comprobacion de la tercera funcion */
		int max, min, rep;

		Scanner sca = new Scanner(System.in); // Creacion del objeto tipo Scanner

		// Se solicita al usuario que introduzca un numero
		System.out.println("Introduzca un numero: ");
		num = sca.nextInt(); // Se guarda el valor en la variable

		NumerosAleatorios.numerosAleatorios(num); //Se llama a la funcion

		// Se solicita al usuario que introduzca dos numeros
		System.out.println("Introduzca dos numero: ");
		num1 = sca.nextInt(); // Se guarda el valor en la variable
		num2 = sca.nextInt(); // Se guarda el valor en la variable
		NumerosAleatorios.numerosAleatorios(num1, num2); //Se llama a la funcion 

		// Se solicita al usuario que introduzca tres numeros
		System.out.println("Introduzca repeticiones, max y min");
		rep = sca.nextInt(); // Se guarda el valor en la variable 
		max = sca.nextInt(); // Se guarda el valor en la variable
		min = sca.nextInt(); // Se guarda el valor en la variable
		NumerosAleatorios.numerosAleatorios(rep, max, min); //Se llama a la funcion  

		sca.close(); //Se cierra el objeto creado
	}

}
