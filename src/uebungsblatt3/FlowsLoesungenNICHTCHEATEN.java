package uebungsblatt3;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class FlowsLoesungenNICHTCHEATEN {
    public static void main(String[] args) {
        StdOut.print("Please insert unit F or C:");
        char newUnit = Character.toUpperCase(StdIn.readChar());
        StdOut.print("Please insert value:");
        double value = StdIn.readDouble();
        char unit;
        double newValue;
        switch (newUnit) {
            case 'C' -> {
                unit = 'F';
                newValue = (value - 32) * 5 / 9;
            }
            case 'F' -> {
                unit = 'C';
                newValue = (value * 9 / 5) + 32;
            }
            default -> throw new IllegalArgumentException(String.format("Given unit %s is not supported", newUnit));
        }
        StdOut.println(String.format("Translated %s %s to %s %s", value, unit, newValue, newUnit));
    }
}
