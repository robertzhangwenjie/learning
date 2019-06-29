package com.robert;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        function();
    }

    public static void function(){
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}
