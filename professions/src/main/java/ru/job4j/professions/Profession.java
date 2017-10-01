package ru.job4j.professions;

/**
 * //TODO add comments.
 *
 * Задание на понимание взаимодуствия между классами.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Profession {

    /** Имя. */
    private String name;

    /**
     * Возраст.
     */
    private int age;

    /**
     * Пол.
     */
    private String sex;

    /**
     * Оконченное высшее учебное заведение.
     */
    private String highSchool;

    /**
     * Носит ли униформу на работе.
     */
    private boolean uniform;


    /**
     * Геттер.
     * @return - возвращает имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Сеттер.
     * @param name - имя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return - Возвращает возраст.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * @return - Возвращает пол.
     */
    public String getSex() {
        return this.sex;
    }

    /**
     * @return - Возвращает имя ВУЗа.
     */
    public String getHighSchool() {
        return this.highSchool;
    }

    /**
     * @return - Возвращает униформу (да/нет).
     */
    public boolean getUniform() {
        return this.uniform;
    }

    /**
     * Человек читает мануал и делает конспект.
     * @param manual - Имя экземпляра класса Manual
     * @return - возвращает конспект по прочитанному мануалу.
     */
    public Conspect read(Manual manual) {
        String consName = ("conspect of " + manual.getName());
        Conspect newConspect = new Conspect(consName);
        return newConspect;
    }

    /**
     * Человек ездит на машине.
     * @param car - машина.
     * @return - возвращает строку вида "%PROFESSION% %NAME% drive %CAR.MODEL%"
     */
    public String drive(Car car) {
        return (this.getClass().getSimpleName() + " " + this.getName() + " drive " + car.getModel());
    }
}