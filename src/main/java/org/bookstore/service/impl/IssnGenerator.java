package org.bookstore.service.impl;

import org.bookstore.annotation.interception.bindig.Loggable;
import org.bookstore.annotation.qualifier.EightDigits;
import org.bookstore.service.NumberGenerator;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * IssnGenerator генерирует восьмизначный номер
 */

@EightDigits
public class IssnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String issn =  "8-" + Math.abs(new Random().nextInt());
        logger.info("Сгенерирован ISBN: " + issn);
        return issn;
    }
}
