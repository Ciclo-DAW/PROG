/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author Brais
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int maximo = 1;
        int minimo = 20;
        int cont = 1;
        Random rand = new Random();

        TreeSet<Integer> pares = new TreeSet<Integer>();


        for(int i = 0; i<numeros.length; i++){
            numeros[i] = rand.nextInt(20) + 1;
            if(numeros[i] > maximo) maximo = numeros[i];
            if(numeros[i] < minimo) minimo = numeros[i];

            if(numeros[i]%2 == 0){
                pares.add(numeros[i]);
            }

            if(cont < 10){
                System.out.print(numeros[i] + ", ");
                cont++;
            } else if (cont == 10){
                System.out.print(numeros[i]);
                System.out.println();
                cont = 1;
            }
        }

        System.out.println("El número más grande es: " + maximo);
        System.out.println("El número más pequeño es: " + minimo);

        System.out.println(pares);

    }
}
