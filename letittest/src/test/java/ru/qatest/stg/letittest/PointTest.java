package ru.qatest.stg.letittest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

	@Test
	public void testDistance (){
		Point p1 = new Point(2.2,4.4);
		Assert.assertEquals(p1.distance(),2.828427124746191);

	}
}
