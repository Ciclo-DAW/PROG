/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n;
        System.out.print("Introduzca un número: ");
        n = t.nextInt();
        SecuenciaNumeros num = new SecuenciaNumeros(n);
        num.longitudCiclo();
        num.escribeSecuencia();
    }
}
