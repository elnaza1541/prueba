/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int centígrados, cambio;
        
        System.out.println(" escribir grados ");
        
        centígrados = leer.nextInt();
        
       cambio = 32 + (9 * centígrados / 5);
       
        System.out.println( centígrados + " grados centigrados a Fahrenheit es " + cambio );
    }
    
}
