package ru.job4j.loop;

/**
 * Вычисление факториала заданного числа
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Board {
    StringBuilder builder = new StringBuilder();

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


















