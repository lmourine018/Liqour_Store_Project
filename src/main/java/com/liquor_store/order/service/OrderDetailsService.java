package com.liquor_store.order.service;

import com.liquor_store.order.controller.dto.OrderDetailsDto;

import java.util.List;

public interface OrderDetailsService {

    List<OrderDetailsDto> getAllOrderDetails();
    OrderDetailsDto getOrderDetailById(Integer id);
    OrderDetailsDto createOrderDetail(OrderDetailsDto orderDetailDTO);
    OrderDetailsDto updateOrderDetail(Integer id, OrderDetailsDto orderDetailDTO);
    void deleteOrderDetail(Integer id);
}
