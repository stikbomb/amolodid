package ru.job4j.strategy;

/** Треугольник. */
public class Triangle implements Shape {

    /**
     * Отвечает за прорисовку треугольника.
     * @return - возращаем отформатированную строку.
     */

    public String pic() {
        StringBuilder fig = new StringBuilder();
        fig.append("  +  ");
        fig.append(System.getProperty("line.separator"));
        fig.append(" +++ ");
        fig.append(System.getProperty("line.separator"));
        fig.append("+++++");
        return fig.toString();

    }
}
