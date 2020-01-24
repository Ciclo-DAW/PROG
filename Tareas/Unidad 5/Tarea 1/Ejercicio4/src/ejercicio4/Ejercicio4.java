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
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num = t.nextInt();
        int nivel, totalUvas;

        while (num != 0){
            nivel = 1;
            totalUvas = 1;
            while(totalUvas < num){
                nivel++;
                totalUvas+=nivel;
            }

            System.out.println(nivel);
            num = t.nextInt();
        }
    }
    
}
