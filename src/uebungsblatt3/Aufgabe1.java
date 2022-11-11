package uebungsblatt3;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.util.Objects;

public class Aufgabe1 {
    public static void main(String[] args) {
        char einheit = StdIn.readChar();
        double x = StdIn.readDouble();
        StdOut.println("Bitte Einheit eingeben.");
        if (Objects.equals(einheit, "C")) {
            double y = (x - 32) * 5 / 9;
            StdOut.println("C" + y);
        }
    }
}
