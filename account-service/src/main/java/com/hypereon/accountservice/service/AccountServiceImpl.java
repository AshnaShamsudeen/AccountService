package com.hypereon.accountservice.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hypereon.accountservice.dto.AccountDto;
import com.hypereon.accountservice.dto.AccountResponse;
import com.hypereon.accountservice.exception.AccountAlreadyExistingException;
import com.hypereon.accountservice.exception.AccountNotFoundException;
import com.hypereon.accountservice.mapper.AccountMapper;
import com.hypereon.accountservice.model.Account;
import com.hypereon.accountservice.repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepo repo;

    @Autowired
    AccountMapper accMapper;

    @Autowired
    ObjectMapper objectMapper; // Autowire ObjectMapper bean

    @Override
    public AccountDto findAccountById(Long accountId) {
        Account newAccount=  repo.findByAccountId(accountId).orElseThrow(()->
        new AccountNotFoundException("Account with id " + accountId + " not found"));
      return accMapper.mapToAccountDto(newAccount);
    }
   
    @Override

     public AccountResponse addAccountFromJson() {
    // public List<Account> addAccountFromJson() {
        List<AccountDto> addedAccounts = new ArrayList<>();
        List<String> errorMessage = new ArrayList<>();

        ObjectMapper objMapper = new ObjectMapper();
        try {
            File mockData = new File("src\\main\\java\\com\\hypereon\\accountservice\\MOCK_DATA.json");
            List<Account> accounts = objMapper.readValue(mockData, new TypeReference<List<Account>>() {
            });
            for (Account account : accounts) {
                Optional<Account> optAccount = repo.findByAccountId(account.getAccountId());
                
                    if (optAccount.isEmpty()) {
                        repo.save(account);
                        addedAccounts.add((accMapper.mapToAccountDto(account)));
                    }  else {
                        errorMessage.add("Account with id " + account.getAccountId() + " already exists.");
                    }
               
            }
        } catch (IOException e) {
            // Handle the IO exception
            e.printStackTrace();
        }
        AccountResponse accountResponse=new AccountResponse(errorMessage,
        addedAccounts);
        return accountResponse;
       // return addedAccounts;
    }

    @Override
    public List<AccountDto> findAllAccount() {
        List<AccountDto> accDtoList= new ArrayList<>();
        List<Account> accList=repo.findAll();
        for(Account acc:accList)
        {
            accDtoList.add(accMapper.mapToAccountDto(acc));
        }
        return accDtoList;
    }

    @Override
    public AccountDto addNewAccount(Account account) {
        repo.findByAccountId(account.getAccountId()).ifPresent(existingAccount->{
        throw new AccountAlreadyExistingException("Account Already Exist");
        });
        repo.save(account);
        return accMapper.mapToAccountDto(account);
    }
}
