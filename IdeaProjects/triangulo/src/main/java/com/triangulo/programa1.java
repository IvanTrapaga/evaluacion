package com.triangulo;

public class programa1 {

    private int numero;
    
    public int programa(int numero){

        this.numero=numero;
        int cont=0;
        int suma=0;

        for (int i = 0; i <=numero; i++) {
            cont=cont+i;
        }
        for (int i = 0; i <numero ; i++) {
            suma=suma+(cont-i);
        }
        return suma;

    }
}
