package ru.job4j.tracker;

/**
 * Расширяет класс INPUT.
 */
public class StubInput implements Input {

    /**
     * Массив вопросов.
     */
    private String[] answers;

    /**
     * Позиция ответа.
     */
    private int position = 0;

    /**
     * Ответ на вопрос.
     * @param answers - ответы
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Вопросы.
     * @param question - вопросы
     * @return - следующий вопрос
     */
    public String ask(String question) {
        return answers[position++];
    }
}
