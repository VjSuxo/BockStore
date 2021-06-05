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
public class Ticket {

    private int Cantidaddelibros;
    private int Codigo;
    private int FechaEntrega;
    private int FechaDevolucion;
    private int TiempoExpiracion;
    private Usuario usr;
    private Libro lbr;

    public Ticket(int Cantidaddelibros, int Codigo, int FechaEntrega, int FechaDevolucion, int TiempoExpiracion, Usuario usr, Libro lbr) {
        this.Cantidaddelibros = Cantidaddelibros;
        this.Codigo = Codigo;
        this.FechaEntrega = FechaEntrega;
        this.FechaDevolucion = FechaDevolucion;
        this.TiempoExpiracion = TiempoExpiracion;
        this.usr = usr;
        this.lbr = lbr;
    }

    public int getCantidaddelibros() {
        return Cantidaddelibros;
    }

    public void setCantidaddelibros(int Cantidaddelibros) {
        this.Cantidaddelibros = Cantidaddelibros;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(int FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public int getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(int FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public int getTiempoExpiracion() {
        return TiempoExpiracion;
    }

    public void setTiempoExpiracion(int TiempoExpiracion) {
        this.TiempoExpiracion = TiempoExpiracion;
    }

    public Usuario getUsr() {
        return usr;
    }

    public void setUsr(Usuario usr) {
        this.usr = usr;
    }

    public Libro getLbr() {
        return lbr;
    }

    public void setLbr(Libro lbr) {
        this.lbr = lbr;
    }
    
    
    
}
