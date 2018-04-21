package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class ValidateInputTest {

    /**
     * Обеспечивает выход данных.
     */
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();

    /**
     * Обеспечивает поток данных.
     */
    private final PrintStream out = System.out;

    /**
     * Блок операций до теста.
     */
    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    /**
     * Блок операций после теста.
     */
    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    /**
     * Тест моделирует ситуацию с некорректным вводом данных (текст вместо числа).
     */
    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "1"})
        );
        input.ask("Enter", new int[] {1});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Please enter validate data again.%n")
                )
        );
    }

    /**
     * Тест моделирует ситуацию с некорректным вводом данных (число за пределами допустимых границ).
     */
    @Test
    public void whenInputOutOfRange() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"60", "1"})
        );
        input.ask("Enter", new int[] {1});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Please select key from menu.%n")
                )
        );
    }
}
