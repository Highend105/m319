package ch.tbz.lib;
import java.util.Scanner;

import javax.lang.model.type.NullType;

import static ch.tbz.lib.Input.inputString;
public class ZahlenScannerA {
 
 
public static void main(String[] args) {
 
    Scanner scan = new Scanner (System.in);
 
    int input;
 
    System.out.println("Geben Sie eine Zahl zwischen 2 und 6 ein:");
 
    input = scan.nextInt();
 
    if((input >=2) && (input <=6)) {
        int zaehler = 0;
        for (int i = -5; i < 5; i++){
            zaehler = zaehler + i + input;
            System.out.println(zaehler);
 
 
        }
 
    } else {
        System.err.println("Achtung, falsche Eingabe!");
    }
    System.out.println("und fertig!");
 
    scan.close();
 
    }
 
}