package ej12;

import java.util.Scanner;

/**
 * TA05 - Verificaci�n contrase�a.
 * @author marcp
 *
 */
public class Ej12App {

	public static void main(String[] args) {
		
		String password = "Bootcamp";
		
		Scanner sc = new Scanner(System.in);
		int cont=1;
		String scan_password = "";
		boolean flag = false;
		
		do {
			
			System.out.println("Introduce la contrase�a, intento n�mero "+cont+":");
			scan_password = sc.nextLine();
			flag = password.equals(scan_password);
			cont++;
			
		}while(cont<=3 && (!flag));
		
		if (flag) {
			System.out.println("Enhorabuena");
		}else {
			System.out.println("Contrase�as introducidas incorrectas!");
		}
		
		sc.close();

	}

}
