package com.liquor_store.transaction.controller.dto;


import lombok.Data;

@Data
public class TransactionDetailsDto {

    private Integer transactionId;
    private Integer productId;
    private Integer quantity;
    private double subtotal;

}
