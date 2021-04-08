package ort;

import java.util.Scanner;

public class Ejercicio_16 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int cantInscriptos, cantAsientos;
		
		System.out.println("Ingrese la cantidad de inscriptos al evento");
		cantInscriptos = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la cantidad de asientos disponibles");
		cantAsientos = Integer.parseInt(input.nextLine());
		
		
		if(cantInscriptos == cantAsientos) {
			System.out.println("Alcanzan los asientos pero no sobra ninguno");
		}else if(cantInscriptos > cantAsientos) {
			System.out.println("Los asientos no alcanzan, faltarian " + (cantInscriptos - cantAsientos));
		}else {
			System.out.println("Los asientos alcanzan y sobran: " + ( cantAsientos - cantInscriptos ));
		}
	}

}
