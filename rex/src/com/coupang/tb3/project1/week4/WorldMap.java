package com.coupang.tb3.project1.week4;

import com.coupang.tb3.project1.StdLibrary.StdDraw;
import com.coupang.tb3.project1.StdLibrary.StdIn;

public class WorldMap {

    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        StdDraw.enableDoubleBuffering();
        while (!StdIn.isEmpty()) {
            StdIn.readString();
            int vertices = StdIn.readInt();
            double[] x = new double[vertices];
            double[] y = new double[vertices];
            for (int i = 0; i < vertices; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }
        StdDraw.show();
    }
}
