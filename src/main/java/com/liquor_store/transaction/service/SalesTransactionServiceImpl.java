package com.liquor_store.transaction.service;

import com.liquor_store.transaction.controller.assembler.SalesTransactionAssembler;
import com.liquor_store.transaction.controller.dto.SalesTransactionDto;
import com.liquor_store.transaction.entity.SalesTransaction;
import com.liquor_store.transaction.repository.SalesTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SalesTransactionServiceImpl implements SalesTransactionService {
    private final SalesTransactionRepository salesTransactionRepository;
    private final SalesTransactionAssembler salesTransactionAssembler;

    @Override
    public List<SalesTransactionDto> getAllSalesTransactions() {
        return salesTransactionRepository.findAll().stream()
                .map(salesTransactionAssembler::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public SalesTransactionDto getSalesTransactionById(Long id) {
        SalesTransaction salesTransaction = salesTransactionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sales transaction not found with id: " + id));
        return salesTransactionAssembler.toDto(salesTransaction);
    }

    @Override
    public SalesTransactionDto createSalesTransaction(SalesTransactionDto salesTransactionDto) {
        SalesTransaction salesTransaction = salesTransactionAssembler.toEntity(salesTransactionDto);
        SalesTransaction savedSalesTransaction = salesTransactionRepository.save(salesTransaction);
        return salesTransactionAssembler.toDto(savedSalesTransaction);
    }

    @Override
    public SalesTransactionDto updateSalesTransaction(Long id, SalesTransactionDto salesTransactionDTO) {
        if (!salesTransactionRepository.existsById(id)) {
            throw new ResourceNotFoundException("Sales transaction not found with id: " + id);
        }
        SalesTransaction salesTransaction = salesTransactionAssembler.toEntity(salesTransactionDTO);
        salesTransaction.setId(id);
        SalesTransaction updatedSalesTransaction = salesTransactionRepository.save(salesTransaction);
        return salesTransactionAssembler.toDto(updatedSalesTransaction);
    }

    @Override
    public void deleteSalesTransaction(Long id) {
        if (!salesTransactionRepository.existsById(id)) {
            throw new ResourceNotFoundException("Sales transaction not found with id: " + id);
        }
        salesTransactionRepository.deleteById(id);
    }
}
