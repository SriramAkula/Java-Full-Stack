package com.loan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.entity.DematAccount;

public interface DematRepository extends JpaRepository<DematAccount, Integer> {

    List<DematAccount> findByCustomerId(int customerId);

}
