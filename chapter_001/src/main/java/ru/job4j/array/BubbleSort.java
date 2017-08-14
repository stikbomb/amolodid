package ru.job4j.array;

/**
 * Программа для сортировки массива методом перестановки
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort {
    public int[] sort(int[] array) {
        //внешний цикл отвечает за количество "проходов"
        for (int i = array.length - 1; i >= 1; i--) {
            //внутренний цикл отвечает за сортировку чисел в каждом "проходе"
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    //переменная temp используется для перестановки чисел
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}