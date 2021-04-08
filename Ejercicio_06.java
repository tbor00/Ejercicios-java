package ort;

import java.util.Scanner;

public class Ejercicio_06 {
	private static final float PORCENTAJE_VENTAS = 16;
	private static final int SUELDO_FIJO = 44000;
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		float ventas, total;
		System.out.println("Ingrese el monto total de las ventas realizadas en el mes");
		ventas = Float.parseFloat(input.nextLine());
		total = SUELDO_FIJO + ((ventas * PORCENTAJE_VENTAS) / 100);
		System.out.println("El sueldo total es de: " + total);
	}

}
