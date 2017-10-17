package ru.job4j.tracker;

/**
 * Интерфейс ввода.
 */
public interface Input {

    /**
     * Описание интерфейса.
     * @param question - задаём вопрос
     * @return - ждём ответ
     */
    String ask(String question);
}
