package ch.tbz;

import static ch.tbz.lib.Input.inputDouble;
import static ch.tbz.lib.Input.inputString;

public class Test {

    // Die Funktion main in einer Klasse wird automatisch gestartet
     public static void main( String[] args ) {
         
        String a = inputString("Geben Sie ihren Vornamen ein: ");
        String b = inputString("Geben Sie ihren Nachnamen ein: ");


        System.out.println(a+" "+b);
     
     }
 }
 