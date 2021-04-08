package ort;

import java.util.Scanner;

public class Ejercicio_05 {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2, num1Revertido, num2Revertido;
		System.out.println("Ingrese el num1: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el num2: ");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Usted ingreso en num1: " + num1 + " Y en num2: " + num2);
		num1Revertido = num2;
		num2Revertido = num1;
		System.out.println("Ahora los revertimos");
		System.out.println("Usted ingreso en num1: " + num1Revertido + " Y en num2: " + num2Revertido);

	}

}
