package p1;

public class MatriculaColegio extends Matricula {

    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;
    private double costoLaboratorios;

    public MatriculaColegio(double cosDep,
            double cosFol, double cosUni,
            double cosLab) {
        costoDeportes = cosDep;
        costoFolletos = cosFol;
        costoUniformes = cosUni;
        costoLaboratorios = cosLab;
    }

    public double obtenerCostoDeportes() {
        return costoDeportes;
    }

    public void establecerCostoDeportes(double n) {
        costoDeportes = n;
    }

    public double obtenerCostoFolletos() {
        return costoFolletos;
    }

    public void establecerCostoFolletos(double n) {
        costoFolletos = n;
    }

    public double obtenerCostoUniformes() {
        return costoUniformes;
    }

    public void establecerCostoUniformes(double n) {
        costoUniformes = n;
    }

    public double obtenerCostoLaboratorios() {
        return costoLaboratorios;
    }

    public void establecerCostoLaboratorios(double n) {
        costoLaboratorios = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoDeportes + costoFolletos
                + costoLaboratorios + costoUniformes;
    }

    @Override
    public String toString() {
        String m = String.format("Matricula Colegio\n"
                + "\tCosto Deportes: $%.2f\n"
                + "\tCosto Folletos: $%.2f\n"
                + "\tCosto Uniformes: $%.2f\n"
                + "\tCosto Laboratorios: $%.2f\n"
                + "\tTarifa: $%.2f\n\n",
                costoDeportes,
                costoFolletos,
                costoUniformes,
                costoLaboratorios,
                tarifa);

        return m;
    }
}
