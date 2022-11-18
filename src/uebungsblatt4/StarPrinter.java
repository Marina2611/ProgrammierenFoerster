package uebungsblatt4;

import edu.princeton.cs.introcs.StdOut;

public class StarPrinter {
    public static void printStars(int anzahl) {
        printString(anzahl, "*");
    }

    public static void printSpace(int anzahl) {
        printString(anzahl, " ");
    }


    public static void printString(int anzahl, String character) {
        for (int aktuelleAnzahl = 1; aktuelleAnzahl <= anzahl; aktuelleAnzahl++) {
            StdOut.print(character);
        }
    }
}