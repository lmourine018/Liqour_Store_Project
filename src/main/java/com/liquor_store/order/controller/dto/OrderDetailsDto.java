package com.liquor_store.order.controller.dto;

import lombok.Data;

@Data
public class OrderDetailsDto {
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
    private double unitPrice;
}
