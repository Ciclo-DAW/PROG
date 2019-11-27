/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");

        int total = 0;
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                total += i;
            }
        }

        if(total > num*2){
            System.out.println("El número es abundante");
        } else {
            System.out.println("El número no es abundante");
        }
    }
    
}
