package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирует трекер.
 */

public class TrackerTest {

    /**
     * Проверяет добавление заявки - метод add.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.getAll()[0], is(item));
    }

    /**
     * Проверяет замену заявки - метод replace.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Проверяет удаление заявки - метод delete.
     */
    @Test
    public void whenDeleteITem() {
        Tracker tracker = new Tracker();
        //Добавляем массив заявок.
        Item item0 = new Item("test1", "testDesr1", 1234L);
        tracker.add(item0);
        Item item1 = new Item("test2", "testDesr2", 1234L);
        tracker.add(item1);
        Item item2 = new Item("test3", "testDesr3", 1234L);
        tracker.add(item2);
        Item item3 = new Item("test4", "testDesr4", 1234L);
        tracker.add(item3);
        Item item4 = new Item("test5", "testDesr5", 1234L);
        tracker.add(item4);
        Item item5 = new Item("test6", "testDesr6", 1234L);
        tracker.add(item5);
        Item item6 = new Item("test7", "testDesr7", 1234L);
        tracker.add(item6);
        //Удаляем заявку.
        tracker.delete(item3.getId());
        //Проверяем, как сдвинулся массив.
        assertThat(tracker.getAll()[3], is(item4));
    }

    /**
     * Проверяет поиск заявок по имени.
     * Допускается, что может быть несколько заявок с одним и тем же именем.
     */
    @Test
    public void whenFindByNameTwoItems() {
        //Добавляем заявки.
        Tracker tracker = new Tracker();
        Item item0 = new Item("test1", "testDesr1", 1234L);
        tracker.add(item0);
        Item item1 = new Item("test2", "testDesr2", 1234L);
        tracker.add(item1);
        Item item2 = new Item("TestName", "testDesr3", 1234L);
        tracker.add(item2);
        Item item3 = new Item("test4", "testDesr4", 1234L);
        tracker.add(item3);
        Item item4 = new Item("TestName", "testDesr5", 1234L);
        tracker.add(item4);
        Item item5 = new Item("test6", "testDesr6", 1234L);
        tracker.add(item5);
        Item item6 = new Item("test7", "testDesr7", 1234L);
        tracker.add(item6);
        //Делаем поиск по имени, получаем массим из двух элементов, проверяем эти элементы.
        assertThat(tracker.findByName("TestName")[0], is(item2));
        assertThat(tracker.findByName("TestName")[1].getDescription(), is("testDesr5"));

        }
}