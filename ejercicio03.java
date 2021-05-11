
/*

 * 3. Crear un programa con la sentencia switch con 4 opciones – suma, resta,
 * multiplicación y división. El usuario deberá digitar 2 números y dependiendo
 * la opción elegida el programa debe realizar la operación. Cabe anotar que
 * para la resta no puede dar número negativo y en la división no se puede por
 * cero.
 */

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) throws Exception {
        int resultado;
        Scanner enter = new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        int num1 = enter.nextInt();
        System.out.println("Escribe el segundo numero: ");
        int num2 = enter.nextInt();
        System.out.println("¿Que operacion desea realizar con los numeros ingresados? , digita tu opcion: ");
        System.out.println("1. Suma  2. resta  3. Multiplicacion  4. division : ");
        int menu = enter.nextInt();
        switch (menu) {
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma de tus numeros ingresados es igual a: " + resultado);
                break;
            case 2:
                if (num1 < num2 || num2 > num1) {
                    System.out.println("El resultado de la resta no puede ser negativo : "); }
                else {
                resultado = num1 - num2; 
                    System.out.println("La resta de tus numeros ingresados es: " + resultado);}
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("La multiplicacion de tus numeros ingresados es igual a: " + resultado);
                break;
            case 4:
                if (num1 == 0 || num2 == 0) {
                    System.out.println("No se puede realizar una division por 0: ");
                } else {
                    resultado = num1 / num2; 
                System.out.println("La diviaion de tus numeros ingresados es: " + resultado);
            }
                break;
            default: {
                System.out.println("El dato ingresado no es valido");
            }
                break;

        }
        enter.close();
    }
}
