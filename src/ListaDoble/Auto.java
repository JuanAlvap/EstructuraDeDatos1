package ListaDoble;

public class Auto {
    private String placa;
    private int modelo;
    private String color;
    private String marca;
    private double precio;

    public Auto() {
    }

    public Auto(String placa, int modelo, String color, String marca, double precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", modelo=" + modelo + ", color=" + color + ", marca=" + marca + ", precio=" + precio + '}';
    }
    
    
}
