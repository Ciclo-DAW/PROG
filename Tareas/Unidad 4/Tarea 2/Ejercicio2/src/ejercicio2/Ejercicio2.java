/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número entero entre 3 y 10: ");
        num = keyboard.nextInt();

        while(num < 3 || num > 10){
            System.out.print("Número fuera de rango, introduce otro: ");
            num = keyboard.nextInt();
        };

        for(int i = 1; i < num*2; i++ ) {
            if (i <= num) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("A");
                }
            } else {
                for (int j = num * 2 - i; j > 0; j--) {
                    System.out.print("A");
                }
            }
            System.out.println("");
        }
    }
}
