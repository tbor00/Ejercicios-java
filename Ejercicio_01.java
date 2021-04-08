package ort;
import java.util.Scanner;

public class Ejercicio_01 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nombre;

			System.out.println("Ingrese su nombre");
			nombre = input.nextLine();
			System.out.println("Bienvenido, " + nombre + ". Un gusto conocerte");
	}

}
