package ru.qatest.stg.letittest;

public class PointThree {
	public double x;
	public double y;
	public PointThree(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double distanceThree (PointThree third) {

					return Math.sqrt(
										Math.pow((this.x - third.x), 2) + Math.pow((this.y - third.y), 2))

		;
	}
}
