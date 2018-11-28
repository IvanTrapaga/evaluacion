package Servicios;

public class Triangulo implements Figuras {

    private int lado1;
    private int lado2;
    private double lado3;
    private int angulo;

    public Triangulo(int lado1, int lado2, int angulo) {
        this.lado1=lado1;
        this.lado2=lado2;
        this.angulo=angulo;
        lado3=Math.sqrt((lado1^2+lado2^2)*(lado1*lado2*Math.cos(angulo)));
    }

    @Override
    public String Nombre() {
        return "Triangulo";
    }

    @Override
    public double calcularArea() {
        return (lado1*lado2*Math.sin(angulo))/2;
    }

    @Override
    public double calcularPerimetro() {
        return (lado1+lado2+lado3);
    }

    @Override
    public void dibujarTxt() {

    }
}
