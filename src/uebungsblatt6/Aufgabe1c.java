package uebungsblatt6;

public class Aufgabe1c {
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
        while (anzahl1 <= anzahl) {
            System.out.print(c);
            anzahl1++;
        }
    }

    public static void main(String[] args) {


        /**
         * 3 1
         * 2 3
         * 1 5
         * 0 7
         *
         * Zeilenanzahl:1 Leerzeichenanzahl = 0
         * Zeilenanzahl:2 Leerzeichenanzahl = 1
         * Zeilenanzahl:3 Leerzeichenanzahl = 2
         * Zeilenanzahl:4 Leerzeichenanzahl = 3
         * Zeilenanzahl:5 Leerzeichenanzahl = 4
         * Zeilenanzahl:6 Leerzeichenanzahl = 5
         * Zeilenanzahl:7 Leerzeichenanzahl = 6
         * Wenn Zeilenanzahl n ist und y die Sternanzeichen ist (initial auf 1), dann ist die Leerzeichenanzahl x auf n-1 initiaL:
         * int leerzeichen = n-1;
         * int sternchen = 1;
         * for(n iterationen) {
         * leerzeichen--;
         * sternchen += 2;
         * printeLeerzeichen leerzeichen mal
         * printSternchen sternchen mal
         * }
         *
         *
         *
         */
        n = 17;
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
}
