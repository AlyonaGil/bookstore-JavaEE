package org.bookstore.service;

import org.bookstore.annotation.interception.bindig.Loggable;
import org.bookstore.annotation.qualifier.ThirteenDigits;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Имитационный генератор чисел, применяемый в качестве
 * альтернативы тринадцатизначного числа
 */

@Alternative @ThirteenDigits
public class MockGenerator implements NumberGenerator {
    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String mock = "MOCK-" + Math.abs(new Random().nextInt());
        logger.info("Сгенерирован Mock: " + mock);
        return mock;
    }
}
