package ort;

import java.util.Scanner;

public class Ejercicio_21 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String uno = "Domingo", dos = "Lunes", tres = "Martes", cuatro = "Miercoles", cinco = "Jueves", seis = "Viernes", siete = "Sabado";
		int diaSemana;
		
		System.out.println("Ingrese un numero del 1 al 7, esto se representa en días de la semana");
		diaSemana = Integer.parseInt(input.nextLine());
	
		//Evaluamos la condición
		switch(diaSemana) {
		case 1:
			System.out.println("El dia de semana correspondiente a ese numero es: " + uno);
			break;
		case 2:
			System.out.println("El dia de semana correspondiente a ese numero es: " + dos);
			break;
		case 3:
			System.out.println("El dia de semana correspondiente a ese numero es: " + tres);
			break;
		case 4:
			System.out.println("El dia de semana correspondiente a ese numero es: " + cuatro);
			break;
		case 5:
			System.out.println("El dia de semana correspondiente a ese numero es: " + cinco);
			break;
		case 6: 
			System.out.println("El dia de semana correspondiente a ese numero es: " + seis);
			break;
		case 7: 
			System.out.println("El dia de semana correspondiente a ese numero es: " + siete);
			break;
		default:
			System.out.println("Ingreso un numero ERRONEO");
		}
		
	}

}
