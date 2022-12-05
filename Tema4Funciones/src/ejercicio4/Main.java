package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1, num2;
		String operador;
		
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Introduzca el primer numero: ");
		num1 = sca.nextInt();
		System.out.print("Introduzca el operador [(+)Suma; (-)Resta; (*)Multiplicacion; (/)Division]: ");
		operador = sca.next();
		System.out.print("Introduzca el segundo numero ");
		num2 = sca.nextInt();
		
		Operaciones mates = new Operaciones();

		mates.num1 = num1;
		mates.num2 = num2;
		
		System.out.print("El resultado es: ");
		
		if (operador.equals("+")) {
			System.out.println(mates.sum());
		} else if (operador.equals("-")) {
			System.out.println(mates.res());
		}else if (operador.equals("*")) {
			System.out.println(mates.multi());
		}else if (operador.equals("/")) {
			System.out.println(mates.div());
		}
		
		sca.close();
	}

}
