package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	static int calculadora(int a, int b, int opc) {
		
		double calculo;
		
		switch (opc) {
		case 1 -> {
			calculo = a + b;
		}
		case 2 -> {
			calculo = a - b;
		}
		case 3 -> {
			calculo = a * b;
		}
		case 4 -> {
			calculo = a / b;
		}
		default ->
			calculo = 0;
		}
		return (int)calculo;
	}

	public static void main(String[] args) {
		
		int num1, num2, opc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 2 numeros para realizar operaciones matematicas");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Introduzca: [1]Suma/[2]Resta/[3]Multiplicacion/[4]Division");
		opc = sc.nextInt();
		
		calculadora(num1, num2, opc);
		
		System.out.println("El resultado es: " + calculadora(num1, num2, opc));
		
		sc.close();

	}

}
