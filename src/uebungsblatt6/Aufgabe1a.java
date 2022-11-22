package uebungsblatt6;

public class Aufgabe1a {
    public static void wiederholeZeichen(String c, int anzahl) {
        int anzahl1 = 1;
        do {
            System.out.println(c);
            anzahl1++;

        }
        while (anzahl1 <= anzahl);

    }

    public static void main(String[] args) {
        wiederholeZeichen("c ist in c drinnen", 2);


    }
}
