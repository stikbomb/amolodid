package ru.job4j.array;

/**
 * Программа для проверка содержания одной строки в другой.
 *
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class StringContain {

    /**
     * Проверяет содержание одной строки в другой.
     *
     * @param origin - строка, в которой проверяется содержание
     * @param sub    - строка, содержание которой проверяется
     * @return - возврат значения true/false
     */
    public boolean contains(String origin, String sub) {
        Boolean contain = false;
        //переменная index считает количество совпавших подряд символов
        int index = 0;
        //преобразуем обе строки в массивы символов
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        //сравниваем все символы из исходной строки с первым символом подстроки
        for (int i = 0; i <= originArray.length - subArray.length; i++) {
            //если первый символ подстроки совпал с символом из исходной строки,
            // запускаем проверку всех символов подстроки
            if (subArray[0] == originArray[i]) {
                for (int j = 0; j < subArray.length; j++) {
                    if (subArray[j] == originArray[i]) {
                        index++;
                        i++;
                    } else {
                        //если один их элементов не прошёл проверку - обнуляем index,
                        //возвращаем исходное значение i, продолжаем проверку
                        i -= index;
                        index = 0;
                    }
                }
            }
        }
        //если число совпавших подряд символов равно длине подстроки, возвращаем TRUE
        if (index == subArray.length) {
            contain = true;
        }
        return contain;
    }
}