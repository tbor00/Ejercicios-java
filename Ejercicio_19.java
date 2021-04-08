package ort;

import java.util.Scanner;

public class Ejercicio_19 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean esdeunSolodigito, esImpar, estaEnAmbos, noEstaEnNiguno;
		int numeroEvaluar;
		
		System.out.println("Ingrese un numero");
		numeroEvaluar = Integer.parseInt(input.nextLine());
		
		esdeunSolodigito = numeroEvaluar >= 1 && numeroEvaluar < 10;
		esImpar = numeroEvaluar % 2 != 0;
		estaEnAmbos = numeroEvaluar % 2 !=0 && numeroEvaluar >= 1 && numeroEvaluar < 10;
		noEstaEnNiguno = numeroEvaluar % 2 == 0 && numeroEvaluar > 10;
		
		if(noEstaEnNiguno) {
			System.out.println("El numero no es impar y no es de un solo digito");
		}else if(estaEnAmbos) {
			System.out.println("El numero es impar y es de un solo digito");
		}else if(esImpar) {
			System.out.println("El numero es impar");
		}else if(esdeunSolodigito) {
			System.out.println("El numero es de un solo digito");
		}
	}

}
