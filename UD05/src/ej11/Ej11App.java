package ej11;

import java.util.Scanner;

/**
 * TA05 - D�a de la semana usando switch.
 * @author marcp
 *
 */
public class Ej11App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un d�a se la semana: ");
		String day = sc.nextLine();
		sc.close();
		
		switch(day) {
			case "Lunes":
				System.out.println("D�a laboral!");
				break;
			case "Martes":
				System.out.println("D�a laboral!");
				break;
			case "Mi�rcoles":
				System.out.println("D�a laboral!");
				break;
			case "Jueves":
				System.out.println("D�a laboral!");
				break;
			case "Viernes":
				System.out.println("D�a laboral!");
				break;
			case "S�bado":
				System.out.println("D�a NO laboral!");
				break;
			case "Domingo":
				System.out.println("D�a No laboral!");
				break;
			default:
				System.out.println("No has introducido un d�a correcto!");
				break;
		}

	}

}
