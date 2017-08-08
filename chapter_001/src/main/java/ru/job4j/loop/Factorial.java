package ru.job4j.loop;

/**
 * Вычисление факториала заданного числа
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {
    public int calc(int n){
        if (n == 0){
            return 1;
        }
        int factorial = 1;
        for (int index = 1; index <= n; index++) {
            factorial = factorial * index;
        }
        return factorial;
    }
}
