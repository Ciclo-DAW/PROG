/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n1, n2, pos, punto, tempPunto, numPlanas, tempPlanas;
        boolean comen, primera;

        n1 = teclado.nextInt();
        while (n1 > -1) {
            comen = primera = false;
            pos = punto = tempPunto = numPlanas  = tempPlanas = 0;

            n2 = teclado.nextInt();
            while (n2 > -1) {
                if (n1 == n2) {
                    comen = true;
                    if (!primera) {
                        primera = true;
                        tempPlanas = 0;
                        tempPunto = pos;
                    }

                    tempPlanas++;
                    if (tempPlanas > numPlanas) {
                        numPlanas = tempPlanas;
                        punto = tempPunto;
                    }
                } else primera = false;

                n1 = n2;
                pos++;

                n2 = teclado.nextInt();
            }

            if (comen) {
                System.out.println(punto + " " + numPlanas);
            }
            else {
                System.out.println("HOY NO COMEN");
            }

            n1 = teclado.nextInt();
        }

    }
    
}
