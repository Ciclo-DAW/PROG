/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int piedras;
        int cont;

        piedras = teclado.nextInt();

        while (piedras > 0) {
            int fila = 1;
            cont = 0;
            for (int i = 0; i < piedras; i++) {
                cont += fila;
                fila++;
                if (cont == piedras || cont + (fila) > piedras) {
                    System.out.println((fila - 1) + " " + (piedras - cont));
                    break;
                }
            }

            piedras = teclado.nextInt();

        }
    }
}
