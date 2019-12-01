package com.example;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    @Test
    public void testBasic() {
        Logger logger = LoggerFactory.getLogger(this.getClass().getName());
        logger.debug("hello world");

        // 打印 logback 自己的状态
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);

    }
}
