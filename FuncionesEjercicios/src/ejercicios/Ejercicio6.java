package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

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
		String sol;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		esPrimo(num);

		sol = esPrimo(num) ? "Es primo" : "no es primo";
		System.out.println(sol);
		
		sc.close();
	}

}
