package com.liquor_store.order.controller.assembler;

import com.liquor_store.order.controller.dto.OrderDto;
import com.liquor_store.order.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderAssembler {
    public Order toEntity(OrderDto dto) {
        Order order = new Order();
        order.setStoreId(dto.getStoreId());
        order.setEmployeeId(dto.getEmployeeId());
        order.setDate(dto.getDate());
        order.setTotal(dto.getTotal());
        return order;
    }

    public OrderDto toDto(Order order) {
        OrderDto dto = new OrderDto();
        dto.setStoreId(order.getStoreId());
        dto.setEmployeeId(order.getEmployeeId());
        dto.setDate(order.getDate());
        dto.setTotal(order.getTotal());
        return dto;
    }
}
