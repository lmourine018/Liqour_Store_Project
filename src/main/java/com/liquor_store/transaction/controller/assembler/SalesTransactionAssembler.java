package com.liquor_store.transaction.controller.assembler;

import com.liquor_store.transaction.controller.dto.SalesTransactionDto;
import com.liquor_store.transaction.entity.SalesTransaction;
import org.springframework.stereotype.Component;

@Component
public class SalesTransactionAssembler {
    public SalesTransaction toEntity(SalesTransactionDto dto) {
        SalesTransaction salesTransaction = new SalesTransaction();
        salesTransaction.setStoreId(dto.getStoreId());
        salesTransaction.setEmployeeId(dto.getEmployeeId());
        salesTransaction.setDate(dto.getDate());
        salesTransaction.setTotal(dto.getTotal());
        return salesTransaction;
    }

    public SalesTransactionDto toDto(SalesTransaction salesTransaction) {
        SalesTransactionDto dto = new SalesTransactionDto();
        dto.setStoreId(salesTransaction.getStoreId());
        dto.setEmployeeId(salesTransaction.getEmployeeId());
        dto.setDate(salesTransaction.getDate());
        dto.setTotal(salesTransaction.getTotal());
        return dto;
    }
}
