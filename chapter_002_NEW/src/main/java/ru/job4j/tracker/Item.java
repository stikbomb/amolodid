package ru.job4j.tracker;

/**
 * Содержит в себе информацию о заявке.
 */

public class Item {

    /** Содержит уникальный ID элемента. */
    private String id;

    /** Содержит имя элемента. */
    private String name;

    /** Содержит описание элемента. */
    private String description;

    /** Содержит дату создания элемента. */
    private long create;

    /** Содержит дату последнего изменения элемента. */
    private long update;

    /**
     * Конструктор, применяемый при создании элемента.
     * @param name - имя элемента
     * @param description - описание элемента
     * @param create - время создание элемента
     */
     Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    /**
     * Конструктор, применяемые при изменении заявки.
     * @param name - имя элемента
     * @param description - описание жлемента
     * @param id - ID жлемента
     * @param create - дата создания
     * @param update - дата последнего изменения
     */
     Item(String name, String description, String id, long create, long update) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.create = create;
        this.update = update;
    }

    /**
     * Геттер для ID элемента.
     * @return - возвращает ID элемента
     */
    String getId() {
        return this.id;
    }

    /**
     * Сеттер для ID элемента.
     * @param id - устанавливает ID элемента
     */
    void setId(String id) {
        this.id = id;
    }

    /**
     * Геттер для имени элемента.
     * @return - возращает имя элемента
     */
    String getName() {
        return this.name;
    }

    /**
     * Сеттер для имени элемента.
     * @param name - устанавливает имя элемента
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер для описания элемента.
     * @return - вовзращает описание элемента
     */
    String getDescription() {
        return this.description;
    }

    /**
     * Сеттер для описания элемента.
     * @param description - устанавливает описание элемента
     */
    void setDescription(String description) {
        this.description = description;
    }

    /**
     * Геттер для даты создания элемента.
     * @return - возращает дату создания элемента
     */
    long getCreate() {
        return this.create;
    }

    /**
     * Геттер для даты последнего изменения элемента.
     * @return - возвращает дату последнего изменения элемента
     */
    long getUpdate() {
        return this.update;
    }

    /**
     * Сеттер для даты последнего изменения элемента.
     * @param update - устанавливает дату послднего изменения элемента
     */
    void setUpdate(long update) {
        this.update = update;
    }
}
