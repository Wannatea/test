package ru.qatest.stg.letittest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointThreeTest {

	@Test
	public void testDistanceThree(){
		PointThree p1 = new PointThree(2,2);
		PointThree p2 = new PointThree (4,4);
		Assert.assertEquals(p1.distanceThree(p2), 2.8284271247461903);
	
	}

}
