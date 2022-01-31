/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        
        System.out.println("ingresa una palabra");
        
        palabra = leer.next();
        
        System.out.println(palabra.toUpperCase());
        
        System.out.println(palabra.toLowerCase());
        
        
    }
    
}
