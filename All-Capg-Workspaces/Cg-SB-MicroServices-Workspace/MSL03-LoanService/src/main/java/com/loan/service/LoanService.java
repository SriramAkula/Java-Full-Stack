package com.loan.service;

import java.util.List;

import com.loan.entity.Loan;

public interface LoanService {

    Loan applyLoan(Loan loan);

    Loan getLoanById(int loanId);

    List<Loan> getAllLoans();

    List<Loan> getLoansByCustomerId(int customerId);

    Loan updateLoanStatus(int loanId, String status);

    void deleteLoan(int loanId);
}