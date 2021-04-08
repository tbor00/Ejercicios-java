package ort;

import java.util.Scanner;

public class Ejercicio_13 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int numero, numero2, numero3;
		System.out.println("Ingrese primer numero");
		numero = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese segundo numero");
		numero2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese tercer numero");
		numero3 = Integer.parseInt(input.nextLine());
		
		if(numero > numero2 && numero > numero3) {
			System.out.println("El numero " + numero + " es más grande");
		}else if(numero2 > numero && numero2 > numero3) {
			System.out.println("El numero " + numero2 + " es más grande");
		}else {
			System.out.println("El numero " + numero3 + " es más grande");
		}
	}

}