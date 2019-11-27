package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pesoMaximo;
        int pesoElefante;
        int pesoTotal;
        int cont;
        boolean rompio;

        pesoMaximo = teclado.nextInt();
        while (pesoMaximo != 0) {
            cont = 0;
            pesoTotal = 0;

            pesoElefante = teclado.nextInt();

            while(pesoElefante != 0){
                pesoTotal += pesoElefante;

                if(pesoTotal <= pesoMaximo){
                    cont++;
                }
                pesoElefante = teclado.nextInt();
            }

            System.out.println(cont);

            pesoMaximo = teclado.nextInt();

        }
    }
    
}
