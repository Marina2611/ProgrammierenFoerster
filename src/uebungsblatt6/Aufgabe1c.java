package uebungsblatt6;


import java.util.logging.Logger;

/**
 * 3 1
 * 2 3
 * 1 5
 * 0 7
 * <p>
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
 */
public class Aufgabe1c {
    public static void main(String[] args) {
        int height = 17;
        Methoden.printTriangle(height);
    }
}
