/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_22;

import java.util.LinkedList;

/**
 *
 * @author Emili
 */
public class Buzon {
    LinkedList<Correo> cola = new LinkedList<>();

    public int numeroDeCorreos() {
        return cola.size();
    }

    public void agregar(Correo correo) {
        cola.add(correo);
    }

    public void agregar(Correo... correos) {
        for (int i = 0; i < correos.length; i++) {
            cola.add(correos[i]);
        }
    }

    public boolean noLeidos() {
        boolean noLeidos = false;
        for (int i = 0; i < cola.size(); i++) {
            if (!cola.get(i).isLeido()) {
                noLeidos = true;
            }
        }
        return noLeidos;
    }

    public String muestraPrimerNoLeido() {
        for (int i = 0; i < cola.size(); i++) {
            if (!cola.get(i).isLeido()) {
                return cola.get(i).getContenido();
            }
        }
        return "No hay correos sin leer";
    }

    public String muestra(int k) {
        return cola.get(k).getContenido();
    }

    public String muestra() {
        String buzon = "";
        for (int i = 0; i < cola.size(); i++) {
            buzon += muestra(i) + "\n";
        }
        return buzon;
    }

    public void elimina(int k) {
        cola.remove(k);
    }

}
