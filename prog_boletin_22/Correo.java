/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_22;

/**
 *
 * @author Emili
 */
public class Correo {

    private String contenido;
    private boolean leido;

    public Correo() {
    }

    public Correo(String contenido) {
        this.contenido = contenido;
        this.leido = false;
    }

    public Correo(String contenido, boolean leido) {
        this.contenido = contenido;
        this.leido = leido;
    }

    public String getContenido() {
        leido = true;
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
}
