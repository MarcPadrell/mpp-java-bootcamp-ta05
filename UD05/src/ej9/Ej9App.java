package ej9;

/**
 * TA05 - Números divisbles por 2 y 3.
 * @author marcp
 *
 */
public class Ej9App {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println("El numero "+i+" SÍ es divisble entre 2 i 3!");
			}
		}

	}

}
