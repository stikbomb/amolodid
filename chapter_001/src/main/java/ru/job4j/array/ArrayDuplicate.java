package ru.job4j.array;

import java.util.Arrays;

/**
 * Программа для удаления дубликатов из массива с применением метода "Arrays.copyOf".
 * В том числе проверяется сложный случай, когда подряд стоят больше двух одинаковых значений.
 * ИСПРАВЛЕНИЕ: удалено обязательное сохранение порядка элементов в массиве,
 * следовательно, убран третий счётчик.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicate {

    /**
     * Удаляет из массива элементы, повторяющиеся несколько раз.
     *
     * @param array - исходный массив
     * @return - возращаемый массив
     */
    public String[] remove(String[] array) {
        //считает количество переставленных значений, которые будут удалены из финального массива
        int index = 0;
        //отвечает за проход по каждому члену массива, кроме последнего
        for (int i = 0; i <= array.length - 2 - index; i++) {
            //отвечает за сравнение с каждым последующим членом
            for (int j = i + 1; j <= array.length - 1 - index; j++) {
                if (array[i].equals(array[j])) {
                    String temp = array[array.length - 1 - index];
                    array[array.length - 1 - index] = array[j];
                    array[j] = temp;
                    index++;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, array.length - index);
    }
}
