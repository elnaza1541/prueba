/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         String palabra;
         
         
         System.out.println("ingresa la palabra");
         
         palabra = leer.next();
        
         
         if ( palabra.equals("eureka")) {
             System.out.println("correcto");
             
         } else {
            System.out.println("incorrecto");
         }
    }
    
}
