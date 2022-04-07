package ej5;
import java.util.Scanner;

/**
 * TA05 - Número divisible por 2.
 * @author marcp
 *
 */
public class Ej5App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		String num = sc.nextLine();
		sc.close();
		
		if((Integer.parseInt(num) % 2) == 0) {
			System.out.println("El numero SÍ es divisble entre 2!");
		}else {
			System.out.println("El numero NO es divisble entre 2!");
		}

	}

}
