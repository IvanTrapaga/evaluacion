package com.ivan;

import com.ivan.ejercicio1.Circulo;
import com.ivan.ejercicio1.Cuadrado;
import com.ivan.ejercicio1.Figura;
import com.ivan.ejercicio1.Triangulo;
import com.ivan.ejercicio2.Hamster;
import com.ivan.ejercicio2.HamsterAzul;
import com.ivan.ejercicio2.Raton;
import com.ivan.ejercicio2.Roedores;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {

        ArrayList<Figura> lista=new ArrayList<Figura>();
        lista.add(new Circulo());
        lista.add(new Circulo());
        lista.add(new Cuadrado());
        lista.add(new Triangulo());

        for (Figura x:lista) {
            System.out.println(x);
        }
        ArrayList<Roedores> lista2=new ArrayList<Roedores>();
        lista2.add(new HamsterAzul());
        lista2.add(new Raton());
        lista2.add(new Raton());

        for (Roedores x:lista2) {
            System.out.println(x);
        }
    }
}
