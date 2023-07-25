package com.deni.GreenShop.Errors;

public class DeleteProductNotFoundException extends Exception{
    public DeleteProductNotFoundException() {
        super();
    }

    public DeleteProductNotFoundException(String message) {
        super(message);
    }

    public DeleteProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteProductNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DeleteProductNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
