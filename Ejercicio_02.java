package ort;

import java.util.Scanner;

public class Ejercicio_02 {

		private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
			int primerTrimestre, segundoTrimestre, tercerTrimestre, promedioFinal;
		
			System.out.println("Hola, este es un programa de promedios de 3 trimestres.");
			System.out.println("A continuación introduzca la nota del primer trimestre");
			primerTrimestre = Integer.parseInt(input.nextLine());
			System.out.println("Ahora introduzca la del segundo trimestre");
			segundoTrimestre  = Integer.parseInt(input.nextLine());
			System.out.println("Y por ultimo la nota del tercer trimestre");
			tercerTrimestre  = Integer.parseInt(input.nextLine());


			promedioFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;
			
			System.out.println("El promedio final es de: "+ promedioFinal);
	}

}
