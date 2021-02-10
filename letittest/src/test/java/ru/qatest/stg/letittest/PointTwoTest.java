package ru.qatest.stg.letittest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTwoTest {
	@Test
	public void testDistanceTwo() {
		PointTwo p1 = new PointTwo(2,2);
		PointTwo p2 = new PointTwo(4,4);
		Assert.assertEquals(p1.distanceTwo(p2), 2.8284271247461903);
	}
}
