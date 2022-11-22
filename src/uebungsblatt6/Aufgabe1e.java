package uebungsblatt6;

import edu.princeton.cs.introcs.StdIn;

public class Aufgabe1e {
    public static void main(String[] args) {


        System.out.println(frageInt(0, 9));
    }

    public static int frageInt(int min, int max) {

        while (true) {
            try {
                String zahl = StdIn.readString();
                int zahl1 = Integer.parseInt(zahl);
                if (zahl1 > min && zahl1 < max) {
                    return zahl1;
                }
            } catch (NumberFormatException ignored) {
            }
        }
    }
}
