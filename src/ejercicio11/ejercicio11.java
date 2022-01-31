/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int tipomotor;
        
        
        System.out.println("\n" + "Ingrese el Tipo de Motor");
        System.out.println("[1] La Bomba es una Bomba de Agua");
        System.out.println("[2] La Bomba es una Bomba de Gasolina");
        System.out.println("[3] La Bomba es una Bomba de Hormigón");
        System.out.println("[4] La bomba es una Bomba de Pasta Alimenticia");
        
        tipomotor = leer.nextInt();
        
        switch (tipomotor) {
            case 1:
                System.out.println("La Bomba es de Agua");
                break;
            case 2:
                System.out.println("La Bomba es de Gasolina");
                break;
                        
            case 3:
                System.out.println("La Bomba es de Hormigón");
                break;
            case 4:
                System.out.println("La bomba es de Pasta Alimenticia");
                break;
            default: System.out.println("error");
        }
        
                
                
    }
    
}
