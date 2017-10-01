package ru.job4j.professions;

/**
 * Класс Инженер, дочерний к классу Профессии.
 */
public class Engineer extends Profession {

    /**
     * Наимменование инженерного института.
     */
    private String engInstitute;

    /**
     * Категория специалиста.
     */
    private String category;

    /**
     * Инженерные исследования.
     */
    private String engResearch;

    /**
     * Сеттер.
     * @param engInstitute - инженерный институт.
     */
    public void setEngInstitute(String engInstitute) {
        this.engInstitute = engInstitute;
    }

    /**
     * Геттер.
     * @return - инженерный институт.
     */
    public String getEngInstitute() {
        return this.engInstitute;
    }

    /**
     * Сеттер.
     * @param category - категория инженера.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Геттер.
     * @return - возвращает категорию инженера.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Сеттер.
     * @param engResearch - инжерные исследования.
     */
    public void setEngResearch(String engResearch) {
        this.engResearch = engResearch;
    }

    /**
     * Геттер.
     * @return - возращает инжереные исследования.
     */
    public String getEngResearch() {
        return engResearch;
    }

    /**
     * Инженер рисует чертежи и получает Проект.
     * @param blueprint - наименование чертежа.
     * @return - возвращает Проект.
     */
    public Project draw(Blueprint blueprint) {
        Project newProject = new Project();
        return newProject;
    }

    /**
     * Инженер управляет рабочим.
     * @param worker - рабочий.
     * @return - возвращает строку виду "Engineer %NAME% manage worker %NAME%"
     */
    public String manage(Worker worker) {
        return (this.getClass().getSimpleName() + " " + this.getName() + " manage worker " + worker.getName());
    }
}
