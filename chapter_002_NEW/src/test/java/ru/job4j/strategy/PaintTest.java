package ru.job4j.strategy;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

/**
 * Test.
 *
 * @author Alexander Molodid (mailto:a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class PaintTest {
//    /**
//     * Test add.
//     */
//    @Test
//    public void whenDrawTriangleThenCheckIt() {
//        Paint paint = new Paint();
//        String result = paint.draw(new Triangle());
//        String expected = String.format("  +  %s +++ %s+++++", System.getProperty("line.separator"),
//                System.getProperty("line.separator"));
//        assertThat(result, is(expected));
//
//    }
//
//    /**
//     * Test add.
//     */
//    @Test
//    public void whenDrawSquareThenCheckIt() {
//        Paint paint = new Paint();
//        String result = paint.draw(new Square());
//        String expected = String.format("++++%s++++%s++++%s++++", System.getProperty("line.separator"),
//                System.getProperty("line.separator"), System.getProperty("line.separator"));
//        assertThat(result, is(expected));
//
//    }
    /**
     * Перехватывает поток.
     */
    private final PrintStream stdout = System.out;

    /**
     * Преобразует поток.
     */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Выполняется до теста.
     */
    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    /**
     * Выполняется после теста.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    /**
     * Проверяем как рисуется квадрат.
     */
    @Test
    public void whenDrawSquare() {
        System.out.println(new Paint().draw(new Square()));
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                        .append("++++")
                        .append(System.getProperty("line.separator"))
                        .append("++++")
                        .append(System.getProperty("line.separator"))
                        .append("++++")
                        .append(System.getProperty("line.separator"))
                        .append("++++")
                        .append(System.getProperty("line.separator"))
                                .toString()

                )
        );
    }

    /**
     * Проверяем как рисуется треугольник.
     */
    @Test
    public void whenDrawTriangle() {
        System.out.println(new Paint().draw(new Triangle()));
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(
                                System.lineSeparator(), "",
                                System.lineSeparator())
                                .add("  +  ")
                                .add(" +++ ")
                                .add("+++++")
                                .toString()
                )
        );
    }
}


