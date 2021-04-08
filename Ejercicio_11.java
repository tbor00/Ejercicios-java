package ort;

import java.util.Scanner;

public class Ejercicio_11 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		System.out.println("Ingrese un numero");
		numero = Integer.parseInt(input.nextLine());
		
		if(numero % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
	}

}
