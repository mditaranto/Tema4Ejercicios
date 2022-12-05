package ejercicio3;

public class NumerosAleatorios {

	// Creacion de la variable donde se guardaran los numeros aleatorios
	static double aleat = 0;

	/*
	 * Esta funcion ofrecera un numero aleatorio entre 0 y 1 tantas veces como el
	 * numero lo indique
	 */
	static void numerosAleatorios(int num) {

		// Mediante un for se crea un bucle hasta que i sea igual o mayor que num
		for (int i = 0; i < num; i++) {
			// Se genera un numero aleatorio entre 0 y 1
			aleat = Math.random();
			// Se ofrece al usuario dicho numero
			System.out.println(aleat);
		}

	}

	/*
	 * Esta funcion ofrecera un numero aleatorio entre 0 y el numero 2 introducido
	 * tantas veces como el numero 1 lo indique
	 */
	static void numerosAleatorios(int num1, int num2) {

		// Mediante un for se crea un bucle hasta que i sea mayor que num1
		for (int i = 0; i < num1; i++) {
			// Se genera un numero aleatorio entre 0 y num2
			aleat = Math.random() * num2;
			// Se ofrece al usuario dicho numero
			System.out.println((int) aleat);
		}
	}

	/*
	 * Esta funcion ofrecera un numero aleatorio entre el minimo y el maximo
	 * introducido tantas veces como las repeticiones lo indique
	 */
	static void numerosAleatorios(int rep, int max, int min) {

		// Mediante un for se crea un bucle hasta que i sea mayor que rep
		for (int i = 0; i < rep; i++) {
			// Se genera un numero aleatorio entre el min y el max
			aleat = Math.random() * ((max + 1) - min) + min;
			// Se ofrece al usuario dicho numero
			System.out.println(aleat);
		}
	}

}
