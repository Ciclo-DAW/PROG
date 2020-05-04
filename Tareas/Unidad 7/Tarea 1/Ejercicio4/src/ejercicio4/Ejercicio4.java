/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */

    public static String aumentarLetra(String s) {

        String res;
        char[] c = new char[3];

        for(int i=0; i<s.length(); i++) {
            c[i] = s.charAt(i);
        }

        c[2] = aumentarChar(c[2]);

        if(c[2] == 'B') {
            c[1] = aumentarChar(c[1]);
            if(c[1] == 'B'){
                c[0] = aumentarChar(c[0]);
            }
        }
        res = String.copyValueOf(c);
        return res;
    }

    public static char aumentarChar(char c){
        char[] letras =  {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
        int pos = 0;;
        for(int i=0; i<21; i++) {
            if(c == letras[i]) {
                if(letras[i] == 'Z') {
                    pos = 0;
                } else {
                    pos = i + 1;
                }
            }
        }
        return letras[pos];
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        String letra;

        numero = teclado.nextInt();
        letra = teclado.next();

        while (numero != 9999 || !letra.equals("ZZZ")) {
            numero++;
            if (numero > 9999) {
                letra = aumentarLetra(letra);
                numero = 0;
            }

            if (numero == 0) {
                System.out.println("0000 " + letra );
            } else {
                System.out.printf("%04d %s", numero, letra );
                System.out.println();
            }

            numero = teclado.nextInt();
            letra = teclado.next();
        }
    }
}
