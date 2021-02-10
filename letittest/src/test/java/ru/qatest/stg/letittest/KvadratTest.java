package ru.qatest.stg.letittest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class KvadratTest {

	@Test
	public void testPlosh(){
		Kvadrat s = new Kvadrat(7);
		Assert.assertEquals(s.plosh(), 49);

	}
}
