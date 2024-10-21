/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDoble;

/**
 *
 * @author alvarezjp
 */
public class ListaDoble {
    private NodoDoble PTR;
    private NodoDoble FINAL;

    public ListaDoble() {
        this.PTR = null;
        this.FINAL = null;
    }
    
    public boolean registrarAuto(String placa, int modelo, String color, String marca, double precio){
        try{
        Auto auto = new Auto(placa, modelo, color, marca, precio);
        NodoDoble nodo = new NodoDoble(auto);
        if(PTR == null){
            PTR = nodo;
            FINAL = nodo;
        }else {
            FINAL.setSig(nodo);
            nodo.setAnt(FINAL);
            FINAL = nodo;
        }
        return true;
        }catch(Exception e){
            return false;
        }
    }
    
    private void mostrarLista(NodoDoble nodo){
        if(nodo == FINAL){
            System.out.println(nodo.getAuto().toString());
        }else{
            System.out.println(nodo.getAuto().toString());
            mostrarLista(nodo.getSig());
        }
    }
    
    public void mostrarLista(){
        NodoDoble x = PTR;
        if(x != null){
            mostrarLista(x);
        }else{
            System.out.println("Lista vacía.");
        }
    }
 
}
