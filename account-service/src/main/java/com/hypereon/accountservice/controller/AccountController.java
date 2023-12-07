package com.hypereon.accountservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hypereon.accountservice.dto.AccountDto;
import com.hypereon.accountservice.dto.AccountResponse;
import com.hypereon.accountservice.model.Account;
import com.hypereon.accountservice.service.AccountService;

@RestController
@RequestMapping("/api/account")
@CrossOrigin("*")
public class AccountController {
    @Autowired
    AccountService accountService;
    
    @GetMapping("/get")
    public ResponseEntity<AccountDto> getAccountById(@RequestParam Long accountId){
        return ResponseEntity.ok(accountService.findAccountById(accountId));
    }

    @PostMapping("/add")
    public ResponseEntity<AccountDto> addAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.addNewAccount(account));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<AccountDto>> getAllAccount(){
        return ResponseEntity.ok(accountService.findAllAccount());
    }

    @PostMapping("/addAll")
    public ResponseEntity<AccountResponse>addFromJson(){
        // public ResponseEntity<List<Account>>addFromJson(){
        return ResponseEntity.ok(accountService.addAccountFromJson());
    }

}
