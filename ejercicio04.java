
/*
 * 
 * 4. Pedirle al usuario que digite un valor que me representara el valor de la
 * moneda colombiana, luego debe elegir de 3 opciones a su criterio a qué tipo
 * de moneda lo desea convertir y mostrar el resultado final..
 */

import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) throws Exception {
        Double resultado;
        Scanner enter = new Scanner(System.in);
        System.out.println("digite la cantidad de pesos colombianos a convertir: ");
        Double cop= enter.nextDouble();
        if (cop>=0){
            System.out.println("selecciona la divisa a la que deseas convertir: ");
            System.out.println("1. Dolar estadounidense USD  2. Dolar Canadiense CAD  3. Peso Mexicano MXN : ");
            int opcion= enter.nextInt();
            switch(opcion){
                case 1:
                resultado= cop * 0.00027;
                System.out.println("La cantidad en dolares estadounidensde USD es: " + resultado);
                break;
                case 2:
                resultado= cop * 0.00033;
                System.out.println("La cantidad en dolares canadienses CAD es: " + resultado);
                break;
                case 3:
                resultado= cop * 0.0054;
                System.out.println("La cantidad en pesos mexicanos MXN es: " + resultado);
                break;
                default:
                System.out.println("la opción ingresada no es valida");
                break;
            }
            enter.close();
        }

    }
}
