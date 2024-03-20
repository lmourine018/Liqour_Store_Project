package com.liquor_store.transaction.controller;

import com.liquor_store.transaction.controller.assembler.SalesTransactionAssembler;
import com.liquor_store.transaction.controller.dto.SalesTransactionDto;
import com.liquor_store.transaction.service.SalesTransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/sales-transactions")
public class SalesTransactionController {
    private final SalesTransactionService salesTransactionService;

    private final SalesTransactionAssembler salesTransactionAssembler;

    @GetMapping
    public List<SalesTransactionDto> getAllSalesTransactions() {
        return salesTransactionService.getAllSalesTransactions();
    }

    @GetMapping("/{id}")
    public SalesTransactionDto getSalesTransactionById(@PathVariable Integer id) {
        return salesTransactionService.getSalesTransactionById(id);
    }

    @PostMapping
    public SalesTransactionDto createSalesTransaction(@RequestBody SalesTransactionDto salesTransactionDto) {
        return salesTransactionService.createSalesTransaction(salesTransactionDto);
    }

    @PutMapping("/{id}")
    public SalesTransactionDto updateSalesTransaction(@PathVariable Integer id, @RequestBody SalesTransactionDto salesTransactionDto) {
        return salesTransactionService.updateSalesTransaction(id, salesTransactionDto);
    }

    @DeleteMapping("/{id}")
    public void deleteSalesTransaction(@PathVariable Integer id) {
        salesTransactionService.deleteSalesTransaction(id);
    }
}
