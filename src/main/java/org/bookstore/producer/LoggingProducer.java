package org.bookstore.producer;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

/**
 * Механизм записи в журнал
 */

public class LoggingProducer {
    /**
     * Создание Logger
     * @param injectionPoint точка внедрения
     * @return Logger
     */
    @Produces
    private Logger createLogger(InjectionPoint injectionPoint){
        return Logger.getLogger(
                injectionPoint
                .getMember()
                .getDeclaringClass()
                .getName());
    }
}
