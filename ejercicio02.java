/*
       2.  Digitar un nombre y si este termina en “rt” me muestra un mensaje que me diga “Termina en las letras”, 
       de lo contrario “No termina en las letras”.
       */
import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Digita el nombre que deseas verificar: ");
        String nombre = enter.nextLine();

        if (nombre.endsWith("rt") || nombre.endsWith("RT")) {
            System.out.println("El nombre ingresado termina en las letras rt o RT");
        } else {
            System.out.println("El nombre no termina en las letras indicadas");
        }
        enter.close();
    }
}
//comprobando que se pueden modificar diferentes archivos del repositorio
