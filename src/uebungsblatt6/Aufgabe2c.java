package uebungsblatt6;

public class Aufgabe2c {
    public static void main(String[] args) {
        System.out.println(maxArray(new int[]{4, 9, 0, 4}));
    }
    public static int maxArray(int[] array){
        int tmp = 0;
        for (int eintrag:array) {
            tmp= getMax(eintrag, tmp);
        }
        return tmp;
    }
    public static int getMax(int a, int b) {
        return Math.max(a,b);
    }
}
