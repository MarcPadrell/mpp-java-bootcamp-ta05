package ej11;

import java.util.Scanner;

/**
 * TA05 - Día de la semana usando switch.
 * @author marcp
 *
 */
public class Ej11App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un día se la semana: ");
		String day = sc.nextLine();
		sc.close();
		
		switch(day) {
			case "Lunes":
				System.out.println("Día laboral!");
				break;
			case "Martes":
				System.out.println("Día laboral!");
				break;
			case "Miércoles":
				System.out.println("Día laboral!");
				break;
			case "Jueves":
				System.out.println("Día laboral!");
				break;
			case "Viernes":
				System.out.println("Día laboral!");
				break;
			case "Sábado":
				System.out.println("Día NO laboral!");
				break;
			case "Domingo":
				System.out.println("Día No laboral!");
				break;
			default:
				System.out.println("No has introducido un día correcto!");
				break;
		}

	}

}
