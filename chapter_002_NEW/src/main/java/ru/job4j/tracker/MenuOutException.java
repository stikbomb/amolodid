package ru.job4j.tracker;

/**
 * Отвечает за обработку ошибок.
 */
class MenuOutException extends RuntimeException {

    /**
     * Сообщение в случае ошибки.
     * @param msg - такст сообщения
     */
    MenuOutException(String msg) {
        super(msg);
    }
}
