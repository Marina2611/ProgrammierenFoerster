package uebungsblatt1;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;

import java.awt.*;

public class Spiess {
    public static void main(String[] args) {
        StdDraw.setXscale (0, 100);
        StdDraw.setYscale (0, 100);
        StdDraw.point(0, 0);
        StdDraw.line (50, 0, 50, 100);
        StdDraw.setPenColor(Color.RED);
        StdDraw.square(50, 15, 10);
        StdDraw.square(50, 60, 10);
        StdDraw.setPenColor(Color.yellow);
        StdDraw.circle(50,37,10);
        StdDraw.circle(50,37,10);

    }
}
