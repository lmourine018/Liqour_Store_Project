package com.liquor_store.order.service;

import com.liquor_store.order.controller.dto.OrderDto;
import com.liquor_store.order.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    List<OrderDto> getAllOrders();
    OrderDto getOrderById(Long id);
    OrderDto createOrder(OrderDto orderDto);
    OrderDto updateOrder(Long id, OrderDto orderDto);
    void deleteOrder(Long id);
}
