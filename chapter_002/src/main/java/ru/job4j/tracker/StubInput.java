package ru.job4j.tracker;

/**
 * Класс-заглушка для тестирования.
 */
public class StubInput implements Input {
    /** Ответы. */
    private String[] answers;
    /** Позиция в массиве ответов.. */
    private int position = 0;

    /**
     * Конструктор.
     * @param answers - массив вопросов.
     */

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Контракт.
     * @param question - задаём вопрос
     * @return - возвращаем ответ
     */
    public String ask(String question) {
        return answers[position++];
    }
}
