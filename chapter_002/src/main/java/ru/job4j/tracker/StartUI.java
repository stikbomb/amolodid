package ru.job4j.tracker;

/**
 *
 */


import java.util.Date;

/**
 * Отвечает за работу меню и работу с заявками.
 */
public class StartUI {
    /** Константа для меню - выход. */
    private static final String EXIT = "0";
    /** Константа для меню - добавить заявку. */
    private static final String ADD = "1";
    /** Константа для меню - показать все заявка. */
    private static final String SHOWALL = "2";
    /** Константа для меню - изменить. */
    private static final String EDIT = "3";
    /** Константа для меню - удалить. */
    private static final String DELETE = "4";
    /** Константа для меню - найти заявку по ID. */
    private static final String FINDBYID = "5";
    /** Константа для меню - найти заявку по имени. */
    private static final String FINDBYNANE = "6";

    /** Интерфейс. */
    private Input input;

    /** Трекер. */
    private Tracker tracker;

    /**
     * Запуск оболочки.
     * @param input - интерфейс
     */
    public StartUI(Input input) {
        this.input = input;
    }

    /**
     * Запуск оболочки.
     * @param input - интерфейс
     * @param tracker - трекер
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Показывает полные данные о заявке.
     * @param item - передаваемая заявка
     */
    public void showItem(Item item) {
        System.out.println();
        System.out.println("Name: " + item.getName());
        System.out.println("ID: " + item.getId());
        System.out.println("Description: " + item.getDescription());
        Date d = new Date(item.getCreate());
        System.out.println("Created: " + d);
        if (item.getUpdate() != 0) {
            System.out.println(item.getUpdate());
        }
        System.out.println();
    }

    /**
     * Создаёт заявку.
     * @param input - интерфейс
     * @param tracker - трекер
     */
    public void createItem(Input input, Tracker tracker) {
        System.out.println();
        String name = input.ask("What's name of Item?");
        String desc = input.ask("What's description of Item?");
        //Date newDate = new Date();
        tracker.add(new Item(name, desc, System.currentTimeMillis()));
    }

    /**
     * Показывает все заявки.
     * @param tracker - трекер
     */
    public void showAll(Tracker tracker) {
        for (Item item : tracker.findAll()) {
            showItem(item);
        }
    }

    /**
     * Изменяет заявку.
     * @param input - интерфейс
     * @param tracker - трекер
     */
    public void editItem(Input input, Tracker tracker) {
        System.out.println();
        String id = input.ask("What's ID of Item you want to edit?");
        if (tracker.findById(id) == null) {
            System.out.println("Wrong ID. Try again!");
            return;
        }
        String name = input.ask("What's name of Item?");
        String desc = input.ask("What's description of Item?");
        long create = tracker.findById(id).getCreate();
        //Date newDate2 = new Date();
        tracker.update(new Item(id, name, desc, create, System.currentTimeMillis()));
    }

    /**
     * Удаляет заявку.
     * @param input - интерфейс
     * @param tracker - трекер
     */
    public void deleteItem(Input input, Tracker tracker) {
        System.out.println();
        String id = input.ask("What's ID of Item you want to delete?");
        if (tracker.findById(id) == null) {
            System.out.println("Wrong ID. Try again!");
        } else if (input.ask("Are you sure? Type \"YES\" to continue.").equals("YES")) {
            tracker.delete(tracker.findById(id));
        } else {
            System.out.println("Aborted! Wrong word!");
        }
    }

    /**
     * Ищет заявку по ID.
     * @param input - интерфейс
     * @param tracker - трекер
     */
    public void findItemById(Input input, Tracker tracker) {
        System.out.println();
        String id = input.ask("What's ID of item you want to find?");
        if (tracker.findById(id) == null) {
            System.out.println("Wrong ID. Try again!");
        } else {
            showItem(tracker.findById(id));
        }
    }

    /**
     * Ищет заявку по имени.
     * @param input - интерфейс
     * @param tracker - трекер
     */
    public void findItemsByName(Input input, Tracker tracker) {
        System.out.println();
        String name = input.ask("What's name of item ypu want to find?");
        System.out.println();
            for (Item item : tracker.findByName(name)) {
                showItem(item);
            }
    }

    /** Запускает и продолжает работу меню. */
    public void init() {
        printWelcome();
        System.out.println();
        String answer = null;
        while (!EXIT.equals(answer)) {
            printMenu();
            answer = input.ask("Select:");
            switch (answer) {
                case ADD:
                    this.createItem(input, tracker);
                    break;
                case SHOWALL:
                    this.showAll(tracker);
                    break;
                case EDIT:
                    this.editItem(input, tracker);
                    break;
                case DELETE:
                    this.deleteItem(input, tracker);
                    break;
                case FINDBYID:
                    this.findItemById(input, tracker);
                    break;
                case FINDBYNANE:
                    this.findItemsByName(input, tracker);
                    break;
                default:
                    break;
            }
        }
        if (EXIT.equals(answer)) {
            System.out.println();
            System.out.println("See you soon, my little friend!");
        }
    }

    /**
     * Точка входа в программу.
     * @param args - стандарт
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }

    /** Выводит приветствие. */
    public void printWelcome() {
        System.out.println("Hello, my little friend! Let's call me Master of tracker!");
    }
    /** Выводит меню. */
    public void printMenu() {
        System.out.println();
        System.out.println("Choose item from menu (digit from 0 to 6):");
        System.out.println("1. Add new Item");
        System.out.println("2. Show all items");
        System.out.println("3. Edit item");
        System.out.println("4. Delete item");
        System.out.println("5. Find items by ID");
        System.out.println("6. Find items by name");
        System.out.println("0. Exit Program");
    }
}

