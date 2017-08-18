package org.tanzeem;

import org.tanzeem.utility.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorAddTest {

	Calculator calculator = new Calculator();

	@Test
	public void testAddition2Plus2Equals4() {
		Assert.assertEquals(calculator.add(2, 2), 4, "Sum mismatch...");
	}

	@Test
	public void testAddition2Plus6Equals8() {
		Assert.assertEquals(calculator.add(2, 6), 8, "Sum mismatch...");
	}

}
