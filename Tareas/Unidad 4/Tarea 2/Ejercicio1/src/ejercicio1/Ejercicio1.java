/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Brais
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bucle For");
        for (int i = 53; i > 0; i--) {
            if (i % 2 == 0) {
                if (i < 52) {
                    System.out.print(",");
                }
                System.out.print(i);
            }
        }

        System.out.println("\nBucle While");
        int j = 53;
        while (j > 0){
            if (j % 2 == 0) {
                if (j < 52) {
                    System.out.print(",");
                }
                System.out.print(j);
            }
            j--;
        }

        System.out.println("\nBucle Do-While");
        int x = 53;
        do{
            if (x % 2 == 0) {
                if (x < 52) {
                    System.out.print(",");
                }
                System.out.print(x);
            }
            x--;
        } while (x > 0);
    }
}
