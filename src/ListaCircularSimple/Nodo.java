/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircularSimple;

import ListaDoble.*;

/**
 *
 * @author alvarezjp
 */
public class Nodo {

    private Auto auto;
    private Nodo sig;

    public Nodo(Auto auto) {
        this.auto = auto;
        this.sig = null;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
