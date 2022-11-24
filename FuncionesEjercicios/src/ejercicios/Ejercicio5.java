package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	static boolean vocal(String letra) {
		boolean siono;
		siono=letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u");
		return siono;
	}

	public static void main(String[] args) {
		String letra;
		String sol;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("letra?");
		letra = sc.next();
		
		vocal(letra);
		
		sol = vocal(letra)?"Es vocal" : "Es consonante";
		
		System.out.println(sol);
		
		sc.close();

	}

}
