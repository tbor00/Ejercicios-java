package ort;
import java.util.Scanner;

public class Ejercicio_10 {
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String socio1, socio2, socio3;
		float capSocio1, capSocio2, capSocio3, total;
		
		//Socio1
		System.out.println("Ingrese el nombre del socio 1: ");
		socio1 = input.nextLine();
		System.out.println("Ingrese el capital aportado del socio 1: ");
		capSocio1 = Float.parseFloat(input.nextLine());
		
		//Socio2
		System.out.println("Ingrese el nombre del socio 2: ");
		socio2 = input.nextLine();
		System.out.println("Ingrese el capital aportado del socio 2: ");
		capSocio2 = Float.parseFloat(input.nextLine());
		
		
		//Socio3
		System.out.println("Ingrese el nombre del socio 3: ");
		socio3 = input.nextLine();
		System.out.println("Ingrese el capital aportado del socio 3: ");
		capSocio3 = Float.parseFloat(input.nextLine());
		
		
		//Sentencias
		
		total = (capSocio1 + capSocio2 + capSocio3);
		System.out.println("El total es de: " + total);
		
		System.out.println(socio1 + " aporto: %" + ((capSocio1 / total)* 100));
		System.out.println(socio2 + " aporto: %" + ((capSocio2 / total)* 100));
		System.out.println(socio3 + " aporto: %" + ((capSocio3 / total)* 100));
		
	}

}
