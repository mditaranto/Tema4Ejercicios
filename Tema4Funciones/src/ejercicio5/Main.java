package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num;
		int a, n;
		
		Scanner sca = new Scanner(System.in);
		
		num = sca.nextInt();
		
		System.out.println(FuncionesRecursivas.sumatorio(num));

		a = sca.nextInt();
		n = sca.nextInt();
		
		System.out.println(FuncionesRecursivas.potencia(a,n));
		
		System.out.println(FuncionesRecursivas.serieFibonacci(num));
		sca.close();
		
	}

}
