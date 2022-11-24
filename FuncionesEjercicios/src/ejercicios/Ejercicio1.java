package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	static void eco(int n) {
		for (int i = 1; i<=n; i++) {
			System.out.println("eco");
		}
	}

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		numero=sc.nextInt();
		
		eco(numero);
		
		sc.close();

	}

}
