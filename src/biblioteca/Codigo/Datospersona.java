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
public class Datospersona {

    private String Ci;
    private String Nombre;
    private int AñoNac;
    private int Reguniv;

    
    
    public Datospersona(String Ci, String Nombre, int AñoNac, int Reguniv) {
        this.Ci = Ci;
        this.Nombre = Nombre;
        this.AñoNac = AñoNac;
        this.Reguniv = Reguniv;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAñoNac() {
        return AñoNac;
    }

    public void setAñoNac(int AñoNac) {
        this.AñoNac = AñoNac;
    }

    public int getReguniv() {
        return Reguniv;
    }

    public void setReguniv(int Reguniv) {
        this.Reguniv = Reguniv;
    }
    
    
    
}
