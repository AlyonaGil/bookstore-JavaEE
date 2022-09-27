package org.bookstore.service.impl;

import org.bookstore.annotation.interception.bindig.Loggable;
import org.bookstore.annotation.qualifier.ThirteenDigits;
import org.bookstore.service.NumberGenerator;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * IsbnGenerator генерирует тринадцатизначный номер
 */

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Сгенерирован ISBN: " + isbn);
        return isbn;
    }
}
