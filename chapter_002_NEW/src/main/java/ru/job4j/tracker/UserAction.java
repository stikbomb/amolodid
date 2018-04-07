package ru.job4j.tracker;

/**
 * Интрефейс пользоватенльских действи в меню.
 */
public interface UserAction {
    /**
     * ключ.
     * @return - возращает числовой параметр
     */
    int key();

    /**
     * Само действие.
     * @param input - инпут
     * @param tracker - трекер
     */
    void execute(Input input, Tracker tracker);

    /**
     * Информация о действии.
     * @return - возвращает строку пункта меню.
     */
    String info();

}
