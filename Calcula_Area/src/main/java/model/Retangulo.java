package model;

public class Retangulo {

    private double base;
    private double altura;

    public Retangulo() {
        this(0, 0);
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getArea() {
        return (getBase() * getAltura());
    }
}
