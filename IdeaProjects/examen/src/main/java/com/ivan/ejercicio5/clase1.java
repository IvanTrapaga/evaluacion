package com.ivan.ejercicio5;

public abstract class clase1 {

    public void perimetro(int a, int b){
        System.out.println("Perimetro de rectangulo"+((a*2)+(b*2)));
    }
    public void perimetro(int a, int b, int c){
        System.out.println("Perimetro de triangulo"+(a+b+c));
    }
    abstract void perimetro(int a);
}
