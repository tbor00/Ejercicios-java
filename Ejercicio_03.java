package ort;

import java.util.Scanner;

public class Ejercicio_03 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int ingresoNumero, numeroMultiplicado, numeroDividido; 
		
		System.out.println("Ingrese un numero entero");
		ingresoNumero = Integer.parseInt(input.nextLine());
		
		numeroMultiplicado = ingresoNumero * 5;
		numeroDividido = ingresoNumero / 2;
		
		System.out.println("El numero que ingresaste multiplicado por 5 da: " + numeroMultiplicado + " Y el numero que se ingreso dividido por 2 da: " + numeroDividido);;
	}

}
