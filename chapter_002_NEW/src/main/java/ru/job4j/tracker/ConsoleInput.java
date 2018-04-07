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
}
