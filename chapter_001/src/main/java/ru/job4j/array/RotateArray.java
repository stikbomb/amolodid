package ru.job4j.array;

/**
 * Программа для поворота квадратного массива на 90 градусов
 *
 * без использования дополнительного массива
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class RotateArray {
    public int[][] rotate(int[][] array) {
        //для удобства составления формул используется дополнительная переменная
        int arL = array.length - 1;
        for (int i = 0; i <= array.length / 2; i++) {
            for (int j = i; j < arL - i; j++) {
                //переменная temp используется для перестановки значений
                int temp = array[arL - j][i];
                array[arL - j][i] = array[arL - i][arL - j];
                array[arL - i][arL - j] = array[j][arL - i];
                array[j][arL - i] = array[i][j];
                array[i][j] = temp;
            }
        }
        return array;
    }
}
