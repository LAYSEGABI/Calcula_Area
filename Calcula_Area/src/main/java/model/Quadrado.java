package model;

public class Quadrado {

    private double lado;

    public Quadrado() {
        this(0);
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
   
    public double getArea() {
        return (getLado() * getLado());
    }
}
