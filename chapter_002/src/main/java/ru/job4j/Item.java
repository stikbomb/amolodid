package ru.job4j;

/**
 * Содержит в себе информацию об одной заявке.
 */


public class Item {

    /** Содержит в себе уникальный ID элемента. */
    private String id;

    /**Содержит в себе имя элемента.*/
    private String name;

    /** Содержит в себя описание элемента. */
    private String description;

    /** Содержит в себе время создания элемента. */
    private long create;

    /** Содержит время последнего изменения элемента. */
    private long update;

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
     * Еще один конструктор, для правки заявок.
     * @param id - id заявки
     * @param name - имя заявки
     * @param description - описание заявки
     * @param create - дата создания заявки
     * @param update - дата последнего изменения заявка
     */
    Item(String id, String name, String description, long create, long update) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.create = create;
        this.update = update;
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

    /**
     * Обычный сеттер.
     * @param date - устанавливает дату создания элемента
     */
    void setCreate(long date) {
            this.create = date;
    }

    /**
     * Обычный геттер.
     * @return - возрвщает дату последнего изменения элемента
     */
    long getUpdate() {
        return this.update;
    }

    /**
     * обычный сеттер.
     * @param date - устанавливает дату последнего изменения элемента
     */
    void setUpdate(long date) {
        this.update = date;
    }
}