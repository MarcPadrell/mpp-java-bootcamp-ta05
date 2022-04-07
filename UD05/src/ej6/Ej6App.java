package ej6;
import java.util.Scanner;

/**
 * TA05 - Precio más IVA.
 * @author marcp
 *
 */
public class Ej6App {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce el precio de un producto: ");
		String precio = sc.nextLine();
		sc.close();
		
		double precio_double = Double.parseDouble(precio);
		
		System.out.println("El precio final del artículo es: "+(precio_double+(precio_double*IVA)));

	}

}
