package com.hypereon.accountservice.dto;

import java.util.ArrayList;
import java.util.List;

// import com.hypereon.accountservice.model.Account;

public class AccountResponse {

    private List<String> exceptionResponse=new ArrayList<>();
    private List<AccountDto> accounts=new ArrayList<>();


    public List<String> getExceptionResponse() {
        return exceptionResponse;
    }
    public void setExceptionResponse(List<String> exceptionResponse) {
        this.exceptionResponse = exceptionResponse;
    }
    public List<AccountDto> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<AccountDto> accounts) {
        this.accounts = accounts;
    }
    public AccountResponse(List<String> exceptionResponse, List<AccountDto> accounts) {
        this.exceptionResponse = exceptionResponse;
        this.accounts = accounts;
    }
    public AccountResponse() {
    }

    

    
}
