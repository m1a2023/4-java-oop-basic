package com.example.task04;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void flip() {
		double tmp = this.x;
		this.x = -this.y;
		this.y = -tmp;
	}

	public double getX() { return this.x; }
	public double getY() { return this.y; }

	public double getLength(Point point) {
		return Math.sqrt(
				Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2)
		);
	}

	@Override
	public String toString() {
		return String.format("(%f, %f)", this.x, this.y);
	}
}
