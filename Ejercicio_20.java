package ort;

import java.util.Scanner;

public class Ejercicio_20 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int numero1, numero2;
		char expresion;
		
		System.out.println("Ingrese el primer numero");
		numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero");
		numero2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la operación que desea hacer: + (SUMA), -(RESTA), *(MULTIPLICACION), /(DIVISION)");
		expresion = input.next().charAt(0);
		
		if(expresion == '+') {
			System.out.println("El resultado de la suma de los dos numeros es: " + (numero1 + numero2));
		}else if(expresion == '-') {
			System.out.println("El resultado de la resta de los dos numeros es: " + (numero1 - numero2));
		}else if(expresion == '*') {
			System.out.println("El resultado de la resta de los dos numeros es: " + (numero1 * numero2));
		}else if(expresion == '/') {
			System.out.println("El resultado de la division de los dos numeros es: " + (numero1 / numero2));
		}else {
			System.out.println("ERROR!");
		}
			

	}

}
