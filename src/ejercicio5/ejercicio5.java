/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numero;
        
        System.out.println("ingresa un numero");
        
        numero = leer.nextInt();
        
        double resultado = Math.sqrt(numero);
        
        System.out.println(" el doble del el numero es " + 2*numero);
        
        System.out.println(" el triple del numero es " + 3 *numero);
        
        System.out.println(" la raiz cuadrada del numero es " + resultado);
        
        
                
          
    }
    
}
