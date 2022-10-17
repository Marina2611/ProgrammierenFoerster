package uebungsblatt1;

import edu.princeton.cs.introcs.StdIn;

public class Mittelwert {
    public static void main(String[] args) {
        var ersteZahl = StdIn.readInt();
        var zweiteZahl = StdIn.readInt();
        var average = ersteZahl / (double) zweiteZahl;
        System.out.printf("Das ist der Mittelwert der Zahlen %s und %s: %s%n", ersteZahl,zweiteZahl, average);
    }
}
