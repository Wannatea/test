package ru.qatest.stg.letittest;

public class PointTwo {
	public double x;
	public double y;
	public PointTwo(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTwo (PointTwo vtoroy){

		return Math.sqrt(
										((this.x - vtoroy.x )*(this.x - vtoroy.x)) + ((this.y - vtoroy.y)*(this.y - vtoroy.y))
							 )
		;
	}

}
