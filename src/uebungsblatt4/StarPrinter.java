package uebungsblatt4;

import edu.princeton.cs.introcs.StdOut;

public class StarPrinter {
    static void printStars(int anzahl) {
        printChar(anzahl, '*');
    }

    static void printSpace(int anzahl) {
        printChar(anzahl, ' ');
    }

    private static void printChar(int anzahl, char character) {
        for (int aktuelleAnzahl = 1; aktuelleAnzahl <= anzahl; aktuelleAnzahl++) {
            StdOut.print(character);
        }
    }
}