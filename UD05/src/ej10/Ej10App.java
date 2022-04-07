package ej10;

import java.util.Scanner;

/**
 * TA05 - Suma de las ventas.
 * @author marcp
 *
 */
public class Ej10App {

	public static void main(String[] args) {
		
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el número de ventas: ");
		String num_ventanas = sc.nextLine();
		
		
		for(int i=1; i<=Integer.parseInt(num_ventanas); i++) {
			System.out.println("Indica el valor de la venta numero "+i+": ");
			String valor_venta = sc.nextLine();
			suma = suma + Integer.parseInt(valor_venta);
		}
		sc.close();
		
		System.out.println("Suma de todas las ventas: "+suma);

	}

}
