package ChainofResponsibilityPattern;

import ChainofResponsibilityPattern.abstracts.AbstractLogger;
import ChainofResponsibilityPattern.concretes.ConsoleLogger;
import ChainofResponsibilityPattern.concretes.ErrorLogger;
import ChainofResponsibilityPattern.concretes.FileLogger;

public class ChainPatternDemo {
    private static AbstractLogger getChainOfLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information log!");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug log!");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error log!");

    }
}
