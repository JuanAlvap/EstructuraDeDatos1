package ListaDoble;

import ListaCircularSimple.ListaCircularSimple;

public class Main {

    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.registrarAuto("ABC-123", 2024, "Blanco", "Mercedes", 150);
        listaDoble.registrarAuto("ABC-124", 2025, "Gris", "Audi", 180);
        listaDoble.registrarAuto("ABC-125", 2001, "Rojo", "Jaguar", 300);
        listaDoble.mostrarLista();
        listaDoble.mostrarListaFinal();
        
        ListaCircularSimple listaCircular = new ListaCircularSimple();
        listaCircular.registrarAuto("ABC-123", 2024, "Blanco", "Mercedes", 150);
        listaCircular.registrarAuto("ABC-124", 2025, "Gris", "Audi", 180);
        listaCircular.registrarAuto("ABC-125", 2001, "Rojo", "Jaguar", 300);
        listaCircular.mostrarLista();
        
    }
}
