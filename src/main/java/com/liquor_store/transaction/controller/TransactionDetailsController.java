package com.liquor_store.transaction.controller;

import com.liquor_store.transaction.controller.dto.TransactionDetailsDto;
import com.liquor_store.transaction.service.TransactionDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/transaction-details")
public class TransactionDetailsController {
    private final TransactionDetailsService transactionDetailsService;

    @GetMapping
    public List<TransactionDetailsDto> getAllTransactionDetails() {
        return transactionDetailsService.getAllTransactionDetails();
    }

    @GetMapping("/{id}")
    public TransactionDetailsDto getTransactionDetailById(@PathVariable Long id) {
        return transactionDetailsService.getTransactionDetailById(id);
    }

    @PostMapping
    public TransactionDetailsDto createTransactionDetail(@RequestBody TransactionDetailsDto transactionDetailsDto) {
        return transactionDetailsService.createTransactionDetail(transactionDetailsDto);
    }

    @PutMapping("/{id}")
    public TransactionDetailsDto updateTransactionDetail(@PathVariable Long id, @RequestBody TransactionDetailsDto transactionDetailsDto) {
        return transactionDetailsService.updateTransactionDetail(id, transactionDetailsDto);
    }

    @DeleteMapping("/{id}")
    public void deleteTransactionDetails(@PathVariable Long id) {
        transactionDetailsService.deleteTransactionDetails(id);
    }
}
