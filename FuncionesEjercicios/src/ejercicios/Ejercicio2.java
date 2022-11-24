package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	static void cont(int x, int y) {
		for (int i = Math.min(x, y) ; i<=Math.max(x, y); i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		cont(num1, num2);
		
		sc.close();
	}

}
