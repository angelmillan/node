package es.vcarmen.socialtech;

import java.io.Serializable;

/**
 * Created by angelmillanmiralles on 24/10/17.
 */

public class Contacto implements Serializable {
    static int contadorDeInstancias = 0;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String formacion;

    public Contacto(String nombre, String apellidos, String telefono, String email, String formacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.formacion = formacion;
        contadorDeInstancias++;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    @Override
    public String toString() {
        return  nombre + ' ' +
                apellidos + ' ' +
                telefono + ' ' +
                email + ' ' +
                formacion + '\n'
                ;
    }
}
