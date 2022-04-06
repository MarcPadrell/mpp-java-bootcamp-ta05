package ej13;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el primer entero: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Indica el segundo entero: ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Indica el signo aritmético (+,-,*,/,^,%) : ");
		String symbol = sc.nextLine();
		
		switch(symbol) {
			case "+":
				System.out.println("Suma de los operandos: "+(num1+num2));
				break;
			case "-":
				System.out.println("Resta de los operandos: "+(num1-num2));
				break;
			case "*":
				System.out.println("Multiplicación de los operandos: "+(num1*num2));
				break;
			case "/":
				System.out.println("División de los operandos: "+(num1/num2));
				break;
			case "^":
				System.out.println("Exponente: "+(num1^num2));
				break;
			case "%":
				System.out.println("Módulo: "+(num1%num2));
				break;
		}
		
		sc.close();	

	}

}
