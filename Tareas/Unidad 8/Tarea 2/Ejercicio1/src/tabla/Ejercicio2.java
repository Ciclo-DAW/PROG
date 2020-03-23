package tabla;

import vehiculo.Coche;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Coche[][] tabla = new Coche[5][5];
        Random velocidad = new Random();
        Random marcha = new Random();
        ArrayList<Coche> menores = new ArrayList<Coche>();
        ArrayList<Coche> mayores = new ArrayList<Coche>();
        for (int i = 0; i<5; i++){
            for (int j = 0; j < 5; j++){
                tabla[i][j] = new Coche(velocidad.nextInt(111) + 10, marcha.nextInt(7));
            }
        }

        for (int i = 0; i<5; i++){
            for (int j = 0; j < 5; j++){
                if(tabla[i][j].getVelocidad() > 60){
                    mayores.add(tabla[i][j]);
                }

                if(tabla[i][j].getVelocidad() < 40){
                    menores.add(tabla[i][j]);
                }
            }
        }

        Collections.sort(mayores);
        Collections.sort(menores);

        System.out.println("Valores de la tabla");

        for (int i = 0; i<5; i++){
            for (int j = 0; j < 5; j++){
               System.out.println("Velocidad: " + tabla[i][j].getVelocidad() + ", marcha: " + tabla[i][j].getMarcha());
            }
        }

        System.out.println("Valores del ArrayList de menores de 40");

        for (int i = 0; i<menores.size(); i++){
            System.out.println(menores.get(i).getVelocidad());
        }

        System.out.println("Valores del ArrayList de mayores de 60");

        for (int i = 0; i<menores.size(); i++){
            System.out.println(mayores.get(i).getVelocidad());
        }

    }
}
