/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numCasos;
        String palabra, invertida;

        numCasos = keyboard.nextInt();

        for(int i = 0;i < numCasos;i++) {
            invertida = "";
            palabra = keyboard.next();

            for(int j = palabra.length() - 1; j >= 0; j--) {

                if(Character.isUpperCase(palabra.charAt(0)) && j == palabra.length() - 1) {
                    invertida += (Character.toUpperCase(palabra.charAt(j)));
                    palabra = palabra.toLowerCase();
                } else {
                    invertida += (palabra.charAt(j));
                }
            }

            System.out.println(invertida);
        }
    }
}
