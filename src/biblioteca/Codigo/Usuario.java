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
public class Usuario extends Datospersona{
    
    private String user;
    private String pas;

    public Usuario(String user, String pas, String Ci, String Nombre, int AñoNac, int Reguniv) {
        super(Ci, Nombre, AñoNac, Reguniv);
        this.user = user;
        this.pas = pas;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }
    
    
    
}
