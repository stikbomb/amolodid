package ru.job4j.condition;

/**
 * Condition point.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Point {

    /**
     * Поле - координата X.
     */
    private int x;

    /**
     * Поле - координата Y.
     */
    private int y;

    /**
     * Присваивает координаты точке.
     * @param x - координата Х
     * @param y - координата Y
     */
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает значение координаты Х.
     * @return - возращает значение Х.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Возвращает значение координаты Y.
     * @return - возращает значение Y.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Проверяет принадлежность точки графику.
     * @param a - координата X
     * @param b - координата Y
     * @return - возрать значения true/false
     */
    public boolean is(int a, int b) {
        return (getY() == a * getX() + b);
    }

    /**
     * Возращает расстояние между точками.
     * @param that - передаваемые значения
     * @return - возрат расстояния
     */
    public double distance(Point that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}