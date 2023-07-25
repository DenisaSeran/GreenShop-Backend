package com.deni.GreenShop.Errors;

public class DeleteStoreNotFoundException extends Exception{
    public DeleteStoreNotFoundException() {
        super();
    }

    public DeleteStoreNotFoundException(String message) {
        super(message);
    }

    public DeleteStoreNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteStoreNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DeleteStoreNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
