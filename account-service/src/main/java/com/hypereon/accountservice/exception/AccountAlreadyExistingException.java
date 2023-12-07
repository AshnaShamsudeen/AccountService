package com.hypereon.accountservice.exception;

public class AccountAlreadyExistingException extends RuntimeException {
    public AccountAlreadyExistingException (String message){
        super(message);
    }
    
}
