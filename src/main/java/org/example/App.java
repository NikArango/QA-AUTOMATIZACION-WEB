package org.example;

import org.example.models.Nissan;
import org.example.models.Toyota;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //Nissan nis = new Nissan("PAL202");
        //System.out.println("VElocidad Maxima Nis: " + nis.getVelocidadMaxima());


        Toyota tot = new Toyota("PAL202");
        System.out.println("VElocidad Maxima Toy: " + tot.getVelocidadMaxima());

        System.out.println("agregamos m  en la web despues de comitear a mi local ");

    }
}
