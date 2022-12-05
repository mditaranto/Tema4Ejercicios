package ejercicio2;

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
	 * Numero introducido: 10
	 * Respuesta esperada: (Una correcta superficie y volumen)
	 * Respuesta dada: 1256.63 y 4188.79 (Una correcta superficie y volumen) 
	 * 
	 * Numero introducido: -5
	 * Respuesta esperada: Error
	 * Respuesta dada: Error
	 */

	public static void main(String[] args) {

		// Creacion de la variable donde se guardara el radio introducido
		int radio;
		// Creacion de la variable donde se guardara el volumen
		double volumen;
		// Creacion de la variable donde se guardara la superficie
		double superf;

		// Creacion del objeto de tipo Scanner
		Scanner sca = new Scanner(System.in);

		// Se solicita al usuario los datos a introducir
		System.out.println("Introduzca un valor para el radio de la esfera");
		radio = sca.nextInt(); // Se guarda el valor de los datos en la variable

		if (radio > 0) {
		Esfera.radio = radio; // Se asigna el valor a la variable global
		// Llamada a la funcion y asignacion a la variable
		superf = Esfera.superficie();
		// Llamada a la funcion y asignacion a la variable
		volumen = Esfera.volumen();

		// Se ofrece al usuario la superficie y volumen de la esfera
		System.out.println("La superficie de la esfera es " + superf + " y su volumen es " + volumen);
		
		} else {
			System.out.println("No es posible formar una esfera con radio negativo");
		}
		sca.close(); // Se cierra el objeto creado

	}

}
