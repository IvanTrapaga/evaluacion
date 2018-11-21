package com.primos;

public class programa2 {

    private int numero;

    public void programa(int numero){
        this.numero=numero;

        for (int i = 1; i <= numero; i++) {
            int valor=primo(i);
            if(valor==2){
                System.out.println("Primo: "+i);
            }
        }
    }

    public int primo(int numeroPrimo) {

        int cont=0;
        for (int i = 1; i <= numeroPrimo; i++) {
            if(numeroPrimo%i==0){
                cont=cont+1;
            }
        }
        return cont;
    }
}
