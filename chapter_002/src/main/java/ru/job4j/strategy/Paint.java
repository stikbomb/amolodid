package ru.job4j.strategy;

/**
 * Отвечает за прорисовку фигур.
 */
public class Paint {

    /** Определяет стратегию. */
    private Shape shape;

    /**
     * Прорисовывает фигуру в зависимости от параметра.
     * @param shape - тип фигуры
     * @return - возвращает отформатированную строку псевдографики.
     */
    public String draw(Shape shape) {
        this.shape = shape;
        return shape.pic();
    }
}
