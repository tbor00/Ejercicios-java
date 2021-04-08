package ort;

import java.util.Scanner;

public class Ejercicio_18 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int numero1, numero2;
		
		System.out.println("Ingresar un numero entero");
		numero1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresar otro numero entero");
		numero2 = Integer.parseInt(input.nextLine());
		
		if(numero1 > numero2) {
			
			if(numero1 % numero2 == 0) {
				System.out.println("El numero mayor es "+ numero1 + " y es divisible por el numero " + numero2);
			}else {
				System.out.println("El numero mayor es "+ numero1 + " y no es divisible por el numero " + numero2);
			}
			
		}else {
			if(numero2 % numero1 == 0) {
				System.out.println("El numero mayor es "+ numero2 + " y es divisible por el numero" + numero1);
			}else {
				System.out.println("El numero mayor es "+ numero2 + " y no es divisible por el numero" + numero1);
			}
		}

	}

}
