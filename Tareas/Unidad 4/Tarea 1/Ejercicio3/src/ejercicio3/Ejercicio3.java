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
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] weekDays = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int num;
        String res;

        System.out.println("Introduzca un número entre 1 y 7");
        num = keyboard.nextInt();

        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                res = weekDays[num];
                break;
            case 7:
                res = weekDays[0];
                break;
            default:
                res = "DIA ERRÓNEO";
                break;
        }

        System.out.println(res);
    }
    
}
