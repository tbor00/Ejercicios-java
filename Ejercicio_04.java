package ort;

import java.util.Scanner;

public class Ejercicio_04 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidadHoras, precioHora, horaSabados, resultado;

		System.out.println("Ingrese cantidad de horas que trabaja por día");
		cantidadHoras = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la cantidad de plata que cobra por hora");
		precioHora = Integer.parseInt(input.nextLine());
		
		horaSabados = cantidadHoras / 2;
		
		
		resultado  =( (cantidadHoras * precioHora) * 5) + (horaSabados * precioHora)  ; 
		System.out.println("El salario por semana es: "+ resultado);
		
	}

}
