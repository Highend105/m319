package ch.tbz.lib;

import java.util.Scanner;

public class SORTIEREN {
    static int iZ1, iZ2, iZ3;

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        do {
            System.out.print("1. Zahl? ");
            iZ1 = inputScanner.nextInt();
            System.out.print("2. Zahl? ");
            iZ2 = inputScanner.nextInt();
            System.out.print("3. Zahl? ");
            iZ3 = inputScanner.nextInt();

            if (iZ1 > iZ2) {
                tausche1();
            }

            if (iZ2 > iZ3) {
                tausche2();
            }

            if (iZ1 > iZ2) {
                tausche1();
            }

            System.out.println("OUTPUT: " + iZ1 + " ist kleiner als " + iZ2 + " ist kleiner als " + iZ3 + "!");
        } 
        // Task 1: Solange wiederholen, bis alle eingegebenen Zahlen 0 sind.
        while (iZ1 != 0 || iZ2 != 0 || iZ3 != 0);
        
        /* Task 2: Solange wiederholen, bis alle eingegebenen Zahlen gleich sind.
        while (iZ1 != iZ2 || iZ2 != iZ3);
        */

        /* Task 3: Solange wiederholen, bis iZ1 = iZ2 ODER iZ1 = iZ3 ist.
        while (!(iZ1 == iZ2 || iZ1 == iZ3));
        */
        

        inputScanner.close();
    }

    public static void tausche1() {
        int iTemp = iZ1;
        iZ1 = iZ2;
        iZ2 = iTemp;
    }

    public static void tausche2() {
        int iTemp = iZ3;
        iZ3 = iZ2;
        iZ2 = iTemp;
    }
}
