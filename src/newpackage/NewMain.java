/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author elnaza
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);int num1, num2, opcion;double resultado;
boolean bandera = false;String rp;System.out.println("===CALCULADORA CUANTICA===");
System.out.println("\n" + "[X] Ingrese 2 numeros para calcular.. ");System.out.println("NUM1: ");
num1 = leer.nextInt();System.out.println("NUM2: ");num2 = leer.nextInt();
System.out.println("\n" + "MENU");System.out.println("[1] Sumar");System.out.println("[2] Restar");
System.out.println("[3] Multiplicar");System.out.println("[4] Dividir");System.out.println("[5] Salir");
do {opcion = leer.nextInt();switch (opcion) {
case 1:resultado = num1 + num2;System.out.println("el resultado es " + resultado);break;
case 2:resultado = num1 - num2;System.out.println("el resultado es " + resultado);break;
case 3:resultado = num1 * num2;System.out.println("el resultado es " + resultado);break;
case 4:resultado = num1 / num2;System.out.println("el resultado es " + resultado);break;
case 5:System.out.println("Enserio quieres salir? S/SI N/NO");rp = leer.next();if ("s".equals(rp) || "S".equals(rp)){
bandera = true;}break;default:System.out.println("las opciones son entre 1 a 5");opcion = 1;
break;}} while (opcion <= 5 && bandera == false);}}