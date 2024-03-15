package com.liquor_store.order.controller.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderDto {
    private int storeId;
    private int employeeId;
    private Date date;
    private Double total;
}
