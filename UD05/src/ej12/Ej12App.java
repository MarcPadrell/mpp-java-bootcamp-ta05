package ej12;

import java.util.Scanner;

public class Ej12App {

	public static void main(String[] args) {
		
		String password = "Bootcamp";
		
		Scanner sc = new Scanner(System.in);
		int cont=1;
		String scan_password = "";
		boolean flag = false;
		
		do {
			
			System.out.println("Introduce la contraseña, intento número "+cont+":");
			scan_password = sc.nextLine();
			flag = password.equals(scan_password);
			cont++;
			
		}while(cont<=3 && (!flag));
		
		if (flag) {
			System.out.println("Enhorabuena");
		}else {
			System.out.println("Contraseñas introducidas incorrectas!");
		}
		
		sc.close();

	}

}
