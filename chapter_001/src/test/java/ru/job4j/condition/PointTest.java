package ru.job4j.condition;

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

public class PointTest {
	/**
	* Test add.
	*/
@Test
    public void whenConditionTrue() {
        Point point = new Point(2, 10);
        boolean result = point.is(3,4);
        assertThat(result, is(true));
    }
}