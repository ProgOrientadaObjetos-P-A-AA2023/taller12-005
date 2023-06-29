package p2;

import java.util.ArrayList;
import p1.Matricula;

public class TipoMatricula {
    private double promedioMatriculas;
    private ArrayList<Matricula> listaMatriculas;

    public TipoMatricula(ArrayList<Matricula> ls) {
        listaMatriculas = ls;
    }

    public ArrayList<Matricula> obtenerListaMatriculas() {
        return listaMatriculas;
    }

    public void establecerListaMatriculas(ArrayList<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }
    
    public void establecerPromedioMatriculas(){
        double suma = 0;
        for (Matricula ls : listaMatriculas) {
            suma += ls.obtenerTarifa();
        }     
        
        promedioMatriculas = suma/listaMatriculas.size();
    }
    
    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String m = "\t******Listado de Matriculas******\n";
        for (Matricula ls : listaMatriculas) {
            m = String.format("%s%s\n",
                    m,
                    ls);
        }
        
        m = String.format("%s\nPromedio Matriculas: $%.2f\n",
                m,
                promedioMatriculas);
        
        return m;
    }
  
}
