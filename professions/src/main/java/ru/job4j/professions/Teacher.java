package ru.job4j.professions;

/**
 * Класс Учитель, дочерний к классу Профессии.
 */
public class Teacher extends Profession {

    /**
     * Наименование педагогического института.
     */
    private String pedInstitute;

    /**
     * Сеттер.
     * @param pedInstitute - педагогический институт.
     */
    public void setPedInstitute(String pedInstitute) {
        this.pedInstitute = pedInstitute;
    }

    /**
     * Геттер.
     * @return - возращает педагогический институт.
     */
    public String getPedInstitute() {
        return this.pedInstitute;
    }

    /**
     * Степень учителя.
     */
    private String grade;

    /**
     * Сеттер.
     * @param grade - степень.
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Геттер.
     * @return - степень учителя.
     */
    public String getGrade() {
        return this.grade;
    }

    /**
     * Критическая статья.
     */
    private String criticalArticle;

    /**
     * Сеттер.
     * @param criticalArticle - критическая статья.
     */
    public void setCriticalArticle(String criticalArticle) {
        this.criticalArticle = criticalArticle;
    }

    /**
     * Геттер.
     * @return - возвращает критическую статью.
     */
    public String getCriticalArticle() {
        return criticalArticle;
    }

    /**
     * Учитель учит студентов и получает Выпускников.
     * @param student - студент.
     * @return - возвращает Выпускника.
     */
    public Graduate teach(Student student) {
        Graduate newGraduate = new Graduate(student.getName());
        return newGraduate;
    }

    /**
     * Учитель пишет Заметки.
     * @param outline - заметка.
     * @return - возращает строку вида "Teacher %NAME% write %OUTLINE.NAME%
     */
    public String write(Outline outline) {
        return (this.getClass().getSimpleName() + " " + this.getName() + " write " + outline.getClass().getSimpleName());
    }
}
