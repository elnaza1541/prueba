/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2, calculo;
        double resultado;

        boolean salir = false;

        System.out.println("\n" + "MENU");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[5] Salir");

        calculo = leer.nextInt();

        System.out.println("\n" + "Ingrese el primer numero");

        num1 = leer.nextInt();

        System.out.println("\n" + "Ingrese el segundo numero");

        num2 = leer.nextInt();

        do {
            switch (calculo) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("el resultado es " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.println("el resultado es " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("el resultado es " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("el resultado es " + resultado);
                    break;
                case 5:
                    salir = true;
                    break;

            }
        } while (calculo <= 5 && salir == false);

    }

}
