package uebungsblatt6;

public class Aufgabe1d {
    public static void main(String[] args) {

        String zahl = "12";

        System.out.println(frageInt(zahl));
    }

    public static int frageInt(String zahl) {
        return Integer.parseInt(zahl);
    }
}

