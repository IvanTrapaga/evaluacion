package com.ivan.ejercicio2;

public class Raton extends Roedores {
    @Override
    void correr() {
        System.out.println("No corre");
    }

    @Override
    void chillar() {
        System.out.println("Chilla quedito");
    }
}
