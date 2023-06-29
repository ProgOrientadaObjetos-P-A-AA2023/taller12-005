package p3;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Matricula> lista = new ArrayList<>();

        MatriculaCampamento mcamp
                = new MatriculaCampamento(25, 155, 50.13);
        mcamp.establecerTarifa();
        lista.add(mcamp);

        MatriculaColegio mcolegio
                = new MatriculaColegio(21.33, 10,
                        6.89, 288.2);
        mcolegio.establecerTarifa();
        lista.add(mcolegio);

        MatriculaEscuela mescuela
                = new MatriculaEscuela(45.33, 7.89, 123);
        mescuela.establecerTarifa();
        lista.add(mescuela);

        MatriculaJardin mjardin = new MatriculaJardin(55,
                96.1, 41.03);
        mjardin.establecerTarifa();
        lista.add(mjardin);

        MatriculaMaternal mmaternal = new MatriculaMaternal(45.12,
                77.77, 77.2);
        mmaternal.establecerTarifa();
        lista.add(mmaternal);

        MatriculaMaternal mmaternal2
                = new MatriculaMaternal(10.23, 456, 12.03);
        mmaternal2.establecerTarifa();
        lista.add(mmaternal2);
        

        TipoMatricula tipos = new TipoMatricula(lista);
        tipos.establecerPromedioMatriculas();

        System.out.printf("%s\n", tipos);
    }
}
