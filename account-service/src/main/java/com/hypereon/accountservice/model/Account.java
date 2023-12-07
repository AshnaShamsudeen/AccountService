package com.hypereon.accountservice.model;

import java.time.LocalDateTime;
import java.util.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account {

    private long accountId;
    private List<String> accountManager;
    private String accountName;
    private List<String> hiringManager;
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public Account() {
    }

    public Account(long accountId, List<String> accountManager, String accountName, List<String> hiringManager,
            LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.accountId = accountId;
        this.accountManager = accountManager;
        this.accountName = accountName;
        this.hiringManager = hiringManager;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

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

    public void setHiringNanager(List<String> hiringNanager) {
        this.hiringManager = hiringNanager;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public Account orElseThrow(Object object) {
        return null;
    }

}
