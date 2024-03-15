package com.liquor_store.transaction.controller.assembler;

import com.liquor_store.transaction.controller.dto.TransactionDetailsDto;
import com.liquor_store.transaction.entity.TransactionDetails;
import org.springframework.stereotype.Component;

@Component
public class TransactionDetailsAssembler {

    public TransactionDetails toEntity(TransactionDetailsDto dto) {
        TransactionDetails transactionDetail = new TransactionDetails();
        transactionDetail.setSalesTransactionId(dto.getTransactionId());
        transactionDetail.setProductId(dto.getProductId());
        transactionDetail.setQuantity(dto.getQuantity());
        transactionDetail.setSubtotal(dto.getSubtotal());
        return transactionDetail;
    }

    public TransactionDetailsDto toDto(TransactionDetails transactionDetail) {
        TransactionDetailsDto dto = new TransactionDetailsDto();
        dto.setTransactionId(transactionDetail.getSalesTransactionId());
        dto.setProductId(transactionDetail.getProductId());
        dto.setQuantity(transactionDetail.getQuantity());
        dto.setSubtotal(transactionDetail.getSubtotal());
        return dto;
    }
}
