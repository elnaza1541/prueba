/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String nombre;
        
        System.out.println("ingresa tu nombre");
        
        nombre = leer.next();
        System.out.println("mi nombre es " + nombre + " mucho gusto na");
    }
    
}
