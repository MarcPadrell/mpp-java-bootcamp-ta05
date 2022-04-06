package ej4;
import java.util.Scanner;

public class Ej4App {

	public static void main(String[] args) {
		
		final double PI = Math.PI;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce el radio: ");
		String radio = sc.nextLine();
		sc.close();
		
		double area = PI*Math.pow(Double.parseDouble(radio), 2);
		
		System.out.println("Area del circulo: "+area);

	}

}
