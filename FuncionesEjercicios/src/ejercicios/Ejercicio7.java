package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	static int numDiv(int n) {
		int cont = 0;
		for (int i = 2; i<n; i++) {
			if (n%i==0 && esPrimo(i)) {
				cont++;
			}
		}
		
		return cont;
	}

	static boolean esPrimo(int n) {

		boolean sol = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sol = false;
				break;
			}
		}
		if (n == 1) {
			sol = false;
		}

		return (sol);

	}
	
	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		esPrimo(num);
		numDiv(num);

		System.out.println("La cantidad de primos divisores de " + num + " es " + numDiv(num));
		
		sc.close();
	}

}
