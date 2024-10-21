package ListaDoble;

public class NodoDoble {
    private Auto auto;
    private NodoDoble sig;
    private NodoDoble ant;

    public NodoDoble(Auto auto) {
        this.auto = auto;
        this.sig = null;
        this.ant = null;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }
    
    
}
