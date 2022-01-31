/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el Primer Numero");

        num1 = leer.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero no es par");
        }
    }

}
