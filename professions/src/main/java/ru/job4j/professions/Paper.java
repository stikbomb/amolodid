package ru.job4j.professions;

/**
 * Класс Бамага, родительский класс для всех "бумажных" классов в этом приммере.
 */
public class Paper {

    /**
     * Имя.
     */
    private String name;

    /**
     * Сеттер.
     * @param name - имя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер.
     * @return - возвращает имя.
     */
    public String getName() {
        return this.name;
    }

}

/**
 * Класс Мануал (Руководство), дочерний к классу Бумага.
 */
class Manual extends Paper {

    /**
     * Конструктор.
     * @param name - имя.
     */
    Manual(String name) {
        this.setName(name);
    }
}

/**
 * Класс Заметка, дочерний к классу Бумага.
 */
class Outline extends Paper {

}

/**
 * Класс Рецепт, дочерний к класса Бумага.
 */
class Recipe extends Paper {
    /**
     * Номер рецепта.
     */
    private int number;

    /**
     * Сеттер.
     * @param number - имя.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Геттер.
     * @return - возвращает имя.
     */
    public int getNumber() {
        return this.number;
    }
}

/**
 * Класс Чертёж, дочерний к классу Бумага.
 */
class Blueprint extends Paper {

}

/**
 * Класс Проект, дочерний к классу Бумага.
 */
class Project extends Paper {

}

/**
 * Класс Конспект, дочерний к классу Бумага.
 */
class Conspect extends Paper {

    /**
     * Конструктор.
     * @param name - имя.
     */
    Conspect(String name) {
        this.setName(name);
    }

}