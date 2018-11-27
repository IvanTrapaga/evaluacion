package com.kaisen;

import Servicios.Cuadrado;
import Servicios.Figuras;
import Servicios.Rectangulo;
import Servicios.TrianguloRectangulo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class PruebaFiguras
{
    static Figuras obj;
    static Scanner scanner=new Scanner(System.in);
    static int lado1;
    static int lado2;

    public static void main( String[] args )
    {
        boolean SI = true;

        while(SI) {
            System.out.println("1.\tCrear rectángulo\n" +
                    "2.\tCrear cuadrado\n" +
                    "3.\tCrear triángulo");
            if(obj!=null){
                System.out.println("4.\tver figura");
            }
            System.out.println("5.\tsalir\n");

            try {
                int decision = scanner.nextInt();
                System.out.println();


                switch (decision) {
                    case 1:
                        llenadoDatos(1);
                        obj = new Rectangulo(lado1, lado2);
                        break;
                    case 2:
                        llenadoDatos(2);
                        obj = new Cuadrado(lado1);
                        break;
                    case 3:
                        llenadoDatos(2);
                        obj = new TrianguloRectangulo(lado1);
                        break;
                    case 4:
                        obj.calcularArea();
                        obj.calcularPerimetro();
                        obj.dibujarTxt();
                        break;
                    case 5:
                        SI = false;
                        System.out.println("BYE");
                        break;
                    default:
                        break;
                }


            } catch (Exception ex) {
                System.out.println("El valor no es congruente al esperado");
            }
        }
    }

    static void llenadoDatos(int seleccion){

        switch (seleccion){
            case 1:
                System.out.println("Dame la base");
                lado1=scanner.nextInt();
                System.out.println("Dame la altura");
                lado2=scanner.nextInt();
                break;
            case 2:
                System.out.println("Dame el lado");
                lado1=scanner.nextInt();
                break;
            default:break;
        }


    }
}
