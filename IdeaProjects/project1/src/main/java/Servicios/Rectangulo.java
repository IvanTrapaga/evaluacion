package Servicios;


public class Rectangulo implements Figuras {

    private int base;
    private int altura;

    public Rectangulo(int base,int altura) {
        this.altura=altura;
        this.base=base;
    }

    @Override
    public String Nombre() {
        return "Rectangulo";
    }

    @Override
    public double calcularArea() {
        return (base*altura);
    }

    @Override
    public double calcularPerimetro() {
        return ((base*2)+(altura*2));
    }

    @Override
    public void dibujarTxt() {
        System.out.println(base+"X"+altura);
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
