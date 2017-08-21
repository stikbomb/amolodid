package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Test.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class TriangleTest {

    /**
	* Test add.
	*/
    @Test
    public void whenConditionIsNotTrue() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
    // Вычисляем площадь.
    double result = triangle.area();
    // Задаем ожидаемый результат.
    double expected = -1D;
    //Проверяем результат и ожидаемое значение.
    assertThat(result, closeTo(expected, 0.1));
    }

    /**
    Test added.
     */
    @Test
    public void whenConditionIsTrue() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
    // Вычисляем площадь.
    double result = triangle.area();
    // Задаем ожидаемый результат.
    double expected = 2D;
    //Проверяем результат и ожидаемое значение.
    assertThat(result, closeTo(expected, 0.1));
}
}