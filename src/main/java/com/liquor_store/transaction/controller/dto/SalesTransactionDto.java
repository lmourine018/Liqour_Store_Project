package com.liquor_store.transaction.controller.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SalesTransactionDto {
    private int storeId;
    private int employeeId;
    private Date date;
    private Double total;
}
