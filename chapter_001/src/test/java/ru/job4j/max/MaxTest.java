package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class MaxTest {
	/**
	* Test add.
	*/
@Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 3);
        assertThat(result, is(3));
    }

	/**
	* Test add.
	*/
@Test
    public void whenFirstIsMaxOfThree() {
        Max maxim = new Max();
        int result = maxim.max(6, 3, 2);
        assertThat(result, is(6));
    }}