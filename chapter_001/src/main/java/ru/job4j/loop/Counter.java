package ru.job4j.loop;

/**
 * Подсчёт суммы чётных чисел в диапазоне
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Counter {
    /**
     * Вычисляет сумму чётных чисел в заданном диапазоне
     * @param start - минимальное значение диапазона
     * @param finish - максимальное значение диапазона
     * @return sum - возвращает сумму
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }
}