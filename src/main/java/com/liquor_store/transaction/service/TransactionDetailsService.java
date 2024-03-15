package com.liquor_store.transaction.service;

import com.liquor_store.transaction.controller.dto.TransactionDetailsDto;
import com.liquor_store.transaction.entity.TransactionDetails;

import java.util.List;

public interface TransactionDetailsService {

    List<TransactionDetailsDto> getAllTransactionDetails();
    TransactionDetailsDto getTransactionDetailById(Long id);
    TransactionDetailsDto createTransactionDetail(TransactionDetailsDto transactionDetailsDto);
    TransactionDetailsDto updateTransactionDetail(Long id, TransactionDetailsDto transactionDetailsDto);
    void deleteTransactionDetails(Long id);
}
