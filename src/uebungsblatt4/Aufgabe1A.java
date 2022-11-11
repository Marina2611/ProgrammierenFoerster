package uebungsblatt4;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Aufgabe1A {
    public static void main(String[] args) {
        int maxZeile = StdIn.readInt();
        for (int aktuelleZeile = 1; aktuelleZeile <= maxZeile; aktuelleZeile++) {
            StarPrinter.printStars(aktuelleZeile);
            if (aktuelleZeile != maxZeile) StdOut.println();
        }

    }


}
