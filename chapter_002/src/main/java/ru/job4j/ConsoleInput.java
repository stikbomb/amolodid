package ru.job4j;

import java.util.Scanner;

/** Отвечает за ввод с клавиатуры. */
public class ConsoleInput implements Input {

    /** Создаём экзмепляр класса Сканнер, отвечающий за ввод с клавиатуры. */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Отвечает за порядок ввода информации с клавиатуры.
     * @param question - вопрос
     * @return - чтение строки (ответ на вопрос)
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

}
