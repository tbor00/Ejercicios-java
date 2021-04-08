package ort;

import java.util.Scanner;

public class Ejercicio_14 {
	public static Scanner input = new Scanner(System.in);
	private static final double ESTATURA_REQUERIDA = 1.50;
	private static final int EDAD_REQUERIDA = 7;
	
	public static void main(String[] args) {
		String jugador1;
		float estaturaJugador1;
		int edadJugador1;

		//Pedimos los datos
		System.out.println("Ingrese el nombre del jugador");
		jugador1= input.nextLine();
		System.out.println("Ingrese la edad del jugador");
		edadJugador1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la estatura del jugador");
		estaturaJugador1 = Float.parseFloat(input.nextLine());
		
		
		//Evaluamos los datos
		if(estaturaJugador1 >= ESTATURA_REQUERIDA && edadJugador1 >= EDAD_REQUERIDA) {
				System.out.println("El jugador " + jugador1 + " cumple con los requisitos y puede entrar a la montaña rusa");
		}else {
			System.out.println("El jugador " + jugador1 + " no cumple con los requisitos");
		}
		
		
		
	}

}
