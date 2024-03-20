package com.liquor_store.transaction.service;

import com.liquor_store.transaction.controller.assembler.TransactionDetailsAssembler;
import com.liquor_store.transaction.controller.dto.TransactionDetailsDto;
import com.liquor_store.transaction.entity.TransactionDetails;
import com.liquor_store.transaction.repository.TransactionDetailsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionDetailsServiceImpl implements TransactionDetailsService {

    private final TransactionDetailsRepository transactionDetailRepository;

    private final TransactionDetailsAssembler transactionDetailsAssembler;

    @Override
    public List<TransactionDetailsDto> getAllTransactionDetails() {
        return transactionDetailRepository.findAll().stream()
                .map(transactionDetailsAssembler::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TransactionDetailsDto getTransactionDetailById(Integer id) {
        TransactionDetails transactionDetail = transactionDetailRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Transaction detail not found with id: " + id));
        return transactionDetailsAssembler.toDto(transactionDetail);
    }

    @Override
    public TransactionDetailsDto createTransactionDetail(TransactionDetailsDto transactionDetailsDto) {
        TransactionDetails transactionDetail = transactionDetailsAssembler.toEntity(transactionDetailsDto);
        TransactionDetails savedTransactionDetail = transactionDetailRepository.save(transactionDetail);
        return transactionDetailsAssembler.toDto(savedTransactionDetail);
    }

    @Override
    public TransactionDetailsDto updateTransactionDetail(Integer id, TransactionDetailsDto transactionDetailDTO) {
        if (!transactionDetailRepository.existsById(id)) {
            throw new ResourceNotFoundException("Transaction detail not found with id: " + id);
        }
        TransactionDetails transactionDetail = transactionDetailsAssembler.toEntity(transactionDetailDTO);
        transactionDetail.setId(id);
        TransactionDetails updatedTransactionDetail = transactionDetailRepository.save(transactionDetail);
        return transactionDetailsAssembler.toDto(updatedTransactionDetail);
    }

    @Override
    public void deleteTransactionDetails(Integer id) {
        if (!transactionDetailRepository.existsById(id)) {
            throw new ResourceNotFoundException("Transaction detail not found with id: " + id);
        }
        transactionDetailRepository.deleteById(id);
    }
}
