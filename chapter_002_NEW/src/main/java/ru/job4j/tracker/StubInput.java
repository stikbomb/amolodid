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

    /**
     * Механизм реализации запроса.
     * @param question - вопрос
     * @param range - область ответа
     * @return - возвращает ключ
     * @throws MenuOutException - тип кидаемой ошибки
     */
    public int ask(String question, int[] range) throws MenuOutException {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range.");
        }
    }
}
