package com.liquor_store.order.service;

import com.liquor_store.order.controller.dto.OrderDetailsDto;

import java.util.List;

public interface OrderDetailsService {

    List<OrderDetailsDto> getAllOrderDetails();
    OrderDetailsDto getOrderDetailById(Long id);
    OrderDetailsDto createOrderDetail(OrderDetailsDto orderDetailDTO);
    OrderDetailsDto updateOrderDetail(Long id, OrderDetailsDto orderDetailDTO);
    void deleteOrderDetail(Long id);
}
