package ru.job4j.loop;

/**
 * Построение пирамиды по заданной высоте.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Paint {

    /**
     * Создаёт новый объект класса StringBuilder.
     */
    private StringBuilder builder = new StringBuilder();

    /**
     * Рисует пирамиду заданной высота.
     * @param h - высота пирамиды
     * @return - массив в виде строки
     */
    public String piramid(int h) {

        for (int i = 1; i <= h; i++) {

            //цикл для построения отступов слева
            for (int s1 = h - i; s1 > 0; s1--) {
                builder.append(" ");
            }

            //цикл для построения "тела" пирамиды
            for (int k = 1; k <= (i * 2 - 1); k++) {
                builder.append("^");
            }

            //цикл для построения отступов справа
            for (int s2 = h - i; s2 > 0; s2--) {
                builder.append(" ");
            }

            //перенос каретки после построения строки
            builder.append(System.getProperty("line.separator"));
        }

        //возврат построенной пирамиды
        return builder.toString();
    }
}