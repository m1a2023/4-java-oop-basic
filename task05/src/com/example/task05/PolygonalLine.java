package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points;

    public PolygonalLine() { this.points = new Point[0]; }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        /**
         * incorrect
          */
        //this.points = points.clone();

        //System.arraycopy(points, 0, this.points, 0, points.length);

        //Point[] newPoints = new Point[points.length];
        //System.arraycopy(points, 0, newPoints, 0, points.length);
        //this.points = newPoints;

        /**
         * correct
         */
        this.points = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }

        //for (int i = 0; i < points.length; i++) {
        //    addPoint(points[i]);
        //}
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point[] newPoints = new Point[this.points.length + 1];

        System.arraycopy(
                this.points, 0,
                newPoints, 0,
                this.points.length
        );

        newPoints[this.points.length] = new Point(point.getX(), point.getY());

        this.points = newPoints;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        if (this.points.length == 0) return 0;

        double res = 0;

        for (int i = 0; i < this.points.length - 1; i++) {
            //System.out.println("Calculating distance between points: ("
            //        + this.points[i].getX() + "," + this.points[i].getY() + ") and ("
            //        + this.points[i+1].getX() + "," + this.points[i+1].getY() + ")");
            res += this.points[i].getLength(this.points[i + 1]);
        }

        return res;
    }
}
