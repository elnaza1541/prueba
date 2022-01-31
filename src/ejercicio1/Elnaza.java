/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class Elnaza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int,doble,float ---> numericos
        //string,char ---> cadena o caracter
        //boolean ----> verdadero o falso
        Scanner leer = new Scanner(System.in);
             
        int num1, num2, resultado ;
        
        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        
        System.out.println("ingrese un numero");
        num2 = leer.nextInt();
        
        
        resultado = num1 + num2;
                
        System.out.println( "el numero es " + resultado);
    }
    
}
