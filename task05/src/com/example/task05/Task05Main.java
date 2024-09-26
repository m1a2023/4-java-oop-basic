package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();

        Point[] points = {
                new Point(1, 2),
                new Point(4, 6),
                new Point(8, 9),
                new Point(12, 12),
                new Point(15, 16),
        };

        line.setPoints(points);

        System.out.println(line.getLength());
    }
}
