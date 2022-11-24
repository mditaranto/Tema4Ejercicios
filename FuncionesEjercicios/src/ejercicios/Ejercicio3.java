package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	static void circulo(int radio, int altura, int opc) {
		
		double sol;
		
		switch (opc) {
		case 1 -> {
			sol = 2 * Math.PI * radio * (altura + radio);
		}
		case 2 -> {
			sol = Math.PI * (radio*radio) * altura;

		}
		default -> {
			sol = 0;
		}
		}
		System.out.println(sol);
	}

	public static void main(String[] args) {
		int opc, alt, rad;
		
		Scanner sc = new Scanner(System.in);
		
		opc = sc.nextInt();
		alt = sc.nextInt();
		rad = sc.nextInt();
		
		circulo(rad, alt, opc);
		
		sc.close();

	}

}
