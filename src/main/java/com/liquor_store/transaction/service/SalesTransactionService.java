package com.liquor_store.transaction.service;

import com.liquor_store.transaction.controller.dto.SalesTransactionDto;

import java.util.List;

public interface SalesTransactionService {

    List<SalesTransactionDto> getAllSalesTransactions();
    SalesTransactionDto getSalesTransactionById(Long id);
    SalesTransactionDto createSalesTransaction(SalesTransactionDto salesTransactionDTO);
    SalesTransactionDto updateSalesTransaction(Long id, SalesTransactionDto salesTransactionDTO);
    void deleteSalesTransaction(Long id);
}
