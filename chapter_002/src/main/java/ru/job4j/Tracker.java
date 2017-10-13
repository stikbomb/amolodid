package ru.job4j;

import java.util.Arrays;
import java.util.Random;

/**
 * Заниматеся управление и хранением заявок.
 */
public class Tracker {

    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];

    /**
     * Отвечает за позицию каждой новой заявки в массиве.
     */
    private int position = 0;

    /**
     * Отвечает за создание случайных ID.
     */
    private static final Random RN = new Random();

    /**
     * Добавляет заявку.
     * @param item - добавляемая заявка.
     * @return - заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }

    /**
     * Обнолвяет заявку по номеру ID.
     * @param item - заявка.
     */
    public void update(Item item) {
        for (int i = 0; i != position; i++) {
            if (items[i].getId().equals(item.getId())) {
                items[i] = item;
                break;
            }
        }
    }

    /**
     * Удаляем заявку, найденную по ID.
     * Удаление происходит за счёт использования "System.arraycopy".
     * @param item - заявка.
     */
    public void delete(Item item) {
        if (items[position - 1].getId().equals(item.getId())) {
            System.arraycopy(items, 0, items, 0, position - 1);
            position--;
            return;
        } else {
            for (int i = 0; i < position - 1; i++) {
                if (items[i].getId().equals(item.getId())) {
                    System.arraycopy(items, i + 1, items, i, position - i - 1);
                    //делаем декремент номеру позиции, чтобы корректно работали остальные методы
                    position--;
                }
            }
        }
    }

    /**
     * Формирует новый массив из всех элементов, не равных null.
     * @return - новый массив.
     */
    public Item[] findAll() {
        int nullCount = 0;
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            if (this.items[index] == null) {
                nullCount++;
            }
            result[index] = this.items[index];
        }
        return Arrays.copyOf(result, this.position - nullCount);
    }

    /**
     * Возращает массив элементов с именем, как в запросе.
     * @param name - запрашиваемое имя элементов
     * @return - возрщает новый массив
     *
     */
    public Item[] findByName(String name) {
        Item[] result = new Item[this.position];
        int j = 0;
        for (int i = 0; i != this.position; i++) {
            if (items[i] != null & items[i].getName().equals(name)) {
                result[j] = items[i];
                j++;
            }
        }
        if (j == 0) {
            System.out.println("Item with this name was not found. Try again.");
        }
        return Arrays.copyOf(result, j);
    }

    /**
     * Ищет элемент по ID.
     * @param id - параметр ID
     * @return - возвращает элемент, найденный по ID
     */
    public Item findById(String id) {
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
     * Генерирует случайный ID. Длина ID уменьшена для удобства разработки и тестирования.
     * При необходимости верну прежнее значение.
     * @return - возвращает уникальный ID.
     */
    String generateId() {
        return String.valueOf((System.currentTimeMillis() + RN.nextInt()) / 999999);
    }
}
