package ru.job4j.tracker;

/**
 * Отвечает за редактирвование заявки.
 */
class EditItem implements UserAction {

    /**
     * Возвращает ключ.
     * @return - возвращает ключ
     */
    public int key() {
        return 2;
    }

    /**
     * Основная часть действий.
     * @param input - инпут
     * @param tracker - трекер
     */
    public void execute(Input input, Tracker tracker) {
        if (tracker.checkEmptyArray()) {
            System.out.println();
            System.out.println("========EDIT THE ITEM==========");
            String id = input.ask("Please, enter the task's id to edit;");
            if (tracker.checkId(id)) {
                String name = input.ask("Please, enter the task's new name: ");
                String desc = input.ask("Please, enter the task's new description: ");
                Item item = new Item(name, desc, id, tracker.findById(id).getCreate(), System.currentTimeMillis());
                tracker.replace(id, item);
                System.out.println(String.format("%s %s %s", "Item with ID", id, "was edited."));
                System.out.println();
            }
        }
    }

    /**
     * Информация о действии.
     * @return - возвращает строку для пункта меню
     */
    public String info() {
        return String.format("%s. %s", this.key(), "Edit the item.");
    }
}

/**
 * Отвечает за удаление заявки.
 */
class DeleteItem implements UserAction {

    /**
     * Возвращает ключ.
     * @return - возвращает ключ
     */
    public int key() {
        return 3;
    }

    /**
     * Основная часть действий.
     * @param input - инпут
     * @param tracker -трекер
     */
    public void execute(Input input, Tracker tracker) {
        System.out.println();
        System.out.println("==========DELETE THE ITEM==========");
        if (tracker.checkEmptyArray()) {
            String id = input.ask("Please, enter the task's id to delete:");
            if (tracker.checkId(id)) {
                tracker.delete(id);
                System.out.println(String.format("%s %s %s", "Item with ID", id, "was deleted."));
                System.out.println();
            }
        }
    }

    /**
     * Информация о действии.
     * @return - возвращает строку для пункта меню
     */
    public String info() {
        return String.format("%s. %s", this.key(), "Delete the item.");
    }
}

/**
 * Отвечает за организацию заявок через меню.
 */
public class MenuTracker {

    /**
     * Ввод данных.
     */
    private Input input;

    /**
     * Трекер.
     */
    private Tracker tracker;

    /**
     * Пункты меню.
     */
    private UserAction[] actions = new UserAction[6];

    /**
     * Конструктор.
     * @param input - инпут
     * @param tracker - трекер
     */
    MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Заполнение пунктов меню.
     */
    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = this.new FindItemByID();
        this.actions[5] = new MenuTracker.FindItemByName();
    }

    /**
     * Выбор пукнтов меню.
     * @param key - ключ
     */
    public void select(int key) {
        this.actions[key].execute(input, tracker);
    }

    /**
     * Отрисовка меню.
     */
    public void show() {
        System.out.println();
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Внутренний класс, отвечает за добавление заявки.
     */
    private class AddItem implements UserAction {
        /**
         * Возвращает ключ.
         * @return - возвращает ключ
         */
        public int key() {
            return 0;
        }

        /**
         * Основная часть действий.
         * @param input - инпут
         * @param tracker -трекер
         */
        public void execute(Input input, Tracker tracker) {
            System.out.println("==========ADD NEW TASK==========");
            String name = input.ask("Enter task's name: ");
            String description = input.ask("Enter task's description: ");
            Item item = new Item(name, description, System.currentTimeMillis());
            tracker.add(item);
            System.out.println("New task with ID " + item.getId() + " was added.");
            System.out.println();
        }

        /**
         * Информация о действии.
         * @return - возвращает строку для пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new Item.");
        }
    }

    /**
     * Внутренний класс, отвечает за поиск заявки по ID.
     */
    private class FindItemByID implements UserAction {
        /**
         * Возвращает ключ.
         * @return - возвращает ключ
         */
        public int key() {
            return 4;
        }

        /**
         * Основная часть действий.
         * @param input - инпут
         * @param tracker -трекер
         */
        public void execute(Input input, Tracker tracker) {
            if (tracker.checkEmptyArray()) {
                System.out.println();
                System.out.println("==========FIND THE TASK BY ID==========");
                String id = input.ask("Please enter the task's id to find:");
                if (tracker.checkId(id)) {
                    tracker.showItem(tracker.findById(id));
                    System.out.println();
                }
            }
        }

        /**
         * Информация о действии.
         * @return - возвращает строку для пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find the item by ID.");
        }

    }

    /**
     * Внутренний статичный класс, отвечает за показ всех зарегистрированных заявок.
     */
    private static class ShowItems implements UserAction {
        /**
         * Возвращает ключ.
         * @return - возвращает ключ
         */
        public int key() {
            return 1;
        }

        /**
         * Основная часть действий.
         * @param input - инпут
         * @param tracker -трекер
         */
        public void execute(Input input, Tracker tracker) {
            if (tracker.checkEmptyArray()) {
                System.out.println("==========SHOW ALL ITEMS==========");
                for (Item item : tracker.getAll()) {
                    tracker.showItem(item);
                }
            }
        }

        /**
         * Информация о действии.
         * @return - возвращает строку для пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items.");
        }
    }


    /**
     * Внутренний статичный класс, отвечает за поиск заявок по имени.
     */
    private static class FindItemByName implements UserAction {
        /**
         * Возвращает ключ.
         * @return - возвращает ключ
         */
        public int key() {
            return 5;
        }

        /**
         * Основная часть действий.
         * @param input - инпут
         * @param tracker -трекер
         */
        public void execute(Input input, Tracker tracker) {
            if (tracker.checkEmptyArray()) {
                String name = input.ask("Please enter the task's name to find: ");
                if (tracker.checkName(name)) {
                    System.out.println();
                    System.out.println("==========FIND ITEMS BY NAME==========");
                    for (Item item : tracker.findByName(name)) {
                        tracker.showItem(item);
                    }
                }
            }
        }

        /**
         * Информация о действии.
         * @return - возвращает строку для пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find items by name.");
        }
    }
}
