package ru.job4j.loop;

/**
 * Рисование шахматной доски заданных размеров.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Board {

    /**
     * Создаёт новый класс StringBuilder.
     */
    private StringBuilder builder = new StringBuilder();

    /**
     * Рисует шахматную доску заданных размеров.
     * @param width - ширина доски
     * @param height - высота доски
     * @return - возвращает массив в виде строки
     */
    public String paint(int width, int height) {
        for (int index2 = 1; index2 <= height; index2++) {

            if (index2 % 2 != 0) {
                for (int index1 = 1; index1 <= width; index1++) {
                    if (index1 % 2 != 0) {
                        builder.append("x");
                    } else {
                        builder.append("  ");
                    }
                }
                builder.append(System.getProperty("line.separator"));

            } else {
                for (int index1 = 1; index1 <= width; index1++) {
                    if (index1 % 2 != 0) {
                        builder.append("  ");
                    } else {
                        builder.append("x");
                    }
                }
                builder.append(System.getProperty("line.separator"));
            }
        }
        return builder.toString();
    }

}


















