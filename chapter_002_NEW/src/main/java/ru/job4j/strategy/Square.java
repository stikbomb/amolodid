package ru.job4j.strategy;

/** Квадрат. */
public class Square implements Shape {

    /**
     * Отвечает за прорисовку квадрата.
     * @return - возращаем отформатированную строку.
     */
    public String pic() {

        StringBuilder figure = new StringBuilder();
        figure.append("++++");
        figure.append(System.getProperty("line.separator"));
        figure.append("++++");
        figure.append(System.getProperty("line.separator"));
        figure.append("++++");
        figure.append(System.getProperty("line.separator"));
        figure.append("++++");
        return figure.toString();

    }
}
