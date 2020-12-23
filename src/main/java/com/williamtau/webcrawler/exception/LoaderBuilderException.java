package com.williamtau.webcrawler.exception;

/**
 * @author williamtau
 */
public class LoaderBuilderException extends RuntimeException {

    private String message;

    public LoaderBuilderException(String message) {
        this.message = message;
    }

    public LoaderBuilderException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public LoaderBuilderException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public LoaderBuilderException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public LoaderBuilderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }
}
