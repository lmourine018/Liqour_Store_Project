package com.liquor_store.transaction.service;

import com.liquor_store.transaction.controller.dto.SalesTransactionDto;

import java.util.List;

public interface SalesTransactionService {

    List<SalesTransactionDto> getAllSalesTransactions();
    SalesTransactionDto getSalesTransactionById(Integer id);
    SalesTransactionDto createSalesTransaction(SalesTransactionDto salesTransactionDTO);
    SalesTransactionDto updateSalesTransaction(Integer id, SalesTransactionDto salesTransactionDTO);
    void deleteSalesTransaction(Integer id);
}
