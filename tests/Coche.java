public class Coche {
    public int velocidad;

    public void acelerar_AlejandroBotella(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_AlejandroBotella(int deceleracion){
        velocidad -= deceleracion;
        if(velocidad<0) velocidad=0;
    }
}
