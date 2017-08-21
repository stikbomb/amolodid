package ru.job4j.condition;

/**
 * Square of Triangle.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Triangle {

    /**
     * Поле точка А.
     */
    private Point a;

    /**
     * Поле точка В.
     */
    private Point b;

    /**
     * Поле точка С.
     */
    private Point c;

    /**
     * Сохраняет координаты вершин треугольника.
     * @param a - точка А
     * @param b - точка В
     * @param c - точка С
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Вычисление площади треугольника. Старое решение.
     * Вопспользуемся формулой sqr = ((x1-x3)(y2-y3)-(x2-x3)(y1-y3))/2
     *
     * @return возращает значение площади треугольника
     */
    public double area() {
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        double p = (ab + ac + bc) / 2;
        if (ab + ac <= bc || ab + bc <= ac || bc + ac <= ab) {
            return -1;
        } else {
            return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
    }
}