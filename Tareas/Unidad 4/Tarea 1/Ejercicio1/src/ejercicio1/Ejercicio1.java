/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número entero: ");
        num = keyboard.nextInt();

        //Apartado a
        if(num%2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        //Apartado b
        System.out.println(num%2 == 0 ? "El número es par" : "El número es impar");

    }
    
}
