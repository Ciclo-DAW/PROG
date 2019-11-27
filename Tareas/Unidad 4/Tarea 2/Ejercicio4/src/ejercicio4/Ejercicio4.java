/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int caloriasEntreno;
        int totalCalorias;
        int calorias;
        int numComidas;
        int numEntrenos;

        Scanner leo = new Scanner(System.in);
        caloriasEntreno = leo.nextInt();

        while (caloriasEntreno != 0) {
            numComidas = leo.nextInt();
            numEntrenos = 0;
            totalCalorias = 0;

            for(int i = 0;i < numComidas; i++) {
                totalCalorias += leo.nextInt();
            }
            while(totalCalorias > 0){
                numEntrenos++;
                totalCalorias -= caloriasEntreno;
            }

            System.out.println( numEntrenos );

            caloriasEntreno = leo.nextInt();
        }
    }
}
