package ru.job4j.professions;

/**
 * Класс Доктор, дочерний к классу Профессии.
 */
public class Doctor extends Profession {

    /**
     * Наименование медицинского института.
     */
    private String medInstitute;

    /**
     * Категория специалиста.
     */
    private String category;

    /**
     * Научные публикации.
     */
    private String scientPublication;

    /**
     * Сеттер.
     * @param medInstitute - мелицинский институт.
     */
    public void setMedInstitute(String medInstitute) {
        this.medInstitute = medInstitute;
    }

    /**
     * Геттер.
      * @return - возращает наименование медицинского иститута.
     */
    public String getMedInstitute() {
        return this.medInstitute;
    }

    /**
     * Сеттер.
     * @param category - категория врача.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Геттер.
     * @return - возращает категорию врача.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Сеттер.
     * @param scientPublication - научные публикации.
     */
    public void setScientPublication(String scientPublication) {
        this.scientPublication = scientPublication;
    }

    /**
     * Геттер.
     * @return - возращает науные публикации.
     */
    public String getScientPublication() {
        return this.scientPublication;
    }

    /**
     * Лечит пациента.
     * @param patient - наименование пациента.
     * @return - возращает строку вида "Doctor %NAME% heal patient %NAME%"
     */
    public String heal(Patient patient) {
        return (this.getClass().getSimpleName() + " " + getName() + " heal patient" + patient.getName());
    }

    /**
     * Пишет рецепты.
     * @param recipe - наименование рецепта.
     * @return - возращает строку вида "Doctor %NAME% write recipe # %NUMBER%"
     */
    public String write(Recipe recipe) {
        return (this.getClass().getSimpleName() + " write recipe №" + recipe.getNumber());
    }
}
