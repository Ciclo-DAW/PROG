package ejercicio1;

public class SecuenciaNumeros {
    private int numero;

    public SecuenciaNumeros() {
        this.numero = 22;
    }

    public SecuenciaNumeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void longitudCiclo() {
        int cont;
        cont = 1;
        int aux = this.numero;

        while(aux != 1){
            if(aux % 2 == 0){
                aux = aux/2;
            } else {
                aux = aux*3+1;
            }
            cont++;
        }
        System.out.println(cont);
    }

    public void escribeSecuencia() {
        int aux = this.numero;

        System.out.print(aux + " ");
        while(aux != 1){
            if(aux % 2 == 0){
                aux = aux/2;
            } else {
                aux = aux*3+1;
            }
            System.out.print(aux + " ");
        }
    }
}
