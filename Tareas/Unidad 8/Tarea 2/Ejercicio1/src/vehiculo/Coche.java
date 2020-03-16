package vehiculo;

public class Coche {

    private int velocidad;
    private int marcha;

    public Coche() {
        velocidad = 0;
        marcha = 0;
    }

    public Coche(int velocidad, int marcha) {
        this.velocidad = velocidad;
        this.marcha = marcha;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void acelera(int velocidad){
        this.velocidad = this.velocidad + velocidad;
    }

    public void frena(int velocidad){
        this.velocidad = this.velocidad - velocidad;
    }

    public void subeMarcha(){
        if(this.marcha < 6) this.marcha++;
    }

    public void reduceMarcha(){
        if(this.marcha > 0) this.marcha--;
    }

}
