package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	static int esPrimo(int n) {

		int cont = 0;
		boolean sol = true;

		if (n > 0) {
			// Mediante un for vamos sumando numeros hasta el del usuario
			for (int i = 2; i <= n; i++) {
				// En caso que sea 2 (Primo) se suma.
				if (i == 2 && n % i == 0) {
					cont++;
				}
				// Mediante otro for se verifica si el numero del for actual es primo o no
				for (int a = 2; a < i; a++) {
					// Se divide entre todos los numeros hasta el mismo
					if (i % a == 0) {
						// Si no es primo se sale del bucle
						sol = false;
						break;
					} // Si es primo se guarda en el boolean
					sol = true;
					// Al cumplir que sea primo y que a 1 menos que i, se suma.
					if (sol == true && a == i - 1 && n % i == 0) {
						cont++;
					}
				}
			}
		}
		return (cont);
	}

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		esPrimo(num);

		System.out.println("La cantidad de primos divisores de " + num + " es " + esPrimo(num));
		
		sc.close();
	}

}
