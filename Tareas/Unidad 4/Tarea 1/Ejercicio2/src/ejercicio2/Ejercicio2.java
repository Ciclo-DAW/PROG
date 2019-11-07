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
        int n1, n2, n3;
        System.out.println("Introduzca tres números enteros");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();

        if(n1 < n2 && n2 < n3){
            System.out.println("Números introducidos en orden creciente");
        } else if(n1 > n2 && n2 > n3) {
            System.out.println("Números introducidos en orden decreciente");
        } else if(n1 == n2 && n1 == n3){
            System.out.println("Números introducidos iguales");
        } else {
            System.out.println("Números introducidos desordenados");
        }
    }

}
