package org.bookstore;

import org.bookstore.pojo.Book;
import org.bookstore.service.BookService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BookServiceIT {
    @Test
    public void shouldCheckNumberIsMOCK() {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        BookService bookService = container.instance().select(BookService.class).get();
        Book book = bookService.createBook("Книга_1", 15.3f, "Описание_книги_1");
        assertTrue(book.getNumber().startsWith("MOCK"));
        weld.shutdown();
    }
}
