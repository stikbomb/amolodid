package ru.job4j.max;

/**
 * Max of 2.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {
    /**
     * Метод определение наибольшего числа.
     * @param a - первое число.
     * @param b - второе число.
     * @return - возврат значения.
     */
    public int max(int a, int b){
        return (a <= b ? b : a);
    }
}