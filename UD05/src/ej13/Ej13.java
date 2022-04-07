package ej13;

import java.util.Scanner;

/**
 * TA05 - Calculadora.
 * @author marcp
 *
 */
public class Ej13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el primer entero: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Indica el segundo entero: ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Indica el signo aritm�tico (+,-,*,/,^,%) : ");
		String symbol = sc.nextLine();
		
		switch(symbol) {
			case "+":
				System.out.println("Suma de los operandos: "+(num1+num2));
				break;
			case "-":
				System.out.println("Resta de los operandos: "+(num1-num2));
				break;
			case "*":
				System.out.println("Multiplicaci�n de los operandos: "+(num1*num2));
				break;
			case "/":
				System.out.println("Divisi�n de los operandos: "+(num1/num2));
				break;
			case "^":
				System.out.println("Exponente: "+(num1^num2));
				break;
			case "%":
				System.out.println("M�dulo: "+(num1%num2));
				break;
		}
		
		sc.close();	

	}

}
