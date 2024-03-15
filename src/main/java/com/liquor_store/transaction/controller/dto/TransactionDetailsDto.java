package com.liquor_store.transaction.controller.dto;


import lombok.Data;

@Data
public class TransactionDetailsDto {

    private int transactionId;
    private int productId;
    private int quantity;
    private double subtotal;

}
