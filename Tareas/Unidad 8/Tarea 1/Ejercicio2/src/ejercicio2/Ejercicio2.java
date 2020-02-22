/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int colSize = 10, rowSize = 10;
        int[][] campo = new int[colSize][rowSize];
        int arco, fila, columna, asteroides;

        for(int i = 0; i < campo.length; i++){
            for(int j = 0; j < campo[i].length; j++){
                campo[i][j] = (int)Math.round( Math.random());
                System.out.print(campo[i][j] + " ");
                if(j == campo[i].length - 1) System.out.println();
            }
        }

        System.out.println("Introduce el arco de estudio (-1 para finalizar): " );
        arco = keyboard.nextInt();
        while(arco > -1){
            asteroides = 0;
            System.out.println("Introduce la fila de la coordenada de estudio: " );
            fila = keyboard.nextInt();
            System.out.println("Introduce la columna de la coordenada de estudio: " );
            columna = keyboard.nextInt();

            for(int i = fila - arco; i <= fila + arco; i++){
                for(int j = columna - arco; j <= columna + arco; j++){
                    if(i >= 0 && i < rowSize && j >= 0 && j < colSize && campo[i][j] == 1) asteroides++;
                }
            }

            System.out.println("En el área de estudio hay " + asteroides + " asteroides");

            System.out.println("Introduce el arco de estudio (-1 para finalizar): " );
            arco = keyboard.nextInt();

        }
    }
    
}
