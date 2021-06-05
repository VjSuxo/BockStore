/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Codigo;

import biblioteca.Codigo.Estructuras.MultipleCola;

/**
 *
 * @author Tostadora
 */
public class Estante {
    MultipleCola mulCol;

    public Estante(MultipleCola mulCol) {
        this.mulCol = mulCol;
    }

    public MultipleCola getMulCol() {
        return mulCol;
    }

    public void setMulCol(MultipleCola mulCol) {
        this.mulCol = mulCol;
    }
    
}
