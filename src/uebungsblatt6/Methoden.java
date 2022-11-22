package uebungsblatt6;

import edu.princeton.cs.introcs.StdIn;

public class Methoden {

    public static void wiederholeZeichen(char c, int anzahl) {
        int anzahl1 = 1;
        while (anzahl1 <= anzahl) {
            System.out.print(c);
            anzahl1++;
        }
    }
    public static void printTriangle(int n) {
        int y = 1;
        int x = n - 1;

        for (int i = 0; i < n; i++) {
            wiederholeZeichen(' ', x);
            wiederholeZeichen('*', y);
            System.out.println();
            y += 2;
            x--;
        }
    }
    public static int frageInt(String zahl) {
        return Integer.parseInt(zahl);
    }
    public static int frageInt(int min, int max) {

        while (true) {
            try {
                String zahl = StdIn.readString();
                int zahl1 = frageInt(zahl);
                if (zahl1 > min && zahl1 < max) {
                    return zahl1;
                }
            } catch (NumberFormatException ignored) {
            }
        }
    }
    public static void printQuadrat(int n){
    int x = n - 2;
    wiederholeZeichen('c', n);
        System.out.println();
        for (int i = 0; i < x; i++) {
        wiederholeZeichen('c', 1);
        wiederholeZeichen(' ', x);
        wiederholeZeichen('c', 1);
        System.out.println();
    }

    wiederholeZeichen('c', n);
    ;

}
}
