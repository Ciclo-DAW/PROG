/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String isbn;
        String[] isbnArray = new String[13];
        Scanner keyboard = new Scanner(System.in);
        int suma = 0;

        System.out.println("Introduzca un ISBN sin guiones: ");
        isbn = keyboard.nextLine();
        isbnArray = isbn.split("");

        for(int i = 0;i < isbnArray.length;i++)
        {
            if(i%2 == 0){
                suma += Integer.parseInt(isbnArray[i]);
            } else {
                suma += Integer.parseInt(isbnArray[i]) * 3;
            }
        }

        if(suma%10 == 0){
            System.out.println("El dígito de control es correcto.");
        } else{
            System.out.println("El dígito de control es incorrecto.");
        }
    }
}
