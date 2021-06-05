/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Codigo;

/**
 *
 * @author Tostadora
 */
public class Edicion {
    
    private String Editorial;
    private int Año;

    public Edicion(String Editorial, int Año) {
        this.Editorial = Editorial;
        this.Año = Año;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }
    
    
    
}
