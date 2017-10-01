package ru.job4j.professions;

/**
 * Класс машина.
 */
public class Car {

    /**
     * Модель машины.
     */
    private String model;

    /**
     * Цвет машины.
     */
    private String color;

    /**
     * Геттер модели.
     * @return - возращает модель машины.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Геттер цвета.
     * @return - возвращает цвет машины.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Конструктор, учитывающий только модель.
     * @param model - модель машины.
     */
    public Car(String model) {
        this.model = model;
    }

    /**
     * Конструктор, учитывающий модель и цвет машины.
     * @param model - модель машины
     * @param color - цвет машины
     */
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
