package Servicios;

public class TrianguloRectangulo extends Triangulo{

    private int lado1;

    public TrianguloRectangulo(int lado1) {

        super(lado1, lado1, 90);
        this.lado1=lado1;
    }

    @Override
    public String Nombre() {
        return super.Nombre();
    }

    @Override
    public double calcularArea() {
        return super.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return super.calcularPerimetro();
    }

    @Override
    public void dibujarTxt() {
        System.out.println(lado1+"X");
        for (int i = 0; i <= lado1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
