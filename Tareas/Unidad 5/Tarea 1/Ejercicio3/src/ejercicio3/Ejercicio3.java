/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palabra1, palabra2;
        int numCasos = s.nextInt();

        for(int i = 0; i < numCasos; i++) {

            palabra1 = s.next().toLowerCase();
            s.next();
            palabra2 = s.next().toLowerCase();

            System.out.println(palabra1.equals(palabra2) ? "TAUTOLOGIA" : "NO TAUTOLOGIA");

        }
    }
}
