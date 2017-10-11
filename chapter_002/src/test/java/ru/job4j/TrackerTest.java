package ru.job4j;

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
public class TrackerTest {
    /**
     * Test added.
     * Проверяет метод add, update, findByID
     */
    @Test
    public void whenUpdateNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next2 = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next2.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.update(next2);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Test added.
     * Проверяет метод add, findAll
     * В коде есть проверка на наличие null-квых элементов в коде, но я не смог в тесте воспроизвести такой ситуации.
     * Кидается ошибка на нулевой элемент и всё.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        //создаём три элемента Item с разными номера, нумерация начинается с нуля, чтоб было легче отслеживать
        Item item0 = new Item("test0", "testDesc0", 123L);
        Item item1 = new Item("test1", "testDesc1", 12345L);
        Item item2 = new Item("test2", "testDesc2", 123445L);
        Item item3 = new Item("test3", "testDesc3", 12345634L);
        Item item4 = new Item("test4", "testDesc4", 1234536L);
        //добавляем заявки в трекер
        tracker.add(item0);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        //Проверяем, что второй элемент массива равен item1
        assertThat(tracker.findAll()[1], is(item1));
        //Проверяем, что длина нового массива равна 5
        assertThat(tracker.findAll().length, is(5));
    }

    /**
     * Test added.
     * Проверяет методы add, delete, findAll.
     */
    @Test
    public void whenDeleteOneItemAndItemsRightOfItMoveLeftOnePosition() {
        Tracker tracker = new Tracker();
        //создаём заявка
        Item item1 = new Item("test1", "testDescription1", 123L);
        Item item2 = new Item("test2", "testDesc2", 12345L);
        Item item3 = new Item("test3", "testDescription3", 123L);
        Item item4 = new Item("test4", "testDescription4", 123L);
        Item item5 = new Item("test5", "testDescription5", 123L);
        //добавляем их в трекер
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        //удалём одну из заявок
        tracker.delete(item2);
        //поскольку удаление достигается сдвигом части массива, проверяем, что массив сдвинулся
        assertThat(tracker.findAll()[1], is(item3));
        assertThat(tracker.findAll()[2], is(item4));
    }

    /**
     * Test added.
     * Проверяет метод findByName
     */
    @Test
    public void whenFewItemsWithEqualsNamesGetOneArray() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("test", "testDescription1", 123L);
        Item item1 = new Item("test1", "testDescription1", 123L);
        Item item2 = new Item("test", "testDesc2", 12345L);
        Item item3 = new Item("test3", "testDescription3", 123L);
        Item item4 = new Item("test", "testDescription4", 123L);
        Item item5 = new Item("test5", "testDescription5", 123L);
        tracker.add(item0);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        tracker.findByName("test");
        //проверяем, что длина нового массива равно 3
        assertThat(tracker.findByName("test").length, is(3));
        //проверяем, что значение третьего элемента равно item 4
        assertThat(tracker.findByName("test")[2], is(item4));
    }
}
