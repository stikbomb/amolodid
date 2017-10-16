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

public class StubInputTest {


    /**
     * Test added.
     * Проверяем метод add.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"1", "test name", "desc", "2", "0"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }


    /**
     * Test added.
     * Проверяем метод update.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("TestNAme", "TestDes", 1234123L));
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"3", item.getId(), "test name", "desc", "0"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }


    /**
     * Test added.
     * Проверяем метод delete.
     */
    @Test
    public void whenDeleteItemThenCheckIt() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем 4 заявки
        Item item0 = tracker.add(new Item("TestNAme0", "TestDes", 1234123L));
        Item item1 = tracker.add(new Item("TestNAme1", "TestDes", 1234123L));
        Item item2 = tracker.add(new Item("TestNAme2", "TestDes", 1234123L));
        Item item3 = tracker.add(new Item("TestNAme3", "TestDes", 1234123L));
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"4", item1.getId(), "YES", "0"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что элемент item1 удалился и весь массив сдвинулся на одну позицию
        assertThat(tracker.findAll()[1], is(item2));
        assertThat(tracker.findAll()[2], is(item3));
    }


    /**
     * Test added.
     * Проверяем метод findById.
     */
    @Test
    public void whenFindItemByIdThenCheckIt() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item0 = tracker.add(new Item("TestNAme0", "TestDes", 1234123L));
        Item item1 = tracker.add(new Item("TestNAme1", "TestDes", 1234123L));
        Item item2 = tracker.add(new Item("TestNAme2", "TestDes", 1234123L));
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"5", item1.getId(), "0"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что элемент, найденный по ID, соответствует ожидаемому
        assertThat(tracker.findById(item1.getId()), is(item1));
    }


    /**
     * Test added.
     * Проверяем метод findByName.
     */
    @Test
    public void whenFindItemsByNameThenCheckIt() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item0 = tracker.add(new Item("TestNAme0", "TestDes", 1234123L));
        Item item1 = tracker.add(new Item("TestNAme1", "TestDes", 1234123L));
        Item item2 = tracker.add(new Item("TestNAme0", "TestDes", 1234123L));
        Item item3 = tracker.add(new Item("TestNAme2", "TestDes", 1234123L));
        Item item4 = tracker.add(new Item("TestNAme0", "TestDes", 1234123L));
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"6", item2.getName(), "0"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что массив найденных элементов состоим из трёх элементов
        assertThat(tracker.findByName("TestNAme0").length, is(3));
        // проверяем, что имя каждого найденного элемента равно TestNAme0
        assertThat(tracker.findByName("TestNAme0")[0].getName(), is("TestNAme0"));
        assertThat(tracker.findByName("TestNAme0")[1].getName(), is("TestNAme0"));
        assertThat(tracker.findByName("TestNAme0")[2].getName(), is("TestNAme0"));
    }

    /**
     * Test added.
     * Проверяем метод showAll.
     */
    @Test
    public void whenShowAllItamsThenCheckIt() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item0 = tracker.add(new Item("TestNAme0", "TestDes", 1234123L));
        Item item1 = tracker.add(new Item("TestNAme1", "TestDes", 1234123L));
        Item item2 = tracker.add(new Item("TestNAme2", "TestDes", 1234123L));
        Item item3 = tracker.add(new Item("TestNAme3", "TestDes", 1234123L));
        Item item4 = tracker.add(new Item("TestNAme4", "TestDes", 1234123L));
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"2", "0"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что массив найденных элементов состоим из пяти элементов
        assertThat(tracker.findAll().length, is(5));

    }
}
