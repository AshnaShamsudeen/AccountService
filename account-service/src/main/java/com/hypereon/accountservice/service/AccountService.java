package com.hypereon.accountservice.service;

import java.util.List;

import com.hypereon.accountservice.dto.AccountDto;
import com.hypereon.accountservice.dto.AccountResponse;
// import com.hypereon.accountservice.dto.AccountResponse;
import com.hypereon.accountservice.model.Account;

public interface AccountService  {

    public AccountDto findAccountById(Long accountId);
    public AccountDto addNewAccount(Account account);
    public List<AccountDto> findAllAccount();
    // public List<Account> addAccountFromJson();
    public AccountResponse addAccountFromJson();
  
}
