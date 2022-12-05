package ejercicio2;

public class Esfera {

	// Creacion de variable global para el radio
	static int radio;

	// En esta funcion se calcula el volumen de la esfera
	static double volumen() {
		// Se devuelve el valor
		return (4 * Math.PI * Math.pow(radio, 3)) / 3; // (Formula del volumen)
	}

	// En esta funcion se calcula la superficie de la esfera
	static double superficie() {
		// Se devuelve el valor
		return 4 * Math.PI * Math.pow(radio, 2); // (Formula de la superficie)
	}

}
