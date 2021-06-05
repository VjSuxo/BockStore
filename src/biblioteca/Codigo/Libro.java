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
public class Libro {
    
    private String Nombre;
    private String auto;
    private String Codigo;
    private String Seccion;

    public Libro(String Nombre, String auto, String Codigo, String Seccion) {
        this.Nombre = Nombre;
        this.auto = auto;
        this.Codigo = Codigo;
        this.Seccion = Seccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }
    
    
    
    
}
