package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	static int max(int num1, int num2) {
		
		return Math.max(num1, num2);
	}

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		max(num1, num2);
		
		System.out.println(max(num1, num2));
		
		sc.close();

	}

}
