package ru.job4j.tracker;


import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Тестирует программу с помощью эмуляции действий пользователя.
 */
public class StartUITest {

    /**
     * Перехватывает поток.
     */
    private final PrintStream stdout = System.out;

    /**
     * Преобразует поток.
     */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Стартует программу с переданными параметрами.
     *
     * @param tracker - трекер
     * @param actions - инпут
     */
    private void fillInput(Tracker tracker, String[] actions) {
        Input input = new StubInput(actions);
        new StartUI(input, tracker).init();
    }

    /**
     * Новый трекер.
     */
    private Tracker tracker = new Tracker();

    /**
     * Позволяет корректно работать с датами.
     */
    private DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    /**
     * Выполняется до теста, заполняем трекер заявками.
     */
    @Before
    public void fillTracker() {
        Item item1 = new Item("name1", "desc1", System.currentTimeMillis());
        Item item2 = new Item("name2", "desc2", System.currentTimeMillis());
        Item item3 = new Item("name3", "desc3", System.currentTimeMillis());
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
    }

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
     * Проверяем вывод первого элемента массива.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        assertThat(tracker.getAll()[0].getName(), is("name1")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

//    /**
//     * Проверяем обновление заявки.
//     */
//    @Test
//    public void whenUpdateThenTrackerHasUpdatedValue() {
//        fillInput(tracker, new String[]{"2", tracker.getAll()[0].getId(), "new name 2", "new desc 2", "Y"});
//        assertThat(tracker.findById(tracker.getAll()[0].getId()).getName(), is("new name 2"));
//    }


//    /**
//     * Проверяем удаление заявки.
//     */
//    @Test
//    public void whenDeleteThenCheckIT() {
//        fillInput(tracker, new String[]{"3", tracker.getAll()[0].getId(), "Y"});
//        assertThat(tracker.getAll()[0].getName(), is("name2"));
//    }

}
