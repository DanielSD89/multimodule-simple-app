package com.belcebus.module_1;

import com.belcebus.module_2.Module2;
import com.belcebus.module_3.Module3;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "MODULO1" );
        Module2 m2 = new Module2();
        System.out.println( m2.getNombre() );
        Module3 m3 = new Module3();
        System.out.println( m3.getNombre() );
    }
}
