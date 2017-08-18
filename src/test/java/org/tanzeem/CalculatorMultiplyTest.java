package org.tanzeem;

import org.tanzeem.utility.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMultiplyTest {

	Calculator calculator = new Calculator();

	@Test
	public void testAddition2Plus2Equals4() {
		Assert.assertEquals(calculator.multiply(2, 2), 4, "Mul mismatch...");
	}

	@Test
	public void testAddition2Plus6Equals8() {
		Assert.assertEquals(calculator.multiply(2, 6), 12, "Mul mismatch...");
	}

}
