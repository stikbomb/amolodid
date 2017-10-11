package ru.job4j;

/**
 * Содержит в себе информацию об одной заявке.
 */


public class Item {

    /**
     * Содержит в себе уникальный ID элемента.
     */
    private String id;

    /**
     * Содержит в себе имя элемента.
     */
    private String name;

    /**
     * Содержит в себя описание элемента.
     */
    private String description;

    /**
     * Содержит в себе время создания элемента.
     */
    private long create;

    /**
     * Конструктор, применяемый при создании элемента.
     * @param name - имя элемента
     * @param description - описание элемента
     * @param create - время создания элемента
     */
    Item(String name, String description, long create) {
    this.name = name;
    this.description = description;
    this.create = create;
    }

    /**
     * Обычный геттер.
     * @return - возращает ID
     */
    String getId() {
        return this.id;
    }

    /**
     * Обычный сеттер.
     * @param id - устанавливает ID элемента
     */
    void setId(String id) {
        this.id = id;
    }

    /**
     * Обычный геттер.
     * @return - возвращает имя элемента.
     */
    String getName() {
        return this.name;
    }

    /**
     * Обычный геттер.
     * @return - возвращает описание элемента.
     */
    String getDescription() {
        return this.description;
    }

    /**
     * Обычный геттер.
     * @return - возвращает время создания элемента.
     */
    long getCreate() {
        return this.create;
    }
}