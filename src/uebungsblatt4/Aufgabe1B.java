package uebungsblatt4;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Aufgabe1B {
    public static void main(String[] args) {
        int maxZeile = StdIn.readInt();
        StarPrinter.printStars(maxZeile);
        StdOut.println();

        for (int aktuelleZeile = 2; aktuelleZeile < maxZeile; aktuelleZeile++) {
            StarPrinter.printStars(1);
            StarPrinter.printSpace(maxZeile - 2);
            StarPrinter.printStars(1);
            StdOut.println();
        }

        StarPrinter.printStars(maxZeile);
    }
}
