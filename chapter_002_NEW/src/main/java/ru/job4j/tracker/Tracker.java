package ru.job4j.tracker;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Random;

/**
 * Занимается управлением и хранением заявок.
 */

public class Tracker {

    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[10];

    /**
     * Считает позицию в массиве для новой заявки.
     */
    private int position = 0;

    /**
     * Отвечает за генерацию случайного числа для ID.
     */
    private static final Random RN = new Random();

    /**
     * Позволяет корректно работать с датой и временем.
     */
    private DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    /**
     * Добавляет заявку в трекер.
     * @param item - заявка
     */
    public void add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
    }

    /**
     * Ищет заявку по ID.
     * @param id - ключ поиска
     * @return - возвращает заявку
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Генерирует уникальный ID.
     * @return - возвращает значение уникального ID
     */
    private String generateId() {
        return String.valueOf((System.currentTimeMillis() + RN.nextInt()) / 1000000);
    }

    /**
     * Возвращает массив всех заявок.
     * @return - возвращает массив заявок
     */
    public Item[] getAll() {
        Item[] result = new Item[position];
        for (int index = 0; index != position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * Меняет одну заявку на другую по ID.
     * @param id - ID заявки для замены
     * @param item - новая заявка
     */
    public void replace(String id, Item item) {
        for (int index = 0; index != position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                items[index] = item;
                break;
            }
        }
    }

    /**
     * Удаляет заявку из массива.
     * @param id - ID заявки для удаления
     */
    public void delete(String id) {
        for (int index = 0; index != position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, position - index - 1);
                items[position] = null;
                position--;
                break;
            }
        }
    }

    /**
     * Ищет заявку по имени.
     * Допускается, что имя заявки не уникально, поэтому возвращается массив из заявок.
     * @param key - ключ поиска
     * @return - возврат массива заявок
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int j = 0;
        for (int i = 0; i != position; i++) {
            if (items[i].getName().equals(key)) {
                result[j] = items[i];
                j++;
            }
        }
        return Arrays.copyOf(result, j);
    }

    /**
     * Показывает полную информацию об одной заявке.
     * @param item - заявка
     */
    public void showItem(Item item) {
        System.out.println("Name: " + item.getName());
        System.out.println("Description: " + item.getDescription());
        System.out.println("ID: " + item.getId());
        System.out.println("Create date: " + dateFormat.format(item.getCreate()));
        if (item.getUpdate() != 0) {
            System.out.println("Update date: " + dateFormat.format(item.getUpdate()));
        }
        System.out.println();
    }

    //Методы проверки ввередния корректности данных (наличие заявок, корректные ID и имя)

    /**
     * Проверяем наличие заявок в трекере.
     * @return - возвращает булево значение
     */
    public boolean checkEmptyArray() {
        if (this.getAll().length == 0) {
            System.out.println("\nThere are no items in tracker!\n");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Проверяет корректность введённого ID.
     * @param id - ID
     * @return - возвращает булево значени
     */
    public boolean checkId(String id) {
        if (this.findById(id) == null) {
            System.out.println("\nThere is no items with this ID in tracker!\n");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Проверяем корректность введённого имени.
     * @param name - имя
     * @return - вовзращает булево значение
     */
    public boolean checkName(String name) {
        if (this.findByName(name).length == 0) {
            System.out.println("\nThere are no items with this name in tracker!\n");
            return false;
        } else {
            return true;
        }
    }
}
