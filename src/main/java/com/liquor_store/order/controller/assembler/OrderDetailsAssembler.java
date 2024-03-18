package com.liquor_store.order.controller.assembler;

import com.liquor_store.order.controller.dto.OrderDetailsDto;
import com.liquor_store.order.entity.OrderDetails;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailsAssembler {
    public OrderDetails toEntity(OrderDetailsDto dto) {
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setOrderId(dto.getOrderId());
        orderDetails.setProductId(dto.getProductId());
        orderDetails.setQuantity(dto.getQuantity());
        orderDetails.setUnitPrice(dto.getUnitPrice());
        return orderDetails;
    }

    public OrderDetailsDto toDto(OrderDetails orderDetails) {
        OrderDetailsDto dto = new OrderDetailsDto();
        dto.setOrderId(orderDetails.getOrderId());
        dto.setProductId(orderDetails.getProductId());
        dto.setQuantity(orderDetails.getQuantity());
        dto.setUnitPrice(orderDetails.getUnitPrice());
        return dto;
    }
}
