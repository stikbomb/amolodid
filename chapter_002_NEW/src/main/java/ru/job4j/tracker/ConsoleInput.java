package ru.job4j.tracker;

/**
 * Позволяет вводить данные с клавиатуры.
 */

import java.util.Scanner;

/**
 * Расширяет класс Input.
 */
public class ConsoleInput implements Input {

    /**
     * Новый сканер.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Контракт.
     * @param question - вопрос
     * @return - возврат введённой строки
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();

    }

    /**
     * Механизм работы запроса.
     * @param question - вопрос
     * @param range - область ответа
     * @return - возвращает ключ
     * @throws MenuOutException - тип выкидываемой ошибки
     */
    public int ask(String question, int[] range)  throws MenuOutException {
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
