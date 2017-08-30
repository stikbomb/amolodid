package ru.job4j.array;

/**
 * Программа для формирования двух отсортированных массивов в один с сохранением сортировки.
 * По умолчанию считается, что массивы отсортированы в порядке возарстания
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class ArraySort {

    /**
     * Фомироует из двух отсортированных массивов один.
     * @param a - первый массив
     * @param b - второй массив
     * @return - возврат результирующего массива
     */
    public int[] sort(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        int i = 0;
        int j = 0;
        int[] resultArray = new int[aLen + bLen];
        for (int k = 0; k < aLen + bLen; k++) {
            if (i < aLen && j < bLen) {
                if (a[i] <= b[j]) {
                    resultArray[k] = a[i];
                    i++;
                } else {
                    resultArray[k] = b[j];
                    j++;
                }
            } else if (i == aLen) {
                resultArray[k] = b[j];
                j++;
            } else if (j == bLen) {
                resultArray[k] = a[i];
                i++;
            }
        }
        return resultArray;
    }
}
