package org.bookstore.interceptor;

import org.bookstore.annotation.interception.bindig.Loggable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

/**
 * Перехватчик записывает в журнал методы при входе и при выходе
 * Класс LoggingInterceptor определяет связь с перехватчиком @Loggable (с помощью @Interceptor)
 * и может впоследствии применяться в любом компоненте
 */

@Interceptor
@Loggable
public class LoggingInterceptor {
    @Inject
    private Logger logger;

    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception{
        logger.entering(ic.getTarget().getClass().getName(),
                ic.getMethod().getName());
        try {
            //вызов следующего метода перехватчика по цепочке
            return ic.proceed();
        } finally {
            logger.exiting(ic.getTarget().getClass().getName(),
                    ic.getMethod().getName());
        }
    }
}
