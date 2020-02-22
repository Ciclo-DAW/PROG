/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       boolean triangularSuperior, triangularInferior;
       int dimensiones, num;
       Scanner keyboard = new Scanner(System.in);

       dimensiones = keyboard.nextInt();

       while(dimensiones != 0) {
           triangularInferior = triangularSuperior = true;
           for(int i = 0; i < dimensiones; i++){
               for(int j = 0; j < dimensiones; j++){
                   num = keyboard.nextInt();

                   if( i < j && num != 0){
                       triangularSuperior = false;
                   } else if ( i > j && num != 0) {
                       triangularInferior = false;
                   }
               }
           }

           if(triangularSuperior || triangularInferior) {
               System.out.println("SI");
           } else {
               System.out.println("NO");
           }

           dimensiones = keyboard.nextInt();
       }
    }
}
