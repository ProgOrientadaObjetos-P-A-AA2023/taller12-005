package p1;

public class MatriculaMaternal extends Matricula{
    
    private double costoDesayunos;
    private double costoAlmuerzo;
    private double costoMedico;

    public MatriculaMaternal(double cosDes, double cosAl, double cosMed) {
        costoDesayunos = cosDes;
        costoAlmuerzo = cosAl;
        costoMedico = cosMed;
    }

    public double getCostoDesayunos() {
        return costoDesayunos;
    }

    public void setCostoDesayunos(double n) {
        this.costoDesayunos = n;
    }

    public double getCostoAlmuerzo() {
        return costoAlmuerzo;
    }

    public void setCostoAlmuerzo(double n) {
        costoAlmuerzo = n;
    }

    public double getCostoMedico() {
        return costoMedico;
    }

    public void setCostoMedico(double n) {
        costoMedico = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoDesayunos + costoAlmuerzo + costoMedico;
    }

    @Override
    public String toString() {
        String m = String.format("Matricula Maternal\n"
                + "\tCosto Desayunos: $%.2f\n"
                + "\tCosto Almuerzo: $%.2f\n"
                + "\tCosto Medico: $%.2f\n"
                + "\tTarifa: $%.2f\n\n", 
                costoDesayunos,
                costoAlmuerzo,
                costoMedico,
                tarifa);
        
        return m;
    }
}