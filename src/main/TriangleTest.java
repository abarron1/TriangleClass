package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		Triangle test = new Triangle(3, 3, 3);
		double out = test.getPerimeter();
		assertEquals(9, out, 0);

		out = test.getArea();
		assertEquals(3.8971, out, 0.001);
	}

}