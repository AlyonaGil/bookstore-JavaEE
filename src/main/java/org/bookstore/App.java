package org.bookstore;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.bookstore.pojo.Book;
import org.bookstore.service.BookService;

/**
 * Класс org.bookstore.App использует контейнер CDI для вызова BookService
 */

public class App {
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        BookService bookService =
                container.instance().select(BookService.class).get();
        Book book = bookService.createBook("Книга_1", 15.3f, "Описание_книги_1");
        System.out.println(book);
        weld.shutdown();
    }
}
