package uebungsblatt1;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Add5Integers {
    public static void main(String [] args)
    {
        StdOut.println("Dieses Programm addiert zwei ganze Zahlen.");
        StdOut.print("Bitte erste Zahl eingeben: ");
        int n1 = StdIn.readInt();
        StdOut.print("Bitte zweite Zahl eingeben: ");
        int n2 = StdIn.readInt();
        int n3 = StdIn.readInt();
        int n4 = StdIn.readInt();
        int n5 = StdIn.readInt();

        int sum = n1 + n2 + n3 + n4 + n5;
        StdOut.println("Die Summe ist " + sum + ".");
    }
}
