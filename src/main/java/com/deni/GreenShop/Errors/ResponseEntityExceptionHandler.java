package com.deni.GreenShop.Errors;

import com.deni.GreenShop.Models.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@ResponseStatus
public class ResponseEntityExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    //Product Exception Handlers
            @ExceptionHandler(ProductNotFoundException.class)
            public ResponseEntity<ErrorMessage> productNotFoundException(ProductNotFoundException exception, WebRequest request) {
                ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(message);
            }
            @ExceptionHandler(DeleteProductNotFoundException.class)
            public ResponseEntity<ErrorMessage> deleteProductNotFoundException(DeleteProductNotFoundException exception, WebRequest request) {
                ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(message);
            }
    //Store Exception Handlers
            @ExceptionHandler(StoreNotFoundException.class)
            public ResponseEntity<ErrorMessage> storeNotFoundException(StoreNotFoundException exception, WebRequest request){
                ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(message);
            }

            @ExceptionHandler(DeleteStoreNotFoundException.class)
            public ResponseEntity<ErrorMessage> deleteStoreNotFoundException(DeleteStoreNotFoundException exception, WebRequest request){
                ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(message);
            }
    //Customer Exception Handlers
            @ExceptionHandler(CustomerNotFoundException.class)
            public ResponseEntity<ErrorMessage> customerNotFoundException(CustomerNotFoundException exception, WebRequest request){
                ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(message);
            }
            @ExceptionHandler(DeleteCustomerNotFoundException.class)
            public ResponseEntity<ErrorMessage> deleteCustomerNotFound(DeleteCustomerNotFoundException exception, WebRequest request){
                ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(message);
            }

}
