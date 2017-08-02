package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexander Molodid (mailto:a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class CalculatorTest {
/**
* Test add.
*/
	@Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
		assertThat(result, is(expected));
    }

/**
* Test subtract.
*/
	@Test
    public void whenSubtractOneFromFourThenThree() {
        Calculator calc = new Calculator();
        calc.subtract(4D, 1D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }

	/**
* Test div.
*/
	@Test
    public void whenDivideSixByThreeThenTwo() {
        Calculator calc = new Calculator();
        calc.div(6D, 3D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

/**
* Test multiple.
*/
	@Test
    public void whenMultipleThreeAndThreeThenNine() {
        Calculator calc = new Calculator();
        calc.multiple(3D, 3D);
        double result = calc.getResult();
        double expected = 9D;
        assertThat(result, is(expected));
    }
}