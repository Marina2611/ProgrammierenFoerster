package uebungsblatt5.solution;

import uebungsblatt4.StarPrinter;

public class Aufgabe3 {
    public static void main(String[] args) {
        int eingabe = 70; //StdIn.readInt()
        var arr = new int[eingabe];
        for (int index = 0; index < arr.length; index++) {
            StarPrinter.printString(index, 0+"");
            StarPrinter.printString(1,index+"");
            StarPrinter.printString(arr.length-1-index, index+"");
        }
    }
}
