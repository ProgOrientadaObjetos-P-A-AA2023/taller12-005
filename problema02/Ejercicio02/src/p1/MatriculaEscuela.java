package p1;

public class MatriculaEscuela extends Matricula {

    private double costoLibro;
    private double costoDeportes;
    private double costoFolletos;

    public MatriculaEscuela(double cl, double cd, double cf) {
        costoLibro = cl;
        costoDeportes = cd;
        costoFolletos = cf;
    }

    public void establecerCostoLibro(double cl) {
        costoLibro = cl;
    }

    public void establecerCostoDeportes(double cd) {
        costoDeportes = cd;
    }

    public void establecerCostoFolletos(double cf) {
        costoFolletos = cf;
    }

    public double obtenerCostoLibro() {
        return costoLibro;
    }

    public double obtenerCostoDeportes() {
        return costoDeportes;
    }

    public double obtenerCostoFolletos() {
        return costoFolletos;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoLibro + costoDeportes + costoFolletos;
    }
    
        @Override
    public String toString() {
        String m = String.format("Matricula Escuela\n"
                + "\tCosto Libro: $%.2f\n"
                + "\tCosto Deportes: $%.2f\n"
                + "\tCosto Folleto: $%.2f\n"
                + "\tTarifa: $%.2f\n\n", 
                costoLibro,
                costoDeportes,
                costoFolletos,
                tarifa);
        
        return m;
    }
}
