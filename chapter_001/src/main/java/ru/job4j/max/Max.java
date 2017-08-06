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
     * Метод определение наибольшего числа их двух.
     * @param a - первое число.
     * @param b - второе число.
     * @return - возврат значения.
     */
    public int max(int a, int b){

        return (a <= b ? b : a);
    }
	/**
     * Метод определение наибольшего числа их трёх.
     * @param a - первое число.
     * @param b - второе число.
	 * @param c - третье число.
     * @return - возврат значения.
     */
	public int max(int a, int b, int c) {
		return max(max(a, b), c);
		}
}