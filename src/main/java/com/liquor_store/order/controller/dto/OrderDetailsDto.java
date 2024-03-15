package com.liquor_store.order.controller.dto;

import lombok.Data;

@Data
public class OrderDetailsDto {
    private int orderId;
    private int productId;
    private int quantity;
    private double unitPrice;
}
