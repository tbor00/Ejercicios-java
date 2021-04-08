package ort;

import java.util.Scanner;

public class Ejercicio_17 {

	private static final char MASCULINO = 'M';
	private static final char FEMENINO  = 'F';
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		char genero;
		int edad;
		
		
		System.out.println("Ingrese su edad: ");
		edad = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese su género, M para masculino y F para femenino");
		genero = input.next().charAt(0);
		
		if(edad >= 1 && edad <= 120 && genero == MASCULINO || genero == FEMENINO) {
			if(genero == MASCULINO && edad > 60) {
				System.out.println("Señor, usted ya tiene la edad para jubilarse");
			}else if(genero == FEMENINO && edad > 65) {
				System.out.println("Señora, usted ya tiene la edad para jubilarse");
			}else {
				System.out.println("Usted no tiene edad para jubilarse");
			}
		}else {
			System.out.println("Ingreso algun dato erroneo");
		}
				
	}

}
