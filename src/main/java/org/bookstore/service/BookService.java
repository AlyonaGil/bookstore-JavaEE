package org.bookstore.service;

import org.bookstore.annotation.interception.bindig.Loggable;
import org.bookstore.annotation.qualifier.ThirteenDigits;
import org.bookstore.pojo.Book;

import javax.inject.Inject;

/**
 * BookService, использующий внедрение зависимости и перехват
 * (перехватчик @Loggable - регистрирует момент входа в метод
 * и выхода из него.
 */

@Loggable
public class BookService {
    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;
    public Book createBook(String title, Float price, String desc){
        Book book = new Book(title, price, desc);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }
}
