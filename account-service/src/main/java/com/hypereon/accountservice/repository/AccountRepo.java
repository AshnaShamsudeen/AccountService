package com.hypereon.accountservice.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hypereon.accountservice.model.Account;

public interface AccountRepo extends MongoRepository <Account,Long> {
public Optional<Account> findByAccountId(Long accountId);
    
}
