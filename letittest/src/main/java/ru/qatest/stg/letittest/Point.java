package ru.qatest.stg.letittest;

public class Point {
	double p1;
	double p2;
	double p3;
	double p4;


	public Point(double p1, double p2) {
		this.p1 = p1;
		this.p2 = p2;

}

	public double distance() {
		int p3 = (int) p1;
		int p4 = (int) p2;
		return  Math.sqrt(
				  ((p4 - p3) * (p4 - p3)) +
							 (
										(((p2 % 1) * 10) - ((p1 % 1) * 10)) *
												  (((p2 % 1) * 10) - ((p1 % 1) * 10))
							 )
		);
	}
	}
