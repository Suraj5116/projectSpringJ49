package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
