package com.ivan;

import com.primos.programa2;
import com.triangulo.programa1;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        programa1 clase=new programa1();
        int valor=clase.programa(4);
        System.out.println(valor);

        programa2 clase2=new programa2();
        clase2.programa(9);
    }
}
