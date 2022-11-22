package uebungsblatt6;

public class Aufgabe1b {

    private static int n;
    private static int x;

    /**
     * cccc
     * c  c
     * c  c
     * cccc
     *
     * @param c
     * @param anzahl
     */

    public static void wiederholeZeichen(char c, int anzahl) {

        int anzahl1 = 1;
        do {
            System.out.print(c);
            anzahl1++;

        }
        while (anzahl1 <= anzahl);
    }

    public static void main(String[] args) {
        n = 17;
        x = n - 2;
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
