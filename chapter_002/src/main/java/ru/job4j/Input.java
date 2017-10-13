package ru.job4j;

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
