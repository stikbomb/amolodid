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

    /**
     * Сложная структура запроса.
     * @param question - вопрос
     * @param range - область ответа
     * @return - возращаемое значение
     */
    int ask(String question, int[] range);
}
