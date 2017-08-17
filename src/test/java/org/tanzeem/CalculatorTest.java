package org.tanzeem;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	public void testAddition2Plus2Equals4() {
		Assert.assertEquals(calculator.add(2, 2), 4, "Sum mismatch...");
	}

	@Test
	public void testAddition2Plus6Equals8() {
		Assert.assertEquals(calculator.add(2, 6), 6, "Sum mismatch...");
	}

}
