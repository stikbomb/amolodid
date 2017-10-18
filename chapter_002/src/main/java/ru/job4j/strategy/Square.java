package ru.job4j.strategy;

/** Квадрат. */
public class Square implements Shape {

    /**
     * Отвечает за прорисовку квадрата.
     * @return - возращаем отформатированную строку.
     */
    public String pic() {

        StringBuilder fig = new StringBuilder();
        fig.append("++++");
        fig.append(System.getProperty("line.separator"));
        fig.append("++++");
        fig.append(System.getProperty("line.separator"));
        fig.append("++++");
        fig.append(System.getProperty("line.separator"));
        fig.append("++++");
        return fig.toString();

    }
}
