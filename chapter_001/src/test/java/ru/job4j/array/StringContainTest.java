package ru.job4j.array;

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

public class StringContainTest {

    /**
    Test added.
     */
    @Test
    public void whenOriginStringContainSubStringThenTrue() {
        //тест, проверяющий содержание одной строки в другой
        StringContain newSC = new StringContain();
        String origin = "привет";
        String sub = "иве";
        boolean result = newSC.contains(origin, sub);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    /**
    Test added.
     */
    @Test
    public void whenOriginStringContainSubStringThenFalse() {
        //тест, проверяющий содержание одной строки в другой
        StringContain newSC = new StringContain();
        String origin = "привет";
        String sub = "ивт";
        boolean result = newSC.contains(origin, sub);
        boolean expect = false;
        assertThat(result, is(expect));
    }

    /**
    Test added.
     */
    @Test
    public void whenOriginStringContainSubStringThenTrueHard() {
        //тест, проверяющий содержание одной строки в другой
        StringContain newSC = new StringContain();
        String origin = "ппивепприииивет";
        String sub = "ивет";
        boolean result = newSC.contains(origin, sub);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    /**
    Test added.
     */
    @Test
    public void whenOriginStringContainSubStringThenTrueFiniteCondition() {
        //тест, проверяющий содержание одной строки в другой
        StringContain newSC = new StringContain();
        String origin = "привекииививелдивет";
        String sub = "ивет";
        boolean result = newSC.contains(origin, sub);
        boolean expect = true;
        assertThat(result, is(expect));
    }
}