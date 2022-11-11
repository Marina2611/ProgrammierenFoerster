package uebungsblatt5;

import edu.princeton.cs.introcs.StdIn;

import java.util.Arrays;

public class Aufgabe2 {
    public static void main(String[] args) {
        int anzahl = StdIn.readInt();
        double[] array = new double[anzahl];
        initializeArray(array);
        Arrays.stream(array).forEach(System.out::println);
        System.out.println(Arrays.stream(array).average().orElse(0));
        System.out.println(Arrays.stream(array).max().orElse(0));
        System.out.println(Arrays.stream(array).min().orElse(0));
    }

    private static void initializeArray(double[] array) {
        for (int index = 0; index < array.length; index++) {
            array[index] = (Math.random() * 160);
        }
    }
}
