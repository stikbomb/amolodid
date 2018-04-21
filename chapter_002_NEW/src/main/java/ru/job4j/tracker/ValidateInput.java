package ru.job4j.tracker;

/**
 * Проверяет корректность поступаюших данных.
 */
public class ValidateInput implements Input {

    /**
     * Поле вводных данных.
     */
    private final Input input;

    /**
     * Конструктор.
     * @param input - входящие данные
     */


    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    /**
     * Проверка ответа на корректность.
     * @param question - вопрос
     * @param range - область ответа
     * @return - возвращает корректное значение
     */
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            } catch (MenuOutException moe) {
                System.out.println("Please select key from menu.");
            }
        } while (invalid);
        return value;
    }
}
