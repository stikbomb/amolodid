package ru.job4j.tracker;


/**
 * Стартует программу.
 */
public class StartUI {

    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Сам трекер.
     */
    private final Tracker tracker;

    /**
     * Конструктор.
     * @param tracker - трекер
     * @param input - ввод данных
     */
    public StartUI(Tracker tracker, Input input) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * ОСновной цикл программы.
     */
    public void init() {
//        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        System.out.println("Welcome to Tracker v. 0.1");
        do {
            menu.show();
            System.out.println();
            try {
                int key = Integer.valueOf(input.ask("Select: "));
                if (key <= 5 && key >= 0) {
                    menu.select(key);
                } else {
                    System.out.println("Wrong choice, please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong choice, please try again.");
            }
        } while (!"Y".equals(this.input.ask("Exit? (Y or N)")));
    }


    /**
     * Точка входа в программу.
     * @param args - стандартный аргумент
     */
    public static void main(String[] args) {
        new StartUI(new Tracker(), new ConsoleInput()).init();
    }
}
