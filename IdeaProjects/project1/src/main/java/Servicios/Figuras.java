package Servicios;

abstract public interface Figuras {

    /* Devuelve el nombre de la figura*/
    public String Nombre();

    /*Calcula la superficie de la figura*/
    public double calcularArea();

    /*Calcula el perímetro de la figura*/
    public double calcularPerimetro();

    /*Dibujar la figura en la pantalla, en modo texto*/
    abstract public void dibujarTxt();


}
