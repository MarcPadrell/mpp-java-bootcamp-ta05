package ej3;
import javax.swing.JOptionPane;

/**
 * TA05 - Utilizaci�n de JOptionPane
 * @author marcp
 *
 */
public class Ej3App {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Introduce el nombre:");
		System.out.println("Bienvenido "+name);

	}

}
