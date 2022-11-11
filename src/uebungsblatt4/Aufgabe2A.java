package uebungsblatt4;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Aufgabe2A {
    public static void main(String[] args) {
        int zahl = 2;
        int n = StdIn.readInt();
        for (int i = 1; i <= n; i++) {
            double answer = Math.pow(zahl, i);
            StdOut.println(answer);
        }
    }
}
