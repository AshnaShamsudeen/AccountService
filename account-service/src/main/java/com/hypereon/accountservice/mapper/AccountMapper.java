package com.hypereon.accountservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.hypereon.accountservice.dto.AccountDto;
// import com.hypereon.accountservice.dto.AccountResponse;
import com.hypereon.accountservice.model.Account;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountMapper mapper=Mappers.getMapper(AccountMapper.class);
    AccountDto mapToAccountDto(Account account);

   

 
}
