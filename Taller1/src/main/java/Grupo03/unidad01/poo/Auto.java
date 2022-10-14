package Grupo03.unidad01.poo;

public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private int cilindraje;
    private double costo;


    private int calcularEdad(int añoActual){
        return this.año-añoActual;
    }

    public double calcularMatricula(){
        return 0;
    }

    public boolean esTaxi(){
        return false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
