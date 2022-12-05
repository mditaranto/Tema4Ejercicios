package ejercicio5;

public class FuncionesRecursivas {

	// Esta funcion se encarga de realizar el sumatorio
	static int sumatorio(int numero) {
		// Creacion de la variable donde se guardara la suma
		int suma = 0;
		if (numero > 0) {
			// Se llama a la funcion y se suma de forma progresiva
			suma = numero + sumatorio(numero - 1);
		}
		return suma; // Se devuelve el valor
	}

	//Esta funcion se encarga de realizar la potencia
	static double potencia(double a, int n) {
		// Creacion de la variable donde se guardara la pontecia
		double pot = 1;
		if (n > 0) {
			// Se multiplica el numero por la funcion potencia en forma progresiva
			pot *= a * potencia(a, n - 1);
		}
		return pot;
	}

	//Esta funcion se encarga de realizar la serie Fibonacci
	static int serieFibonacci(int numero) {
		 //CASO BASE, si es cero o menor devuelve un cero
        if (numero <= 0) {
            return 0;
        //CASO BASE, si es 1 devuelve un 1    
        } else if (numero == 1) {
            return 1;
        } else {
            //Se realiza la suma
            return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
        }
	}

}
