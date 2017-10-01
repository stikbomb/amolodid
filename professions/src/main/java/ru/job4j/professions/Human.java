package ru.job4j.professions;

/**
 * Класс Человек, родитель всех классов, относящихся к людям, кроме Профессий и Студента.
 */
public class Human {
    /**
     * Имя человека.
     */
    private String name;

    /**
     * Возвраст человека.
     */
    private int age;

    /**
     * Возвращает имя.
     * @return - возврат имени
     */
    public String getName() {
        return this.name;
    }

    /**
     * Устанавливает имя.
     * @param name - имя.
     */
    public void setName(String name) {
        this.name = name;
    }
}

/**
 * Класс Студент, дочерний к классу Человек.
 */
class Student extends Human {

}

/**
 * Класс Пациент, дочерний к классу Человек.
 */
class Patient extends Human {

}

/**
 * Класс Рабочий, дочерний к классу Человек.
 */
class Worker extends Human {

}

/**
 * Класс Выпускник, дочерний к классу Студент.
 */
class Graduate extends Student {

    /**
     * Конструктор класса.
     * @param name - имя Выпускника.
     */
    Graduate(String name) {
        this.setName(name);
    }

}
