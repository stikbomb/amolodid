package ru.job4j.array;

/**
 * Программа для разворота массива задом наперёд.
 *
 * без использования дополнительного массива
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */


public class Turn {

    /**
     * Возаращает развёрнутый массив.
     * @param array - исходный массив
     * @return - возвращает развёрнутый массив
     */
    public int[] back(int[] array) {
        //для удобства введём переменную arLen
        int arLen = array.length - 1;
        //меняем числа из первой половины массива с числами из второй
        //при нечётном количестве чисел "среднее" число остаётся неизменным
        for (int i = 0; i <= (arLen / 2); i++) {
            //для переназначения используем дополнительную переменную temp
            int temp = array[i];
            array[i] = array[arLen - i];
            array[arLen - i] = temp;
        }
        return array;
    }
}