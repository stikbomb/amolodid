package ru.job4j.tracker;


/**
 * Стартует программу.
 */
public class StartUI {

    /**
     * Допустимые ответы.
     */
    private int[] ranges = new int[] {0, 1, 2, 3, 4, 5};


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
    public StartUI(Input input, Tracker tracker) {
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
            int key = input.ask("Select: ", ranges);
        } while (!"Y".equals(this.input.ask("Exit? (Y or N)")));
    }


    /**
     * Точка входа в программу.
     * @param args - стандартный аргумент
     */
    public static void main(String[] args) {
        new StartUI(
                new ValidateInput(
                        new ConsoleInput()
                ),
                new Tracker()
        ).init();
    }
}
