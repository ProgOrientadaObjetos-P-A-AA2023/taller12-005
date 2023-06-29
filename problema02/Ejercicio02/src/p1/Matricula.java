package p1;

public abstract class Matricula {
    protected double tarifa;

    public double obtenerTarifa() {
        return tarifa;
    }

    public abstract void establecerTarifa(); 
}
