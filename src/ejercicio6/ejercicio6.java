/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  num1, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el Primer Numero");
        
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el Segundo Numero");
        
        num2 = leer.nextInt();
        
        if (num1>num2) {
            
            System.out.println(num1+" Es mayor que " +num2 );
        }
        else{
            System.out.println(num1+" Es Menor que " + num2);
      
        
         
        }
                
        
    }
    
}
