package ort;

import java.util.Scanner;

public class Ejercicio_09 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		float anguloA, anguloB;
		
		System.out.println("Ingrese el angulo A de un triangulo");
		anguloA = Float.parseFloat(input.nextLine());
		System.out.println("Ingrese el angulo B de un triangulo");
		anguloB = Float.parseFloat(input.nextLine());
		
		if(anguloA + anguloB < 180) {
			System.out.println("El angulo C, equivale a: "+ (180-(anguloA+anguloB)));
		}else {
			System.out.println("Vuelve a intentarlo. las suma de dos lados tiene que ser menor a 180°");
		}
		
	}

}
