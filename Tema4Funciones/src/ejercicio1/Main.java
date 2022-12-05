package ejercicio1;

import java.util.Scanner;

/**
 * 
 * @author mditaranto
 *
 */
public class Main {

	/*
	 * Para la comprobacion de un correcto funcionamiento de este programa se han
	 * realizado diversas pruebas:
	 * 
	 * Numero introducido: -55
	 * Respuesta esperada: Es capicua / No es primo
	 * Respuesta dada: Es capicua / No es primo
	 * 
	 * Numero introducido: 11
	 * Respuesta esperada: Es capicua / Es primo
	 * Respuesta dada: Es capicua / Es primo
	 * 
	 * Numero introducido; 13
	 * Respuesta esperada: No es capicua / Es primo
	 * Respuesta dada: No es capicua / Es primo
	 */

	public static void main(String[] args) {

		// creacion de variable para guardar el numero introducido por el usuario
		int num;
		// Creacion de variable para guardar los booleanos respuesta de las funciones
		boolean respuesta;

		Scanner sca = new Scanner(System.in); // Creacion del objeto Scanner

		// Se solicita al usuario que introduzca los datos
		System.out.println("Introduzca un numero. Le dire si es primo y/o capicua.");
		num = sca.nextInt(); // Se guarda el valor en la variable

		Numeros operaciones = new Numeros(); // Creacion del objeto de tipo Numeros

		respuesta = operaciones.esCapicua(num); // Llamada a una funcion y asignacion a la variable

		// Mediante una condicional se ofrece una respuesta
		if (respuesta) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}

		respuesta = operaciones.esPrimo(num); // Llamada a una funcion y asignacion a la variable

		// Mediante una condicional se ofrece una respuesta
		if (respuesta && num > 0) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

		sca.close(); // Se cierra el objeto creado

	}

}
