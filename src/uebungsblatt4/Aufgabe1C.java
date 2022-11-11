package uebungsblatt4;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Aufgabe1C {
    public static void main(String[] args) {
        int maxZeile = StdIn.readInt();
        int space = maxZeile-1;
        int star = 1;


        for (int aktuelleZeile = 1; aktuelleZeile <= maxZeile; aktuelleZeile++) {
            StarPrinter.printSpace(space);
            StarPrinter.printStars(star);
            StdOut.println();
            space--;
            star+=2;
        }



    }
}
