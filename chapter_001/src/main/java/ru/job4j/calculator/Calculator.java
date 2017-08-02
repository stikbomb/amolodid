package ru.job4j.calculator;

/**
 * Calculate.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Calculator {

	/**
	* поле класса.
	*/
	private double result;

	/**
	* метод сложение.
	* @param first - первая переменная;
	* @param second - вторая переменная;
	*/
	public void add(double first, double second) {
        this.result = first + second;
    }

	/**
	* метод вычитание.
	* @param first - первая переменная;
	* @param second - вторая переменная;
	*/
	public void subtract(double first, double second) {
        this.result = first - second;
    }

	/**
	* метод деление.
	* @param first - первая переменная;
	* @param second - вторая переменная;
	*/
	public void div(double first, double second) {
        this.result = first / second;
    }

	/**
	* метод умножение.
	* @param first - первая переменная;
	* @param second - вторая переменная;
	*/
	public void multiple(double first, double second) {
        this.result = first * second;
    }

	/**
	* возврат результата.
	* @return возрат результат сложения
	*/
    public double getResult() {
        return this.result;
    }
}