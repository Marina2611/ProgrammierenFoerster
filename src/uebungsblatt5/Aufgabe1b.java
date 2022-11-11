package uebungsblatt5;

import edu.princeton.cs.introcs.StdIn;

import java.util.Arrays;

public class Aufgabe1b {
    public static void main(String[] args) {
        int anzahl = StdIn.readInt();
        int[] array = new int[anzahl];
        initializeArray(array);
        Arrays.stream(array).forEach(System.out::println);
        int anzahlUebergewichtig = 0;
        int anzahlUntergewichtig = 0;

        for (int index = 0; index < anzahl; index++) {
            if (array[index] < 80) anzahlUntergewichtig++;
            else if (array[index] > 120) anzahlUebergewichtig++;
        }
        System.out.println("Anzah Untergewichtig: " + anzahlUntergewichtig);
        System.out.println("Anzah Uebergewichtig: " + anzahlUebergewichtig);
        System.out.println("Anzah Untergewichtig in %: " + calculatePercentage(anzahl, anzahlUntergewichtig));
        System.out.println("Anzah Uebergewichtig in %: " + calculatePercentage(anzahl, anzahlUebergewichtig));

    }

    private static double calculatePercentage(int gesamtAnzahl, int anzahl) {
        return ((double) anzahl / gesamtAnzahl) * 100;
    }

    private static void initializeArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * 160);
        }
    }
}
