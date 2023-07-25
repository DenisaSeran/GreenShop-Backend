package com.deni.GreenShop.Errors;

public class DeleteCustomerNotFoundException extends Exception{
    public DeleteCustomerNotFoundException() {
        super();
    }

    public DeleteCustomerNotFoundException(String message) {
        super(message);
    }

    public DeleteCustomerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteCustomerNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DeleteCustomerNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
