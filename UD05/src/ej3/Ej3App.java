package ej3;
import javax.swing.JOptionPane;

/**
 * TA05 - Utilización de JOptionPane
 * @author marcp
 *
 */
public class Ej3App {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Introduce el nombre:");
		System.out.println("Bienvenido "+name);

	}

}
