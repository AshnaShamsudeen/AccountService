package com.hypereon.accountservice.dto;

import java.util.List;

public class AccountDto {
    private long accountId;
    private List<String> accountManager;
    private String accountName;
    private List<String> hiringManager;
    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public List<String> getAccountManager() {
        return accountManager;
    }
    public void setAccountManager(List<String> accountManager) {
        this.accountManager = accountManager;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public List<String> getHiringManager() {
        return hiringManager;
    }
    public void setHiringManager(List<String> hiringManager) {
        this.hiringManager = hiringManager;
    }
    public AccountDto(long accountId, List<String> accountManager, String accountName, List<String> hiringManager) {
        this.accountId = accountId;
        this.accountManager = accountManager;
        this.accountName = accountName;
        this.hiringManager = hiringManager;
    }
    
    public AccountDto() {
    }


    




    

    
}
