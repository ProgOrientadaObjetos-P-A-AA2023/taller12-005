package p1;

public class MatriculaJardin extends Matricula {

    private double costoDesayunos;
    private double costolibros;
    private double costoPaseos;

    public MatriculaJardin(double cosDes, double cosLibs, double cosPas) {
        costoDesayunos = cosDes;
        costolibros = cosLibs;
        costoPaseos = cosPas;
    }

    public double obtenerCostoDesayunos() {
        return costoDesayunos;
    }

    public void establecerCostoDesayunos(double x) {
        costoDesayunos = x;
    }

    public double obtenerCostolibros() {
        return costolibros;
    }

    public void establecerCostolibros(double x) {
        costolibros = x;
    }

    public double obtenerCostoPaseos() {
        return costoPaseos;
    }

    public void establecerCostoPaseos(double x) {
        costoPaseos = x;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoDesayunos + costolibros + costoPaseos;
    }

    @Override
    public String toString() {
        String m = String.format("Matricula Jardin\n"
                + "\tCosto Desayunos: $%.2f\n"
                + "\tCosto Libros: $%.2f\n"
                + "\tCosto Paseo: $%.2f\n"
                + "\tTarifa: $%.2f\n\n",
                costoDesayunos,
                costolibros,
                costoPaseos,
                tarifa);

        return m;
    }
}
