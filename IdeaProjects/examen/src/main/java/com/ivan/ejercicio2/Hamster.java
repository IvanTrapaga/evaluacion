package com.ivan.ejercicio2;

public abstract class Hamster extends Roedores {
    @Override
    void correr() {
        System.out.println("Corre mucho");
    }

    @Override
    void chillar() {
        System.out.println("No chilla");
    }
}
