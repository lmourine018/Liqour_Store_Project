package com.liquor_store.order.controller.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderDto {
    private Integer storeId;
    private Integer employeeId;
    private Date date;
    private Double total;
}
