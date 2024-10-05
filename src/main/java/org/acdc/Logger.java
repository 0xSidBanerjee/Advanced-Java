package org.acdc;

import java.util.function.Function;

@FunctionalInterface
public interface Logger {
    void log(String message);

    default void logWithPrefix(String prefix, String message) {
        log(prefix + ": " + message);
    }

    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_RESET = "\u001B[0m";

    static Logger getDefaultLogger() {
        return message -> System.out.println(ANSI_RED + message + ANSI_RESET);
    }

    default void logWithTransformation(Function<String, String> transform, String message) {
        log(transform.apply(message));
    }
}
