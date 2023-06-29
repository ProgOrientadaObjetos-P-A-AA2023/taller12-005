package p1;

public class MatriculaCampamento extends Matricula {

    private double costoTransporte;
    private double costoComida;
    private double costoInstructores;

    public MatriculaCampamento(double ct, double cc, double ci) {
        costoTransporte = ct;
        costoComida = cc;
        costoInstructores = ci;
    }

    public void establecerCostoTransporte(double ct) {
        costoTransporte = ct;
    }

    public void establecerCostoComida(double cc) {
        costoComida = cc;
    }

    public void establecerCostoInstructores(double ci) {
        costoInstructores = ci;
    }

    public double obtenerCostoTransporte() {
        return costoTransporte;
    }

    public double obtenerCostoComida() {
        return costoComida;
    }

    public double obtenerCostoInstructores() {
        return costoInstructores;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoTransporte + costoComida + costoInstructores;
    }

    @Override
    public String toString() {
        String m = String.format("Matricula Campamento\n"
                + "\tCosto Transporte: $%.2f\n"
                + "\tCosto Comida: $%.2f\n"
                + "\tCosto Instructores: $%.2f\n"
                + "\tTarifa: $%.2f\n\n",
                costoTransporte,
                costoComida,
                costoInstructores,
                tarifa);

        return m;
    }
}
