/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> numeros;
        Scanner teclado = new Scanner(System.in);
        int size;
        int valor;
        int pos;
        int aux;

        valor = teclado.nextInt();
        while(valor != 0){
            valores.add(valor);
            valor = teclado.nextInt();
        }

        for(int i = 0; i<valores.size(); i++){
            size = valores.get(i);
            numeros = new ArrayList<Integer>();
            pos = 0;
            aux = 1;
            for(int j = 1; j<= size; j++){
                numeros.add(j);
            }

            while(aux < numeros.size()){
                while(pos < numeros.size()){
                    numeros.remove(pos);
                    pos = pos + aux;
                }
                pos = 0;
                aux++;
            }

            Collections.sort(numeros, Collections.reverseOrder());
            System.out.print(size + ": ");
            for(int j = 0; j<numeros.size(); j++){
                System.out.print(numeros.get(j) + " ");
            }

            System.out.println();
        }
    }
}
