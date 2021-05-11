/*1.  Si el nombre inicia por A o E me muestra un mensaje que muestre el nombre, 
          si inicia por I o O me muestra un mensaje ADSI 2021 
          y si inicia en U me muestra el segundo y tercer carácter del nombre*/

import java.util.Scanner;

public class ejercicio01 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		String nombre = enter.nextLine();

		if (nombre.startsWith("A") || nombre.startsWith("a") || nombre.startsWith("E") || nombre.startsWith("e")) {
			System.out.println("Tú nombre ingresado es:" + nombre);
		} else if (nombre.startsWith("I") || nombre.startsWith("i") || nombre.startsWith("O")
				|| nombre.startsWith("o")) {
			System.out.println("eres integrante del grupo ADSI 2104630 año 2021");
		} else if (nombre.startsWith("U") || nombre.startsWith("u")) {
			System.out.println("El segundo y tercer caracter de tú nombre son: " + nombre.substring(1, 3));
		} else
			System.out.println("Tú nombre no cumple con las condiciones y es: " + nombre);
		{
		}
		enter.close(); //realizando un comentario para git
	}
}
