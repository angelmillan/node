package es.vcarmen.socialtech;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by angelmillanmiralles on 24/10/17.
 */

public class Contactos implements Serializable {
    private List<Contacto> contactos = null;

    public Contactos() {
        this.contactos = new ArrayList<Contacto>();
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void addContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }

    @Override
    public String toString() {
        return contactos + "" ;
    }
}



