package ejercicio5;

public class FuncionesRecursivas {

	static int sumatorio(int numero) {
		int suma = 0;
		if (numero > 0) {
			suma = numero + sumatorio(numero - 1);
		}
		return suma;
	}

	static double potencia(double a, int n) {
		double pot = 1;
		if (n > 0) {
			pot *= a * potencia(a,n - 1);
		}
		return pot;
	}
	
	static int serieFibonacci(int numero) {
		int res = numero;
		if (numero > 2) {
		res = serieFibonacci(numero-1) + serieFibonacci(numero-2);
		}
		return res;	
		
	}

}
