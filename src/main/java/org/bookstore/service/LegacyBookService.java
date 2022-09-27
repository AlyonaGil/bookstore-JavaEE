package org.bookstore.service;

import org.bookstore.annotation.qualifier.EightDigits;
import org.bookstore.pojo.Book;

import javax.inject.Inject;


public class LegacyBookService {
    @Inject @EightDigits
    private NumberGenerator numberGenerator;
    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }
}
