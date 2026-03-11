package com.loan.service;

import java.util.List;

import com.loan.entity.DematAccount;

public interface DematService {

    DematAccount createAccount(DematAccount account);

    DematAccount getAccountById(int accountId);

    List<DematAccount> getAllAccounts();

    List<DematAccount> getAccountsByCustomerId(int customerId);

    DematAccount updateAccountStatus(int accountId, String status);

    void deleteAccount(int accountId);
}