package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int tmp = this.x;
        this.x = -this.y;
        this.y = -tmp;
    }

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public double distance(Point point) {
        return Math.sqrt(
                Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2)
        );
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
