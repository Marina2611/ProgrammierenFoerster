package uebungsblatt6;

import java.util.Arrays;

public class Aufgabe2d {
    public static void main(String[] args) {
        int[] arr = new int[] {0,4,5,9};
        int[] copy = copyArray(arr);


        copy = copyReverse(arr);
        wtiteArray(copy);
    }

    private static void wtiteArray(int[] copy) {
        Arrays.stream(copy).forEach(System.out::print);
    }

    private static int[] copyReverse(int[] arr) {
        int[] copy = new int[arr.length];
        int tmpCounter = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            copy[tmpCounter] = arr[i];
            tmpCounter++;
        }
        return copy;
    }

    private static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
}
