package ru.job4j.strategy;

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

    public class PaintTest {
        /**
         * Test add.
         */
        @Test
        public void whenDrawTriangleThenCheckIt() {
            Paint paint = new Paint();
            String result = paint.draw(new Triangle());
            String expected = String.format("  +  %s +++ %s+++++", System.getProperty("line.separator"),
                    System.getProperty("line.separator"));
            assertThat(result, is(expected));

        }

        /**
         * Test add.
         */
        @Test
        public void whenDrawSquareThenCheckIt() {
            Paint paint = new Paint();
            String result = paint.draw(new Square());
            String expected = String.format("++++%s++++%s++++%s++++", System.getProperty("line.separator"),
                    System.getProperty("line.separator"), System.getProperty("line.separator"));
            assertThat(result, is(expected));

        }
    }


