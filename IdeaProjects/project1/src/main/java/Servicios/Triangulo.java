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
    }

    @Override
    public String Nombre() {
        return "Triangulo";
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        lado3=Math.sqrt(lado1^2+lado2^2);
        return lado3;
    }

    @Override
    public void dibujarTxt() {

    }
}
