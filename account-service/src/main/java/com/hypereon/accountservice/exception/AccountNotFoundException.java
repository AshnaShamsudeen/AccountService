package com.hypereon.accountservice.exception;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String message){
        super(message);    
    }
}
