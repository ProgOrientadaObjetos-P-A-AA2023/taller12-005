package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;


public class VentasTvs {

    double precioTotal;
    double precioMasAlto;
    ArrayList<Televisor> televisores;
    String marcasVendidas;

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public void establecerPrecioTotal() {
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();

        }
        precioTotal = s;

    }

    public void establecerPrecioMasAlto() {
        double s = 0;
        // pass
        for (Televisor t : televisores) {
            if (t.obtenerPrecio() > s) {
                s = t.obtenerPrecio();
            }
        }
        
        precioMasAlto = s;
    }

    public void establecerMarcasVendidas() {
        String s = "";
        for (int i = 0; i < televisores.size(); i++) {
            s = String.format("%s%s\n", 
                    s,
                    televisores.get(i).obtenerMarca());
        }
        
        marcasVendidas = s;
    }

    public double obtenerPrecioTotal() {
        return precioTotal;
    }

    public String obtenerMarcasVendidas() {
        return marcasVendidas;
    }

    public double obtenerPrecioMasAlto() {
        return precioMasAlto;
    }
    
}
