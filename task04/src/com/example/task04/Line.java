package com.example.task04;

public class Line {
	Point p1;
	Point p2;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() { return this.p1; }
	public Point getP2() { return this.p2; }

	public double getLength() {
		return p1.getLength(p2);
	}

	public boolean isCollinearLine(Point p) {
		/** ! Explanation:
		 * Points are collinear if the vectors formed by pairs of points are
		 * linearly dependent
		 *
		 *      (x2 - x1  y2 - y1)
		 *  det (x  - x1  y  - y1)  == 0
		 *  	=> Points are collinear
		 */

		return (
				((p2.getX() - p1.getX()) * (p.getY() - p1.getY())
						- (p2.getY() - p1.getY()) * (p.getX() - p1.getX()))
					  	== 0);
	}

	@Override
	public String toString() {
		return "Length: " + this.getLength()
				+ "\nPoint x: " + this.p1
				+ "\nPoint y: " + this.p2;
	}
}
