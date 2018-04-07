package ru.job4j.tracker;

/**
 * Интерфейс ввода.
 */
public interface Input {

    /**
     * Структура запроса.
     * @param question - вопроса
     * @return - возврат
     */
    String ask(String question);
}
