package ru.job4j.strategy;

/**
 * Отвечает за прорисовку фигур.
 */
public class Paint {


    /**
     * Прорисовывает фигуру в зависимости от параметра.
     * @param shape - тип фигуры
     * @return - возвращает отформатированную строку псевдографики.
     */
    public String draw(Shape shape) {
        return shape.pic();
    }
}
