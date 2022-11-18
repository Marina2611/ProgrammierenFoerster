package uebungsblatt5.solution;

public class Bloodsugar {
    public static void main(String[] args) {
        int anzahl = 4; //Anzahl der Personen [StdIn.readInt();]
        int[] persons = new int[anzahl];
        for (int singlePerson : persons) {
            singlePerson = (int) (Math.random()*160);
        }
    }
}
