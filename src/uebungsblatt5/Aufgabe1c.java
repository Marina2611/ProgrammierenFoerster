package uebungsblatt5;

import edu.princeton.cs.introcs.StdIn;

import java.util.Arrays;

public class Aufgabe1c {
    public static void main(String[] args) {
        int anzahl = StdIn.readInt();
        int[] array = new int[anzahl];
        initializeArray(array);
        Arrays.stream(array).forEach(System.out::println);

        for (int index = 0; index < anzahl; index++) {
            if (array[index] < 80) System.out.printf("Person an Index %s ist untergewichtig%n", index);
            else if (array[index] > 120) System.out.printf("Person an Index %s ist uebergewichtig%n", index);
        }
    }

    private static void initializeArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * 160);
        }
    }
}
