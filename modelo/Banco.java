package modelo;

import javax.swing.JOptionPane;

public class Banco {
	
	public static void main(String[] args) {
		
		
		//Comienza menu
		String opcion = "";
		do {
			//Pedimos opcion
			opcion = JOptionPane.showInputDialog(null, MENU, "Menú Banco", JOptionPane.PLAIN_MESSAGE);
			//Analizamos opcion escogida
			switch(opcion) {
			case "1":
				depositar();
				break;
			case "2":
				retirar();
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "FIN DEL PROGRAMA", "Menú Banco",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción equivocada", "Menú Banco", JOptionPane.ERROR_MESSAGE);
			}
		}while(!opcion.equals("3"));

	}

	private static void depositar() {
		
		
	}

	private static void retirar() {
    }

	//String con las opciones del menu para mostrar en el JOptionPane
	private static final String MENU = "1._ Depositar\n2.- Retirar"
			+ "TERMINAR";

}