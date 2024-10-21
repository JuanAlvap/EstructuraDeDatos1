/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircularSimple;

import ListaDoble.Auto;

/**
 *
 * @author alvarezjp
 */
public class ListaCircularSimple {

    private Nodo PTR;
    private Nodo FINAL;

    public ListaCircularSimple() {
        this.FINAL = null;
        this.PTR = null;
    }

    public void registrarAuto(String placa, int modelo, String color, String marca, double precio) {
        try {
            Auto auto = new Auto(placa, modelo, color, marca, precio);
            Nodo nodo = new Nodo(auto);
            if (PTR == null) {
                PTR = nodo;
                FINAL = nodo;
                FINAL.setSig(PTR);
            } else {
                FINAL.setSig(nodo);
                nodo.setSig(PTR);
                FINAL = nodo;

            }
        } catch (Exception e) {
            System.out.println("Error. ");
        }
    }

    private void mostrarLista(Nodo nodo) {
        if (nodo == FINAL) {
            System.out.println(nodo.getAuto().toString());
            System.out.println(nodo.getSig().getAuto().toString());
        } else {
            System.out.println(nodo.getAuto().toString());
            mostrarLista(nodo.getSig());
        }
    }

    public void mostrarLista() {
        Nodo x = PTR;
        if (x != null) {
            mostrarLista(x);
        } else {
            System.out.println("Lista vacía.");
        }
    }

}
