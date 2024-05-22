package mypkt;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int num = 0;

		System.out.println("Buenos días Ceinmark, soy Jano");

		System.out.println("Introduce un número para averiguar si es primo o no: ");
		num = Integer.parseInt(ent.nextLine());

		for (int i = 0; i < 10; i++) {
			if (num / i == 0) {
				System.out.println("El numero es primo");
				System.out.println("Los divisores del " + num + " son:" + i);
			} else {
				System.out.println("El numero no es primo");
			}
		}

	}

}
