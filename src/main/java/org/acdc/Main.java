package org.acdc;

public class Main {
    public static void main(String[] args) {
        Logger upperCaseLogger = (message) -> System.out.println(message.toUpperCase());

        upperCaseLogger.log("This is a simple message");

        upperCaseLogger.logWithPrefix("INFO", "This is a prefixed message");

        Logger redLogger = Logger.getDefaultLogger();
        redLogger.log("This is a default logger message");

        upperCaseLogger.logWithTransformation(message -> message.substring(0, 10), "Autobots Rollout!");
    }
}