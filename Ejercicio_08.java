package ort;

import java.util.Scanner;

public class Ejercicio_08 {
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2;
		
		System.out.println("Ingrese un numero natural:");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero natural:");
		num2 = Integer.parseInt(input.nextLine());
		
		/*Ahora hacemos las operaciones*/
		
		System.out.println("El resultado de la mult de los dos numeros naturales es: " + (num1 * num2) + " el resultado de la resta es: " + (num1 - num2) + " el resultado de la suma es: " + (num1 + num2) + " y el resultado de la division es: "+ (num1 / num2));

	}
}
